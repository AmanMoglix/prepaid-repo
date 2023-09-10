package com.example.prepaiddiscount.util;

import com.example.prepaiddiscount.entity.PrepaidDiscountJPA;
import com.example.prepaiddiscount.mongo.document.PrepaidDiscountMongo;
import com.example.prepaiddiscount.mongo.repo.PrepaidDiscountMongoRepo;
import com.example.prepaiddiscount.repository.PrepaidJPARepo;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PrepaidInActive {
    private static final Logger logger = LoggerFactory.getLogger(PrepaidInActive.class);

    @Autowired
    private PrepaidDiscountMongoRepo prepaidDiscountMongoRepo;
    @Autowired
    private MongoTemplate mongoTemplate;

    @Autowired
    private PrepaidJPARepo prepaidJPARepo;

    public void removeItemInCart() {
        List<PrepaidDiscountJPA> prepaidDiscountJPAS = prepaidJPARepo.findAllByIsDeletedTrue();
        for (PrepaidDiscountJPA prepaidDiscountJPA : prepaidDiscountJPAS) {
            String categoryCode = prepaidDiscountJPA.getTaxonomyCode();
            String brandName = prepaidDiscountJPA.getBrandName();
            if (StringUtils.isNotBlank(categoryCode) && StringUtils.isNotBlank(brandName)) {
                String key = brandName + categoryCode;
                List<PrepaidDiscountMongo> prepaidDiscountMongoList = findByDynamicValue(key);
                if (prepaidDiscountMongoList != null && !prepaidDiscountMongoList.isEmpty()) {
                    logger.info("SIZE {}", prepaidDiscountMongoList.size());
                    logger.info("SIZE {}", prepaidDiscountMongoList.size());

                    logger.info("SIZE {}", prepaidDiscountMongoList.size());

                    prepaidDiscountMongoRepo.deleteAll(prepaidDiscountMongoList);
                }
            }
        }
    }


    public List<PrepaidDiscountMongo> findByDynamicValue(String dynamicValue) {
        Query query = new Query(Criteria
                .where("prepaidDiscountList." + dynamicValue).exists(true)
                .and("prepaidDiscountList." + dynamicValue + ".is_applicable").is(true)
        );
        return mongoTemplate.find(query, PrepaidDiscountMongo.class);
    }
}

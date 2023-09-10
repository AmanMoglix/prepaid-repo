package com.example.prepaiddiscount.mongo.repo;

import com.example.prepaiddiscount.mongo.document.PrepaidDiscountMongo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PrepaidDiscountMongoRepo extends MongoRepository<PrepaidDiscountMongo,String> {
//    @Query(value = "{ 'prepaid_discounts.:dynamicKey': { $exists: true }, 'prepaid_discounts.:dynamicKey.is_applicable': true }")
//    List<PrepaidDiscountMongo> findByDynamicKey(
//            @Param("dynamicKey") String dynamicKey
//    );

}

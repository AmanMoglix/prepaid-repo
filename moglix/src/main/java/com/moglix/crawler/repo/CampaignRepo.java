package com.moglix.crawler.repo;

import com.moglix.crawler.document.Campaign;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface CampaignRepo extends ReactiveMongoRepository<Campaign,String> {
    Flux<Campaign> findAllByBrandNameEqualsIgnoreCase(String brandName);
}

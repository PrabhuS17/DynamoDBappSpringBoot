package io.currency.currencyrate.repos;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import io.currency.currencyrate.RateInfo;

@EnableScan
public interface RateInfoRepo extends CrudRepository<RateInfo, String> {
    
}
package io.currency.currencyrate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import io.currency.currencyrate.RateInfo;
import io.currency.currencyrate.repos.RateInfoRepo;

public class RateInfoService {
  @Autowired
  private RateInfoRepo repo;

  public RateInfo addRequest(RateInfo rateInfo) {
    return repo.save(rateInfo);
  }
  
  public List<RateInfo> fetch() {
    return (List<RateInfo>) repo.findAll();
  }
}

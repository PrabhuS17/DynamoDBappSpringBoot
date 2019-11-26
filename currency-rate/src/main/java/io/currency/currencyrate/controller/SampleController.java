package io.currency.currencyrate.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.currency.currencyrate.RateInfo;
import io.currency.currencyrate.constant.Constants;
import io.currency.currencyrate.service.RateInfoService;

@RestController
public class SampleController {
  
  @Autowired
  private RateInfoService service;
  
  @GetMapping("/rate")
  public List<RateInfo> hello() {
    return service.fetch();
  }
  
  @PostMapping(value = Constants.ADD_URL, produces = MediaType.APPLICATION_JSON_VALUE)
  public Object addToDynamoDB(@RequestBody RateInfo rateInfo) {
      return service.addRequest(rateInfo);
  }
}

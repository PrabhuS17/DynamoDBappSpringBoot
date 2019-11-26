package io.currency.currencyrate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.currency.currencyrate.service.RateInfoService;

@SpringBootApplication
public class CurrencyRateApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyRateApplication.class, args);
	}

	@Bean
	public RateInfoService getRateInfoService() {
	  return new RateInfoService();
	}
}

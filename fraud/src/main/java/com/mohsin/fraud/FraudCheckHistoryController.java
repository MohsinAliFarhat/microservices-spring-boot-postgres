package com.mohsin.fraud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("api/v1/fraud-check/")
public class FraudCheckHistoryController {

    @Autowired
    FraudCheckService fraudCheckService;

    @GetMapping(path = "{customerId}")
    public FraudCheckResponse isFraudster(@PathVariable("customerId") Integer customerId){

        log.info("Customer Info received: {}",customerId);
        boolean isFraudulentCustomer  = fraudCheckService.isFraudulentCustomer(customerId);
        log.info("isFraudulentCustomer: {}",isFraudulentCustomer);
        FraudCheckResponse fraudCheckResponse = new FraudCheckResponse(isFraudulentCustomer);
        log.info("Response Object: {}",fraudCheckResponse);
        return fraudCheckResponse;
    }
}

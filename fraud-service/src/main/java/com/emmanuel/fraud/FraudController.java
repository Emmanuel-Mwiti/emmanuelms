package com.emmanuel.fraud;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Emmanuel Mwiti on Mar 2024
 **/

@RestController
@RequestMapping("api/v1/fraud-check")
@RequiredArgsConstructor
@Slf4j
public class FraudController {
    private final FraudCheckService fraudCheckService;
    @GetMapping(path ="{customerId}")
    public FraudCheckResponse isFraudster(
            @PathVariable("customerId") Integer customerID
            )
    {
        boolean isFraudulentCustomer = fraudCheckService.isFraudulentCustomer(customerID);
        log.info("fraud check request for customer {}",customerID);

        return new FraudCheckResponse(isFraudulentCustomer);

    }
}

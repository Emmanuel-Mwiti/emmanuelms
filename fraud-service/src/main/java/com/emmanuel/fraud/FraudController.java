package com.emmanuel.fraud;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Emmanuel Mwiti on Mar 2024
 **/

@RestController
@RequestMapping("api/v1/fraud-check")
@RequiredArgsConstructor
public class FraudController {
    private final FraudCheckService fraudCheckService;
    @GetMapping(path ="{customerId}")
    public FraudCheckResponse isFraudster(
            @PathVariable("customerId") Integer customerID
            )
    {
        boolean isFraudulentCustomer = fraudCheckService.isFraudulentCustomer(customerID);

        return new FraudCheckResponse(isFraudulentCustomer);

    }
}

package com.mohsin.fraud;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class FraudCheckResponse {
    private boolean isFraudulent;
}

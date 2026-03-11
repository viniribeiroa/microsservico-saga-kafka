package br.com.microservices.orchestrated.orchestratorservice;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Etopics {

    START_SAGA("start-saga"),
    BASE_ORCHESTRATOR("orchestrator"),
    FINISH_SUCCESS("finish-success"),
    FINISH_FAIL("finish-fail"),
    PRODUCT_VALIDATION_SUCCESS("product-validation-success"),
    PRODUCT_VALIDATION_FAIL("product-validation.fail"),
    INVENTORY_VALIDATION_SUCCESS("inventory-validation-success"),
    INVENTORY_VALIDATION_FAIL("inventory-validation.fail"),
    PAYMENT_VALIDATION_SUCCESS("payment-validation-success"),
    PAYMENT_VALIDATION_FAIL("payment-validation.fail"),
    NOTIFY_ENDING("notify-ending");

    private String topic;
}

package com.ayed.ecom.payment;

import com.ayed.ecom.customer.CustomerResponse;
import com.ayed.ecom.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
    BigDecimal amount,
    PaymentMethod paymentMethod,
    Integer orderId,
    String orderReference,
    CustomerResponse customer
) {
}

package com.ayed.ecom.kafka;



import com.ayed.ecom.customer.CustomerResponse;
import com.ayed.ecom.order.PaymentMethod;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation (
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<com.ayed.ecom.product.PurchaseResponse> products

) {
}

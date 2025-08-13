package com.ecommerce.paymentserviceaug2025.dtos;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InitiatePaymentRequestDto {

    public Long getAmount() {
        return amount;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    private Long orderId;
    private Long amount;

}

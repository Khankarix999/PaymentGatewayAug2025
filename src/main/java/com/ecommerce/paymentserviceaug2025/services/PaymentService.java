package com.ecommerce.paymentserviceaug2025.services;

import com.ecommerce.paymentserviceaug2025.paymentgateway.PaymentGateway;
import com.razorpay.RazorpayException;
import com.stripe.exception.StripeException;
import org.springframework.stereotype.Service;

@Service
public class PaymentService  {

    private PaymentGateway paymentGateway;

    public PaymentService(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public String initiatePayment(Long orderId , Long amount) throws StripeException, RazorpayException {

        //make a call to paymentgateway to generate payment link
        return paymentGateway.generatePaymentLink(orderId, amount);
    }
}

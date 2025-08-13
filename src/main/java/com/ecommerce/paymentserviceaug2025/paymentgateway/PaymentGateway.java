package com.ecommerce.paymentserviceaug2025.paymentgateway;

import com.razorpay.RazorpayException;
import com.stripe.exception.StripeException;

public interface PaymentGateway {
    String generatePaymentLink(Long orderId , Long amount) throws RazorpayException, StripeException;
}

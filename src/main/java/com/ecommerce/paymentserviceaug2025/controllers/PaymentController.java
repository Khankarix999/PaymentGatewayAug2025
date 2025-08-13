package com.ecommerce.paymentserviceaug2025.controllers;


import com.ecommerce.paymentserviceaug2025.dtos.InitiatePaymentRequestDto;
import com.ecommerce.paymentserviceaug2025.services.PaymentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    private PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
    @PostMapping("/")
   public String initiatePayment(@RequestBody InitiatePaymentRequestDto requestDto){
        try {
            return paymentService.initiatePayment(
                    requestDto.getOrderId(),
                    requestDto.getAmount()
            );
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        return null;
    }
}

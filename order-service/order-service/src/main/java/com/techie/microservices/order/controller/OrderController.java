package com.techie.microservices.order.controller;

import org.springframework.web.bind.annotation.*;

import com.techie.microservices.order.service.OrderService;
import com.techie.microservices.order.dto.OrderRequest;
import org.springframework.http.HttpStatus;


import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String placeOrder(@RequestBody OrderRequest orderRequest) {
        orderService.placeOrder(orderRequest);
        return "Order Placed Successfully";
    }
}

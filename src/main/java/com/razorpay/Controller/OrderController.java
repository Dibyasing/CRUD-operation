package com.razorpay.Controller;

import com.razorpay.Order;
import com.razorpay.PayLoad.OrderDetails;
import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/order")
public class OrderController {
    //http://localhost:8080/api/order
   @PostMapping
    public String CreateOrder(@RequestBody OrderDetails orderDetails) throws Exception {
        RazorpayClient razorpay = new RazorpayClient("rzp_test_nZ6fhF7qf52cAq", "yCNdfp8DsyE9PsTj8ehI8N1R");

        JSONObject orderRequest = new JSONObject();
        orderRequest.put("amount",orderDetails.getAmount());
        orderRequest.put("currency",orderDetails.getCurrency());
        orderRequest.put("receipt", UUID.randomUUID().toString());
        JSONObject notes = new JSONObject();
        notes.put(orderDetails.getNoteSbject(),orderDetails.getNoteContent());
        orderRequest.put("notes",notes);

        Order order = razorpay.orders.create(orderRequest);
        return order.get("id").toString();
    }
}

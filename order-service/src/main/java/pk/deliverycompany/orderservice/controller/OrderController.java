package pk.deliverycompany.orderservice.controller;

import pk.deliverycompany.orderservice.dto.OrderRequest;
import pk.deliverycompany.orderservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String placeOrder(@RequestBody OrderRequest orderRequest) {
        System.out.println(orderRequest);
        if(orderRequest==null){
            System.out.println("nie działa");
        }else{
       // String string=  orderRequest.getOrderLineItemsDtoList().toString();
         //   System.out.println(string);
            System.out.println("działa!");

        }

     //   orderService.placeOrder(orderRequest);
        return "Order Placed Successfully";
    }
}

package com.example.demo.controller;

import com.example.demo.entity.OrderInfo;
import com.example.demo.service.OrderInfoServiceIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class OrderInfoController {
    @Autowired
    private OrderInfoServiceIMPL orderInfoServiceIMPL;

    @PostMapping("/updateOrderInfo") //checked
    public void updateOrderInfo(OrderInfo orderInfo){ orderInfoServiceIMPL.updateOrderInfo(orderInfo);} //by primary key

    @PostMapping("/deleteOrderInfo/{id}") //checked
    public void deleteOrderInfo(@PathVariable("id") Integer id){orderInfoServiceIMPL.deleteOrderInfo(id);}

    @PostMapping("/addOrderInfo") //uncheck
    public boolean addOrderInfo(OrderInfo orderInfo){ return orderInfoServiceIMPL.addOrderInfo(orderInfo);}

    @GetMapping("/findOrderByUserID/{id}") //chaecked
    public List<OrderInfo> findOrderByUserID(@PathVariable("id") Integer id){return orderInfoServiceIMPL.findOrderByUserID(id);}

    @GetMapping("/findOrderByGoodsDetailID/{id}") //checked
    public List<OrderInfo> findOrderByGoodsDetailID(@PathVariable("id") Integer id){return orderInfoServiceIMPL.findOrderByGoodsDetailID(id);}

    @GetMapping("/findOrderByOrderId/{id}") //checked
    public List<OrderInfo> findOrderByOrderId(@PathVariable("id") Integer id){return orderInfoServiceIMPL.findOrderByOrderId(id);}

    @GetMapping("/orderinfo/findWhateverYouWant") //checked
    public List<OrderInfo> findWhateverYouWant(OrderInfo orderInfo){return orderInfoServiceIMPL.findWhateverYouWant(orderInfo);}

    @GetMapping("/findByStatus")
    public int findByStatus(OrderInfo orderInfo){
        List<OrderInfo> list = new ArrayList<OrderInfo>();
        list = orderInfoServiceIMPL.findWhateverYouWant(orderInfo);
        return list.size();
    }
}

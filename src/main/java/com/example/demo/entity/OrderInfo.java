package com.example.demo.entity;

import java.math.BigDecimal;
import java.util.Date;

public class OrderInfo {
    private Integer orderId;

    private Integer amount;

    private String delivery;

    private Integer goodsDetailId;

    private Date orderDate;

    private BigDecimal orderPrice;

    private Integer status;

    private Date leaseTerm;

    private Integer userId;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getDelivery() {
        return delivery;
    }

    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }

    public Integer getGoodsDetailId() {
        return goodsDetailId;
    }

    public void setGoodsDetailId(Integer goodsDetailId) {
        this.goodsDetailId = goodsDetailId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public BigDecimal getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(BigDecimal orderPrice) {
        this.orderPrice = orderPrice;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getLeaseTerm() {
        return leaseTerm;
    }

    public void setLeaseTerm(Date leaseTerm) {
        this.leaseTerm = leaseTerm;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "OrderInfo{" +
                "orderId=" + orderId +
                ", amount=" + amount +
                ", delivery='" + delivery + '\'' +
                ", goodsDetailId=" + goodsDetailId +
                ", orderDate=" + orderDate +
                ", orderPrice=" + orderPrice +
                ", status=" + status +
                ", leaseTerm=" + leaseTerm +
                ", userId=" + userId +
                '}';
    }
}
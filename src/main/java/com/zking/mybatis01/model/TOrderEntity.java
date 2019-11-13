package com.zking.mybatis01.model;

import lombok.ToString;

import java.util.Objects;

/**
 * @author Administrator
 * @create 2019-11-1212:03
 */
@ToString
public class TOrderEntity {
    private Integer orderId;
    private String orderNo;
    private Integer cid;

    private TCustomerEntity customer;

    public TCustomerEntity getCustomer() {
        return customer;
    }

    public void setCustomer(TCustomerEntity customer) {
        this.customer = customer;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TOrderEntity that = (TOrderEntity) o;
        return Objects.equals(orderId, that.orderId) &&
                Objects.equals(orderNo, that.orderNo) &&
                Objects.equals(cid, that.cid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, orderNo, cid);
    }
}

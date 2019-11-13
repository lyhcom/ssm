package com.zking.mybatis01.model;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author Administrator
 * @create 2019-11-1212:03
 */
@ToString(exclude = "orders")
public class TCustomerEntity {

    private Integer customerId;
    private String customerName;

    private List<TOrderEntity> orders = new ArrayList<>();

    public List<TOrderEntity> getOrders() {
        return orders;
    }

    public void setOrders(List<TOrderEntity> orders) {
        this.orders = orders;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TCustomerEntity that = (TCustomerEntity) o;
        return Objects.equals(customerId, that.customerId) &&
                Objects.equals(customerName, that.customerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, customerName);
    }
}

package me.smartstore.core.domain;

import me.smartstore.enums.CustomerType;

public class Customer {
  private static Long seqNo = 0L;
  private Long id;
  private String name;
  private String userId;
  private Integer spentTime;
  private Integer payAmount;
  private CustomerType customerType;

  public Customer(String name, String userId, Integer spentTime, Integer payAmount) {
    synchronized (this) {
      this.id = seqNo++;
    }
    this.name = name;
    this.userId = userId;
    this.spentTime = spentTime;
    this.payAmount = payAmount;
    this.customerType = null;
  }

  public Customer(CustomerDTO dto) {
    if (dto.id() == null) {
      synchronized (this) {
        this.id = seqNo++;
      }
    } else {
      this.id = dto.id();
    }
    this.name = dto.name();
    this.userId = dto.userId();
    this.spentTime = dto.spentTime();
    this.payAmount = dto.payAmount();
    this.customerType = null;
  }

  public Customer(
      String name, String userId, Integer spentTime, Integer payAmount, CustomerType customerType) {
    this.name = name;
    this.userId = userId;
    this.spentTime = spentTime;
    this.payAmount = payAmount;
    this.customerType = customerType;
  }

  public Long getId() {
    return id;
  }

  public String getUserId() {
    return userId;
  }

  public String getName() {
    return name;
  }

  public Integer getSpentTime() {
    return spentTime;
  }

  public Integer getPayAmount() {
    return payAmount;
  }

  public CustomerType getCustomerType() {
    return customerType;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setSpentTime(int spentTime) {
    this.spentTime = spentTime;
  }

  public void setPayAmount(int payAmount) {
    this.payAmount = payAmount;
  }

  public void setCustomerType(CustomerType customerType) {
    this.customerType = customerType;
  }

  public void updateCustomerInfo(Customer customer) {
    if (customer.getName() != null) {
      this.name = customer.getName();
    }
    if (customer.getUserId() != null) {
      this.userId = customer.getUserId();
    }
    if (customer.getSpentTime() != null) {
      this.spentTime = customer.getSpentTime();
    }
    if (customer.getPayAmount() != null) {
      this.payAmount = customer.getPayAmount();
    }
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Customer customer = (Customer) o;

    return getId().equals(customer.getId());
  }

  @Override
  public int hashCode() {
    return getId().hashCode();
  }

  @Override
  public String toString() {
    return String.format(
        "Customer{userId='%s`, name='%s', spentTime=%d, totalPayAmount=%d, group=%s}",
        userId, name, spentTime, payAmount, customerType);
  }
}

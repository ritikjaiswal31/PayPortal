package com.payportal.wallet_service.dto;

public class CreditRequest {
    private Long userId;
    private String currency;
    private Long amount;

    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }

    public String getCurrency() { return currency; }
    public void setCurrency(String currency) { this.currency = currency; }

    public Long getAmount() { return amount; }
    public void setAmount(Long amount) { this.amount = amount; }
}
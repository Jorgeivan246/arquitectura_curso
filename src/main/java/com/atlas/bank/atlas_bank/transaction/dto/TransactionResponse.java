package com.atlas.bank.atlas_bank.transaction.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class TransactionResponse {

    private Long id;

    private String type;

    private Long sourceAccountId;

    private Long targetAccountId;

    private BigDecimal amount;

    private BigDecimal fee;

    private Long fromAccountId;

    private Long toAccountId;


}

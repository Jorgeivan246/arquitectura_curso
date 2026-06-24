package com.atlas.bank.atlas_bank.transaction.service;

import com.atlas.bank.atlas_bank.transaction.model.Transaction;

import java.util.List;

public interface ITransactionQueryService {
    public List<Transaction> getByAccount(Long accountId);
}

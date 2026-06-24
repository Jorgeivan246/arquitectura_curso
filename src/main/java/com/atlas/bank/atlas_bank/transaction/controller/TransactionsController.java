package com.atlas.bank.atlas_bank.transaction.controller;

import com.atlas.bank.atlas_bank.transaction.model.Transaction;
import com.atlas.bank.atlas_bank.transaction.service.ITransactionQueryService;
import com.atlas.bank.atlas_bank.transaction.service.ITransferService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/api/v1/transations")
@RequiredArgsConstructor
public class TransactionsController {

    private final ITransferService transferService;

    private final ITransactionQueryService transactionQueryService;

    @PostMapping("/transfer")
    public ResponseEntity<Transaction> transfer(@RequestParam Long  fromId, Long toId, BigDecimal amount){

        return ResponseEntity.ok(transferService.execute(fromId,toId,amount));
    }

    @GetMapping("/{id}/transactions")
    public ResponseEntity<List<Transaction>> getTransactions(@RequestParam Long id){

        return ResponseEntity.ok(transactionQueryService.getByAccount(id));
    }

}

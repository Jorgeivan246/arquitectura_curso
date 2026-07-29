package com.atlas.bank.atlas_bank.transaction.dto;

import org.hibernate.Transaction;
import org.hibernate.mapping.Component;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface TransactionMapper {

    TransactionResponse toResponse(Transaction transaction);
}

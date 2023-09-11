package com.sample.smallbank.mapper;

import com.sample.smallbank.dto.AccountDTO;
import com.sample.smallbank.entity.AccountEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {CustomerMapper.class})
public interface AccountMapper {

    @Mapping(target = "user", source = "customer")
    AccountDTO entityToDto(AccountEntity entity);

}
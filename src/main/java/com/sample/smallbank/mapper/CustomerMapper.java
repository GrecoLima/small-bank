package com.sample.smallbank.mapper;

import com.sample.smallbank.dto.CustomerDTO;
import com.sample.smallbank.entity.CustomerEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    @Mapping(source = "customerId", target = "id")
    CustomerDTO entityToDto(CustomerEntity entity);
}
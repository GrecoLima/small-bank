package com.sample.smallbank.repository;

import com.sample.smallbank.entity.ContactEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactEntityRepository extends JpaRepository<ContactEntity, Long> {
}
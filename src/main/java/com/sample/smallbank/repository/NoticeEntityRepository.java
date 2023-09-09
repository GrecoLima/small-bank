package com.sample.smallbank.repository;

import com.sample.smallbank.entity.NoticeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoticeEntityRepository extends JpaRepository<NoticeEntity, Long> {

    @Query(value = "SELECT n from notice_details n where CURDATE() BETWEEN n.noticBegDt AND n.noticEndDt")
    List<NoticeEntity> findAllActiveNotices();

}
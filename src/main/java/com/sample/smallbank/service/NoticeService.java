package com.sample.smallbank.service;

import com.sample.smallbank.entity.NoticeEntity;
import com.sample.smallbank.repository.NoticeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticeService {
    private final NoticeRepository noticeRepository;

    public NoticeService(NoticeRepository noticeRepository) {
        this.noticeRepository = noticeRepository;
    }

    public List<NoticeEntity> getAllActiveNotices() {
        return noticeRepository.findAllActiveNotices();
    }

}

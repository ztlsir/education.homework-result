package com.ztlsir.homework.result.homeworkResult.repository;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ztlsir.homework.result.homeworkResult.model.HomeworkResult;
import com.ztlsir.shared.model.BaseRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public class HomeworkResultRepository extends BaseRepository<HomeworkResult> {
    private final ObjectMapper objectMapper;
    private JpaRepository<HomeworkResultPO,String> homeworkResultDao;

    public HomeworkResultRepository(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @Override
    protected void doSave(HomeworkResult homeworkResult) {
        try {
            homeworkResultDao.save(new HomeworkResultPO(homeworkResult.getId(), objectMapper.writeValueAsString(homeworkResult)));
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}

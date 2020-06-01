package com.ztlsir.homework.result.homeworkResult.repository;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ztlsir.homework.result.homeworkResult.model.HomeworkResult;
import com.ztlsir.shared.event.DomainEventSender;
import com.ztlsir.shared.model.BaseRepository;
import lombok.var;
import org.springframework.stereotype.Component;

@Component
public class HomeworkResultRepository extends BaseRepository<HomeworkResult> {
    private final ObjectMapper objectMapper;
    private HomeworkResultDao homeworkResultDao;

    public HomeworkResultRepository(
            ObjectMapper objectMapper,
            HomeworkResultDao homeworkResultDao,
            DomainEventSender sender) {
        super(sender);
        this.objectMapper = objectMapper;
        this.homeworkResultDao = homeworkResultDao;
    }

    @Override
    protected void doSave(HomeworkResult homeworkResult) {
        try {
            homeworkResultDao.save(new HomeworkResultPO(homeworkResult.getId(), objectMapper.writeValueAsString(homeworkResult)));
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public HomeworkResult byId(String id) {
        var homeworkResultPO = homeworkResultDao.findById(id).get();
        try {
            return objectMapper.readValue(homeworkResultPO.getJsonContent(), HomeworkResult.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}

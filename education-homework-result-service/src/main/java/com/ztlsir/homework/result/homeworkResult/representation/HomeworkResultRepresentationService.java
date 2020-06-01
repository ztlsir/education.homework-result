package com.ztlsir.homework.result.homeworkResult.representation;

import com.ztlsir.homework.result.homeworkResult.model.HomeworkResult;
import com.ztlsir.homework.result.homeworkResult.repository.HomeworkResultRepository;
import org.springframework.stereotype.Component;

@Component
public class HomeworkResultRepresentationService {
    private final HomeworkResultRepository homeworkResultRepository;

    public HomeworkResultRepresentationService(HomeworkResultRepository homeworkResultRepository) {
        this.homeworkResultRepository = homeworkResultRepository;
    }

    public HomeworkResultRepresentation byId(String id) {
        HomeworkResult homeworkResult = homeworkResultRepository.byId(id);
        return homeworkResult.toRepresentation();
    }
}

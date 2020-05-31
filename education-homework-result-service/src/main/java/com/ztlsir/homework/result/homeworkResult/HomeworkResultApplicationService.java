package com.ztlsir.homework.result.homeworkResult;

import com.ztlsir.homework.result.homeworkResult.command.CreateCommand;
import com.ztlsir.homework.result.homeworkResult.model.HomeworkResult;
import com.ztlsir.homework.result.homeworkResult.repository.HomeworkResultRepository;
import org.springframework.stereotype.Component;

@Component
public class HomeworkResultApplicationService {
    private final HomeworkResultRepository repository;

    public HomeworkResultApplicationService(HomeworkResultRepository repository) {
        this.repository = repository;
    }

    public String create(CreateCommand command) {
        HomeworkResult homeworkResult = HomeworkResult.create(command.classAndGrade,command.studentId,command.reuslt,command.homeworkId);
        repository.save(homeworkResult);

        return homeworkResult.getId();
    }
}

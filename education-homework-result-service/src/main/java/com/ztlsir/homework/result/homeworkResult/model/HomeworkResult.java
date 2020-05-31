package com.ztlsir.homework.result.homeworkResult.model;

import com.ztlsir.shared.value.ClassAndGrade;
import lombok.Builder;
import lombok.Getter;

import java.time.Instant;
import java.util.UUID;

import static java.time.Instant.now;

@Getter
@Builder
public class HomeworkResult {
    private String id;
    private ClassAndGrade classAndGrade;
    public String homeworkId;
    public String reuslt;
    public String studentId;
    private Instant createdAt;
    private HomeworkResultStatus status;

    public static HomeworkResult create(
            ClassAndGrade classAndGrade,
            String studentId,
            String reuslt,
            String homeworkId) {
        HomeworkResult homeworkResult = HomeworkResult.builder()
                .id(UUID.randomUUID().toString())
                .classAndGrade(classAndGrade)
                .studentId(studentId)
                .createdAt(now())
                .reuslt(reuslt)
                .homeworkId(homeworkId)
                .status(HomeworkResultStatus.EDIT)
                .build();
        return homeworkResult;
    }
}

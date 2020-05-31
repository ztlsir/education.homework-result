package com.ztlsir.homework.result.homeworkResult.representation;

import com.ztlsir.shared.value.ClassAndGrade;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Value;

import java.time.Instant;

@NoArgsConstructor(force = true, access = AccessLevel.PRIVATE)
@AllArgsConstructor
@Value
public class HomeworkResultRepresentation {
    private String id;
    private ClassAndGrade classAndGrade;
    public String homeworkId;
    public String reuslt;
    public String studentId;
    private Instant createdAt;
    private String status;
}

package com.ztlsir.homework.result.homeworkResult.command;

import com.ztlsir.shared.value.ClassAndGrade;
import lombok.Value;

import javax.validation.constraints.NotEmpty;

@Value
public class CreateCommand {
    public ClassAndGrade classAndGrade;
    public String homeworkId;
    public String studentId;

    @NotEmpty(message = "作业结果不能为空")
    public String reuslt;
}

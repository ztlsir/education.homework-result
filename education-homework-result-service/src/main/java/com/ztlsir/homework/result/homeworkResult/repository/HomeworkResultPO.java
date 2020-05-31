package com.ztlsir.homework.result.homeworkResult.repository;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Table(name="HomeworkResults")
public class HomeworkResultPO {
    public HomeworkResultPO() {
    }

    public HomeworkResultPO(String id, String jsonContent) {
        this.id = id;
        this.jsonContent = jsonContent;
    }

    @Id
    private String id;
    private String jsonContent;
}

package com.ztlsir.homework.result.homeworkResult.event;

import com.ztlsir.shared.event.DomainEvent;
import lombok.Getter;

@Getter
public class HomeworkResultCreatedEvent extends DomainEvent {
    private String homeworkResultId;

    public HomeworkResultCreatedEvent(String homeworkResultId) {
        this.homeworkResultId = homeworkResultId;
    }
}

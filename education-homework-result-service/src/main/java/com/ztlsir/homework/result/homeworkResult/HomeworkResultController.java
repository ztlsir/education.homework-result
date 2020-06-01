package com.ztlsir.homework.result.homeworkResult;

import com.ztlsir.homework.result.homeworkResult.command.CreateCommand;
import com.ztlsir.homework.result.homeworkResult.representation.HomeworkResultRepresentation;
import com.ztlsir.homework.result.homeworkResult.representation.HomeworkResultRepresentationService;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Map;

import static com.google.common.collect.ImmutableMap.of;

@RestController
public class HomeworkResultController implements HomeworkResultClient {
    private final HomeworkResultApplicationService applicationService;
    private HomeworkResultRepresentationService representationService;

    public HomeworkResultController(HomeworkResultApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @Override
    public Map<String, String> create(@Valid CreateCommand command) {
        return of("id", applicationService.create(command));
    }

    @Override
    public HomeworkResultRepresentation byId(String id) {
        return representationService.byId(id);
    }
}

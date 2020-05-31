package com.ztlsir.homework.result.homeworkResult;

import com.ztlsir.homework.result.homeworkResult.command.CreateCommand;
import com.ztlsir.homework.result.homeworkResult.representation.HomeworkResultRepresentation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Map;

import static org.springframework.http.HttpStatus.CREATED;

@FeignClient(value = "homework-result-service",contextId = "HomeworkResultClient")
@RequestMapping(value = "/homework-results")
public interface HomeworkResultClient {

    @PostMapping
    @ResponseStatus(CREATED)
    public Map<String, String> create(@RequestBody @Valid CreateCommand command);

    @GetMapping("/{id}")
    public HomeworkResultRepresentation byId(@PathVariable(name = "id") String id);
}

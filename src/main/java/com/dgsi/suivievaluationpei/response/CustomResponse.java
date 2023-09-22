package com.dgsi.suivievaluationpei.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.experimental.SuperBuilder;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
import java.util.Map;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

@Data
@SuperBuilder
@JsonInclude(NON_NULL)
public class CustomResponse {
    protected LocalDateTime timeStamp;
    protected HttpStatus status;
    protected int statusCode;
    protected String reason;
    protected String message;
   // protected String developperMessage;
    protected Map<?, ?> data;
}

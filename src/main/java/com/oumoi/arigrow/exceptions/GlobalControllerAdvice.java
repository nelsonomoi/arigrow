package com.oumoi.arigrow.exceptions;


import com.oumoi.arigrow.core.utils.ApiError;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import static com.oumoi.arigrow.utils.MessageConstants.ERROR_MESSAGE;
import static com.oumoi.arigrow.utils.MessageConstants.ERROR_STATUS;

@RestControllerAdvice
public class GlobalControllerAdvice {

    @ExceptionHandler(value = {ResourceNotFoundException.class})
    public ApiError resourceNotFound(ResourceNotFoundException ex){
        return ApiError.builder()
                .status(ERROR_STATUS)
                .statusCode(HttpStatus.NOT_FOUND.value())
                .message(ex.getMessage())
                .build();
    }
}

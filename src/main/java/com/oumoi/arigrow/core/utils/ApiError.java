package com.oumoi.arigrow.core.utils;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class ApiError {
    private int statusCode;
    private String status;
    private String message;
}

package com.oumoi.arigrow.core.utils;


import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class ApiResponse {
    private int statusCode;
    private String status;
    private String message;
    private Object payLoad;
}

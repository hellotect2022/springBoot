package com.msa.rest.dto;

import lombok.Data;

@Data
public class Response<T> {
    private String status;
    private T result;
}

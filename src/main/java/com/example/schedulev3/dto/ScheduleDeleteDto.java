package com.example.schedulev3.dto;

import lombok.Getter;

@Getter
public class ScheduleDeleteDto {
    private final String password;

    public ScheduleDeleteDto(String password) {
        this.password = password;
    }
}

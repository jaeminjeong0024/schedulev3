package com.example.schedulev3.dto;

import lombok.Getter;

@Getter
public class ScheduleRequestDto {

    private String title;
    private String content;

    public ScheduleRequestDto(String title, String content) {
        this.title = title;
        this.content = content;
    }

    ;
}

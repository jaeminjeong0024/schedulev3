package com.example.schedulev3.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@Entity
@RequiredArgsConstructor
public class ScheduleEntity extends BaseEntiry {

    @Id
    private Long id;
    private String title;
    private String content;

    public ScheduleEntity(String title, String content) {
        this.title = title;
        this.content = content;
    }




}

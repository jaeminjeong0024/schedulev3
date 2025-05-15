package com.example.schedulev3.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ScheduleController {

    private final ScheduleService scheduleService;
}

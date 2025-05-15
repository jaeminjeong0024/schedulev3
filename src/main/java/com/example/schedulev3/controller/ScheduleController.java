package com.example.schedulev3.controller;

import com.example.schedulev3.dto.ScheduleRequestDto;
import com.example.schedulev3.dto.ScheduleResponseDto;
import com.example.schedulev3.service.ScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class ScheduleController {
    private final ScheduleService scheduleService;

    @PostMapping
    public ResponseEntity<ScheduleResponseDto> save(@RequestBody ScheduleRequestDto scheduleRequestDto) {
        ScheduleResponseDto responseDto = scheduleService.saveSchedule(
                scheduleRequestDto.getTitle(),
                scheduleRequestDto.getContent()
        );

        return new  ResponseEntity<>(responseDto,HttpStatusCode.valueOf(201));
    }

    @DeleteMapping("/{scheduleId}")
    public ResponseEntity<String> delete(@PathVariable Long scheduleId) {
        scheduleService.delete(scheduleId);

        return new ResponseEntity<>("삭제되었습니다",HttpStatusCode.valueOf(200));
    }
}

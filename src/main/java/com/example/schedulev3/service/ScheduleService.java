package com.example.schedulev3.service;

import com.example.schedulev3.dto.ScheduleRequestDto;
import com.example.schedulev3.dto.ScheduleResponseDto;
import com.example.schedulev3.entity.ScheduleEntity;
import com.example.schedulev3.repository.ScheduleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ScheduleService {
    private final ScheduleRepository scheduleRepository;

    public ScheduleResponseDto save(ScheduleRequestDto scheduleRequestDto) {
        ScheduleEntity scheduleEntity = new ScheduleEntity(scheduleRequestDto.getTitle(), scheduleRequestDto.getContent());

        ScheduleEntity savedSchedule = scheduleRepository.save(scheduleEntity);

        return new ScheduleResponseDto(savedSchedule.getId(), savedSchedule.getTitle(), savedSchedule.getContent());

    }

    public void delete(Long id) {

    }

    public ScheduleResponseDto saveSchedule(String title, String content) {
    }
}

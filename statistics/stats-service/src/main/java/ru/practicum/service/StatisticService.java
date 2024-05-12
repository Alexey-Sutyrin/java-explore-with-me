package ru.practicum.service;

import ru.practicum.StatisticInDto;
import ru.practicum.StatisticViewDto;

import java.time.LocalDateTime;
import java.util.List;

public interface StatisticService {
    void postHit(StatisticInDto hitRequestDto);

    List<StatisticViewDto> getStatistics(LocalDateTime start, LocalDateTime end, List<String> uris, Boolean unique);
}

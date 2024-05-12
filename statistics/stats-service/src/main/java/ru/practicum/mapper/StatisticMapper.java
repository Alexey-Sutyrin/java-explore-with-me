package ru.practicum.mapper;

import lombok.experimental.UtilityClass;
import ru.practicum.StatisticInDto;
import ru.practicum.StatisticViewDto;
import ru.practicum.model.Statistic;
import ru.practicum.model.ViewStats;

@UtilityClass
public class StatisticMapper {
    public static Statistic toStats(StatisticInDto endpointHitRequestDto) {
        return Statistic.builder()
                .ip(endpointHitRequestDto.getIp())
                .timestamp(endpointHitRequestDto.getTimestamp())
                .uri(endpointHitRequestDto.getUri())
                .app(endpointHitRequestDto.getApp())
                .build();
    }

    public static StatisticViewDto toStatsResponseDto(ViewStats viewStats) {
        return StatisticViewDto.builder()
                .app(viewStats.getApp())
                .uri(viewStats.getUri())
                .hits(viewStats.getCount())
                .build();
    }
}

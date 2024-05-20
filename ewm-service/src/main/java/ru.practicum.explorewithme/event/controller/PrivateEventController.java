package ru.practicum.explorewithme.event.controller; //3 - Private endpoints

import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ru.practicum.explorewithme.StatisticClient;
import ru.practicum.explorewithme.event.dto.*;
import ru.practicum.explorewithme.event.service.EventService;

import javax.validation.Valid;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;
import java.util.List;


@Validated
@RestController
@RequiredArgsConstructor
public class PrivateEventController {

    private final EventService eventService;
    private final StatisticClient statisticClient;

    @PostMapping(value = "/users/{userId}/events")
    @ResponseStatus(HttpStatus.CREATED)
    public EventFullDto addEvent(@PathVariable Long userId, @Valid @RequestBody NewEventDto newEventDto) {
        return eventService.addEvent(userId, newEventDto);
    }

    @GetMapping("/users/{userId}/events")
    public List<EventShortDto> findEventsOfUser(@PathVariable Long userId,
                                                @RequestParam(required = false, defaultValue = "0") Integer from,
                                                @RequestParam(required = false, defaultValue = "10") Integer size) {
        return eventService.findEventsOfUser(userId, from, size);
    }

    @GetMapping("/users/{userId}/events/{eventId}")
    public EventFullDto findUserEventById(@PathVariable Long userId, @PathVariable Long eventId) {
        return eventService.findUserEventById(userId, eventId);
    }

    @PatchMapping(value = "/users/{userId}/events/{eventId}")
    public EventFullDto userUpdateEvent(@PathVariable Long userId,
                                        @PathVariable Long eventId,
                                        @Valid @RequestBody UpdateEventUserRequest updateEventUserRequest) {
        return eventService.userUpdateEvent(userId, eventId, updateEventUserRequest);
    }

    @GetMapping("/users/{userId}/followers/{followerId}/events")
    public List<EventFullDto> findEventsBySubscriptionOfUser(@PathVariable Long userId,
                                                             @PathVariable Long followerId,
                                                             @PositiveOrZero @RequestParam(required = false, defaultValue = "0") Integer from,
                                                             @Positive @RequestParam(required = false, defaultValue = "10") Integer size) {
        return eventService.findEventsBySubscriptionOfUser(userId, followerId, from, size);
    }

    @GetMapping("/users/followers/{followerId}/events")
    public List<EventShortDto> findEventsByAllSubscriptions(@PathVariable Long followerId,
                                                            @RequestParam(required = false, defaultValue = "NEW") String sort,
                                                            @PositiveOrZero @RequestParam(required = false, defaultValue = "0") Integer from,
                                                            @Positive @RequestParam(required = false, defaultValue = "10") Integer size) {
        return eventService.findEventsByAllSubscriptions(followerId, sort, from, size);
    }
}
package ru.practicum.explorewithme.event.dto; //a-Data

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.practicum.explorewithme.category.dto.CategoryDto;
import ru.practicum.explorewithme.event.model.Location;
import ru.practicum.explorewithme.user.dto.UserShortDto;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EventFullDto {

    private String annotation;
    private CategoryDto category;
    private Integer confirmedRequests;
    private String createdOn;
    private String description;
    private String eventDate;
    private Long id;
    private UserShortDto initiator;
    private Location location;
    private Boolean paid;
    private Integer participantLimit;
    private String publishedOn;
    private Boolean requestModeration;
    private String state;
    private String title;
    private Long views;
}

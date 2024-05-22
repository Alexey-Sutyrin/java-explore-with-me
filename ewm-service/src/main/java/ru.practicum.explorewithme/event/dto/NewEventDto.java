package ru.practicum.explorewithme.event.dto; //a-Data

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.practicum.explorewithme.event.model.Location;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NewEventDto {

    @NotNull
    @Size(min = 20, max = 2000, message = "Длина аннотации должна быть от 20 до 2000.")
    private String annotation;

    @NotNull
    @Positive
    private Long category;

    @NotNull
    @Size(min = 20, max = 7000, message = "Длина полного описания должна быть от 20 до 7000.")
    private String description;

    @NotNull
    private String eventDate;

    @NotNull
    private Location location;

    private Boolean paid;

    @PositiveOrZero
    private Integer participantLimit;

    private Boolean requestModeration;

    @NotNull
    @Size(min = 3, max = 120, message = "Длина заголовка от 3 до 120.")
    private String title;
}

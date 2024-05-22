package ru.practicum.explorewithme.event.model; //a-Data

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
public class Location {
    private Float lat;
    private Float lon;
}

package ru.practicum.explorewithme.user.dto; //a-Data

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserOutDto {

    private Long id;
    private String email;
    private String name;
}

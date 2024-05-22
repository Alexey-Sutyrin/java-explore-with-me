package ru.practicum.explorewithme.user.dto; //a-Data

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserWithFollowersDto {

    private Long id;
    private String email;
    private String name;
    private List<UserOutDto> followers;
}

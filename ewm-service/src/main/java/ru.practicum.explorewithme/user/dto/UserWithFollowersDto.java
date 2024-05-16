package ru.practicum.explorewithme.user.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
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

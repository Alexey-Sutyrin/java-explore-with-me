package ru.practicum.explorewithme.user.dto; //a-Data

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserInDto {

    @Email
    @NotBlank
    @Size(min = 6, max = 254, message = "Длина эл. почты должна быть от 6 до 254")
    private String email;
    @NotBlank
    @Size(min = 2, max = 250, message = "Длина имени должна быть от 2 до 250")
    private String name;
}

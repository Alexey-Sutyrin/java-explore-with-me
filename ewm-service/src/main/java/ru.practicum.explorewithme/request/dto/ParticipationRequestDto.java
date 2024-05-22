package ru.practicum.explorewithme.request.dto; //a-Data

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ParticipationRequestDto {

    private Long id;
    @NotNull
    private String created;
    @NotNull
    private Long event;
    @NotNull
    private Long requester;
    @NotBlank
    private String status;
}

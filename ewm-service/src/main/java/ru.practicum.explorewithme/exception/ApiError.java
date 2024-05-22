package ru.practicum.explorewithme.exception; //a-Data

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
import java.util.List;

import static ru.practicum.explorewithme.constant.Constant.TIME_FORMAT;

@Getter
@RequiredArgsConstructor
@ToString
public class ApiError {

    private final HttpStatus status;
    private final String reason;
    private final String message;
    private final List<String> errors;
    @JsonFormat(pattern = TIME_FORMAT)
    private final LocalDateTime timestamp;
}

package ru.practicum.explorewithme.exception; // changed to ErrorResponse instead of Map to fix issue

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ErrorHandler {

    @ExceptionHandler
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorResponse handleStatisticValidationException(StatisticValidationException e) {
        return new ErrorResponse("Validation for statistic failed: " + e.getMessage());
    }
}

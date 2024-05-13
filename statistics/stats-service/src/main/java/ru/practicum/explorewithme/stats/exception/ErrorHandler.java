package ru.practicum.explorewithme.stats.exception; // changed to ErrorResponse instead of Map to fix issue

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ErrorHandler {

    @ExceptionHandler
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ru.practicum.explorewithme.stats.exception.ErrorResponse handleStatisticValidationException(StatisticValidationException e) {
        return new ru.practicum.explorewithme.stats.exception.ErrorResponse("Validation for statistic failed: " + e.getMessage());
    }
}

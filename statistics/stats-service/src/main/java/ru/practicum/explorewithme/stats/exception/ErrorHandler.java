package ru.practicum.explorewithme.stats.exception; // добавлена обработка Throwable

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

    @ExceptionHandler
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorResponse handleThrowable(Throwable throwable) {
        return new ErrorResponse("Internal server error occurred: " + throwable.getMessage());
    }
}

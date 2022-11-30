package dev.sungmin.price.presentation.advice

import dev.sungmin.price.common.ApiResponseModel
import dev.sungmin.price.common.exception.BadRequestException
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class RestControllerExceptionHandler {
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(
        BadRequestException::class
    )
    fun badRequest(e: Exception): ApiResponseModel<*> {
        return ApiResponseModel(
            success = false,
            message = e.message,
            data = null
        )
    }
}

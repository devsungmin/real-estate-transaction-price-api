package dev.sungmin.price.common.exception

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "Bad Request")
class BadRequestException(message: String) : RuntimeException(message)

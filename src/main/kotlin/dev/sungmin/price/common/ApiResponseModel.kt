package dev.sungmin.price.common

data class ApiResponseModel<E>(
    val success: Boolean,
    val message: String?,
    val data: E?
)

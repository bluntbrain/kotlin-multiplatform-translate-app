package com.example.myfirstkmmapp.translate.domain.translate

enum class TranslateError {
    SERVICE_UNAVAILABLE,
    CLIENT_ERROR,
    SERVER_ERROR,
    UNKNOWN_ERROR
}

//kotlin exception to throw error in case of translation error
class TranslateException(val error: TranslateError): Exception(
    message = "An error occurred when translating: $error"
)
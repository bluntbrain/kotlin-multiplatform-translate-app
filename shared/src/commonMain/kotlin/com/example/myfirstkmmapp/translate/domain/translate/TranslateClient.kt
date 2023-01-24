package com.example.myfirstkmmapp.translate.domain.translate

import com.example.myfirstkmmapp.core.domain.language.Language

interface TranslateClient {
    suspend fun translate(
        fromLanguage: Language,
        fromText: String,
        toLanguage: Language
    ): String
}
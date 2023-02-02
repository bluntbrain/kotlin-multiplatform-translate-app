package com.example.myfirstkmmapp.core.presentation

import com.example.myfirstkmmapp.core.domain.language.Language

expect class UiLanguage {
    val language: Language
    companion object {
        fun byCode(langCode: String): UiLanguage
        val allLanguages: List<UiLanguage>
    }
}
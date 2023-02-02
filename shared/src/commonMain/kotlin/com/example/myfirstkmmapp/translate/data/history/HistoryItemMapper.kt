package com.example.myfirstkmmapp.translate.data.history

import com.example.myfirstkmmapp.translate.domain.history.HistoryItem
import database.HistoryEntity


fun HistoryEntity.toHistoryItem(): HistoryItem {
    return HistoryItem(
        id = id,
        fromLanguageCode = fromLanguageCode,
        fromText = fromText,
        toLanguageCode = toLanguageCode,
        toText = toText
    )
}
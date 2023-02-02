package com.example.myfirstkmmapp.translate.domain.history

import com.example.myfirstkmmapp.core.domain.util.CommonFlow

interface HistoryDataSource {
    fun getHistory(): CommonFlow<List<HistoryItem>>
    suspend fun insertHistoryItem(item: HistoryItem)
}
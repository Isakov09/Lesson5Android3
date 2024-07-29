package com.example.lesson5android3.utils

data class UiState<T>(
    val isLoading: Boolean = true,
    val error: String? = null,
    val success: T? = null
)

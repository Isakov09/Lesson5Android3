package com.example.lesson5android3.utils

interface CustomCallback <T>{

    fun onResponse(data: T)

    fun onFailure(t: Throwable)
}
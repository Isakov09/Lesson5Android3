package com.example.lesson5android3.data.models

import com.google.gson.annotations.SerializedName

data class Meta(
    @SerializedName("copyright")
    val copyright: String? = "",
    @SerializedName("pagination")
    val pagination: Pagination?,
    @SerializedName("generated_at")
    val generatedAt: String? = ""
)

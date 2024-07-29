package com.example.lesson5android3.data.models

import com.google.gson.annotations.SerializedName

data class DataItem(
    @SerializedName("attributes")
    val attributes: Attributes,
    @SerializedName("links")
    val links: Links,
    @SerializedName("id")
    val id: String = "",
    @SerializedName("type")
    val type: String = ""
)
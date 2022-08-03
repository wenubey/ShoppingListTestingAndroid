package com.example.wenubey.data.remote.responses

import com.example.wenubey.data.remote.responses.ImageResult


data class ImageResponse(
    val hits: List<ImageResult>,
    val total: Int,
    val totalHits: Int
)
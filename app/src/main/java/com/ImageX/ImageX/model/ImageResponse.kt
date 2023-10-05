package com.ImageX.ImageX.model

data class ImageResponse(
        val hits: List<ImageResult>,
        val total: Int,
        val totalHits: Int
)

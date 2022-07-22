package com.example.domain.dto.board.request

data class PostCreatePostRequest(
    val title: String,
    val userName: String,
    val description: String
)

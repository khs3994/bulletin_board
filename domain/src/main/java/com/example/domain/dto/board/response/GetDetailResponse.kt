package com.example.domain.dto.board.response

data class GetDetailResponse(
    val id: Int,
    val title: String,
    val description: String,
    val userName: String
)

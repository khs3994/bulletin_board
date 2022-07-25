package com.example.domain.usecase.board

import com.example.domain.dto.board.request.DomainPostCreatePostRequest
import com.example.domain.repository.BoardRepository
import javax.inject.Inject

class PostCreatePostUseCase @Inject constructor(
    private val repository: BoardRepository
) {
    suspend fun postCreatePost(body: DomainPostCreatePostRequest) = repository.postCreatePost(body)
}
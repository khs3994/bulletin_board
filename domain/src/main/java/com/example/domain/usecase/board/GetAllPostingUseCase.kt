package com.example.domain.usecase.board

import com.example.domain.repository.BoardRepository
import javax.inject.Inject

class GetAllPostingUseCase @Inject constructor(
    private val repository: BoardRepository
) {
    suspend fun getAllPost() = repository.getAllPosting()
}
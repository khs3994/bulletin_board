package com.example.domain.usecase.board

import com.example.domain.repository.BoardRepository
import javax.inject.Inject

class DeletePostUseCase @Inject constructor(
    private val repository: BoardRepository
) {
    suspend fun deletePost(boardId: Int) = repository.deletePost(boardId)
}
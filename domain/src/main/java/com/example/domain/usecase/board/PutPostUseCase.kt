package com.example.domain.usecase.board

import com.example.domain.dto.board.request.DomainPutPostRequest
import com.example.domain.repository.BoardRepository
import javax.inject.Inject

class PutPostUseCase @Inject constructor(
    private val repository: BoardRepository
) {
    suspend fun putPost(boardId: Int, body: DomainPutPostRequest) =
        repository.putPost(boardId, body)
}
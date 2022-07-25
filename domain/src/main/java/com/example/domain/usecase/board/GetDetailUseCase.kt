package com.example.domain.usecase.board

import com.example.domain.repository.BoardRepository
import javax.inject.Inject

class GetDetailUseCase @Inject constructor(
    private val repository: BoardRepository
) {
    suspend fun getDetail(boardId: Int) = repository.getDetail(boardId)
}
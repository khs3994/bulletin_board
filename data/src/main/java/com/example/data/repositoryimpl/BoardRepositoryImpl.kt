package com.example.data.repositoryimpl

import com.example.data.mapper.BoardMapper
import com.example.data.remote.datasource.BoardDataSource
import com.example.domain.dto.board.request.DomainPostCreatePostRequest
import com.example.domain.dto.board.request.DomainPutPostRequest
import com.example.domain.dto.board.response.DomainGetAllPostingResponse
import com.example.domain.dto.board.response.DomainGetDetailResponse
import com.example.domain.repository.BoardRepository
import retrofit2.Response
import javax.inject.Inject

class BoardRepositoryImpl @Inject constructor(
    private val dataSource: BoardDataSource
) : BoardRepository {
    override suspend fun getAllPosting(): Response<DomainGetAllPostingResponse> {
        TODO("Not yet implemented")
    }

    override suspend fun getDetail(boardId: Int): DomainGetDetailResponse? {
        return BoardMapper.getDetailMapper(dataSource.getDetail(boardId))
    }

    override suspend fun postCreatePost(body: DomainPostCreatePostRequest): Void? {
        TODO("Not yet implemented")
    }

    override suspend fun deletePost(boardId: Int): Response<Void> {
        TODO("Not yet implemented")
    }

    override suspend fun putPost(boardId: Int, body: DomainPutPostRequest): Response<Void> {
        TODO("Not yet implemented")
    }

}
package com.example.data.repositoryimpl

import com.example.data.mapper.BoardMapper
import com.example.data.remote.datasource.BoardDataSource
import com.example.data.remote.dto.board.request.DataPostCreatePostRequest
import com.example.data.remote.dto.board.request.DataPutPostRequest
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
    override suspend fun getAllPosting(): DomainGetAllPostingResponse? {
        return BoardMapper.getAllPostingMapper(dataSource.getAllPosting())
    }

    override suspend fun getDetail(boardId: Int): DomainGetDetailResponse? {
        return BoardMapper.getDetailMapper(dataSource.getDetail(boardId))
    }

    override suspend fun postCreatePost(body: DomainPostCreatePostRequest): Void? {
        return dataSource.postCreatePost(
            DataPostCreatePostRequest(
                title = body.title,
                description = body.description,
                userName = body.userName
            )
        )
    }

    override suspend fun deletePost(boardId: Int): Void? {
        return dataSource.deletePost(boardId)
    }

    override suspend fun putPost(boardId: Int, body: DomainPutPostRequest): Void? {
        return dataSource.putPost(
            boardId, DataPutPostRequest(
                title = body.title,
                description = body.description
            )
        )
    }

}
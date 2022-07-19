package com.example.data.repositoryimpl

import com.example.data.remote.datasource.BoardDataSource
import com.example.data.remote.dto.board.request.PostCreatePostRequest
import com.example.data.remote.dto.board.request.PutPostRequest
import com.example.data.remote.dto.board.response.GetAllPostingResponse
import com.example.data.remote.dto.board.response.GetDetailResponse
import com.example.domain.repository.BoardRepository
import retrofit2.Response
import javax.inject.Inject

class BoardRepositoryImpl @Inject constructor(
    private val dataSource: BoardDataSource
) : BoardRepository {
    override suspend fun getAllPosting(): Response<GetAllPostingResponse> {
        return dataSource.getAllPosting()
    }

    override suspend fun getDetail(boardId: Int): Response<GetDetailResponse> {
        return dataSource.getDetail(boardId = boardId)
    }

    override suspend fun postCreatePost(body: PostCreatePostRequest): Response<Void> {
        return dataSource.postCreatePost(body = body)
    }

    override suspend fun deletePost(boardId: Int): Response<Void> {
        return dataSource.deletePost(boardId = boardId)
    }

    override suspend fun putPost(boardId: Int, body: PutPostRequest): Response<Void> {
        return dataSource.putPost(boardId = boardId, body = body)
    }

}
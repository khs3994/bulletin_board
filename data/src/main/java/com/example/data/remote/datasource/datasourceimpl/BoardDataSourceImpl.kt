package com.example.data.remote.datasource.datasourceimpl

import com.example.data.remote.datasource.BoardDataSource
import com.example.data.remote.dto.board.request.PostCreatePostRequest
import com.example.data.remote.dto.board.request.PutPostRequest
import com.example.data.remote.dto.board.response.GetAllPostingResponse
import com.example.data.remote.dto.board.response.GetDetailResponse
import com.example.data.remote.network.BoardAPI
import retrofit2.Response
import javax.inject.Inject

class BoardDataSourceImpl @Inject constructor(
    private val board: BoardAPI
) : BoardDataSource {
    override suspend fun getAllPosting(): Response<GetAllPostingResponse> {
        return board.getAllPosting()
    }

    override suspend fun getDetail(boardId: Int): Response<GetDetailResponse> {
        return board.getDetail(boardId = boardId)
    }

    override suspend fun postCreatePost(body: PostCreatePostRequest): Response<Void> {
        return board.postCreatePost(body = body)
    }

    override suspend fun deletePost(boardId: Int): Response<Void> {
        return board.deletePost(boardId = boardId)
    }

    override suspend fun putPost(boardId: Int, body: PutPostRequest): Response<Void> {
        return board.putPost(boardId = boardId, body = body)
    }
}
package com.example.data.remote.datasource.datasourceimpl

import com.example.data.remote.datasource.BoardDataSource
import com.example.data.remote.dto.board.request.DataPostCreatePostRequest
import com.example.data.remote.dto.board.request.DataPutPostRequest
import com.example.data.remote.dto.board.response.DataGetAllPostingResponse
import com.example.data.remote.dto.board.response.DataGetDetailResponse
import com.example.data.remote.network.BoardAPI
import retrofit2.Response
import javax.inject.Inject

class BoardDataSourceImpl @Inject constructor(
    private val board: BoardAPI
) : BoardDataSource {
    override suspend fun getAllPosting(): Response<DataGetAllPostingResponse> {
        return board.getAllPosting()
    }

    override suspend fun getDetail(boardId: Int): DataGetDetailResponse? {
        return board.getDetail(boardId = boardId).body()
    }

    override suspend fun postCreatePost(body: DataPostCreatePostRequest): Void? {
        return board.postCreatePost(body = body).body()
    }

    override suspend fun deletePost(boardId: Int): Response<Void> {
        return board.deletePost(boardId = boardId)
    }

    override suspend fun putPost(boardId: Int, body: DataPutPostRequest): Response<Void> {
        return board.putPost(boardId = boardId, body = body)
    }
}
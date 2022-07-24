package com.example.data.remote.datasource

import com.example.data.remote.dto.board.request.DataPostCreatePostRequest
import com.example.data.remote.dto.board.request.DataPutPostRequest
import com.example.data.remote.dto.board.response.DataGetAllPostingResponse
import com.example.data.remote.dto.board.response.DataGetDetailResponse
import retrofit2.Response

interface BoardDataSource {
    suspend fun getAllPosting(): DataGetAllPostingResponse?

    suspend fun getDetail(boardId: Int): DataGetDetailResponse?

    suspend fun postCreatePost(
        body: DataPostCreatePostRequest
    ): Void?

    suspend fun deletePost(boardId: Int): Void?

    suspend fun putPost(
        boardId: Int,
        body: DataPutPostRequest
    ): Void?
}
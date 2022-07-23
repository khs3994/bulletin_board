package com.example.data.mapper

import com.example.data.remote.dto.board.request.DataPostCreatePostRequest
import com.example.data.remote.dto.board.response.DataGetDetailResponse
import com.example.domain.dto.board.request.DomainPostCreatePostRequest
import com.example.domain.dto.board.response.DomainGetDetailResponse

object BoardMapper {
    fun getDetailMapper(
        dataResponse: DataGetDetailResponse?
    ): DomainGetDetailResponse? {
        return if (dataResponse != null) {
            DomainGetDetailResponse(
                id = dataResponse.id,
                title = dataResponse.title,
                description = dataResponse.description,
                userName = dataResponse.userName
            )
        } else dataResponse
    }
}
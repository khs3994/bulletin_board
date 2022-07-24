package com.example.data.mapper

import com.example.data.remote.dto.board.response.DataGetAllPostingResponse
import com.example.data.remote.dto.board.response.DataGetDetailResponse
import com.example.domain.dto.board.response.DomainGetAllPostingResponse
import com.example.domain.dto.board.response.DomainGetDetailResponse
import com.example.domain.dto.board.response.DomainPostInfo

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

    fun getAllPostingMapper(
        dataResponse: DataGetAllPostingResponse?
    ): DomainGetAllPostingResponse? {
        return if (dataResponse != null) {
            DomainGetAllPostingResponse(
               list = dataResponse.list.map { DomainPostInfo(it.id,it.title,it.userName) }
            )
        } else dataResponse
    }
}
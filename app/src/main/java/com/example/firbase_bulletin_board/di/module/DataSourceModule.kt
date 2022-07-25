package com.example.firbase_bulletin_board.di.module

import com.example.data.remote.datasource.BoardDataSource
import com.example.data.remote.datasource.datasourceimpl.BoardDataSourceImpl
import com.example.data.remote.network.BoardAPI
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataSourceModule {

    @Provides
    @Singleton
    fun provideInfoDataSource (
        boardAPI: BoardAPI,
    ): BoardDataSource{
        return BoardDataSourceImpl(
            boardAPI
        )
    }

}
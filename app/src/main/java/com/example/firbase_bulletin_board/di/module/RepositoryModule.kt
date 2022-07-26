package com.example.firbase_bulletin_board.di.module

import com.example.data.remote.datasource.BoardDataSource
import com.example.data.repositoryimpl.BoardRepositoryImpl
import com.example.domain.repository.BoardRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @Provides
    @Singleton
    fun provideBoardRepository(dataSource: BoardDataSource): BoardRepository =
        BoardRepositoryImpl(dataSource)
}
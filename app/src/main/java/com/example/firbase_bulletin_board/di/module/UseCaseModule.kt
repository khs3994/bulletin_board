package com.example.firbase_bulletin_board.di.module

import com.example.domain.repository.BoardRepository
import com.example.domain.usecase.board.DeletePostUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {
}
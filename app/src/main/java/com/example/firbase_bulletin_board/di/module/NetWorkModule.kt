package com.example.firbase_bulletin_board.di.module

import com.example.data.remote.network.BoardAPI
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    private const val BASE_URL = com.example.firbase_bulletin_board.di.module.BASE_URL.BASE_URL

    @Provides
    @Singleton
    fun provideOkhttpClient(): OkHttpClient {
        return OkHttpClient.Builder()
            // 요청을 시작한 후 서버와의 TCP handshake 가 완료되기까지 지속되는 시간
            .connectTimeout(30, TimeUnit.SECONDS)
            // 모든 바이트가 전송되는 속도륵 감시
            .readTimeout(30, TimeUnit.SECONDS)
            // 읽기 타임 아웃의 반대 방향. 얼마나 빨리 서버에 바이트를 보낼 수 있는지 확인
            .writeTimeout(30, TimeUnit.SECONDS)
            .build()
    }

    @Provides
    @Singleton
    fun provideRetrofitInstance(
        okHttpClient: OkHttpClient,
        gsonConverterFactory: GsonConverterFactory
    ): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(okHttpClient)
            .client(provideOkhttpClient())
            .addConverterFactory(gsonConverterFactory)
            .build()
    }

    @Provides
    @Singleton
    fun provideConverterFactory(): GsonConverterFactory {
        return GsonConverterFactory.create()
    }

    @Provides
    @Singleton
    fun provideBoardService(retrofit: Retrofit): BoardAPI {
        return retrofit.create(BoardAPI::class.java)
    }
}

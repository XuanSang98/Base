package com.nguyenxuansangvn.demobase.data.api

import hu.akarnokd.rxjava3.retrofit.RxJava3CallAdapterFactory
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ServiceBuider {

    const val API_KEY = "6b33ddff475acb3ae48a5a0198f9de8a"
    const val NAME_API_KEY = "api_key"
    private const val BASE_URL = "https://api.themoviedb.org/3/"
    private val httpClient = OkHttpClient.Builder()
    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
        .client(addQueryParameters())
        .build()

    fun <T> buidService(service: Class<T>): T {
        return retrofit.create(service)
    }

    fun addQueryParameters(): OkHttpClient {
        return httpClient.addInterceptor(object : Interceptor {
            override fun intercept(chain: Interceptor.Chain): Response {
                val origial = chain.request()
                val origialHttpUrl = origial.url
                val url = origialHttpUrl.newBuilder()
                    .addQueryParameter(NAME_API_KEY, API_KEY)
                    .build()
                val requestBuilder = origial.newBuilder()
                    .url(url)
                val request = requestBuilder.build()
                return chain.proceed(request)
            }
        }).build()
    }

}

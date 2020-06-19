package com.nguyenxuansangvn.demobase.data.api

import com.nguyenxuansangvn.demobase.data.model.Popular
import com.nguyenxuansangvn.demobase.data.model.Upcoming
import io.reactivex.rxjava3.core.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("movie/upcoming")
    fun getUpcoming(@Query("page") page: Int):Observable<Upcoming>

    @GET("movie/popular")
    fun getPopular(@Query("page") page: Int):Observable<Popular>

}

package com.nguyenxuansangvn.demobase.data.source.remote

import com.nguyenxuansangvn.demobase.data.api.ApiService
import com.nguyenxuansangvn.demobase.data.model.Upcoming
import com.nguyenxuansangvn.demobase.data.source.UpcomingDataSource
import io.reactivex.rxjava3.core.Observable

class UpcomingRemoteDataSource(private val apiService: ApiService): UpcomingDataSource.Remote {
    override fun getUpcoming(page: Int): Observable<Upcoming> = apiService.getUpcoming(page)
}

package com.nguyenxuansangvn.demobase.data.repository

import com.nguyenxuansangvn.demobase.data.model.Upcoming
import com.nguyenxuansangvn.demobase.data.source.UpcomingDataSource
import io.reactivex.rxjava3.core.Observable

class UpcomingRepository(
    private val remote: UpcomingDataSource.Remote
) : UpcomingDataSource.Local, UpcomingDataSource.Remote {
    override fun getUpcoming(page: Int): Observable<Upcoming> = remote.getUpcoming(page)
}

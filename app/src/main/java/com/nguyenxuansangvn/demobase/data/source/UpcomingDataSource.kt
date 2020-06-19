package com.nguyenxuansangvn.demobase.data.source

import com.nguyenxuansangvn.demobase.data.model.Popular
import com.nguyenxuansangvn.demobase.data.model.Upcoming
import io.reactivex.rxjava3.core.Observable

interface UpcomingDataSource {
    interface Local
    interface Remote {
        fun getUpcoming(page: Int): Observable<Upcoming>
    }
}

package com.nguyenxuansangvn.demobase.ui.movie

import androidx.databinding.ObservableField
import com.nguyenxuansangvn.demobase.base.BaseViewModel
import com.nguyenxuansangvn.demobase.data.model.Upcoming
import com.nguyenxuansangvn.demobase.data.repository.UpcomingRepository
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.kotlin.addTo
import io.reactivex.rxjava3.schedulers.Schedulers

class MovieViewModel(
    private val repositoryUpcoming: UpcomingRepository
): BaseViewModel<Upcoming>() {

    override val observableField: ObservableField<Upcoming> = ObservableField()
    override val compositeDisposable: CompositeDisposable = CompositeDisposable()

    fun getUpcoming(page: Int){
        repositoryUpcoming.getUpcoming(page)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe{
               observableField.set(it)
            }
            .addTo(compositeDisposable)
    }
}

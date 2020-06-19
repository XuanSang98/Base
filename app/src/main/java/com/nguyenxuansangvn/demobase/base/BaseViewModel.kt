package com.nguyenxuansangvn.demobase.base

import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import io.reactivex.rxjava3.disposables.CompositeDisposable

abstract class BaseViewModel<T>: ViewModel() {

    abstract val observableField: ObservableField<T>
    abstract val compositeDisposable:CompositeDisposable

    override fun onCleared() {
        super.onCleared()
        compositeDisposable.dispose()
    }
}

package com.nguyenxuansangvn.demobase.base

import android.view.View
import androidx.recyclerview.widget.RecyclerView

abstract class BaseViewHolder<T>(view: View) : RecyclerView.ViewHolder(view) {
    private var item: T? = null

    open fun bindData(item: T) {
        this.item = item
    }
}

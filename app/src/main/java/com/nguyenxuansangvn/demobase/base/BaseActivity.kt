package com.nguyenxuansangvn.demobase.base

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {
    @get:LayoutRes
    protected abstract val layoutId: Int

    abstract fun initComponents()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutId)
        initComponents()
    }
}

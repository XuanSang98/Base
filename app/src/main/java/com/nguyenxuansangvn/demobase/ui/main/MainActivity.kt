package com.nguyenxuansangvn.demobase.ui.main

import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.nguyenxuansangvn.demobase.R
import com.nguyenxuansangvn.demobase.base.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity(){
    override val layoutId: Int = R.layout.activity_main
    private val navHostFragment: NavHostFragment? by lazy {
        supportFragmentManager.findFragmentById(R.id.fragmentMain) as NavHostFragment?
    }

    override fun initComponents() {
        navHostFragment?.let {  NavigationUI.setupWithNavController(bottomNavigationView,it.navController) }
    }
}

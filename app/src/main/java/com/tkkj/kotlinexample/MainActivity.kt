package com.tkkj.kotlinexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    /**
     * 初始化
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    override fun checkPermission(permission: String?, pid: Int, uid: Int): Int {
        return super.checkPermission(permission, pid, uid)

    }
}

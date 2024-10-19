package com.hong.toast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hong.library.toast.ToastUtils

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ToastUtils.showToast(this, "Hello Toast")
    }
}
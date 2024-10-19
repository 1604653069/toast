package com.hong.library.toast

import android.content.Context
import android.os.Handler
import android.os.Looper
import android.widget.Toast

/**
 * @author: hong
 * @version: 1.0
 * @date: 2024/10/19
 * @description:toast工具类
 */
object ToastUtils {
    private val myHandler = Handler(Looper.getMainLooper())
    private var toast: Toast? = null
    fun showToast(context: Context, text: String) {
        myHandler.post {
            toast = if (toast != null)
                Toast(context)
            else
                Toast.makeText(context, text, Toast.LENGTH_SHORT)
            toast?.show()
        }

    }

    fun cancelToast() {
        myHandler.post {
            if (toast != null)
                toast?.cancel()
            toast = null
        }
    }
}
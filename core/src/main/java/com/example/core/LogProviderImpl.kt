package com.example.core

import android.util.Log
import javax.inject.Inject

class LogProviderImpl @Inject constructor(): LogProvider {
    override fun log(message: String) {
        Log.d("!!!!!!!", message)
    }
}
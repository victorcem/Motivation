package com.victorcastro.motivation.data.response

import android.content.Context

class SecurityResponse (context: Context) {

    private val mSharedPreferences =
        context.getSharedPreferences("motivation", Context.MODE_PRIVATE)

    fun storeString(key: String, value: String) {
        mSharedPreferences.edit().putString(key, value).apply()
    }

    fun getString(key: String): String {
        return mSharedPreferences.getString(key, "") ?: ""
    }

}
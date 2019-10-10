package com.example.dagger
import android.app.Activity
import android.app.Application
import com.example.dagger.di.ApiComponent
import com.example.dagger.di.ApiModule
import com.example.dagger.di.DaggerApiComponent

import dagger.android.AndroidInjector
import dagger.android.HasActivityInjector

class MyApplication : Application() {

    lateinit var apiComponent: ApiComponent
    override fun onCreate() {
        super.onCreate()
        apiComponent = DaggerApiComponent.builder().
            apiModule(ApiModule())
            .build()
    }

    fun getAppComponent() : ApiComponent = apiComponent

    fun getApiInterface() : ApiInterface = apiComponent.getApiInterface()
}
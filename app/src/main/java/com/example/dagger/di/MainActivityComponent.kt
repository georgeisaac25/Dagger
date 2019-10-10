package com.example.dagger.di

import com.example.dagger.ApiInterface
import com.example.dagger.MyAdapter
import dagger.Component

@ActivityScope
@Component(modules = [MainActivityModule::class],dependencies = [ApiComponent::class])
interface MainActivityComponent{
    fun getMyAdapter(): MyAdapter
    fun getApiInterface() : ApiInterface
}
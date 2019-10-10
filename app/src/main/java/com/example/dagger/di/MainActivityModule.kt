package com.example.dagger.di

import com.example.dagger.ApiInterface
import com.example.dagger.MainActivity
import com.example.dagger.MyAdapter

import dagger.Module
import dagger.Provides

@Module
class MainActivityModule(var mainActivity: MainActivity){




    @ActivityScope
    @Provides
    fun getMyAdapter(apiInterface: ApiInterface) : MyAdapter {
        return MyAdapter(mainActivity,apiInterface)
    }


}
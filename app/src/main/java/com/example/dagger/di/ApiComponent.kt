package com.example.dagger.di

import com.example.dagger.ApiInterface
import dagger.Component

@ApplicationScope
@Component(modules = [ApiModule::class])
interface ApiComponent {
    fun getApiInterface() : ApiInterface

    fun getSubComponentModule(subComponentModule: SubComponentModule) : MySubComponent



    //fun inject(mainActivity: MainActivity)
}
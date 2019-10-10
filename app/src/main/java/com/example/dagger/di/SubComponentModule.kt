package com.example.dagger.di

import com.example.dagger.ApiInterface
import com.example.dagger.SubModuleActivity
import com.example.dagger.SubModuleAdapter

import dagger.Module
import dagger.Provides
import dagger.Subcomponent
import javax.inject.Scope

@Module
class SubComponentModule(var subComponentModuleActivity: SubModuleActivity) {

    @SubComponentScope
    @Provides
    fun getSubModuleAdapter(apiInterface: ApiInterface) : SubModuleAdapter {
        return SubModuleAdapter(subComponentModuleActivity,apiInterface)
    }
}
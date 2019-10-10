package com.example.dagger.di

import com.example.dagger.SubModuleAdapter
import dagger.Subcomponent

@SubComponentScope
@Subcomponent(modules = [SubComponentModule::class])
interface MySubComponent {
    fun getSubModuleAdapter(): SubModuleAdapter
}
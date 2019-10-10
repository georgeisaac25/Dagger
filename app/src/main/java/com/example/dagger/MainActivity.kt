package com.example.dagger

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.dagger.di.DaggerMainActivityComponent
import com.example.dagger.di.MainActivityModule

import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var apiInterface: ApiInterface

    @Inject
    lateinit var myAdapter: MyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var mainActivityComponent = DaggerMainActivityComponent.builder()
            .mainActivityModule(MainActivityModule(this))
            .apiComponent((this.application as MyApplication).getAppComponent())
           .build()

        myAdapter = mainActivityComponent.getMyAdapter()
        Log.e("adapter",""+myAdapter)

        //mainActivityComponent.
    }

}
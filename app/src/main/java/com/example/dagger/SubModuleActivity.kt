package com.example.dagger
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.dagger.di.SubComponentModule


class SubModuleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val subModuleComponent = (this.application as MyApplication).getAppComponent()
            .getSubComponentModule(SubComponentModule(this))

        var subModuleAdapter:SubModuleAdapter=subModuleComponent.getSubModuleAdapter()


        Log.e("adapter",""+subModuleAdapter)




        //mainActivityComponent.
    }


}
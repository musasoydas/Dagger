package com.musasoydas.dagger

import android.app.Activity
import dagger.Component
import javax.inject.Inject

//burada projendeki  modüllerini tanımlıyorsun
@Component(modules = [AppModule::class])
interface AppCompanent {
    //bu modüle nerede tanımlaanacak onu belirtmek için
    fun inject(activity: MainActivity)


}
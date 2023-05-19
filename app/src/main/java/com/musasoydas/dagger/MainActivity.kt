package com.musasoydas.dagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.android.support.DaggerAppCompatActivity
import dagger.internal.DaggerCollections
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    //    private lateinit var kargo: Kargo  private kullanımına izin vermez
    @Inject
    lateinit var kargo: Kargo

    @Inject
    lateinit var internet: Internet

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerAppCompanent.builder.build.inject(this)
        kargo.siparisTakip()

        internet.basvuruYap()

    }
}
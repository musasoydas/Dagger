package com.musasoydas.dagger

import dagger.Module
import dagger.Provides

@Module
class AppModule {
    //@Provides sağlayıcı demek
    @Provides
    //biz bağlı olan nesneyi buraya yazıyoruyz
    fun provideAdres(): Adres{
        return Adres("Tuzla / İstanbul")

    }
}
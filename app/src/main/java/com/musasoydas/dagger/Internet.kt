package com.musasoydas.dagger

import javax.inject.Inject

class Internet @Inject constructor(var adres: Adres){

    fun basvuruYap(){
        println("İnternet başvurusu ${adres.adresBilgisi} adresine yapılmıştır")
    }
}
package com.musasoydas.dagger

import javax.inject.Inject

class Kargo @Inject constructor( var adres: Adres) {

    fun siparisTakip(){
        println("Kargonuz  ${adres.adresBilgisi} adresine yola çıkmıştır")
    }
}
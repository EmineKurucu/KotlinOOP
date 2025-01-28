package com.eminekurucu.kotlinoop

class Kopek() : Hayvan() {

    fun havla() {
        println("Kopek havladi")
        // super.sesCikar() ile Hayvan sınıfının methodu kullanılabilir
    }

    override fun sesCikar() { // ayni isimle method tanimlamak için override
        println("Kopek ses cikardi")
    }
}
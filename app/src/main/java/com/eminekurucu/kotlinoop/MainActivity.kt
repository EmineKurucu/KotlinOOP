package com.eminekurucu.kotlinoop

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val atil = Sanatci("Atil", 32, "Guitar", "mavi")
        atil.name = "Atil Samancioglu"
        println(atil.name)
        println(atil.age)
        println(atil.instruments)
        atil.sacRengi = "kizil"
        println(atil.sacRengi)
        // println(atil.tur) görülmüyor çünkü private
        println(atil.turuYazdır()) // insan
        // atil.gozRengi = "kahverengi" // hata verir
        println(atil.evcilHaycan)

        atil.sarkiSoyle()

        // başka bir object oluşturucaz
        val kerem = Sanatci("Kerem Sedef", 42, "Bateri", "kahverengi")
        kerem.sarkiSoyle()
        kerem.setTur("kus")
        kerem.getTur() // kus


        // Encapsulation
        println("---Encapsulation---")

        // visibility modifiers: private , protected, internal, public
        // default olan: public

        // Inheritance sınıf bir başka sınıfın özelliklerini alabilir
        val kahraman = Kahraman("Eddie Brock", "venom")
        kahraman.kos()

        val muhtesemKahraman = MuhtesemKahraman("batman", "zengin olmak")
        muhtesemKahraman.kos() // muhtesemKahraman. diyince Kahraman sınıfının methodları da çıkar
        muhtesemKahraman.muhtesemFonks()


        // Polymorphism
        val islemler = Islemler()
        println(islemler.cikarma(10,3)) // 7
        println(islemler.cikarma(10,3,2)) // 5
        println(islemler.cikarma(10,3,2,1)) // 4

        println("Static Polymorphism")
        val kedi = Hayvan()
        val kopek = Kopek()
        kedi.sesCikar() // hayvan ses çikardi
        kopek.havla() // kopek havladi
        kopek.sesCikar() // kopek ses çıkardı
        println("---------")

        println("Dinamic Polymorhizm")
        val ornDizi = arrayOf(kedi, kopek)
        ornDizi.forEach {
            it.sesCikar()
        } // hayvan ses çıkardi / kopek ses çıkardı

        // Abstraction
        println("---Abstraction---")

    }
}
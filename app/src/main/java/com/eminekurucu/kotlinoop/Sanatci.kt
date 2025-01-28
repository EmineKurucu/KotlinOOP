package com.eminekurucu.kotlinoop

class Sanatci(var name: String, var age : Int, var instruments: String, val gozRengi: String) { // primary constr.
    // tüm propertiesler belirtilmek zorunda değil constructor'da
    var sacRengi = "sarısın" // public dışarıdan müdahaleye açık
    private var tur = "insan" // private dışarıdan müdahaleye kapalı

    // primary constructor da val ile tanımlarsak ilk atamada değer alınır ama sonradan değiştirilemez
    // private tanımlamış gibi olur private setter public getter mantığı
    // constructor da var val hiçbir şey belirtmezsek ilk atamada değer alırız sonrasında
    // değiştiremeyiz , ekrana yazdıramayız sınıfın içinde bile

    var evcilHaycan = "kedi" // değiştirilemez ama erişilebilir
        private set
        public get

    fun setTur(yeniTur : String){
        this.tur = yeniTur
    }

    fun getTur(){
        println(tur)

    }



    fun sarkiSoyle(){
        println("Su sanatci sarki soyledi: ${this.name}")

    }

    fun turuYazdır(){
        println(tur) // class içinde müdahaleye açık
    }
}
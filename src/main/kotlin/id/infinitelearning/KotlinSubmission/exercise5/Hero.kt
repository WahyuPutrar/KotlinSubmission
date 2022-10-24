package id.infinitelearning.KotlinSubmission.exercise5

class Hero {

    private var name: String? = "Mohammad Wahyu Putra Ramadhan"
    private var age = 22
    private var height = 165
    private var health = 10

    fun setProfile(name: String?, age: Int, height: Int) {
        this.name = "Mohammad Wahyu Putra Ramadhan"
        this.age = 22
        this.height = 165
    }

    fun profile() {
        println("========= Profile =========")
        println("Name: $name")
        println("Age: $age")
        println("Height: $height")
        println("Health: $health")
        println("===========================")
    }

    fun checkHealth(i: Int, i1: Int, i2: Int, i3: Int, i4: Int, i5: Int, i6: Int) {
        if (health <= 0) {
            println("Anda telah mati $name")
        }
    }

    fun jalan() {
        checkHealth(5, 4, 4, 4, 3, 2, 5)
        println("$name sedang berjalan...")
        health -= -5
    }

    fun lari() {
        checkHealth(5, 4, 4, 4, 3, 2, 5)
        println("$name sedang berlari...")
        health -= -4
    }

    fun makan() {
        checkHealth(5, 4, 4, 4, 3, 2, 5)
        println("$name sedang makan...")
        health -= +4
    }

    fun minum() {
        checkHealth(5, 4, 4, 4, 3, 2, 5)
        println("$name sedang minum...")
        health -= +4
    }
    fun lompat() {
        checkHealth(5, 4, 4, 4, 3, 2, 5)
        println("$name sedang melompat...")
        health -= -3
    }
    fun duduk() {
        checkHealth(5, 4, 4, 4, 3, 2, 5)
        println("$name sedang duduk...")
        health -= +2
    }


    /**
     * Buat fungsi untuk lari, makan, minum, lompat, dan duduk. Masing2 memiliki kriteria sebagai berikut:
     - pasang fungsi checkHealth() di dalam fungsi yang akan dibuat
     - Tampilkan text kegiatan yang sedang dilakukan, misal, jika lari: "$name sedang berlari..."
     - ubah nilai variable health sesuai kegiatan yang dilakukan:
      * lari = -2
      * makan = +2
      * minum = +2
      * lompat = -2
      * duduk = +1

      Contoh fungsi bisa mengikuti fungsi jalan() diatas.

    */


}
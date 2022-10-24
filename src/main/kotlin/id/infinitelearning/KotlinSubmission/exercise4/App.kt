package id.infinitelearning.KotlinSubmission.exercise4

fun main() {

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */

    fun main(args : Array<String>){
        try{
            var num = 100 / 0
        }
        catch(e: ArithmeticException){
            println("Divide by zero not allowed")
        }
    }



}



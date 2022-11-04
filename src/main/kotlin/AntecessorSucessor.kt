class AntecessorSucessor {

    fun antecessorEsucessor(){
        println("Digite um numero inteiro para saber o ANTECESSOR E SUCESSOR desse numero: ")
        val numInt = readln().toInt()

        val ant = numInt - 1
        val suce = numInt + 1

        println("O ANTECESSOR de $numInt é $ant, e o SUCESSOR de $numInt é $suce")

    }
}
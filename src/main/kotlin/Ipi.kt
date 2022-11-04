class Ipi {

    fun porcentagemIpi(){
        val ipi = 0.35

     /*   println("Qual código da primeira peça: ")
        val peca1 = readln().toInt()*/
        println("Qual valor unitário da peça: ")
        val valUnipeca1 = readln().toInt()
        println("Qual quantidade de peças: ")
        val quantPeca1 = readln().toInt()

/*        println("Qual código da segunda peça: ")
        val peca2 = readln().toInt()*/
        println("Qual valor unitario da peça: ")
        val valUnipeca2 = readln().toInt()
        println("Qual a quantidade de peças: ")
        val quantPeca2 = readln().toInt()

        val totalPagar = (valUnipeca1 * quantPeca1 + valUnipeca2 * quantPeca2) * (ipi / 100 + 1)

        println("O valor total a ser pago é de $totalPagar")
    }
}
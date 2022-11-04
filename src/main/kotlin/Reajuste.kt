class Reajuste {

    fun reajuste(){
        println(" Digite o saldo do seu cartão: ")

        val saldoDocartao = readln().toInt()
        val reajusteDosaldo = saldoDocartao * 0.01

        val totalReajuste = reajusteDosaldo + saldoDocartao

        println("Seu saldo de $saldoDocartao foi reajustado para $totalReajuste ")

    }
}
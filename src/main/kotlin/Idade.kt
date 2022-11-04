class Idade {
    fun idadeEmDias(anos: Int, meses: Int, dias: Int){
        val resultado = (365 * anos) + meses * 30 + dias

        println("$anos Anos $meses meses $dias dias = $resultado  ")
    }

}
class Salario {

    fun quantidadeSalario(){
        val salarioMinimo = 1212

        println("Digite o valor do seu salário: ")
        val salarioFuncionario = readln().toInt()

        val quantSalario = salarioFuncionario / salarioMinimo

        if (quantSalario == 1)
            println("Você recebe a quantidade de $quantSalario salario minimo")
        else {
            println("Você recebe a quantidade de $quantSalario salários minimos")
        }
    }

}
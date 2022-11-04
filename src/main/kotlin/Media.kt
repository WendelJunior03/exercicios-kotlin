class Media {
    fun mediaDasMedias(){
        println("Digite 3 números inteiros para media 1 ")

        println("Digite o primeiro numero: ")
        val num1 = readln().toInt()
        println("Digite o segundo numero: ")
        val num2 = readln().toInt()
        println("Digite o terceiro numero")
        val num3 = readln().toInt()

        val media1 = num1 + num2 + num3 / 3

        println("Digite mais 3 numeros inteiros para media 2 ")

        println("Digite o primeiro numero: ")
        val nume1 = readln().toInt()
        println("Digite o segundo numero: ")
        val nume2 = readln().toInt()
        println("Digite o terceiro numero: ")
        val nume3 = readln().toInt()

        val media2 = nume1 + nume2 + nume3 / 3

        val mediaTotal = media1 + media2

        println("A media das medias é $mediaTotal")
    }

}
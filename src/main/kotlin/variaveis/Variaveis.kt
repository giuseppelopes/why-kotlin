package variaveis

class Variaveis {

    /*
     Váriaveis
         É um valor ou expressão na memória
         No Kotlin pode ser VAL ou VAR
         Tipo "pode ser" omitido.

      VAL x VAR
         VAL = Valor IMUTAVEL - Estado não pode ser modificado após criado; Como o Final no Java;
         VAR = Variavel - Mutável = Valor da Váriavel pode ser modificado após criar
     */

    // Exemplos:

    fun imutaveis() {
        val nome_imutavel = "Gariba Imutavel"
        val nome_imutavel_tipada: String = "Gariba Imutavel Tipada"

        //nome_imutavel = "teste imutavel"  // Val cannot be reassigned
    }

    fun mutaveis() {
        var nome_mutavel = "Gariba mutavel"
        var nome_mutavel_tipada: String = "Gariba mutavel Tipada"

        println(nome_mutavel)
        nome_mutavel = "Alteramos a variavel nome_mutavel!!!"
        println(nome_mutavel)
    }

    fun tipagem() {

        //Inteiros
        var inteiro: Int = 1
        var long: Long = 1L // ou var long: Long = 1
        var short: Short = 1
        var byte: Byte = 1
        //Flutuantes
        var buleano: Double = 1.2
        var float: Float = 1.2F // ou var float: Float = 1.2f

        //texto
        var string: String = "string"
        var char: Char = 'C'
        var variasLinhas: String = """ Teste de string entre 3 aspas duplas
                                       com varias linhas sem utilizar o sinal 
                                       de + para concatenar. """

        //Booleano
        var boolean: Boolean = true // boolean

    }

    fun conversoes() {

        var meuInteiro: Int = 1
        var meuFloat: Float = meuInteiro.toFloat()

        var meuNumeroString: String = "123"
        var meuNumeroInteiro: Int = meuNumeroString.toInt()

    }

    fun arrays() {

        var numeros = intArrayOf( 1, 2, 3)

        var numerosTipando = arrayOf<Int>(1, 2, 3)

        var array = arrayOf( 1, "2", 3.0F)

    }


}
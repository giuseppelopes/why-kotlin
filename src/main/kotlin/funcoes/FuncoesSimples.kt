package funcoes

class FuncoesSimples {

    fun functionVoid() { //
        println("Função simples sem retorno e sem parametro")
    }

    fun function(): Int { //Sem declarar o tipo do retorno
        return 1;
    }

    fun function( idade: Int ): (Int) { //Declarando o tipo do retorno
        return idade
    }

    fun functionSimplificada( idade: Int ) = idade //função simplificada

}
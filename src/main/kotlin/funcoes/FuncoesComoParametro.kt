package funcoes

import java.time.LocalDate

class FuncoesComoParametro {

    var anoAtual: Int = LocalDate.now().year

    fun calculaIdade ( anoNascimento: Int ): (Int) {
        return anoAtual - anoNascimento
    }

    fun funcaoSuperior( anoNascimento: Int, funcaoParametro : (Int) -> Int ): Int { //funcaoParametro recebe calcularIdade
        return funcaoParametro(anoNascimento)
    }

}
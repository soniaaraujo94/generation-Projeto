package classes

import superclass.Metabolica

open class Mulher(altura: Double, peso: Double, idade: Int, nome: String) :
    Metabolica(altura, peso, idade) {

     fun tmb(altura: Double, peso: Double, idade: Int): Double {
        super.tmb()
        var auxAltura = altura * 100
        var calcTbm = 665 + (9.6 * peso) + (1.8 * auxAltura) - (4.7 * idade)
        println("\nTaxa metabólica: " + "%.2f".format(calcTbm))
        return calcTbm
    }
}
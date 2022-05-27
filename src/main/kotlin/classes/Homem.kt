package classes

import superclass.Metabolica

open class Homem( altura: Double, peso: Double, idade: Int) :
            Metabolica(altura, peso, idade) {

     fun tmb(idade: Int, altura: Double, peso: Double): Double{
        val auxAltura = altura * 100

        var calcTbm = 66 + (13.7 * peso) + (5.0 * auxAltura) - (6.8 * idade)
         calcTbm = Math.round(calcTbm).toDouble()
        println("\nTaxa metabólica: " + "%.2f".format(calcTbm))
        return calcTbm
    }


}






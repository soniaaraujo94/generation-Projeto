package superclass
open class Metabolica(
    var altura: Double,
    var peso: Double,
    var idade: Int) {

        /*
        fun verificaIdade(idade: Int){
            if (idade in 0 .. 12){
                println("Categoria: Criança")
            }else if (idade in 12 .. 18){
                println("Categoria: Jovem")
            }else if (idade in 18 ..50){
                println("Categoria: Adulto")
            }else if (idade >= 50){
                println("Categoria: Idoso")
            }else{
                println("Idade Inválida")
            }
        }*/

        companion object {
            fun imc(peso: Double, altura: Double): Double {
                val calcImc = peso / Math.pow(altura, 2.0)

                if (calcImc in 0.0..18.5) {
                    println("Abaixo do peso")
                } else if (calcImc in 18.51..24.9) {
                    println("Peso normal")
                } else if (calcImc in 24.91..29.9) {
                    println("Sobrepeso")
                } else if (calcImc in 29.91..34.9) {
                    println("Obesidade Grau I")
                } else if (calcImc in 34.91..39.9) {
                    println("Obesidade Severa - Grau II")
                } else if (calcImc >= 39.91) {
                    println("Obesidade Mórbida - Grau II")
                } else {
                    println("Morto")
                }


                println("IMC: " + "%.2f".format(calcImc))
                return calcImc
            }

        }

        open fun tmb() {}

}



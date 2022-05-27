import classes.Homem
import classes.Mulher
import superclass.Metabolica

fun main() {

    while (true) {
        println("\n-----------------------------------------------------\n")
        println(" ***** Bem Vindo *****\n")

        println(
            "O que você deseja calcular hoje? " +
                    "\nDigite: 1 - IMC" +
                    "\nDigite: 2 - Taxa metabólica" +
                    "\nDigite: 3 - Sair"
        )

        when (readln().toInt()) {

            1 -> {
                println("--> IMC <--")
                println("Digite o seu peso:")
                val peso = readln().toDouble()
                println("Digite a sua altura: ")
                val altura = readln().toDouble()
                Metabolica.imc(peso, altura)
            }
            2 -> {
                println("--> Verificar a Taxa Metabólica <--")
                println("Digite a sua idade: ")
                val idade = readln().toInt()
                println("Digite a sua altura: ")
                val altura = readln().toDouble()
                println("Digite o seu peso: ")
                val peso = readln().toDouble()
                println(
                    "Qual o seu sexo: " +
                            "\nDigite: 1 - Homem" +
                            "\nDigite: 2 - Mulher"
                )

                when (readln().toInt()) {
                    1 -> {
                        val homem = Homem(altura, peso, idade)
                        println("'-.-' Taxa Metabólica Basal '-.-'")
                        homem.tmb(idade, altura, peso)
                    }
                    2 -> {
                        val mulher = Mulher(altura, peso, idade, "")
                        println("'-.-' Taxa Metabólica Basal '-.-'")
                        mulher.tmb(altura, peso, idade)

                    }



                }

            }


            3 -> {
                println("Programa finalizado")
                break
            }
                else -> {
                     println("Valor inválido")
            }

        }


    }

}
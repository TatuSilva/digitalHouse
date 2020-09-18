package digitalHouse.ExerciciosKotlin2.Atletas

class Exercicio3

fun main() {
    val atleta1 = Atletas("Silva", 10, 10)
    val atleta2 = Atletas("João", 5, 8)
    val prova1 = Prova(10, 8)
    val prova2 = Prova(5, 3)
    val prova3 = Prova(2, 9)

    prova1.podeRealizar(atleta1) // true
    prova2.podeRealizar(atleta1) // true
    prova3.podeRealizar(atleta1) // true
    prova1.podeRealizar(atleta2) // false
    prova2.podeRealizar(atleta2) // true
    prova3.podeRealizar(atleta2) // false

}
package digitalHouse.ExerciciosKotlin2.Atletas

class Prova (var dificuldade: Int, var energiaNecessaria: Int){
    fun podeRealizar(atletas: Atletas) {
        if (energiaNecessaria <= atletas.energia && dificuldade <= atletas.nivel) println("true: ${atletas.nome} pode realizar a prova.")
        else println("false: ${atletas.nome} não pode realizar a prova.")

//        when {
//            energiaNecessaria >= atletas.energia && dificuldade <= atletas.nivel -> println(true)
//            else -> println(false)
//        }
    }
}
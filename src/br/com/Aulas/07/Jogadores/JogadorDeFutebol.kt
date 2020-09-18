package digitalHouse.ExerciciosKotlin2.Jogadores

class JogadorDeFutebol(var nome: String, var energia: Int, var alegria: Int, var gols: Int, var experiencia: Int) {
    fun fazerGol(){
        energia -= 5
        alegria += 10
        gols += 1
        println("GOOOOL! de $nome")
    }
    fun correr(){
        energia -= 10
        println("$nome diz: Cansei")
    }
}
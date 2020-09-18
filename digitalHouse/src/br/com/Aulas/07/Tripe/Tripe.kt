package digitalHouse.ExerciciosKotlin2.Tripe

class Tripe (var dobrado: Boolean, var alturaMinima: Double, var alturaMaxima: Double, var alturaAtual: Double) {
    fun definirAltura(novaAltura: Double){
        alturaAtual = novaAltura
    }
    fun dobrar() {
        dobrado = true
    }
    fun desdobrar(){
        dobrado = false
    }
    fun guardar(){
        dobrado = true
        alturaAtual = alturaMinima
    }
    fun prontoParaGuardar(){
        if (dobrado === true && alturaAtual === alturaMinima) println("O tripé está pronto para ser guardado")
        else println("O tripé não está pronto para ser guardado")
    }
    fun usar(){
        dobrado = false
        alturaAtual = alturaMaxima/2+1
    }
    fun prontoParaUsar(){
        if(dobrado === false && alturaAtual > alturaMaxima/2+1) println("O tripé está pronto para ser usado")
        else println("O tripé não está pronto para ser usado")
    }
}
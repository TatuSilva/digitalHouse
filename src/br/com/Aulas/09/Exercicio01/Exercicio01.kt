package br.DigitalHouse.Aula09.Exercicio01

class Exercicio01 {

}

fun main() {
  val LoteriaDosSonhos = mutableMapOf(0 to "Ovos", 1 to "Água",
                                                            2 to "Escopeta", 3 to "Cavalo",
                                                            4 to "Dentista", 5 to "Fogo")
  val apelidos = mapOf("João" to "Juan, Fissura, Maromba",
    "Miguel" to "Night Watch, Bruce Wayne, Tampinha",
    "Maria" to "Wonder Woman, Mary, Marilene",
    "Lucas" to "Lukinha, Jorge, George")
  LoteriaDosSonhos.forEach {println(it)}
  println("<------------->")
  apelidos.forEach{println(it)}
}
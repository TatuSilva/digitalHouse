package digitalHouse
//Escreva uma classe que receba como parâmetro uma idade, um sexo e os anos de contribuição para a aposentadoria e desenvolva uma função que imprime no console verdadeiro ou falso.
//Lembrando que:
//- A idade mínima para mulheres é de 60 anos;
//- A idade mínima para homens é de 65 anos;
//- Em ambos os casos as pessoas devem ter pelo menos 30 anos de contribuição.

class Aposentar (var idade:Int, var sexo: String, var tempoTrabalho: Int) {

    fun validar (idade: Int, sexo: String, tempoTrabalho: Int) : String {
        var trueOrFalse: String = "falso"
        if (idade <= 0 || tempoTrabalho < 0) trueOrFalse = "Dados Incorretos"
        if (sexo === "F" && idade >= 60 && tempoTrabalho >= 30) trueOrFalse = "verdadeiro"
        if (sexo === "M" && idade >= 65 && tempoTrabalho >= 30) trueOrFalse = "verdadeiro"
        return trueOrFalse
    }
    init{
        println("Aposentadoria Aceita? ${validar(idade, sexo, tempoTrabalho)}")
    }
}
package br.digitalHouse.Aula6.Interfaces

fun main() {
    val foto = Foto()
    val documento = Documento()
    val contrato = Contrato()

    val imprimeFoto = Impressora(foto)
    val imprimeDoc = Impressora(documento)
    val imprimeContrato = Impressora(contrato)

    imprimeFoto.addImpressora()
    imprimeDoc.addImpressora()
    imprimeContrato.addImpressora()

    imprimeFoto.imprimeLista()
    imprimeDoc.imprimeLista()
    imprimeContrato.imprimeLista()
}
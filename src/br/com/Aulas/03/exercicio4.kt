package br.com.digitalhouse.Aula03

//Escrever um programa que imprima na tela os primeiros 100 números inteiros positivos ímpares.

fun main() {
    for (i in 1..100)
        if (i%2 !== 0)
            println(i)
}
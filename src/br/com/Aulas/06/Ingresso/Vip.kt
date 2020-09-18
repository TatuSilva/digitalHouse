package br.digitalHouse.Aula6.Ingresso

open abstract class Vip(valor: Double): Ingresso(valor) {
   var adicional = 20.00
   open fun valorVip(): Double = valor+adicional
}
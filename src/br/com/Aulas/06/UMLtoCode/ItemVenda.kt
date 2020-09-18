package br.digitalHouse.Aula6.UMLtoCode

    class ItemVenda (var produto: String = "", var quantidade :Int = 0, var valor: Double = 0.00): IRecebiveis{

        override fun totalizarReceita(): Double {
            return valor*quantidade
        }

        open fun ItemVenda(){
            println("$quantidade x $produto -- valor unitário: $valor -- valor total: ${totalizarReceita()} ")
        }

        fun toString(produto: String): String {
            return produto
        }


    }

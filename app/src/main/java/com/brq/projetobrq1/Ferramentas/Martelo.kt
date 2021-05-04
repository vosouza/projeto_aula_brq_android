package com.brq.projetobrq1.Ferramentas

class Martelo(var objeto: String): InterfaceFerramenta {

    override fun usarFerramenta(): String {
        return "Batendo o prego no/na $objeto"
    }
}
package com.brq.projetobrq1.Ferramentas

class Pincel(val corDaTinta: String): InterfaceFerramenta {


    override fun usarFerramenta(): String {
        return "Pintando tudo de $corDaTinta"
    }
}
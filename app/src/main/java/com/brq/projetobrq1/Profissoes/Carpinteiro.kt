package com.brq.projetobrq1.Profissoes

import com.brq.projetobrq1.Ferramentas.ChaveDeFenda
import com.brq.projetobrq1.Ferramentas.Martelo
import com.brq.projetobrq1.Ferramentas.InterfaceFerramenta

open class Carpinteiro: InterfaceProfissao {

    private lateinit var ferramenta: InterfaceFerramenta

    override fun trabalhar() {
        if(ferramenta != null){
            println(ferramenta.usarFerramenta())
        }else{
            println("Não tenho uma ferramenta")
        }
    }

    fun pegarFerramenta(ferramenta: InterfaceFerramenta): String{
        if(ferramenta is Martelo || ferramenta is ChaveDeFenda){
            this.ferramenta = ferramenta
            return "peguei uma ferramenta"
        }else{
            return "Eu não sei usar essa ferramenta"
        }
    }
}
package com.brq.projetobrq1.Profissoes

import com.brq.projetobrq1.Ferramentas.Pincel
import com.brq.projetobrq1.Ferramentas.InterfaceFerramenta

open class Pintor: InterfaceProfissao {

    private lateinit var pincel: Pincel

    override fun trabalhar() {
        if(pincel != null){
            println(pincel.usarFerramenta())
        }else{
            println("Não tenho uma ferramenta")
        }
    }

    fun pegarFerramenta(ferramenta: InterfaceFerramenta): String{
        if(ferramenta is Pincel){
            this.pincel = ferramenta
            return "peguei um pincel"
        }else{
            return "Eu não sei usar essa ferramenta"
        }
    }
}
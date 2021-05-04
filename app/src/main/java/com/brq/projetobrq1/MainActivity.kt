package com.brq.projetobrq1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.brq.projetobrq1.Profissoes.InterfaceProfissao

class MainActivity : AppCompatActivity() {

    lateinit var profissional: InterfaceProfissao

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
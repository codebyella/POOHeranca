package com.example.pooheranca

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        lateinit var joao = Funcionario
        joao.setNome("João")
        joao.setDataAdmissao("01/01/2021")
        joao.setSalario(1000)

        lateinit var gerenteMaria : Gerente
        gerenteMaria.setNome("Maria")
        gerenteMaria.setDataAdmissao("01/01/2021")
        gerenteMaria.setSalario(2000)
        gerenteMaria.setComissao(10.5)
        gerenteMaria.setTotalFuncionarios(25)
    }
}
<! criar tela de login com dois campos de texto e um botão de login. >
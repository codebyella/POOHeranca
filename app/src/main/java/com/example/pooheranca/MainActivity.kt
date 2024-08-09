package com.example.pooheranca

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var txtTitulo: TextView
    private lateinit var txtGerente: TextView
    private lateinit var txtFuncionario: TextView
    private lateinit var txtSalarioGerente: TextView
    private lateinit var txtSalarioFuncionario: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Iniciar os componentes da interface
        iniciarComponentesDoLayout()

        // Configurar dados do gerente e funcionário
        exibirDadosGerente()
        exibirDadosFuncionario()
    }

    private fun iniciarComponentesDoLayout() {
        txtTitulo = findViewById(R.id.txtTitulo)
        txtGerente = findViewById(R.id.txtGerente)
        txtFuncionario = findViewById(R.id.txtFuncionario)
        txtSalarioGerente = findViewById(R.id.txtSalarioGerente)
        txtSalarioFuncionario = findViewById(R.id.txtSalarioFuncionario)
    }

    private fun exibirDadosGerente() {
        val gerenteMaria = Gerente(
            nome = "Maria",
            dataAdmissao = "01/01/2021",
            salario = 2000.0,
            comissao = 10.5,
            totalFuncionarios = 25
        )

        // Exibir dados do gerente na interface
        txtGerente.text = "Gerente: ${gerenteMaria.nome}"
        txtSalarioGerente.text = "Salário: R$ ${gerenteMaria.salario}"
    }

    private fun exibirDadosFuncionario() {
        val joao = Funcionario(
            nome = "João",
            dataAdmissao = "01/01/2021",
            salario = 1000.0
        )

        // Exibir dados do funcionário na interface
        txtFuncionario.text = "Funcionário: ${joao.nome}"
        txtSalarioFuncionario.text = "Salário: R$ ${joao.salario}"
    }
}

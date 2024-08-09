package com.example.pooheranca

class Gerente(
    nome: String,
    dataAdmissao: String,
    salario: Double,
    val comissao: Double,
    val totalFuncionarios: Int
) : Funcionario(nome, dataAdmissao, salario)

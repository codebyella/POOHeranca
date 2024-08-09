package com.example.pooheranca

open class Funcionario {
    private var nome: String? = null
    private var dataAdmissao: String? = null
    private var salario: Int? = 0

    fun getNOme(): String{
        return nome !!
    }

    fun getDataAdmissao(): String {
        return dataAdmissao!!
    }
    fun getSalario(): Int {
        return salario!!
    }

    fun setNome(nome: String?) {
        this.nome = nome
    }

    fun setDataAdmissao(dataAdmissao: String?) {
        this.dataAdmissao = dataAdmissao
    }

    fun setSalario(salario: Int?) {
        this.salario = salario
    }
}

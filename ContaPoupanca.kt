package br.com.digitalhouse.santander

class ContaPoupanca(cliente: Cliente, saldo: Float, private var taxaJuros: Float = 0.25f) : Conta(cliente, saldo) {

    override fun deposito(valor: Float) {
        super.deposito(valor)
    }

    override fun saque(valor: Float) {
        super.saque(valor)
    }

    fun recolherJuros(){
        saldo += (saldo * taxaJuros) / 100
        println("Recolhimento de $taxaJuros realizado! Saldo atual: $saldo")
    }
}
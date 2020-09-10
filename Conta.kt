package br.com.digitalhouse.santander

open class Conta(cliente: Cliente, var saldo: Float) {
    open fun deposito(valor: Float){
        saldo += valor
        println("Deposito de R$$valor realizado! Seu saldo atual: $saldo")
    }

    open fun saque(valor: Float){
        if(valor <= saldo) {
            saldo -= valor
            println("Saque de R$$valor realizado! Seu saldo atual: $saldo")
        }else{
            println("Saldo insuficiente. Saldo atual: $saldo")
        }
    }

    open fun consultar(){
        println("Seu saldo é: $saldo")
    }
}
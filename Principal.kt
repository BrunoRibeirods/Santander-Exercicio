package br.com.digitalhouse.santander

fun main() {
    val cliente = Cliente(456654, "Ribeiro", 506598765, 98988856)


    println("----------Conta----------\n")

    val conta = Conta(cliente, 15.000f)
    conta.deposito(5.000f)
    conta.saque(50.000f)
    conta.saque(5.000f)
    conta.consultar()

    println("\n----------Conta Poupança----------\n")
    val contaPoupanca = ContaPoupanca(cliente, 1.000f)
    contaPoupanca.deposito(1.000f)
    contaPoupanca.recolherJuros()

    println("\n----------Conta Corrente----------\n")
    val contaCorrente = ContaCorrente(cliente, 20.000f)
    contaCorrente.depositarCheque(1.000f, "Santander", "09/09/2020")
    contaCorrente.saque(22.000f)

}
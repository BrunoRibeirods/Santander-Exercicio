package br.com.digitalhouse.santander

class ContaCorrente(cliente: Cliente, saldo: Float) : Conta(cliente, saldo) {


    override fun deposito(valor: Float) {
        super.deposito(valor)
    }

    override fun saque(valor: Float) {
        if (valor > saldo){
            saldo -= valor
            saldo -= (0.359f * valor) / 100
            println("Saque realizado de R$$valor com cheque especial! seu saldo: $saldo")
        }else{
            super.saque(valor)
        }
    }

    fun depositarCheque(valor: Float, bancoEmissor: String, dataPag: String){
        saldo += valor
        println("Deposito de R$$valor será realizado em $dataPag por Banco $bancoEmissor.")
        println("Saldo atual: R$$saldo")
    }
}
package bancobnds;

public class Conta {

    int id;
    String dono;
    double saldo;
    double limite;

    //Exemplo de um saque com uso do void sem retorno
    void saca(double quantidade) {
        double saldoAtual = this.saldo - quantidade;
        this.saldo = saldoAtual;
    }

    //Exemplo de um deposito com uso do void sem retorno
    void deposita(double quantidade) {
        this.saldo += quantidade;
    }

    //Exemplo de um saque usando o boolean com retorno
    boolean saca2(double valor) {
        if (this.saldo < valor) {
            System.out.println("Transação não permitida");
            return false;
        } else {
            this.saldo = this.saldo - valor;
            System.out.println("Transação aceita");
            return true;
        }
    }

    //Transferencia de valor da uma conta para outra
    boolean transfere(Conta destino, double valor) {
        boolean retirou = saca2(3000);
        if (retirou == false) {
            System.out.println("\nNão foi possivel realizar a transação SAUDO INSUFICIENTE");
        } else {
            System.out.println("\nTransação realizada com sucesso");
            destino.deposita(valor);
            return true;
        }
        return false;
    }
}

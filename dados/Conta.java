package dados;

public class Conta {
    private int cod_conta;
    private int cod_cliente;
    private int cod_agencia;
    private int tipo_conta;
    private int cod_do_banco;
    private int numero_conta;
    private int saldo;
    
    public int getCod_conta() {
        return cod_conta;
    }
    public void setCod_conta(int cod_conta) {
        this.cod_conta = cod_conta;
    }
    public int getCod_cliente() {
        return cod_cliente;
    }
    public void setCod_cliente(int cod_cliente) {
        this.cod_cliente = cod_cliente;
    }
    public int getCod_agencia() {
        return cod_agencia;
    }
    public void setCod_agencia(int cod_agencia) {
        this.cod_agencia = cod_agencia;
    }
    public int getTipo_conta() {
        return tipo_conta;
    }
    public void setTipo_conta(int tipo_conta) {
        this.tipo_conta = tipo_conta;
    }
    public int getCod_do_banco() {
        return cod_do_banco;
    }
    public void setCod_do_banco(int cod_do_banco) {
        this.cod_do_banco = cod_do_banco;
    }
    public int getNumero_conta() {
        return numero_conta;
    }
    public void setNumero_conta(int numero_conta) {
        this.numero_conta = numero_conta;
    }
    public int getSaldo() {
        return saldo;
    }
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    
}

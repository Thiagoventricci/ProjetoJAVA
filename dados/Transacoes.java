package dados;

public class Transacoes {
    private int cod_transacoes;
    private int cod_operacoes;
    private int cod_conta_nosso_banco;
    private int cod_do_nosso_banco;
    private int cod_do_outro_banco;
    private int valor;
    
    public int getCod_transacoes() {
        return cod_transacoes;
    }
    public void setCod_transacoes(int cod_transacoes) {
        this.cod_transacoes = cod_transacoes;
    }
    public int getCod_operacoes() {
        return cod_operacoes;
    }
    public void setCod_operacoes(int cod_operacoes) {
        this.cod_operacoes = cod_operacoes;
    }
    public int getCod_conta_nosso_banco() {
        return cod_conta_nosso_banco;
    }
    public void setCod_conta_nosso_banco(int cod_conta_nosso_banco) {
        this.cod_conta_nosso_banco = cod_conta_nosso_banco;
    }
    public int getCod_do_nosso_banco() {
        return cod_do_nosso_banco;
    }
    public void setCod_do_nosso_banco(int cod_do_nosso_banco) {
        this.cod_do_nosso_banco = cod_do_nosso_banco;
    }
    public int getCod_do_outro_banco() {
        return cod_do_outro_banco;
    }
    public void setCod_do_outro_banco(int cod_do_outro_banco) {
        this.cod_do_outro_banco = cod_do_outro_banco;
    }
    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }

    
}

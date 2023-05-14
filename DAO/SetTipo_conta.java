package DAO;

import dados.Tipo_conta;

public class SetTipo_conta {
    public static void main(String[] args) {
        Tipo_conta t = new Tipo_conta();

        t.setCod_tipo_conta(0);
        t.setConta("Corrente");

        new Tipo_contaDAO().cadastrarTipoConta(t);

        t.setCod_tipo_conta(0);
        t.setConta("Poupança");

        new Tipo_contaDAO().cadastrarTipoConta(t);

        t.setCod_tipo_conta(0);
        t.setConta("Salario");

        new Tipo_contaDAO().cadastrarTipoConta(t);
    }
}

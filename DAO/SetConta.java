package DAO;

import dados.Conta;

public class SetConta {
    public static void main(String[] args) {
        Conta c = new Conta();

        c.setCod_conta(1);
        c.setCod_cliente(1);
        c.setCod_agencia(1);
        c.setTipo_conta(1);
        c.setCod_do_banco(1);
        c.setNumero_conta(134629);
        c.setSaldo(500);

        new ContaDAO().cadastrarConta(c);

        c.setCod_conta(2);
        c.setCod_cliente(2);
        c.setCod_agencia(2);
        c.setTipo_conta(2);
        c.setCod_do_banco(2);
        c.setNumero_conta(265123);
        c.setSaldo(800);

        new ContaDAO().cadastrarConta(c);

        c.setCod_conta(3);
        c.setCod_cliente(3);
        c.setCod_agencia(3);
        c.setTipo_conta(3);
        c.setCod_do_banco(3);
        c.setNumero_conta(542378);
        c.setSaldo(1200);

        new ContaDAO().cadastrarConta(c);
    }
}

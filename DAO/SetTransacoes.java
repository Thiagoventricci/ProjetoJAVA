package DAO;

import dados.Transacoes;
import DAO.TransacoesDAO;

public class SetTransacoes {
    public static void main(String[] args) throws Exception{
        Transacoes t = new Transacoes();

        t.setCod_transacoes(0);
        t.setCod_operacoes(1);
        t.setCod_conta_nosso_banco(1);
        t.setCod_do_nosso_banco(1);
        t.setValor(500);

        new TransacoesDAO().cadastrarTransacoes(t);

        t.setCod_transacoes(0);
        t.setCod_operacoes(2);
        t.setCod_conta_nosso_banco(2);
        t.setCod_do_nosso_banco(2);
        
        t.setValor(800);

        new TransacoesDAO().cadastrarTransacoes(t);

        t.setCod_transacoes(0);
        t.setCod_operacoes(3);
        t.setCod_conta_nosso_banco(3);
        t.setCod_do_nosso_banco(3);
        t.setCod_do_outro_banco(3);
        t.setValor(1200);


        new TransacoesDAO().cadastrarTransacoes(t);
    }
}

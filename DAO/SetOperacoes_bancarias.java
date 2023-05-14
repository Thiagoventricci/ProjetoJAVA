package DAO;

import dados.Operacoes_bancarias;

public class SetOperacoes_bancarias {
    public static void main(String[] args) {
        Operacoes_bancarias ob = new Operacoes_bancarias();

        ob.setCod_operacoes(0);
        ob.setNome_da_transacao("Pix");

        new Operacoes_bancariasDAO().cadastrarOperacoesBancarias(ob);
        
        ob.setCod_operacoes(0);
        ob.setNome_da_transacao("Operação de Deposíto");

        new Operacoes_bancariasDAO().cadastrarOperacoesBancarias(ob);

        ob.setCod_operacoes(0);
        ob.setNome_da_transacao("Operação de Saque");

        new Operacoes_bancariasDAO().cadastrarOperacoesBancarias(ob);
    }
         
}

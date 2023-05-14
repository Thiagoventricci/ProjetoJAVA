package DAO;
import DAO.Codigo_bancoDAO;
import dados.Codigo_Banco;

public class SetCodigo_banco {
    public static void main(String[] args) {
        Codigo_Banco c = new Codigo_Banco();
        c.setId_cod_banco(0);
        c.setCod_do_banco(341);
        c.setNome_do_banco("Itaú Unibanco");
         
        new Codigo_bancoDAO().cadastrarCodigoBanco(c);

        c.setId_cod_banco(0);
        c.setCod_do_banco(104);
        c.setNome_do_banco("Caixa Econômica Federal");

       new Codigo_bancoDAO().cadastrarCodigoBanco(c);

        c.setId_cod_banco(0);
        c.setCod_do_banco(237);
        c.setNome_do_banco("Bradesco");

        new Codigo_bancoDAO().cadastrarCodigoBanco(c);
    }
}

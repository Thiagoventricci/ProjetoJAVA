package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import dados.Transacoes;

public class TransacoesDAO {
    public void cadastrarTransacoes(Transacoes transacoes){
     
        String sql = "insert into transacoes (cod_transacoes, cod_operacoes, cod_conta_nosso_banco, cod_do_nosso_banco ,valor) values (?,?,?,?,?)";

        PreparedStatement ps = null;
        try {
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, transacoes.getCod_transacoes());
            ps.setInt(2, transacoes.getCod_operacoes());
            ps.setInt(3, transacoes.getCod_conta_nosso_banco());
            ps.setInt(4, transacoes.getCod_do_nosso_banco());
            ps.setInt(5, transacoes.getValor());

            ps.execute();
            ps.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}

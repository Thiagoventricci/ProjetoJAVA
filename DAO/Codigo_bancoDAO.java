package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import dados.Codigo_Banco;

public class Codigo_bancoDAO {
    public void cadastrarCodigoBanco(Codigo_Banco codigo_Banco){
       String sql = "insert into codigo_banco (id_cod_banco, cod_do_banco, nome_do_banco) values (?, ?, ?)";

       PreparedStatement ps = null;

       try {
        ps = Conexao.getConexao().prepareStatement(sql);
        ps.setInt(1, codigo_Banco.getId_cod_banco());
        ps.setInt(2, codigo_Banco.getCod_do_banco());
        ps.setString(3, codigo_Banco.getNome_do_banco());

        ps.execute();
        ps.close();

       } catch (SQLException e) {
        e.printStackTrace();
       }
    }
}

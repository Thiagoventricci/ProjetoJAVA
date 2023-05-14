package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import dados.Tipo_conta;

public class Tipo_contaDAO {
    public void cadastrarTipoConta(Tipo_conta tipo_conta){
        String sql = "insert into tipo_conta (cod_tipo_conta, conta) values (?, ?)";
 
        PreparedStatement ps = null;

        try {
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, tipo_conta.getCod_tipo_conta());
            ps.setString(2, tipo_conta.getConta());

            ps.execute();
            ps.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
 
        
}

}
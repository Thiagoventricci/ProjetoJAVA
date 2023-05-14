package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Set;

import dados.Agencia;
import dados.Agencia;

public class AgenciaDAO {
    public void cadastrarAgencia(Agencia agencia){
    
        String sql = "insert into agencia (cod_agencia, num_agencia, nome_agencia) values (?, ?, ?)";

        PreparedStatement ps = null;

        try {
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, agencia.getCod_agencia());
            ps.setString(2, agencia.getNum_agencia());
            ps.setString(3, agencia.getNome_agencia());

            ps.execute();
            ps.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

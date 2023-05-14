package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import dados.Operacoes_bancarias;

public class Operacoes_bancariasDAO {
    public void cadastrarOperacoesBancarias(Operacoes_bancarias operacoes_bancarias){
        
        String sql = "insert into operacoes_bancarias (cod_operacoes, nome_da_transacao) values (?,?)";

        PreparedStatement ps = null;

        try {
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, operacoes_bancarias.getCod_operacoes());
            ps.setString(2, operacoes_bancarias.getNome_da_transacao());

            ps.execute();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

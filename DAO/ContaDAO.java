package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import dados.Conta;

public class ContaDAO {
    public void cadastrarConta(Conta conta){
        
        String sql = 
        "insert into conta (cod_conta, cod_cliente, cod_agencia, cod_tipo_conta, cod_do_banco, numero_conta, saldo) values (?,?,?,?,?,?,?)";
        
        PreparedStatement ps = null;

        try {
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, conta.getCod_conta());
            ps.setInt(2, conta.getCod_cliente());
            ps.setInt(3, conta.getCod_agencia());
            ps.setInt(4, conta.getTipo_conta());
            ps.setInt(5, conta.getCod_do_banco());
            ps.setInt(6, conta.getNumero_conta());
            ps.setInt(7, conta.getSaldo());

            ps.execute();
            ps.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

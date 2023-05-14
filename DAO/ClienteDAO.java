package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import dados.Cliente;

public class ClienteDAO {
    public void cadastrarCliente(Cliente cliente) {

        String sql = 
        "insert into cliente (cod_cliente, primeiro_nome, sobrenome, cep, endereco, cpf_cnpj, telefone) values (?, ?, ?, ?, ?, ?, ?)";

        PreparedStatement ps = null;

        try {
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, cliente.getCod_cliente());
            ps.setString(2,  cliente.getPrimeiro_nome());
            ps.setString(3, cliente.getSobrenome());
            ps.setInt(4, cliente.getCep());
            ps.setString(5, cliente.getEndereco());
            ps.setString(6, cliente.getCpf_cnpj());
            ps.setString(7, cliente.getTelefone());

            ps.execute();
            ps.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        
    }
}

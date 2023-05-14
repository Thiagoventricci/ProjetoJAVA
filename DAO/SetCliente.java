package DAO;

import dados.Cliente;

public class SetCliente {
    public static void main(String[] args) {
        Cliente c = new Cliente();

        c.setCod_cliente(0);
        c.setPrimeiro_nome("Noah");
        c.setSobrenome("Dias");
        c.setCep(89012212);
        c.setEndereco("Rua das Laranjeiras, 135");
        c.setCpf_cnpj("476-089-321-87");
        c.setTelefone("11-994138654");

        new ClienteDAO().cadastrarCliente(c);
            
        c.setCod_cliente(0);
        c.setPrimeiro_nome("João");
        c.setSobrenome("Medeiros");
        c.setCep(76541789);
        c.setEndereco("Rua das bebedeiras, 205");
        c.setCpf_cnpj("312-765-234-00");
        c.setTelefone("11-954128915");

        new ClienteDAO().cadastrarCliente(c);

        c.setCod_cliente(0);
        c.setPrimeiro_nome("Matheus");
        c.setSobrenome("Santos");
        c.setCep(14572216);
        c.setEndereco("Rua pereira, 102");
        c.setCpf_cnpj("363-785-986-32");
        c.setTelefone("11-998547765");

        new ClienteDAO().cadastrarCliente(c);


    }
}

import java.util.Set;

import com.mysql.cj.xdevapi.PreparableStatement;

public class ComandoTabelas{
   public static void main(String[] args) throws Exception {
    // Testa o banco de Dados
    ConexaoTabelas db1 = new ConexaoTabelas();
    
   
   String sql = "create table agencia    " + 
   "(cod_agencia int primary key not null auto_increment, " + 
   "num_agencia int not null," + 
   "nome_agencia varchar(25) not null)";

    db1.OpenDatabase();
    db1.ExecuteQuery(sql);


   sql = "create table codigo_banco " +
    "(id_cod_banco int primary key not null auto_increment," +
    "cod_do_banco int not null," + 
    "nome_do_banco varchar(50) not null)";

   db1.OpenDatabase();
   db1.ExecuteQuery(sql);

   sql = "create table tipo_conta " + 
   "(cod_tipo_conta int primary key not null auto_increment," + 
   "conta varchar(25) not null)";
   
   db1.OpenDatabase();
   db1.ExecuteQuery(sql);

   sql = "create table cliente " + 
   "(cod_cliente int primary key not null auto_increment," + 
   "primeiro_nome varchar(25) not null," + 
   "sobrenome varchar(25) not null," + 
   "cep int(8) not null," + 
   "endereco varchar(50) not null," + 
   "cpf_cnpj varchar(14) not null," + 
   "telefone varchar(12) not null)";

   db1.OpenDatabase();
   db1.ExecuteQuery(sql);

   sql = "create table conta " + 
   "(cod_conta int primary key not null auto_increment," + 
   "cod_cliente int not null," + 
   "cod_agencia int not null ," + 
   "cod_tipo_conta int not null ," + 
   "cod_do_banco int not null," + 
   "numero_conta int not null," + 
   "saldo int not null," + 
   "constraint fk_cod_cliente foreign key (cod_cliente) references cliente (cod_cliente) on delete cascade on update no action," + 
   "constraint fk_cod_agencia foreign key (cod_agencia) references agencia (cod_agencia) on delete cascade on update no action," + 
   "constraint fk_cod_do_banco foreign key (cod_do_banco) references codigo_banco (id_cod_banco) on delete cascade on update no action," + 
   "constraint fk_cod_tipo_conta foreign key (cod_tipo_conta) references tipo_conta (cod_tipo_conta) on delete cascade on update no action )"; 

   db1.OpenDatabase();
   db1.ExecuteQuery(sql);

   sql = "create table outros_bancos " + 
   "(cod_conta_outro_banco int primary key not null auto_increment," + 
   "cod_tipo_conta int not null," + 
   "cod_agencia int not null ," + 
   "cod_do_banco int not null ," + 
   "numero_conta int not null," + 
   "constraint fk_cod_outro_banco foreign key (cod_do_banco) references codigo_banco (id_cod_banco)," + 
   "constraint fk_cod_conta_outro_banco foreign key (cod_tipo_conta) references tipo_conta (cod_tipo_conta)," + "constraint fk_cod_agencia_outro_banco foreign key (cod_agencia) references agencia (cod_agencia))";
 
   db1.OpenDatabase();
   db1.ExecuteQuery(sql);

   sql = "create table operacoes_bancarias " + 
   "(cod_operacoes int primary key not null auto_increment," + 
   "nome_da_transacao varchar(25) not null)";

   db1.OpenDatabase();
   db1.ExecuteQuery(sql);
  
   sql = "create table transacoes " + 
   "(cod_transacoes int primary key not null auto_increment," + 
   "cod_operacoes int not null," + 
   "cod_conta_nosso_banco int not null ," + 
   "cod_do_nosso_banco int not null ," + 
   "valor int not null," + 
   "constraint fk_cod_do_nosso_banco foreign key (cod_do_nosso_banco) references codigo_banco (id_cod_banco) on delete cascade on update no action," +  
   "constraint fk_cod_operacoes foreign key (cod_operacoes) references operacoes_bancarias (cod_operacoes) on delete cascade on update no action," + 
   "constraint fk_cod_conta_nosso_banco foreign key (cod_conta_nosso_banco) references conta (cod_conta) on delete cascade on update no action)";
   db1.OpenDatabase();
   db1.ExecuteQuery(sql);



  
   

   
  }

  }


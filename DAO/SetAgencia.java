package DAO;
import dados.Agencia;

public class SetAgencia {
    public static void main(String[] args) throws Exception {
      Agencia a = new Agencia();
      a.setCod_agencia(0);
      a.setNum_agencia( "9871");
      a.setNome_agencia("Santander");

      new AgenciaDAO().cadastrarAgencia(a);
    
      a.setCod_agencia(0);
      a.setNum_agencia("7651");
      a.setNome_agencia("Bradesco");

      new AgenciaDAO().cadastrarAgencia(a);
    
      a.setCod_agencia(0);
      a.setNum_agencia("6789");
      a.setNome_agencia("Itau Unibanco");

      new AgenciaDAO().cadastrarAgencia(a);
    }
}

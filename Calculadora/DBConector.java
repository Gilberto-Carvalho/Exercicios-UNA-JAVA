import com.sun.source.tree.WhileLoopTree;

import java.sql.*;
import java.util.ArrayList;

public class DBConector {
    Connection conexaoMySQL;

    public void connect()
    {
        String database = "jdbc:mysql//localhost/calculadora";

        try
        {

            Class.forName("com.mysql.jbdc.Driver");

            conexaoMySQL= DriverManager.getConnection(database, "root", "admin");

        } catch (Exception e)
        {
            System.out.println("ERRO");
        }
    }

    public void executaSQL(String comandoSQL)
    {
        try
        {
            Statement comando = conexaoMySQL.createStatement();

            comando.executeQuery(comandoSQL);

        } catch (Exception e)
        {
            System.out.println("ERRO");
        }
    }

    public void adiciona(Telas telas){

        String sql = "INSERT INTO usuario(IdTela,NomeItem,TipoItem,Complexidade,Tempo) VALUES(?,?,?,?,?)";

        try {
            PreparedStatement stmt = conexaoMySQL.prepareStatement(sql);

            stmt.setInt(1, telas.getIdTela());
            stmt.setString(2, telas.getNome());
            stmt.setString(3, telas.getTipo());
            stmt.setInt(4, telas.complexidade());
            stmt.setDouble(5, telas.tempo());

            stmt.execute();
            stmt.close();

        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }


//    public static String ComandoInsert(String dadoInserir, String tabela, String coluna)
//    {
//        String comandoInsert = "INSERT INTO "+tabela+" ("+coluna+") VALUES ("+dadoInserir+")";
//
//        return comandoInsert;
//    }
//    String comandoInsert = "INSERT INTO `calculadora`.`telas`(`IdTela`,`NomeItem`,`TipoItem`,`Complexidade`,`Tempo`)VALUES(3,2,3,2,1);";


//    public static void main(String[] args) {
//        Telas telas = new Telas();
//        String database = "jdbc:mysql://localhost:3306/calculadora";
//        try {
//
//            // O método forName carrega e inicia o driver passado por parâmetro
//
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection conexaoMySQL = DriverManager.getConnection(database, "root", "admin");
//            Statement consulta = conexaoMySQL.createStatement();
//            ResultSet resultado = consulta.executeQuery("SELECT * FROM telas");
//
////            ArrayList<Telas> telas = new ArrayList<Telas>();
//            while (resultado.next()) {
//                telas.idTela = resultado.getInt("IdTela");
//                telas.nome = resultado.getString("NomeItem");
//                telas.tipo = resultado.getString("TipoItem");
//                telas.complexidade = resultado.getInt("Complexidade");
//                telas.tempo = resultado.getDouble("Tempo");
//            }
//            System.out.println(telas.tipo+telas.tempo+telas.nome+telas.complexidade);
//            conexaoMySQL.close();
//        } catch (Exception ex) {
//            System.out.println(ex);
//        }
//
//    }
}

//    public void executaSQL(String comandoSQL)
//    {
//        try
//        {
//            Statement comando = conexaoMySQL.createStatement();
//
//            comando.executeQuery(comandoSQL);
//
//        } catch (Exception e)
//        {
//            System.out.println("ERRO");
//        }
//    }



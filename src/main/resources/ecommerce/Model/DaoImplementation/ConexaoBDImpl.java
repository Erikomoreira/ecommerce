package ecommerce.Model.DaoImplementation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/* @author sibele */
public class ConexaoBDImpl {

    private static final String SERVIDOR = "";//caminho do servidor do BD
    private static final String BANCO = "ecommerce"; //nome do banco de dados
    private static final String URL = "jdbc:mysql://" + SERVIDOR + "/" + BANCO; //url de conexao
    private static final String DRIVER = "com.mysql.jdbc.Driver"; //driver mysql
    private static final String USUARIO = "root"; //nome do usuário do banco de dados
    private static final String SENHA = ""; //senha do usuário do banco de dados

    public static Connection getConnection() {

        Connection conn = null;

        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}

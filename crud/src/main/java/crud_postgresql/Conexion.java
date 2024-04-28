package crud_postgresql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {
    private static final String url = "jdbc:postgresql://localhost:5432/hoteldb";
    private static final String usuario = "postgres";
    private static final String contrasena = "1";

    Connection conexion = null;
    Statement consulta = null;

    public Conexion() {
        try {
            conexion = DriverManager.getConnection(url, usuario, contrasena);
            System.out.println("Conectado");
            System.out.println("we");
        } catch (SQLException e) {
            System.out.println("No conectado");
        }
        try {
            System.out.println("cONSULTANDO");
            consulta();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void consulta() throws SQLException {
        consulta = (Statement) conexion.createStatement();
        ResultSet resultado = ((java.sql.Statement) consulta).executeQuery("SELECT * FROM hotel");
        System.out.println(resultado);
        System.out.println(resultado);

        while (resultado.next()) {
            int hotelNum = resultado.getInt("hotelNo");
            String hotelNom = resultado.getString("hotelName");
            String ciudad = resultado.getString("city");
            String direccion = resultado.getString("address");
            System.out.println("Numero de hotel: " + hotelNum + ", Hotel: " + hotelNom + ", Ciudad: " +
            ciudad + ", Direccion: " + direccion);
            }
        
        System.out.println("No nada");
    }
}

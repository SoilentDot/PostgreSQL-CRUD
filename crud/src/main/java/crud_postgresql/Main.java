package crud_postgresql;

public class Main {
    public static void main(String[] args) {/*
                                             * Connection conexion = null;
                                             * Statement declaracion = null;
                                             * try {
                                             * conexion = DriverManager.getConnection(URL, USUARIO, CONTRASENA);
                                             * System.out.println("Conexión exitosa a PostgreSQL");
                                             * 
                                             * // Crear una declaración para ejecutar consultas
                                             * declaracion = (Statement) conexion.createStatement();
                                             * 
                                             * // Ejecutar una consulta SELECT
                                             * String consulta = "SELECT * FROM personas"; // Ejemplo de tabla
                                             * ResultSet resultado = ((java.sql.Statement)
                                             * declaracion).executeQuery(consulta);
                                             * 
                                             * // Procesar los resultados
                                             * while (resultado.next()) {
                                             * int id = resultado.getInt("id");
                                             * String nombre = resultado.getString("nombre");
                                             * int edad = resultado.getInt("edad");
                                             * 
                                             * System.out.println("ID: " + id + ", Nombre: " + nombre + ", Edad: " +
                                             * edad);
                                             * }
                                             * 
                                             * // Cerrar el ResultSet
                                             * resultado.close();
                                             * 
                                             * } catch (SQLException e) {
                                             * System.err.println("Error al conectar a PostgreSQL: " + e.getMessage());
                                             * } finally {
                                             * try {
                                             * // Cerrar la declaración
                                             * if (declaracion != null) {
                                             * }
                                             * // Cerrar la conexión
                                             * if (conexion != null) {
                                             * conexion.close();
                                             * }
                                             * } catch (SQLException e) {
                                             * System.err.println("Error al cerrar recursos: " + e.getMessage());
                                             * }
                                             * }
                                             */
        System.out.println();
        @SuppressWarnings("unused")
        Conexion c = new Conexion();
        @SuppressWarnings("unused")
        Ventana v = new Ventana();
    }
}
package AccesoDatos;

import java.sql.*;

public class Conexion {
    public Connection Con = null;
    public String bd = "recaudacion";
    public String user = "postgres";
    public String password = "123";
    public final String CONTROLADOR_JDBC = "org.postgresql.Driver";
    public final String URL_BASEDEDATOS = "Jdbc:postgresql://localhost:5432/" + bd;
    
    
    public Conexion(){                
         try
        {
           Class.forName(CONTROLADOR_JDBC);
           Con = DriverManager.getConnection(URL_BASEDEDATOS,user,password);
           if (Con !=null){
               System.out.println("Conexión a base de datos ... Ok");
           }
        } catch (Exception e) {
            System.out.println("Problema al establecer la Conexión a la base de datos");
        }
    }
    
    public Connection Conectar(){
      return Con;
   }
    
    public void Desconectar()
    {
        try
        {
            Con.close();
            System.out.println("La conexion a la  base de datos " + bd + " a terminado");
        }catch(Exception e)
        {
            System.out.println("Problema para cerrar la Conexión a la base de datos ");
        }
    }
    
}

package com.empresa.dao;
//capa de gestion de datos:CRUD

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.empresa.model.Cliente;

public class ClienteDAO {

	private String endpoint="jdbc:mysql://localhost:3306/test?useSSL=false";
	private String user="root";
	private String pass="";
	
	
	
	public Connection conectar() {
		System.out.println("hola guapo");
		Connection connection =null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 connection = DriverManager.getConnection(endpoint, user, pass);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return connection;
	}//cierra metodo conectar
	
	
	
	public void insertCliente(Cliente c)  {
  
        // try-with-resource statement will auto close the connection.
		 Connection connection = conectar();
		 PreparedStatement ps;
        try {
        	
        	
        	ps = connection.prepareStatement("INSERT INTO clientesjdbc VALUES (?,?,?,?);");
           ps.setInt(1,c.getId());
           ps.setString(2,c.getNombre());
           ps.setString(3,c.getCiudad());
           ps.setFloat(4,c.getFacturacion());
           ps.executeUpdate();
           
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//cierrra insertar
	
	
	//resto de metodos crud
}//cierra dao

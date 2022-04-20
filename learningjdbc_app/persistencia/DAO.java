/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningjdbc_app.persistencia;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//import java.sql.Statement;




public abstract class DAO {
  
    // these will change
    
    protected Connection connection = null;
    protected ResultSet result = null;
    protected Statement statement = null;
        
    // these are constant, so we declare them as 'final'
    
    private final String USER = "root";
    private final String PASSWORD = "root";
    private final String DATABASE = "mywines";
    private final String DRIVER = "com.mysql.jdbc.Driver"; 
    
    // these methods are going to be inherited
    
    protected void connect2dB() throws ClassNotFoundException, SQLException{
        try {
            Class.forName(DRIVER);
            String urlDataBase = "jdbc:mysql://localhost:3306/" + DATABASE + "useSSL=false";
            connection = DriverManager.getConnection(urlDataBase, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException ex) {
            throw ex;    
        }       
    }
    
    protected void disconnectDB() throws Exception{
        try{
            if (result != null) {
                /*
                This would happend if the RusultSet class is 'hosting' some kind of consultation
                */
                result.close();
            }
            if (statement != null) {
                statement.close();
                        }
            if (connection != null) {
                connection.close();
            }
        } catch(Exception e) {
            throw e;
        }
    }
}

/*
'DAO' stands for 'Data Access Object'


*/
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pakg1.automated_Meal_counter;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Tammum Islam
 */
public class databaseConnection {
    public static Connection getConnection(){
		Connection con=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost/mealcounter","tam1","ce13030");
		}catch(Exception e){System.out.println(e);}
		return con;
	}
}

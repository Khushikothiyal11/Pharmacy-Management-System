/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
//import java.sql.*;

/**
 *
 * @author Aayush
 */
public class TABLES {
   public static void main(String[] args)  {
        
      try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/last","root","Khushi@12345");
           Statement stmt = con.createStatement();
        // String query1 = 
       //stmt.executeUpdate("create table apollo(id int AUTO_INCREMENT primary key ,userRole varchar(20),name varchar(20),dob varchar(20),mobile varchar(20),email varchar(20),username varchar(20), password varchar(20),address varchar(20))");
     // stmt.executeUpdate("insert into apollo(userRole,name,dob,mobile,email,username,password,address) values('Admin','Admin','01-01-2001','7587875898','admin@email.com','admin','admin','India')");
      
     //stmt.executeUpdate("insert into apollo(userRole,name,dob,mobile,email,username,password,address) values('Pharmacist','Pharmacist','02-01-2001','7587875878','pharmacist@email.com','pharmacist','pharmacist','India')");
       //  stmt.executeUpdate("insert into apollo(userRole,name,dob,mobile,email,username,password,address) values(?,?,?,?,?,?,?,?)");
       //  stmt.executeUpdate("create table medicine(medID int AUTO_INCREMENT primary key ,uniqueId varchar(20),name varchar(20),companyName varchar(20),quantity bigint,price bigint)");
     //   stmt.executeUpdate("create table bill(billpk int AUTO_INCREMENT primary key,billId varchar(20),billDate varchar(20),totalPaid bigint,generatedBy varchar(20))");
      //  stmt.execute(query1);
      //     System.out.println("table created");
           JOptionPane.showMessageDialog(null, "Table Created Successfully");
      }
      catch(Exception e){
      JOptionPane.showMessageDialog(null, e);
      }
        //  String query2 = "insert into medo values(1,'Admin','Admin','01-01-2001','7587875898','admin@email.com','admin','admin','India')";
//           int x = stmt.executeUpdate(query1);
//         if(x>0)
//          { 
//               System.out.println("data inserted");
//               
//          }else
//          {
//             System.out.println("failed to insert");
//         }
//        stmt.close();
//          con.close();
    }
    
}

    

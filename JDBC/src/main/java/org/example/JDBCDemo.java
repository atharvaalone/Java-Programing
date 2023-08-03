package org.example;

import java.sql.*;

//class customexception extends Exception{
//    public customexception(String message){
//        super(message);
//
//    }
//}
public class JDBCDemo {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/studentdb";
        String username = "root";
        String passworrd = "12345678";
        try (Connection connection = DriverManager.getConnection(url, username, passworrd)) {
//            try {
//                Statement statement = connection.createStatement();
//                String create = "create table employee (id int ,name varchar(200),lastname varchar(20),address varchar(20))";
//                statement.executeUpdate(create);
//                System.out.println("table is craeted ");
//
//            } catch (Exception e) {
//                e.printStackTrace();
//            }

//            try {
//
//                Statement statement = connection.createStatement();
//                String insert = "insert into employee values(1,'Atharva','Alone','Amravati')";
//                statement.executeUpdate(insert);
//                System.out.println("Data inserted Sucessfully");
//            } catch (Exception e) {
//                e.printStackTrace();
//            }

//            try{
//                Statement statement= connection.createStatement();
//                String update="update employee set location='Nagpur' where id=1 ";
//                statement.executeUpdate(update);
//                System.out.println("Values is updates");
//                //throw new customexception("please enter valid name ");
//
//            }catch (Exception e){
//                e.printStackTrace();
//            }

//            try {
//                Statement statement = connection.createStatement();
//                String addColumn = "alter table employee add location varchar(20)";
//                statement.executeUpdate(addColumn);
//                System.out.println("Column Added Sucessfully...");
//
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
            try {
                Statement statement = connection.createStatement();
                String fetch = "select * from employee";
                ResultSet resultSet = statement.executeQuery(fetch);
                while (resultSet.next()) {
                    System.out.println("EmployeeID :" + resultSet.getInt("id"));
                    System.out.println("EmployeeName :" + resultSet.getString("name"));
                    System.out.println("EmployeeLastName :" + resultSet.getString("lastname"));
                    System.out.println("EmployeeAddress :" + resultSet.getString("address"));
                }


            } catch (Exception e) {
                e.printStackTrace();
            }

        }


    }
}

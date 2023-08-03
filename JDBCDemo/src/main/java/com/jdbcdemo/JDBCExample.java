package com.jdbcdemo;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileWriter;
import java.sql.*;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class JDBCExample {
    public static void main(String[] args) {
        //url username,Opwd,connection,statement

        //connection....
//        String url = "jdbc:mysql://localhost:3306/jdbcdemo";
//        String username = "root";
//        String password = "12345678";
//
//        try (Connection connection = DriverManager.getConnection(url, username, password)) {
//            try (Statement statement = connection.createStatement()) {
//                String createTable = "create table student(stu_id int primary key,name varchar(20),address varchar(20))";
//                statement.executeUpdate(createTable);
//                System.out.println("Table is created");
//
//            }
//            try (Statement statement = connection.createStatement()) {
//                String insertvalues = "insert into student values(1,'Atharva','Amravati')";
//                statement.executeUpdate(insertvalues);
//                System.out.println("Values is inserted");
//            }
//
//
//            String update = "update student set name='ram' where stu_id=1";
//            try (Statement statement = connection.createStatement()) {
//
//                statement.executeUpdate(update);
//                System.out.println("Qurey updated");
//            }
//
//            try (Statement statement = connection.createStatement()) {
//                String fetchvalue = "select * from student";
//                //statement.executeUpdate(fetchvalue);
//                ResultSet res = statement.executeQuery(fetchvalue);
//                while (res.next()) {
//                    System.out.println("stdid " + res.getInt("stu_id"));
//                    System.out.println("stdid " + res.getString("name"));
//                    System.out.println("address :" + res.getString("address"));
//                }
//
//            }
//
//
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        }
//
//Gson gson=new Gson();
//Person person=new Person(1,"Atharva","Alone","Amravati");
//String json=gson.toJson(person);
//        System.out.println(json);

//        try{
//            File file=new File("/Users/atharva/Desktop/Hello.txt");
//            FileWriter fileWriter=new FileWriter(file);
//            fileWriter.write("Hello platinum network");
//            fileWriter.close();
//            System.out.println("File Created ");
//
//        }catch (Exception e){
//            e.printStackTrace();
//}
//        List<Integer> list = Arrays.asList(1, 4, 3, 7, 5,6);
//        Integer value=list.stream().min(Integer::compareTo).orElseThrow();
//        System.out.println(value)
//  }
   String str="Atharava" ;

        Boolean b=Pattern.matches("[A-Za-z]{1,8}",str);
        System.out.println(b);






    }
}

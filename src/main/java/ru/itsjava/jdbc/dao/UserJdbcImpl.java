package ru.itsjava.jdbc.dao;

import java.sql.*;

public class UserJdbcImpl implements UserDao {
    public static final String DB_URL = "jdbc:MySql://localhost:3306/my_schema?serverTimezone=UTC";
    public static final String DB_LOGIN = " ";
    public static final String DB_PASSWORD = " ";

//    @Override
//    public int findAgeByName(String name) {
//        try (Connection connection = DriverManager.getConnection(DB_URL, DB_LOGIN, DB_PASSWORD);
//             Statement statement = connection.createStatement()) {
//            ResultSet resultSet = statement.executeQuery("select age from my_schema.users where name = '"+ name + "'");
//            resultSet.next();
//
//            return resultSet.getInt("age");
//
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//        return -1;
//    }


    @Override
    public int findAgeByName(String name) {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_LOGIN, DB_PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement("select age from my_schema.users where name = ? ")) {
            preparedStatement.setString(1,"Masha");
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();

            return resultSet.getInt("age");

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return -1;
    }


}

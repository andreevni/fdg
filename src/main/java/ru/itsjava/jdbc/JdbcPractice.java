package ru.itsjava.jdbc;

import ru.itsjava.jdbc.dao.UserJdbcImpl;
import ru.itsjava.jdbc.dao.UserDao;

public class JdbcPractice {
//    public static final String DB_URL = "jdbc:MySql://localhost:3306/my_schema?serverTimezone=UTC";
//    public static final String DB_LOGIN = "";
//    public static final String DB_PASSWORD = "";

    public static void main(String[] args) {
//        try (Connection connection = DriverManager.getConnection(DB_URL, DB_LOGIN, DB_PASSWORD);
//             Statement statement = connection.createStatement()) {
//            ResultSet resultSet = statement.executeQuery("select name,age from my_schema.users");
//            while (resultSet.next()) {
//            System.out.println(resultSet.getString("name") + ": " + resultSet.getInt("age"));
//            }
//
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
        UserDao userDao = new UserJdbcImpl();
        System.out.println("userDao.findAgeByName(\"Masha\") = " + userDao.findAgeByName("Masha"));

    }
}

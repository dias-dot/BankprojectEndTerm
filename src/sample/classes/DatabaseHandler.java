package sample.classes;

import java.sql.*;

public class DatabaseHandler extends Configs {
    static Connection connection = null;
    String url = "jdbc:mysql://"+dbHost+":"+dbPort+"/"+dbName;
    public Connection getDbConnection()
            throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection(url, dbUser, dbPass);
        return connection;
    }

    public void signUpUser(User user) {
        String insert = "INSERT INTO " + "`" + dbName + "`.`" + Const.USER_TABLE + "` (`" + Const.USER_FIRSTNAME + "`, `" +
                Const.USER_LASTNAME + "`, `" + Const.USER_PHONENUMBER + "`, `" + Const.USER_EMAIL + "`, `" +
                Const.USER_USERNAME + "`, `" + Const.USER_PASSWORD + "`) VALUES (?,?,?,?,?,?);";
        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(insert);
            prSt.setString(1, user.getFirstname());
            prSt.setString(2, user.getLastname());
            prSt.setString(5, user.getPhonenumber());
            prSt.setString(6, user.getEmail());
            prSt.setString(3, user.getUsername());
            prSt.setString(4, user.getPassword());


            prSt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public ResultSet getUser(User user){
        ResultSet resultSet = null;
        String select ="SELECT * FROM "+ Const.USER_TABLE+ " WHERE "+ Const.USER_USERNAME + "=? AND "+Const.USER_PASSWORD+" =?";
        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(select);

            prSt.setString(1, user.getUsername());
            prSt.setString(2, user.getPassword());


            resultSet =prSt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return resultSet;
    }

}
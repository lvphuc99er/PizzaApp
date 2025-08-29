package QuanLyPizza.DAO;

import MyCustom.MyDialog;
import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class MyConnect {

    public static Connection conn = null;
    private final String severName = "localhost:3306";
    private final String dbName = "aurora";
    private final String userName = "sa";
    private final String password = "123456";

    public MyConnect() {

        String strConnect = "jdbc:mysql://" + severName + "/" + dbName + "?useUnicode=true&characterEncoding=utf-8";
        Properties pro = new Properties();
        pro.put("user", userName);
        pro.put("password", password);
        try {
            com.mysql.cj.jdbc.Driver driver = new Driver();
            conn = driver.connect(strConnect, pro);
            
            System.out.println("Connect success !");
        } catch (SQLException ex) {
            new MyDialog("Không kết nối được tới CSDL!", MyDialog.ERROR_DIALOG);
            System.exit(0);
        }

    }
}

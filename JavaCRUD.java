import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class JavaCRUD {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/perpustakaan";
    static final String USER = "root";
    static final String PASS = "";

    static Connection conn;
    static Statement stmt;
    static ResultSet rs;
    static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(inputStreamReader);
    
    try {
        // register driver
        Class.forName(JDBC_DRIVER);

        conn = DriverManager.getConnection(DB_URL, USER, PASS);
        stmt = conn.createStatement();

        while (!conn.isClosed()) {
            showMenu();
        }

        stmt.close();
        conn.close();

    } catch (Exception e) {
        e.printStackTrace();
    }jh2

    static void showbuku(){
        String sql = "SELECT * FROM buku"

        try{
            Sytem.out.print("| DATA BUKU |");
            rs = stmt.executeQuery(sql);

            while(rs.next()){
                int id = rs.getInt("id");
                String judul = rs.getString("judul");
                String penulis = rs.getString("penulis");
                System.out.println(String.format("%d. %s ===> (%s)", id, judul, penulis ));
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }

public static void main(Sring[] args) throws Exception{
    try{
        class.forName(JDBC_DRIVER);
        conn = DriverManager.getConnection(DB_URL, USER, PASS);
        stmt = conn.createStatment();

        while(!conn.isClosed()){
            showbuku();
        }

        stmt.close();
        conn.close();
    } cath(Exception e){
        e.printStackTrace();
    }
}
public void insertbuku(){
    try{
        System.out.print("Judul: ");
        String judul = input.readLine().trim();
        System.out.print("Penulis: ");
        String penulis =input.readline().trim();

        String sql = "INSERT INTO buku (judul, penulis) VALUE ('%s','%s')"
        sql= String.format(sql, judul, penulis);

        stmt.execute(sql);
   } cath (Exception e){
    e.printStackTrace();
   }
}
public static void main(String[] args) throws Exception{
    class.ForName(JDBC_DRIVER);

    conn = DriverManager.getConnection(DB_URL, USER, PASS);
    stmt = conn.createStatement();
    
    while(!conn.isClosed()){
        insertBuku();
        showBuku();
    }
    Stmt.close();
    conn.close();
} catch(Exception e){
    e.printStackTrace();
}
}    

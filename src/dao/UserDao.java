import java.sql.Connection;
import java.sql.PreparedStatement;

public class UserDao {
    public boolean registerUser(String tipoDocumento, String documento, String nombre,
        String apellido, String email, String password) {
        String sql = "INSERT INTO users (tipo_documento, documento, nombre, apellido, email, password) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = DataBase.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, tipoDocumento);
            pstmt.setString(2, documento);
            pstmt.setString(3, nombre);
            pstmt.setString(4, apellido);
            pstmt.setString(5, email);
            pstmt.setString(6, password);
            return pstmt.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}

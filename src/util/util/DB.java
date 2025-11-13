// src/util/DB.java
// package util;

// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.SQLException;

// public class DB {
//     public class DB {
//   // Lee estas variables del entorno o un .properties seguro en producción
//   private static final String HOST = System.getenv().getOrDefault("DB_HOST", "your-cloud-host");
//   private static final String PORT = System.getenv().getOrDefault("DB_PORT", "3306");
//   private static final String DB   = System.getenv().getOrDefault("DB_NAME", "appdb");
//   private static final String USER = System.getenv().getOrDefault("DB_USER", "user");
//   private static final String PASS = System.getenv().getOrDefault("DB_PASS", "password");

//   // Par\u00e1metros recomendados para MySQL en nube: zona horaria y TLS/SSL
//   // Ajusta verifyServerCertificate seg\u00fan tu certificado/CA
//   private static final String PARAMS =
//       "serverTimezone=UTC&useSSL=true&requireSSL=true&verifyServerCertificate=true";

//   private static final String URL = String.format(
//       "jdbc:mysql://%s:%s/%s?%s", HOST, PORT, DB, PARAMS);

//   public static Connection getConnection() throws SQLException {
//     return DriverManager.getConnection(URL, USER, PASS);
//   }
// }
    
// }

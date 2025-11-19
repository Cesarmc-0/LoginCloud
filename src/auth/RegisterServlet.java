import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String tipo = req.getParameter("tipo_documento");
        String doc = req.getParameter("documento");
        String nombre = req.getParameter("nombre");
        String apellido = req.getParameter("apellido");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String confirmar = req.getParameter("confirm_password");

        if (!password.equals(confirmar)) {
            // Maneja el error: las contraseñas no coinciden
            resp.sendRedirect("register.html?error=pass");
            return;
        }

        // Llama al DAO para guardar el usuario
        UserDao dao = new UserDao();
        boolean exito = dao.registerUser(tipo, doc, nombre, apellido, email, password); // Recuerda, deberías cifrar la contraseña

        if (exito) {
            resp.sendRedirect("login.html");
        } else {
            resp.sendRedirect("register.html?error=db");
        }
    }
}

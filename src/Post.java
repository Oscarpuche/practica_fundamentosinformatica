import java.util.Date;
import java.text.SimpleDateFormat;

/**
 * Clase que representa un mensaje publicado por un usuario en la red social.
 */
public class Post {
    private String mensaje;
    private Date fecha;

    /**
     * Constructor para la clase Post.
     * @param mensaje El contenido de texto del post.
     */
    public Post(String mensaje) {
        this.mensaje = mensaje;
        // Capturamos la fecha y hora actual en el momento de crear el post
        this.fecha = new Date();
    }

    // --- Métodos Getter y Setter ---

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Date getFecha() {
        return fecha;
    }

    /**
     * Método para imprimir el post con un formato elegante.
     * Formatea la fecha para que sea legible (ej: 17/10/2023 10:30).
     */
    public void imprimePost() {
        // Usamos SimpleDateFormat para que la fecha no se vea como un código extraño
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        String fechaFormateada = formato.format(fecha);
        
        System.out.println("      [" + fechaFormateada + "] - " + mensaje);
    }
}
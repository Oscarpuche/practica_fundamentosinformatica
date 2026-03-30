import java.util.Date;
import java.text.SimpleDateFormat;

/**
 * Clase que representa un mensaje publicado por un usuario
 * @param mensaje El contenido del post
 * @param fecha La fecha y hora en que se creó el post
 */
public class Post {
    private String mensaje;
    private String url;
    private Date fecha;

    /**
     * Constructor para la clase Post.
     * @param mensaje El contenido de texto del post.
     */
    public Post(String mensaje) {
        this.mensaje = mensaje;
        this.fecha = new Date(); // Capturamos la fecha y hora actual en el momento de crear el post
    }

    // public Date getFecha() {return fecha;} ahora mismo no es necesario pero se escribe para la etapa 3
    public void setURL(String url) {this.url = url;}
    public String getURL() {return url;}

    // Se ha añadido un método para obtener el mensaje y poder imprimirlo junto con la URL en el perfil
    public String getMensaje() {
    return mensaje;
}
    /**
     * Método para imprimir el post con un formato legible (dd/MM/yyyy HH:mm).
     */
    public void imprimePost() {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        String fechaFormateada = formato.format(fecha);
        System.out.println("      [" + fechaFormateada + "] : " + mensaje);
    }
}
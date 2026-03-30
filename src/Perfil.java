import java.util.ArrayList;

/**
 * Clase que representa a un usuario
 * @param nombre El nombre del usuario
 * @param idUsuario El identificador único del usuario
 * @param password La contraseña del usuario
 * @param URL La URL única del perfil del usuario, generada automáticamente a partir del idUsuario
 * @param biografia La biografía del usuario
 * @author Óscar García Puche

 */

public class Perfil {

    private String nombre;
    private String idUsuario;
    private String password;
    private String URL;
    private Biografia biografia;
    private ArrayList<Post> listaPosts;
    

    /**
     * Constructor para la clase Perfil
     * @param nombre El nombre del usuario
     * @param password La contraseña del usuario
     */
    public Perfil(String nombre, String password) {
        this.nombre = nombre;
        this.password = password;
        this.listaPosts = new ArrayList<>();
    }
    
    /**
     * Métodos get y set para los atributos de la clase Perfil
     */
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    
    public String getPassword() {return password;}
    public void setPassword(String password) {this.password = password;}

    public String getIdUsuario() {return idUsuario;}
    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
        this.URL = "https://www.miRed.com/" + idUsuario; // Generamos la URL automáticamente a partir del idUsuario
        
    }

    public String getURL() {return URL;}

    public Biografia getBiografia() {return biografia;}
    public void setBiografia(Biografia biografia) {this.biografia = biografia;}

    /**
     * Método para añadir un post, asignarle una URL y añadirlo al arrayList de posts
     * @param texto El contenido de texto del post
     */
    public void añadirPost(String texto) {
        Post nuevoPost = new Post(texto);
        int numeroPost = listaPosts.size() + 1; // Comenzamos en 1 porque primero definimos URL y luego añadimos el post al arrayList
        String urlPost = "https://www.miRed.com/post/" + this.idUsuario + "." + numeroPost; // Generamos la URL del post usando el idusuario y el nºpost
        nuevoPost.setURL(urlPost);
        listaPosts.add(nuevoPost);
    }

    /**
     * Método para mostrar la información del perfil
     */
    public void imprimeInformacion() {
        System.out.println("Identificador de usuario: " + idUsuario);
        System.out.println("   Nombre: " + nombre);
        System.out.println("   URL: " + URL);
        
        System.out.println("   BIO:");
        biografia.imprimeInformacion();
        
        System.out.println("   POSTS:");
        for (Post post : listaPosts) {
            System.out.println("      " + post.getURL() + ":  " + post.getMensaje());
            // post.imprimePost(); método alternativo para imprimir el post con fecha 
        }
    }
}

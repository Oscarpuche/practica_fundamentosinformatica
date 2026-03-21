import java.util.ArrayList;

public class Perfil {
    
    // Nombramos los atributos privados necesarios para la clase Perfil
    private String nombre;
    private String idUsuario;
    private String password;
    private String URL;
    
    // Establecemos la relación entre las clases Perfil y Biografia a través de un atributo de tipo Biografia
    private Biografia biografia;

    // Atributo de coleccion para los mensajes
    private ArrayList<Post> listaPosts;
  
    public Perfil(String nombre, String password) {
        this.nombre = nombre;
        this.password = password;
        this.listaPosts = new ArrayList<>();
    }
    
    // Escribimos los métodos get y set para cada atributo de esta clase
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

    public void añadirPost(String texto) {
        Post nuevoPost = new Post(texto);
        listaPosts.add(nuevoPost);
    }

    // Escribimos el método para mostrar la información del perfil
    public void imprimeInformacion() {
        System.out.println("Identificador de usuario: " + idUsuario);
        System.out.println("   Nombre: " + nombre);
        System.out.println("   URL: " + URL);
        
        // Impresion de la biografia (llamada en cascada)
        System.out.println("   BIO:");
        biografia.imprimeInformacion();
        
        // Impresion de los mensajes
        System.out.println("   POSTS:");
        for (Post post : listaPosts) {
            post.imprimePost();
        }
    }
}
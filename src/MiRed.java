import java.util.ArrayList;

/**
 * Clase que representa la red social, que gestiona los perfiles y asigna posts
 * @param contadorUsuarios Un contador para asignar IDs únicos a cada usuario
 * @param perfiles Un ArrayList para guardar los perfiles de los usuarios registrados en la red social
 * @author Óscar García Puche
 */
public class MiRed {
    // Atributos de la clase MiRed, arraylist para guardar perfiles y un contador para asignar IDs únicos a cada usuario
    private ArrayList<Perfil> perfiles;
    private int contadorUsuarios; 

    /**
     * Constructor par la clase MiRed
     * @param perfiles Se inicializa el ArrayList de perfiles
     * @param contadorUsuarios Se inicia el contador de usuarios en 0
     */
    public MiRed() {
        this.perfiles = new ArrayList<>();
        this.contadorUsuarios = 0; // iniciamos el contador en 0, se incrementará cada vez que añadamos un nuevo perfil
    }

    /**
     * Método para añadir un perfil a la red social y asignarle un ID único
     * @param p El perfil que se va a añadir
     */
    public void añadirPerfil(Perfil p) {
        contadorUsuarios++;
        p.setIdUsuario("user" + contadorUsuarios); // El id se genera aquí ya que es la red quién gestiona todos los perfiles
        this.perfiles.add(p);
    }

    /**
     * Método get para obtener un perfil a partir de su ID
     * @param idUsuario El identificador único del usuario que queremos obtener
     */
    private Perfil getUsuario(String idUsuario) {
        for (Perfil p : perfiles) {
            if (p.getIdUsuario().equals(idUsuario)) {
                return p;
            }
        }
        return null;
    }

    /**
     * Método para visualizar la red social
     */
    public void visualizarRed() {
        System.out.println("Usuarios en la red:");
        for (Perfil p : perfiles) {
            System.out.println("   "+ p.getIdUsuario() + ": " + p.getNombre());}
        }

    /**
     * Método para visualizar la información de un perfil a partir de su ID
     * @param idUsuario El identificador único del usuario que queremos visualizar
     */
    public void visualizarPerfil(String idUsuario) {
        for (Perfil p : perfiles) {
            if (p.getIdUsuario().equals(idUsuario)) {
                p.imprimeInformacion();
                return;
            }
        }
        System.out.println("No existe el usuario " + idUsuario );
    }

    // POR QUÉ ES NECESARIO QUE SEA UN BOOLEANO SI SOLO VAMOS A IMPRIMIR POR PANTALLA SI LA CONTRASEÑA ES CORRECTA O NO?
    /**
     * Método para comprobar si la contraseña introducida por el usuario es correcta
     * @param idUsuario El identificador único del usuario que quiere iniciar sesión
     * @param password La contraseña introducida por el usuario para iniciar sesión
     */
    public boolean comprobarPassword(String idUsuario, String password) {
        Perfil p = getUsuario(idUsuario);
        if (!p.getPassword().equals(password)) {
            System.out.println("La password es incorrecta");
            return false;
        }
        else{
            System.out.println("Password correcta");
            return true;
        }
    }

    /**
     * Método para añadir un post a un perfil a partir de su ID, asegurando evitar futuros errores al eliminar/modificar perfiles.
     * @param idUsuario El identificador único del usuario al que queremos añadir el post
     * @param texto El texto del post que queremos añadir
     */
    public void añadirPost(String idUsuario, String texto) {
        for (Perfil p : perfiles) {
            if (p.getIdUsuario().equals(idUsuario)) {
                p.añadirPost(texto);
                return;
            }
        }
    }
}

import java.util.ArrayList;

public class MiRed {
    // Atributo para almacenar todos los perfiles de la red
    private ArrayList<Perfil> perfiles;
    private int contadorUsuarios; 

    public MiRed() {
        this.perfiles = new ArrayList<>();
        this.contadorUsuarios = 0;
    }

    // Añade un perfil a la lista
    public void añadirPerfil(Perfil p) {
        contadorUsuarios++;
        p.setIdUsuario("user" + contadorUsuarios); // Esto activa la URL
        this.perfiles.add(p);
    }

    // Muestra la información de todos los usuarios registrados
    public void visualizarRed() {
        System.out.println("--- LISTADO DE LA RED ---");
        for (Perfil p : perfiles) {
            p.imprimeInformacion();
            System.out.println("-------------------------");
        }
    }

    */
    public void visualizarRed() {
        System.out.println("Usuarios en la red:");
        for (Perfil p : perfiles) {
            System.out.println(p.getIdUsuario() + ": " + p.getNombre());
        }
    */

    // Busca un perfil por su ID y lo muestra
    public void visualizarPerfil(String id) {
        for (Perfil p : perfiles) {
            if (p.getIdUsuario().equals(id)) {
                p.imprimeInformacion();
                return;
            }
        }
        System.out.println("Usuario " + id + " no encontrado.");
    }

    // Busca un usuario y le añade un nuevo comentario/post
    public void añadirPost(String id, String texto) {
        for (Perfil p : perfiles) {
            if (p.getIdUsuario().equals(id)) {
                p.añadirPost(texto);
                return;
            }
        }
    }
}

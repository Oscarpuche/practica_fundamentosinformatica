import java.util.Date;

public class Main {
    public static void main(String[] args) { 

        // Instancia de la red social
        MiRed r = new MiRed();
        /**
        // Creación de perfiles y biografías usando un bucle for 
        String[] Usuarios = {"Ana", "Luis", "Marta", "Carlos"};
        String[] passwords = {"password123", "password124", "password125", "password126"};
        Date fechas[] = {new Date(90, 0, 1), new Date(85, 5, 15), new Date(92, 10, 30),new Date(88, 3, 20)};
        String aficiones[] = {"Cocinar", "Viajar", "Deportes", "Lectura"};
        String profesiones[] = {"Chef", "Turista", "Atleta", "Escritor"};
        String objetivosvitales[] = {"Ser feliz", "Conocer el mundo", "Ganar una medalla olímpica", "Publicar un libro"};
        String posts[] = {"Hola a todos!", "¡Qué día tan maravilloso!", "¿Alguien quiere salir a correr?", "Acabo de terminar un libro increíble."};

        for (int i = 0; i < Usuarios.length; i++) {
            Perfil p = new Perfil(Usuarios[i], passwords[i]);
            Biografia b = new Biografia(fechas[i], aficiones[i], profesiones[i], objetivosvitales[i]);
            p.setBiografia(b);
            r.añadirPerfil(p); 
            r.añadirPost(p.getIdUsuario(), posts[i]);
        }

        // Visualizamos la red social completa
        r.visualizarRed(); // Sacamos por pantalla los usuarios en la red
        System.out.println("-------------");
        r.visualizarPerfil("user56");
        System.out.println("-------------");
        r.visualizarPerfil("user1");
        System.out.println("-------------");
        r.comprobarPassword("user1", "migato");
 */
        PerfilProfesional p = new PerfilProfesional("Test", "123");
        p.setOcupacion("Ingeniero");
        p.setCurriculum("Experiencia en desarrollo de software y gestión de proyectos.");
        // Añadimos esta línea para que la biografía no sea 'null'
        p.setBiografia(new Biografia()); 
        
        // Ahora sí, debería funcionar y mostrar el título
        p.imprimeInformacion();
    }
}
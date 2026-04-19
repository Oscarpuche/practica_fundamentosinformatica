import java.util.Date;

/**
 * Clase que representa la biografía de un usuario en la red social
 * @param fechaDeNacimiento La fecha de nacimiento del usuario
 * @param aficiones Las aficiones del usuario
 * @param profesion La profesión del usuario
 * @param objetivosVitales Los objetivos vitales del usuario
 * @author Óscar García Puche
 */
public class Biografia {

    private Date fechaDeNacimiento;
    private String aficiones;
    private String profesion;
    private String objetivosVitales;

    /**
     * Constructor para la clase Biografia
     * @param fechaDeNacimiento La fecha de nacimiento del usuario
     * @param aficiones Las aficiones del usuario
     * @param profesion La profesión del usuario
     * @param objetivosVitales Los objetivos vitales del usuario
     */
    public Biografia(Date fechaDeNacimiento, String aficiones, String profesion, String objetivosVitales) {
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.aficiones = aficiones;
        this.profesion = profesion;
        this.objetivosVitales = objetivosVitales;
    }

    public Biografia() { }
    /**
     * Métodos get y set para los atributos de la clase Biografia
     */
    public Date getFechaDeNacimiento() {return fechaDeNacimiento;}
    public void setFechaDeNacimiento(Date fechaDeNacimiento) {this.fechaDeNacimiento = fechaDeNacimiento;}

    public String getAficiones() {return aficiones;}
    public void setAficiones(String aficiones) {this.aficiones = aficiones;}

    public String getProfesion() {return profesion;}
    public void setProfesion(String profesion) {this.profesion = profesion;}

    public String getObjetivosVitales() {return objetivosVitales;}
    public void setObjetivosVitales(String objetivosVitales) {this.objetivosVitales = objetivosVitales;} 

    /**
    * Método para imprimir la información de la biografía
    */
    public void imprimeInformacion() {
        System.out.println("      Fecha de nacimiento: " + fechaDeNacimiento);
        System.out.println("      Profesión: " + profesion);
        System.out.println("      Aficiones: " + aficiones);
        System.out.println("      Objetivos vitales: " + objetivosVitales);
    }

}
    

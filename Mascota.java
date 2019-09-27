/*
 * Intituto Tecnologico de Costa Rica 
 * Ingeniería en Computacion
 * Lenguajes de Programacion - Semestre 2 - 2019
 * Trabajo Practico #2 - Orientacion a Objetos
 * Natan Fernandez de Castro - 2017105774
 * Kevin Rojas Salazar - 2016081582
 */
package natanfdecastro.tiendamascotas.proyectoProgramado2O;
import java.util.Date; // import para utilizar clase Date provista por Java

public class Mascota {
    
    private int id;
    private String tipoMascota;
    private String nombre;
    private Date fechaNacimiento;
    private Expediente expediente;
    
    Mascota(){};
    
    // Getters para atributos de la clase Mascota
    public int getId(){
        return this.id;
    }
    public String getTipoMascota(){
        return this.tipoMascota;
    }
    public String getNombre(){
        return this.nombre;
    }
    public Date getFechaNacimiento(){
        return this.fechaNacimiento;
    }
    public Expediente getExpediente(){
        return this.expediente;
    }
    
    // Setters para atributos de la clase Mascota
    public void setId( int id ){
        this.id = id;
    }
    public void setTipoMascota( String tipoMascota ){
        this.tipoMascota = tipoMascota; 
    }
    public void setNombre( String nombre ){
        this.nombre = nombre;
    }
    public void setFechaNacimiento( Date fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
    }   
}

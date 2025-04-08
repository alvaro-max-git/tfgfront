package es.upm.dit.isst.tfg.tfgwebapp.model;
import java.net.URI;
import java.util.Arrays;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.DecimalMax;
import com.fasterxml.jackson.annotation.*;


public class TFG {
    @Email private String alumno;
    @Email private String tutor;
    @NotEmpty private String titulo;
    private String resumen;
    private Estado estado;
    private URI memoria;
    @PositiveOrZero @DecimalMax("10.0") private Double calificacion;
    private Boolean matriculaHonor;
    private Sesion sesion;

    //constructor sin parámetros

    public TFG() {
        
    }

    // Constructor con parámetros
    public TFG(String alumno, String tutor, String titulo, String resumen, Estado estado, 
               URI memoria, Double calificacion, Boolean matriculaHonor, Sesion sesion) {
        this.alumno = alumno;
        this.tutor = tutor;
        this.titulo = titulo;
        this.resumen = resumen;
        this.estado = estado;
        this.memoria = memoria;
        this.calificacion = calificacion;
        this.matriculaHonor = matriculaHonor;
        this.sesion = sesion;
    }
    
    // Getters y Setters
    public String getAlumno() {
        return alumno;
    }
    
    public void setAlumno(String alumno) {
        this.alumno = alumno;
    }
    
    public String getTutor() {
        return tutor;
    }
    
    public void setTutor(String tutor) {
        this.tutor = tutor;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getResumen() {
        return resumen;
    }
    
    public void setResumen(String resumen) {
        this.resumen = resumen;
    }
    
    public Estado getEstado() {
        return estado;
    }
    
    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
    public URI getMemoria() {
        return memoria;
    }
    
    public void setMemoria(URI memoria) {
        this.memoria = memoria;
    }
    
    public Double getCalificacion() {
        return calificacion;
    }
    
    public void setCalificacion(Double calificacion) {
        this.calificacion = calificacion;
    }
    
    public Boolean getMatriculaHonor() {
        return matriculaHonor;
    }
    
    public void setMatriculaHonor(Boolean matriculaHonor) {
        this.matriculaHonor = matriculaHonor;
    }
    
    public Sesion getSesion() {
        return sesion;
    }
    
    public void setSesion(Sesion sesion) {
        this.sesion = sesion;
    }

    /*
     * Metodo toString
     */

     @Override
     public String toString() {
         return "TFG [alumno=" + alumno + ", calificacion=" + calificacion + ", estado=" + estado + ", matriculaHonor="
                 + matriculaHonor + ", resumen=" + resumen + ", sesion=" + sesion + ", titulo=" + titulo + ", tutor="
                 + tutor + "]";
     }
 
 
     /*
      * hashCode y equals
      */
 
     //hashCode solo utiliza el atributo @Id 
     @Override
     public int hashCode() {
         final int prime = 31;
         int result = 1;
         result = prime * result + ((alumno == null) ? 0 : alumno.hashCode());
         return result;
     }
 
     //equals solo utiliza el atributo @Id
     @Override
     public boolean equals(Object obj) {
         if (this == obj)
             return true;
         if (obj == null)
             return false;
         if (getClass() != obj.getClass())
             return false;
         TFG other = (TFG) obj;
         if (alumno == null) {
             if (other.alumno != null)
                 return false;
         } else if (!alumno.equals(other.alumno))
             return false;
         return true;
     }

}
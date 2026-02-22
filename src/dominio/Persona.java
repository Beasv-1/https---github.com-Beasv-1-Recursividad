package dominio;

import java.time.LocalDate;

public class Persona {
    private String nombre;
    private LocalDate fechaNacimiento;
    private String apellidos;
    private String localidad;
    private String ocupacion;

    public Persona(String nombre, LocalDate fechaNacimiento, String apellidos, String localidad, String ocupacion) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.apellidos = apellidos; 
        this.localidad = localidad;
        this.ocupacion = ocupacion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return LocalDate.now().getYear() - fechaNacimiento.getYear();
    }
    public String getApellidos() {
        return apellidos;
    }
    public String getLocalidad() {
        return localidad;
    }
    public String getOcupacion() {
        return ocupacion;
    }
    public String setNombre(String nombre) {
        this.nombre = nombre;
        return nombre;
    }

}

package dominio;
 
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
 
public class Persona{
    private String nombre;
    private String apellidos;
    private Date nacimiento;
    private String localidad;
    private String profesion;

    public Persona (String _nombre, Date _nacimiento){
        nombre = _nombre;
        nacimiento = _nacimiento;
    }
    public Persona (String _nombre, String _apellidos,String _nacimiento, String _localidad, String _profesion){
            nombre = _nombre;
            apellidos = _apellidos;
            localidad = _localidad;
            profesion = _profesion;
            try{
                nacimiento = new SimpleDateFormat("dd/MM/yyyy").parse(_nacimiento);
             } catch (Exception ex) {
                System.out.println("Error:"+ex);
            }
    }
    public String getNombre() {
        return nombre;
    }
    public String getNacimiento() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(nacimiento);
        int dia = cal.get(Calendar.DAY_OF_MONTH);
        int mes = cal.get(Calendar.MONTH) + 1;
        int anio = cal.get(Calendar.YEAR);
        return String.format("%02d/%02d/%04d", dia, mes, anio);
    }
    public String getApellidos() {
        return apellidos;  
    }
    public String getLocalidad() {
        return localidad;
    }
    public String getProfesion() {
        return profesion;
    }      
    public void setNombre(String _nombre) {
        nombre = _nombre;
 
    }
    public void setNacimiento(String _nacimiento) {
        try{
            nacimiento = new SimpleDateFormat("dd/MM/yyyy").parse(_nacimiento);
        } catch (Exception ex) {
            System.out.println("Error:"+ex);
        }
    }
    public void setApellidos(String _apellidos) {
        apellidos = _apellidos;
    }
    public void setLocalidad(String _localidad) {
        localidad = _localidad;
    }
    public void setProfesion(String _profesion) {
        profesion = _profesion;
    }
    public int edad(){
        Calendar fechaActual =Calendar.getInstance();    
        Calendar fechaNacimiento = Calendar.getInstance();
        fechaNacimiento.setTime(nacimiento);
        int anios = fechaActual.get(Calendar.YEAR)- fechaNacimiento.get(Calendar.YEAR);
        int meses =fechaActual.get(Calendar.MONTH)- fechaNacimiento.get(Calendar.MONTH);
        int dias = fechaActual.get(Calendar.DATE)- fechaNacimiento.get(Calendar.DATE);
        if(meses<0 || (meses==0 && dias<0)){
           anios--; //se ajustan los años
       }
        return anios;  
    }
    public boolean jubilado() {
        return edad()>67;
    }
        public String toString(){
        StringBuilder sb= new StringBuilder();
        sb.append("Nombre: ").append(nombre).append(" Apellidos: ").append(apellidos).append("\n Nacimiento: ").append(getNacimiento())
                .append("\n Edad: ").append(edad()).append("\n jubilado: ").append(jubilado()).append("\n Localidad: ").append(localidad).append("\n Profesion: ").append(profesion).append("\n"    );
        return sb.toString();
    }
}

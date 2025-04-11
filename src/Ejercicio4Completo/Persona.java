package Ejercicio4Completo;

import java.util.Calendar;
import java.util.Date;

public class Persona {
    String nombre;
    String primerApellido;
    String segundoApellido;
    Date fechaNacimiento;
    Integer numeroCI;
    String complemento;


    public Persona() {}

    public Persona(String nombre, String primerApellido, String segundoApellido, Date fechaNacimiento, Integer numeroCI, String complemento) {
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.fechaNacimiento = fechaNacimiento;
        this.numeroCI = numeroCI;
        this.complemento = complemento;
    }


    public Integer calcularEdad() {
        Calendar actual = Calendar.getInstance();
        Calendar nacimiento = Calendar.getInstance();
        nacimiento.setTime(fechaNacimiento);

        int edad = actual.get(Calendar.YEAR) - nacimiento.get(Calendar.YEAR);

        if (actual.get(Calendar.MONTH) < nacimiento.get(Calendar.MONTH) ||
                (actual.get(Calendar.MONTH) == nacimiento.get(Calendar.MONTH) &&
                        actual.get(Calendar.DAY_OF_MONTH) < nacimiento.get(Calendar.DAY_OF_MONTH))) {
            edad--;
        }
        return edad;
    }


    public Boolean CIConComplemento() {
        return complemento != null;
    }


    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getPrimerApellido() { return primerApellido; }
    public void setPrimerApellido(String primerApellido) { this.primerApellido = primerApellido; }
    public String getSegundoApellido() { return segundoApellido; }
    public void setSegundoApellido(String segundoApellido) { this.segundoApellido = segundoApellido; }
    public Date getFechaNacimiento() { return fechaNacimiento; }
    public void setFechaNacimiento(Date fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }
    public Integer getNumeroCI() { return numeroCI; }
    public void setNumeroCI(Integer numeroCI) { this.numeroCI = numeroCI; }
    public String getComplemento() { return complemento; }
    public void setComplemento(String complemento) { this.complemento = complemento; }
}



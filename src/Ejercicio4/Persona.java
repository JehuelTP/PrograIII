package Ejercicio4;

import java.util.Calendar;
import java.util.Date;

public class Persona {
    String nombre;
    String primerApellido;
    String segundoApellido;
    Date fechaNacimiento;
    Integer numeroCI;
    String complemento;

    public Persona(){

    }

    public Persona(String nombre, String primerApellido, String segundoApellido, Date fechaNacimiento, Integer numeroCI, String complemento) {
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.fechaNacimiento = fechaNacimiento;
        this.numeroCI = numeroCI;
        this.complemento = complemento;

    }

    // metodos

public Integer calcularEdad(){

    Calendar c =    Calendar.getInstance();

    return 0;
}
public Boolean CIConComplemento(){
        if (complemento==null){
            return Boolean.FALSE;
        } else{
            return Boolean.TRUE;
        }
}


// getter y setter


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getNumeroCI() {
        return numeroCI;
    }

    public void setNumeroCI(Integer numeroCI) {
        this.numeroCI = numeroCI;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
}

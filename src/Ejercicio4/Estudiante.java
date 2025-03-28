package Ejercicio4;

import java.util.Date;

public class Estudiante extends Persona {

    String codigoSIS;

    public Estudiante(){

    }

    public Estudiante(String codigoSIS) {
        this.codigoSIS = codigoSIS;
    }

    public Estudiante(String nombre, String primerApellido, String segundoApellido, Date fechaNacimiento, Integer numeroCI, String complemento, String codigoSIS) {
        super(nombre, primerApellido, segundoApellido, fechaNacimiento, numeroCI, complemento);
        this.codigoSIS = codigoSIS;
    }
}

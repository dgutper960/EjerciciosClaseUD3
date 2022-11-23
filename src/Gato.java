import jdk.dynalink.beans.StaticClass;

public class Gato {
    private String nombre;
    private static String raza;


    Gato(String nombre){
        this.nombre = nombre;
    }
    Gato(String nombre, String raza){
        this.nombre = nombre;
        this.raza = raza;
    }


    String getNombre(){
        return nombre;
    }

    void setNombre(String nombre){
        this.nombre = nombre;
    }


    String getRaza(){
        return raza;
    }

    void setRaza(String raza){
        this.raza = raza;
    }


}


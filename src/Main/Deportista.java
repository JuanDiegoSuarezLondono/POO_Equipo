/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author suare
 */
public class Deportista {
    private String nombre;
    private int edad;
    private char sexo;
    private String deporte;

    public Deportista(String nombre, int edad, char sexo, String deporte) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.deporte = deporte;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public char getSexo() {
        return sexo;
    }

    public String getDeporte() {
        return deporte;
    }    
       
}

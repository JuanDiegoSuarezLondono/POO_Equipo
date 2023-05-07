/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/** 
 *
 * @author suare
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Delegacion D1=new Delegacion();
        int num=0;
        System.out.println("¿Cuantos estudiantes va a ingresar?");
        num=Integer.parseInt(br.readLine());
        for(int i=0;i<num;i++)
        {
            System.out.println("Ingrese nombre, edad ,sexo y deporte del deportista: "+(i+1));
            D1.agregarDeportista(new Deportista(br.readLine(),Integer.parseInt(br.readLine()), br.readLine().charAt(0),br.readLine()), i);
        }
        System.out.println("Cantidad de hobres: "+D1.cuantosHombres());
        System.out.println("Cantidad de mujeres: "+D1.cuantasMujeres());
        System.out.println("Cantidad en futbol: "+D1.cuantosEnDeporte("futbol"));
        System.out.println("Cantidad en baloncesto: "+D1.cuantosEnDeporte("baloncesto"));
        System.out.println("Promedio de edad: "+D1.promedioEdad());
        
        // TODO code application logic here
    }
    
}

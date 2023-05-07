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
public class Delegacion {
    private Deportista equipo[];

    public Delegacion() 
    {
       equipo=new Deportista[10];
    }
    
    public void agregarDeportista(Deportista dep, int pos)
    {
        equipo[pos]=dep;
    }
    
    public int cuantosHombres()
    {
       int conteo=0;
       for (int i=0;i<10;i++)
       {
           if(equipo[i]!=null)
           {
           if(equipo[i].getSexo()=='M'||equipo[i].getSexo()=='m')
           {
            conteo++;   
           }
           }
       }
       return conteo;
    }
    
    public int cuantasMujeres()
    {
       int conteo=0;
       for (int i=0;i<10;i++)
       {
           if(equipo[i]!=null)
           {
           if(equipo[i].getSexo()=='F'||equipo[i].getSexo()=='f')
           {
            conteo++;   
           }
           }
       }
       return conteo;
    }
    
    public int cuantosEnDeporte(String dep)
    {
       int conteo=0;
       for (int i=0;i<10;i++)
       {
           if(equipo[i]!=null)
           {
           if(equipo[i].getDeporte().equals(dep)==true)
           {
            conteo++;   
           }
           }
       }
       return conteo;
    }
    
    public double promedioEdad()
    {
        int promedio=0;
        int conteo=0;
        for (int i=0;i<10;i++)
       {
           if(equipo[i]!=null)
           {
            promedio+=equipo[i].getEdad();
            conteo++;
           }
       }       
        promedio/=conteo;
        return promedio;
    }
    
}

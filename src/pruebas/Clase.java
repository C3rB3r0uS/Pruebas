/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.util.Calendar;

/**
 *
 * @author alumno
 */
public class Clase {

    public static int Segundos_De_Hoy () throws Exception {
        Calendar cal = Calendar.getInstance();
        int segundos_del_dia = (cal.get(Calendar.HOUR_OF_DAY)*60*60) + (cal.get(Calendar.MINUTE)*60) + (cal.get(Calendar.SECOND));
        
        return (segundos_del_dia);
        
    }
    
//    public static long MiliSegundos_De_Hoy () throws Exception
//    {                       
//        Calendar cal = Calendar.getInstance();
// 
//        // Obtenemos los milisegundos desde las 00:00 horas 
//        long milisegundos_del_dia = (cal.get(Calendar.HOUR_OF_DAY)*60*60*1000) + (cal.get(Calendar.MINUTE)*60*1000) + (cal.get(Calendar.SECOND)*1000) + (cal.get(Calendar.MILLISECOND));
//          
//        return (milisegundos_del_dia);                  
//        }

    
    public static void main(String[] args) throws Exception{
        
        long ahora;
        long antes;
        long inicio = Segundos_De_Hoy();
        long fin = inicio + 60;
        long aux = fin - inicio;
        int contador = 0;
        
        System.out.println("Inicio: " + inicio);
        System.out.println("Fin: " + fin);
        
        while((ahora = Segundos_De_Hoy()) <= fin){
           
                if((fin - ahora) != aux && contador == 0){
                    
                    System.out.println((fin - ahora));
                    contador = 1;
                                       
                }else{
                    
                    aux = fin - ahora;
                    contador = 0;
                    
                }
          
        }
 
    }
 
}

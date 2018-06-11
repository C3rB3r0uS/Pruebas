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

    
    public static void main(String[] args){
        
     int contador = 0;
     
     
 
    }
 
}

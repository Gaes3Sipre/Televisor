/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricatelevisores;

import java.util.Scanner;

/**
 *
 * @author alejozepol @
 */
public class Televisor {
    Scanner op=new Scanner(System.in);
//METODOS
    
    public void EncenderTv(String enc){
         if (enc.equals("on")) { 
         System.out.println("la tv esta encendida"); 
         }
     } 
     String sw; 
     
    public void CambiarCanal(String elegir){
         System.out.println("INGRESE NUMERO DE CANAL");
     do{ String num; num=op.next(); 
     if (num.equals("9")) System.out.println(">>>>>usted esta viendo INSTITUCIONAL"); 
     if(num.equals("11")) System.out.println(">>>>>usted esta viendo TNT"); 
     if(num.equals("13")) System.out.println(">>>>>usted esta viendo ATV"); 
     if(num.equals("4")) System.out.println(">>>>>usted esta viendo RCN"); 
     System.out.println("····presione !!SW!! para cambiar·····"); 
     System.out.println("····presione SALIR para cambiar de opcion·······"); sw=op.next(); 
     }
     while(sw.equals("sw")); 
     } 
     
    void CantVolumen(int nextInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void Mute(String next) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void CambiaraCable(String next) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void AccesoInternet(String next) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

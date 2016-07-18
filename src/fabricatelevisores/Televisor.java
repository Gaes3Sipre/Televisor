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
public class Televisor {    Scanner op=new Scanner(System.in);
    
     public void EncenderTv(String enc){
         if (enc.equals("on")) { 
         System.out.println("la tv esta encendida"); 
         }
     } 

     public void CantVolumen(int x){
         if (x>10 && x<51) {
             System.out.println("volumen MEDIO......:::");
         } 
         if(x>51 && x<101){ 
             System.out.println("volumen ALTO......:::!!!!!¨¨"); 
         }
         if(x>0 && x<10){ 
             System.out.println("volumen BAJO..::"); 
         }
     } 
     public void Mute(String mute){ 
         if (mute.equals("mute")) { 
             System.out.println("!!!MUTE!!!!");
         }
     }
}
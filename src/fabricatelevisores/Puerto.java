package fabricatelevisores;

import java.util.Scanner;

public class Puerto {
    Scanner op=new Scanner(System.in);
    String sw;
    int a;
    int b;
    int c;
    int d;
     public void CambiaraCable(String puerto) { 
         System.out.println("ELIGA SU PUERTO DE ENTRADA");
         if (puerto.equals("ELEGIR")){
     do{ String camb; camb=op.next(); 
     if (camb.equals("1")){
         System.out.println(" desea concetar el puerto tv pulse 1 para si");
         a=op.nextInt();
         if(a==1){
             System.out.println(">>>>>usted esta en el puerto TV");
                 a=1;    
                     }else{
             System.out.println(">>>>> el puerto no ha sido conectado");
             a=2;
         
         }} 
     if(camb.equals("2")){
         System.out.println(" desea concetar el puerto tv pulse 1 para si \n o de lo contrario pulse otra tecla");
         b=op.nextInt();
         if(b==1){
             
         System.out.println(">>>>>usted esta en el puerto CABLE"); 
                 b=1;    
                     }else{
             System.out.println(">>>>> el puerto no ha sido conectado");
             b=2;
         
         }}  
     if(camb.equals("3")){
         System.out.println(" desea concetar el puerto tv pulse 1 para si \n o de lo contrario pulse otra tecla");
         c=op.nextInt();
         if(c==1){
             
        
         System.out.println(">>>>>usted esta en el puerto HDMI"); 
                 c=1;    
                     }else{
             System.out.println(">>>>> el puerto no ha sido conectado");
             c=2;
         
         }}  
     if(camb.equals("4")){
         System.out.println(" desea concetar el puerto tv pulse 1 para si \n o de lo contrario pulse otra tecla");
         d=op.nextInt();
         if(c==1){
             
        
         System.out.println(">>>>>usted esta en el puerto RGB"); 
                 d=1;    
                     }else{
             System.out.println(">>>>> el puerto no ha sido conectado");
             d=2;
         
         }}  
         if(a==1){
//             metodo canales activo
             
         }else{
//           expresion contraria  
         }
         if(b==1){
//             metodo canales activo
             
         }else{
//           expresion contraria  
         }
         if(c==1){
//             metodo canales activo
             
         }else{
//           expresion contraria  
         }
         if(d==1){
//             metodo canales activo
             
         }else{
//           expresion contraria  
         }
     System.out.println("····presione !!SW!! para cambiar·····"); 
     System.out.println("····presione SALIR para cambiar de opcion·······"); sw=op.next();
     
     }
     while(sw.equals("sw"));
     }
     }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricatelevisores;

/**
 *
 * @author alejozepol
 */
public class FabricaTelevisores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Televisor tv1= new Televisor("Samsung",50.5,40.3);
    
    tv1.encender();
    
    double pulgadas=tv1.calcularPulgadas(60.5, 30.2);
        System.out.println(pulgadas);
    
    
    }
    
}

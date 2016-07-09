/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricatelevisores;

/**
 *
 * @author alejozepol
 * @
 */
public class Televisor {

    private String marca;
    private double largo;
    private double alto;
    private Puerto[] puerto;

    protected boolean estado;
    protected byte volumen;
    protected Puerto entrada;
    protected Canal canal;
    protected boolean mute;

    //Metodos
    public void encender() {
        estado = estado ? !estado : !estado;
    }

    public Televisor(String marca, double largo, double alto) {
        this.marca = marca;
        this.largo = largo;
        this.alto = alto;
        /**
         * @param marco indica la marca de la cual es el televisor
         * @param largo Indica lo largo del televisor
         * @param alto indica el alto del televisor Este metodo un metodo
         */

    }

    public int calcularPulgadas(double largo, double alto) {

        double a = Math.pow(alto, 2);
        double b = Math.pow(largo, 2);
        double hi=a+b;
        hi = Math.round(Math.pow(hi,(0.5)));

        return (int)(hi);
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricatelevisores;

import java.util.Scanner;

/**
 *
 * @author alejozepol
 */
public class Canal {

    byte[] numero;
    String[] nombre;
    String[] clasificacion;

    static int i[] = new int[1];
    static Scanner lectura = new Scanner(System.in);
    static String[][] aire = new String[3][3];
    static String[][] video1 = new String[4][4];

//    metodo a modificar
    public int CambiarCanal(int a) {
        return i[a];
    }

    public void aire(boolean conectado) {
        /*	boolean: la idea es que si esta en true
 * estos canasles se vean al inicia el tv 
 * */
//        CambiarCanal();
        aire[0][0] = "canal capital";
        aire[0][1] = "caracol";
        aire[0][2] = "rcn";
        aire[1][0] = "cana constitucional";
        aire[1][1] = "city tv";
        aire[1][2] = "canal";
        aire[2][0] = "canal";
        aire[2][1] = "canal";
        aire[2][2] = "canal";
    }

    public void video1(boolean conectado) {
        /*la idea es que estos canales le agregues el tipo de canal
 * */

        video1[0][0] = "canal ";
        video1[0][1] = "canal";
        video1[0][2] = "canal";
        video1[0][3] = "canal";
        video1[1][0] = "canal";
        video1[1][1] = "canal";
        video1[1][2] = "canal";
        video1[1][3] = "canal";
        video1[2][0] = "canal";
        video1[2][1] = "canal";
        video1[2][2] = "canal";
        video1[2][3] = "canal";
        video1[3][0] = "canal";
        video1[3][1] = "canal";
        video1[3][2] = "canal";
        video1[3][3] = "canal";
    }

}

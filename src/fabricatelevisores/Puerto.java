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
public class Puerto {
	static byte hdmi;
	static byte video;
	static byte aire1;



	public static void Video(boolean a) {
	
		Canal señalv = new Canal();
		a = true;
		señalv.video1(a);

	}

	public static void aire1(boolean a) {
		
		Canal señala = new Canal();
		a = true;
		señala.aire(a);
	}

	public static void hdmi(boolean a) {
	
		Canal señala = new Canal();
		a = true;
		señala.aire(a);
        //METODO DE CANALES PRIVADOS  		
		Canal señalv = new Canal();
		a = true;
		señalv.video1(a);
	}
}

package programmeringsoppgave1;

import static javax.swing.JOptionPane.*;

public class Poeng {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 10; i++) {
		int poeng = Integer.parseInt(showInputDialog("Elev " + i + "\nPoeng:"));
		
		
		
		if (poeng >= 90 && poeng <= 100) {
			showMessageDialog(null, "Eleven har f�tt A!!");
		} else if (poeng <= 89 && poeng >= 80) {
			showMessageDialog(null, "Eleven har f�tt B!");
		} else if (poeng <= 79 && poeng >= 60) {
			showMessageDialog(null, "Eleven har f�tt C!");
		} else if (poeng <= 59 && poeng >= 50) {
			showMessageDialog(null, "Eleven har f�tt D!");
		} else if (poeng <= 49 && poeng >= 40) {
			showMessageDialog(null, "Eleven har f�tt E!");
		} else if (poeng <= 39 && poeng >= 0) {
			showMessageDialog(null, "Eleven har f�tt F!");
		} else if (poeng > 100 || poeng < 0) {
			showMessageDialog(null, "Ugyldig poeng");
			i--;
		}

	}
	}
}

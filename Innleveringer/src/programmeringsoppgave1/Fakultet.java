package programmeringsoppgave1;

import static javax.swing.JOptionPane.*;

public class Fakultet {

	public static void main(String[] args) {
		
		int n = Integer.parseInt(showInputDialog("Skriv et tall: "));
		
		int fakultet = 1;
		
		for (int i = 1; i <= n; i++) {
			fakultet *= i;
		}
		
		showMessageDialog(null, "Fakultet av tallet " + n + "! er " + fakultet);

	}

}

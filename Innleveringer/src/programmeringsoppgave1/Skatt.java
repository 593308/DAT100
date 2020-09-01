package programmeringsoppgave1;

import static javax.swing.JOptionPane.*;

public class Skatt {

	public static void main(String[] args) {
		
		double inntekt = Double.parseDouble(showInputDialog("Brutto Inntekt: "));
		
		double skatt = 0;
		
		if (inntekt < 180800) {
			skatt = 0;
		} else if (inntekt > 180800 && inntekt < 254500) {
			skatt = inntekt * 0.019;
			
		} else if (inntekt > 254500 && inntekt < 639750) {
			skatt = inntekt * 0.042;
			
		} else if (inntekt > 639750 && inntekt < 999550) {
			skatt = inntekt * 0.132;
			
		} else if (inntekt > 999550) {
			skatt = inntekt * 0.162;
			
		} showMessageDialog(null, "Trinnskatten blir " + (int)skatt);
			
		
		
	} 

}

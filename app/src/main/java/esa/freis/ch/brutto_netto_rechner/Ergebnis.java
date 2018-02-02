package esa.freis.ch.brutto_netto_rechner;

import android.app.Activity;

/**
 * Created by Titus on 01.02.2018.
 */

public class Ergebnis extends Activity {

    public float betrag;
    public boolean isNetto;
    public int ustProzent;
    public float betragNetto;
    public float betragBrutto;
    public float betragUst;

    public void berechneErgebnis() {

        // Berechne Bruttobetrag aus Nettobetrag:
        if (isNetto) {
            betragNetto = betrag;
            betragUst = betrag * ustProzent / 100;
            betragBrutto = betrag + betragUst;
        } else {

            // Berechne Nettobetrag aus Bruttobetrag:
            betragBrutto = betrag;
            betragUst = betrag * ustProzent /
                    (100 + ustProzent);
            betragNetto = betrag - betragUst;
        }
    }
}

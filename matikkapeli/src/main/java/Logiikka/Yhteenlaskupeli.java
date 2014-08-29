/**
 * @author Matias Luukkanen
 * @version 0.01
 */
package Logiikka;

import Matikkapeli.Oppilas;
import java.sql.Timestamp;
import java.util.ArrayDeque;
import java.util.Scanner;

/**
 * Alapelin alaluokka.
 *
 * @author matluukk@cs
 */
public class Yhteenlaskupeli extends Alapeli {

    /**
     * Luokan konstruktori.
     *
     * Alustaa pelin tehtäväjonon uusilla tehtävillä ja asettaa aktiiviseksi
     * tehtäväksi jonon ensimmäisen.
     *
     * @param oppilas Peliä pelaavan käyttäjän nimi jota tarvitaan jotta
     * vaikeusaste osataan asettaa oikein ja jotta pelin loputtua tapahtuma
     * voidaan liittää oikean käyttäjän tapahtumahistoriaan.
     * @param lukija Tekstikäyttöliittymän käyttämä parametri joka antaa pelille
     * lähteen käyttäjän syötteelle.
     */
    public Yhteenlaskupeli(Oppilas oppilas, Scanner lukija) {
        this.oppilas = oppilas;
        this.lukija = lukija;
        this.oikeatVastaukset = 0;
        tehtavat = new ArrayDeque();
        for (int i = 0; i < 10; i++) {
            YhteenlaskuTehtava tehtava = new YhteenlaskuTehtava(oppilas.getTaso());
            tehtavat.add(tehtava);
        }
        this.nykyinenTehtava = tehtavat.getFirst();
    }

    /**
     * Tekstikäyttöliittymän käyttämä metodi joka käy läpi pelin sisältämät
     * tehtävät.
     *
     * Käy läpi yksitellen kaikki tehtävät jonossa, tulostaa kysymyksen ja
     * pyytää käyttäjältä syötettä jota verrataan tehtävän oikeaan vastaukseen.
     * Jos vastaus on oikein lisätään oikeiden vastausten lukumäärää.
     */
    public void pelaaPeli() {
        for (Tehtava tehtava : tehtavat) {
            System.out.println(tehtava.kysymys + " = ?");
            String vastaus = lukija.nextLine();
            if (vastaus.equals(tehtava.oikeaVastaus)) {
                oikeatVastaukset++;
                System.out.println("OIKEIN!");
            } else {
                System.out.println("VÄÄRÄ VASTAUS");
            }
        }
        Timestamp aika = oppilas.historia.lisaaTapahtuma("Yhteenlasku", oppilas.getTaso(), oikeatVastaukset, 10);
        System.out.println("Sait " + oikeatVastaukset + " tehtävää oikein" + "    tapahtuma lisätty " + aika.toString());
        oppilas.tarkistaTaso();
    }

    /**
     * Getteri tehtäväjonolle.
     *
     * @return ArrayDeque joka sisältää kaikki peliin liitetyt Tehtävä-oliot.
     */
    public ArrayDeque<Tehtava> getTehtavat() {
        return tehtavat;
    }

    /**
     * Tallentaa pelaajan tapahtumahistoriaan pelitapahtuman.
     *
     * Luo uuden Tapahtuma-olion ja lisää sen Pelille parametrinä annetun
     * Oppilaan tapahtumahistoriaan.
     */
    public void tallennaTulos() {
        oppilas.historia.lisaaTapahtuma("Yhteenlasku", oppilas.getTaso(), oikeatVastaukset, 10);
        oppilas.tarkistaTaso();
    }
}

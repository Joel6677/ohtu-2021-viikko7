package ohtu.kivipaperisakset;

/**
 *
 * @author hejoel
 */
public class Tehdas {
    
    void luoPeli(String vastaus) {
        if (vastaus.endsWith("a")) {
            KPSPelaajaVsPelaaja kaksinpeli = new KPSPelaajaVsPelaaja();
            kaksinpeli.pelaa();
        } else if (vastaus.endsWith("b")) {
            KPSTekoaly yksinpeli = new KPSTekoaly();
            yksinpeli.pelaa();
        } else if (vastaus.endsWith("c")) {
            KPSParempiTekoaly pahaYksinpeli = new KPSParempiTekoaly();
            pahaYksinpeli.pelaa();
        }
    }
}

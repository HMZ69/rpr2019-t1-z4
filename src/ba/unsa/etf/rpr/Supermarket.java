package ba.unsa.etf.rpr;

public class Supermarket {
    private Artikl[] artikli = new Artikl[1000];

    public Supermarket () {
        this.artikli = new Artikl[1000];
    }

    public Supermarket (Artikl[] artikli) {
        this.artikli = artikli;
    }

    public Artikl[] getArtikli() {
        return artikli;
    }

    public void setArtikli(Artikl[] artikli) {
        this.artikli = artikli;
    }

    public void dodajArtikl (Artikl a) {
        for (int i = 0; i < 1000; i++)
            if (this.getArtikli()[i] == null) {
                this.getArtikli()[i] = a;
                return;
            }
    }

    public Artikl izbaciArtiklSaKodom (String kod) {
        for (int i = 0; i < 1000; i++) {
            if (this.getArtikli()[i] != null && this.getArtikli()[i].getKod().equals(kod)) {
                Artikl a = this.getArtikli()[i];
                this.getArtikli()[i] = null;
                return a;
            }
        }
        return null;
    }



}

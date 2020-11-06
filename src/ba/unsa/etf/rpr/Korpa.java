package ba.unsa.etf.rpr;

public class Korpa {
    private Artikl[] artikli = new Artikl[50];

    public Korpa () {
        this.artikli = new Artikl[50];
    }

    public Korpa (Artikl[] artikli) {
        this.artikli = new Artikl[50];
    }

    public Artikl[] getArtikli() {
        return artikli;
    }

    public void setArtikli(Artikl[] sadrzajKorpe) {
        this.artikli = sadrzajKorpe;
    }

    public boolean dodajArtikl (Artikl a) {
        for (int i = 0; i < 50; i++) {
            if (this.getArtikli()[i] == null) {
                this.getArtikli()[i] = a;
                return true;
            }
        }
        return false;
    }

    public Artikl izbaciArtiklSaKodom (String kod) {
        for (int i = 0; i < 50; i++) {
            if (this.getArtikli()[i].getKod().equals(kod)) {
                Artikl a = this.getArtikli()[i];
                this.getArtikli()[i] = null;
                return a;
            }
        }
        return null;
    }

    public int dajUkupnuCijenuArtikala() {
        int sumaCijena = 0;
        for (Artikl a : this.getArtikli())
            if (a != null)
                sumaCijena += a.getCijena();
        return sumaCijena;
    }
}

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
        for (Artikl ar : this.getArtikli()) {
            if (ar == null) {
                ar = a;
                return true;
            }
        }
        return false;
    }

    public Artikl izbaciArtiklSaKodom (String kod) {
        for (Artikl a : this.getArtikli()) {
            if (a.getKod().equals(kod)) {
                return a;
            }
        }
        return null;
    }

    public int dajUkupnuCijenuArtikala() {
        int sumaCijena = 0;
        for (Artikl a : this.getArtikli())
            sumaCijena += a.getCijena();
        return sumaCijena;
    }

}

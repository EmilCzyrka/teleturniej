package pl.sda;

public class Pytanie {

    private String tresc;
    private String[] odpowiedzi;
    private String poprawna;

    public Pytanie(String tresc, String[] odpowiedzi, String poprawna) {
        this.tresc = tresc;
        this.odpowiedzi = odpowiedzi;
        this.poprawna = poprawna;
    }

    public String getTresc() {
        return tresc;
    }

    public String[] getOdpowiedzi() {
        return odpowiedzi;
    }

    public String getPoprawna() {
        return poprawna;
    }

    public void wyswietl() {
        System.out.println(tresc);
        System.out.println("1. " + odpowiedzi[0]);
        System.out.println("2. " + odpowiedzi[1]);
        System.out.println("3. " + odpowiedzi[2]);
        System.out.println("4. " + odpowiedzi[3]);
    }
}

package pl.sda;



public class Main {

    public static void main(String[] args) {
        String[] odpowiedzi = {"Lublin", "Nielisz", "Cyców", "Niemce"};
        Pytanie pytanie = new Pytanie("Stolicą woj. lubelskiego jest: ", odpowiedzi, "Lublin");

        String[] odpowiedzi2 = {"Java", "C++", "C#", "JavaScript"};
        Pytanie pytanie2 = new Pytanie("Jedynym slusznym jezykiem programowania jest: ", odpowiedzi2, "Java");

        String[] odpowiedzi3 = {"Tecza", "Luna", "Miraz", "Zorza"};
        Pytanie pytanie3 = new Pytanie("zjawisko świetlne obserwowane tylko na biegunie?" , odpowiedzi3, "Zorza");

        String[] odpowiedzi4 = {"Boruta", "Rokita", "Kusy", "Bies"};
        Pytanie pytanie4 = new Pytanie("diabeł o imieniu podobnym do wierzby to: ", odpowiedzi4, "Rokita");

        String[] odpowiedzi5 = {"Dukat", "Obol", "Talar", "Dinar"};
        Pytanie pytanie5 = new Pytanie(" Jaka moneta była opłatą dla przewoźnika w Hadesie? ", odpowiedzi5, "Obol");

        String[] odpowiedzi6 = {"alas", "sake", "tokaja", "rakija"};
        Pytanie pytanie6 = new Pytanie("Jak nazywa się wódka pędzona ze śliwek?", odpowiedzi6, "rakija");

        PulaPytan pulaPytan = new PulaPytan(pytanie, pytanie2, pytanie3, pytanie4, pytanie5, pytanie6);

        Teleturniej teleturniej = new Teleturniej(pulaPytan);

        teleturniej.witaj();

        teleturniej.graj();

        teleturniej.liczenieWyniku();



    }
}

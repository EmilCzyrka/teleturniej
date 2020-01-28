package pl.sda;

import java.util.*;

public class PulaPytan {

    public static List<Pytanie> pytania;

    public PulaPytan(Pytanie... pytania) {
        this.pytania = new ArrayList<>(Arrays.asList(pytania));
    }

    public Pytanie losuj() throws IllegalArgumentException, InputMismatchException {


        Random random = new Random();
        int index = random.nextInt(pytania.size());
        Pytanie tmpPytanie = pytania.get(index);
        pytania.remove(index);
        return tmpPytanie;


        }



}
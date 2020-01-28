package pl.sda;

import java.util.ArrayList;
import java.util.Scanner;

public class Teleturniej {

    private PulaPytan pulaPytan;

    public static ArrayList getPoprawne() {
        return poprawne;
    }

    public static ArrayList poprawne= new ArrayList<Integer>() ;
    public int count;
    public Teleturniej(PulaPytan pulaPytan) {
        this.pulaPytan = pulaPytan;
    }

    public  void liczenieWyniku(){
        System.out.println("twój wynik to: "+ poprawne.size());

    }
    public void witaj(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("podaj Imię :") ;
        String Imie = scanner.nextLine();
        System.out.println("Witaj: "+ Imie);


    }


    public void graj() {
        Scanner scanner = new Scanner(System.in);
        boolean czyGracDalej = true;

        do {
                try {
                    Pytanie pytanie;
                    pytanie = pulaPytan.losuj();
                    pytanie.wyswietl();
                    int odpowiedz = scanner.nextInt();
                    if (pytanie.getOdpowiedzi()[odpowiedz - 1].equalsIgnoreCase(pytanie.getPoprawna())) {
                        System.out.println("Poprawna odpowiedz!");
                        count ++;
                        poprawne.add(count);
                    } else {
                        System.out.println("Niestety, zła odpowiedź" );
                        System.out.println("prawidłowa odpowiedź to :" + pytanie.getPoprawna());
                }} catch (ArrayIndexOutOfBoundsException e) {
                    System.err.println("nie ma takiej odpowiedzi" );

                }

            }while (czyGracDalej);



    }



}



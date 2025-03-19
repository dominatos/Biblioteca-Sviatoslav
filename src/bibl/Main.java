package bibl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Biblioteca b=new Biblioteca();
//
        Scanner sc=new Scanner(System.in);





//
while(true) {
    System.out.println("Cosa vuoi fare?" +
            "\n\n scrivi 1 per aggungere utente" +
            "\n scrivi 2 per aggungere libro" +
            "\n scrivi 3 per prestare libro" +
            "\n scrivi 4 per restituire libro" +
            "\n scrivi 5 per guardare libri" +
            "\n scrivi 6 per vedere utenti" +
            "\n scrivi 0 per uscita\n");
    String sinoval = sc.nextLine();
    if (sinoval.equals("1")) {
        System.out.println("Inserisci Nome del utente:: ");
        String nome = sc.nextLine();
//        int max = 1000;
//        int min = 1;
//        int range = max - min + 1;
//
//
//
//        int rand = (int)(Math.random() * range) + min;

        // String nome = "nome"+rand;
        System.out.println("Inserisci Cognome:: ");
        String cognome = sc.nextLine();
        //String cognome ="cognome"+rand;
        System.out.println("Inserisci IDUtente:: ");

        String IDUtente = sc.nextLine();
        //String IDUtente="IDUtente"+rand;

        Utente r=new Utente(nome, cognome, IDUtente);
        System.out.println(r.getIDUtente());
        b.registraUtente(r);
    } else if (sinoval.equals("2")) {
        System.out.println("Quanti libri vuoi aggungere?");

        String input = sc.nextLine();
        int q=0;
        if (input.matches("\\d+")) {
            q = Integer.parseInt(input);

        } else {

            System.out.println("Errore: devi insere il numero positivo e non double!");
        }
        for (int i = 0; i < q; i++) {

//            int max = 1000;
//            int min = 1;
//            int range = max - min + 1;
//
//            // generate random numbers within 1 to 10
//
//            int rand = (int)(Math.random() * range) + min;



            System.out.println("Inserisci nome della libro:");
            String nome = sc.nextLine();
            //String nome="libro"+ rand;
            System.out.println("Inserisci autore della libro:");
            String autore = sc.nextLine();
            //String autore="autore"+rand;
            System.out.println("Inserisci ISBN della libro:");
            String ISBN = sc.nextLine();
//                                            ISBN548 ISBN88  ISBN86 IDUtente41 IDUtente372
                                            //ISBN990 IDUtente344
            //String ISBN ="ISBN"+rand;
            System.out.println(ISBN);
            b.aggiungiLibro(new Libro(nome, autore, ISBN));
        }
    } else if (sinoval.equals("3")) {
        System.out.println("Inserisci ISBN dell libro:");
        String ISBN = sc.nextLine();

        System.out.println("Inserisci nome IDUtente dell utente:");
        String IDUtente = sc.nextLine();
        b.prestitoLibro(IDUtente, ISBN);
    } else if (sinoval.equals("4")) {
        System.out.println("Inserisci ISBN dell libro da restituire:");
        String ISBN = sc.nextLine();

        System.out.println("Inserisci nome IDUtente dell utente:");
        String IDUtente = sc.nextLine();
        b.restituzioneLibro(IDUtente, ISBN);
    } else if (sinoval.equals("5")) {
        b.mostraCatalogo();
    } else if (sinoval.equals("6")) {
        b.utentiRegistrati();
        
    } else if (sinoval.equals("0")) {
        break;
    } else {
        System.out.println("commanda sconoscuta. Prova ancora");


    }
}




    }



}

package bibl;

public class Biblioteca {
private Libro[] arrlibri= new Libro[10];
private Utente[] arruser1= new Utente[5];

    public void registraUtente(Utente utente){
for(int i=0;i<this.arruser1.length;i++){
    if(this.arruser1[i]!=null && this.arruser1[i].getIDUtente().equals(utente.getIDUtente())){
        System.out.println("Utente gia e registrato");
        break;

    }
    else if(this.arruser1[i]==null){
        this.arruser1[i]=utente;
        break;
    }
}
    }
    public void aggiungiLibro(Libro libro){
        for(int i=0;i<this.arrlibri.length;i++){
            if(this.arrlibri[i]==null){
                this.arrlibri[i]=libro;
                return;
            }
            else if(this.arrlibri[arrlibri.length-1]!=null){
                System.out.println("Hai raggiunto limito di biblioteca!");
                return;
            }
        }

    }
    public void prestitoLibro(String IDUtente, String ISBN) {
        boolean libroTrovato = false;
        boolean utenteTrovato = false;


        for (int i = 0; i < this.arrlibri.length; i++) {
            if (this.arrlibri[i] != null && this.arrlibri[i].getDisponibilita() && this.arrlibri[i].getISBN().equals(ISBN)) {
                libroTrovato = true;

                // Пройти по всем пользователям и найти нужного
                for (int j = 0; j < this.arruser1.length; j++) {
                    if (this.arruser1[j] != null && this.arruser1[j].getIDUtente().equals(IDUtente)) {
                        utenteTrovato = true;

                        this.arruser1[j].prendereInPrestito(this.arrlibri[i]);
                      this.arrlibri[i].prestareLibro();
                       }
                }


                if (!utenteTrovato) {
                    System.out.println("Errore, utente non trovato.");
                    return;
                }
            }
        }


        if (!libroTrovato) {
            System.out.println("Errore, il libro non è disponibile o non trovato.");
        }
    }


    public void restituzioneLibro(String idUtente, String ISBN){
        boolean libroTrovato = true;
        boolean utenteTrovato = true;


        for (int i = 0; i < this.arrlibri.length; i++) {
            if (this.arrlibri[i] != null && this.arrlibri[i].getDisponibilita()==false && this.arrlibri[i].getISBN().equals(ISBN)) {
                libroTrovato = true;

                // Пройти по всем пользователям и найти нужного
                for (int j = 0; j < this.arruser1.length; j++) {
                    if (this.arruser1[j] != null && this.arruser1[j].getIDUtente().equals(idUtente)) {
                        utenteTrovato = true;
                        this.arruser1[j].restituireLibro(this.arrlibri[i]);
                        this.arrlibri[i].restituireLibro();
                        return;
                    }
                }


                if (!utenteTrovato) {
                    System.out.println("Errore, utente non trovato.");
                    return;
                }
            }
        }


        if (!libroTrovato) {
            System.out.println("Errore, il libro non è in prestito o non trovato.");
        }
    }




    public void utentiRegistrati()
    {

        System.out.println("Lista de Utenti:");
        for (int i = 0; i < this.arruser1.length; i++) {
            Utente v= arruser1[i];

            if(v instanceof Utente)
            {
                Utente u=(Utente)v;
                System.out.println("\n"+u.getNome()+" "+u.getCognome()+" "+u.getIDUtente());
                u.mostraLibriInPrestito();
            }

        }
    }
    public void mostraCatalogo(){
        System.out.println("Lista dei Libri:");
        for(int i=0; i< this.arrlibri.length; i++) {
            Libro v = this.arrlibri[i];

            if(v instanceof Libro) {
                Libro a = (Libro) v;

                System.out.println(a.getDettagli());
            }

        }
    }
}

package bibl;

public class Libro {
    private String titolo;
    private String autor;
    private String ISBN;
    private boolean disponibilita;

    public Libro(String titolo, String autor, String ISBN)
    {
    this.titolo = titolo;
    this.autor = autor;
    this.ISBN = ISBN;
    this.disponibilita = true;


    }

    public String getTitolo() {
        return this.titolo;
    }
   public String getAutor() {
        return this.autor;
   }
   public String getISBN() {
        return this.ISBN;
   }
   public boolean getDisponibilita() {
        return this.disponibilita;
   }
   public String getDettagli()
   {
       return "\nIl titolo: " +getTitolo()+
               "\nIl autore: "+getAutor()+
               "\nIl ISBN: "+getISBN()+
       "\nLa disponibilita: (" + getDisponibilita() +")";

   }
   public boolean prestareLibro()
   {
       if(this.disponibilita)
       { this.disponibilita = false; }

        return this.disponibilita;
   }
   public boolean restituireLibro()
   {
       if(!this.disponibilita)
       { this.disponibilita = true; }

       return this.disponibilita;
   }

}

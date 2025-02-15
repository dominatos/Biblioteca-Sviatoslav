package bibl;

public class Utente {
   private String nome;
   private String cognome;
   private String IDUtente;
   private Libro[] listaPrestiti;

   public Utente(String nome, String cognome, String IDUtente) {
       this.nome = nome;
       this.cognome = cognome;
       this.IDUtente = IDUtente;
       listaPrestiti= new Libro[3];
   }


   public String getNome() {
       return this.nome;
   }
  public String getCognome() {
       return this.cognome;

  }
  public String getIDUtente() {

       return this.IDUtente;
  }
  public void prendereInPrestito(Libro libro){
      if(libro.getDisponibilita())
      { int nonZ=0;
          for (Libro num : this.listaPrestiti) {
              if (num != null) {

                  nonZ++;
              }
          }
          if (nonZ >= 3) {
              System.out.println("Hai già preso 3 libri, non puoi prenderne altri.");
              return;
          }
          for(int i=0;i<this.listaPrestiti.length;i++)
          {
              if(this.listaPrestiti[i]==null&& nonZ<3)
              {
                  this.listaPrestiti[i]=libro;
                  libro.prestareLibro();
                  System.out.println("\n"+libro.getTitolo()+" e presa in prestito!");
                  return;
              }

          }


      }
      else {
          System.out.println("Il libro non e disponibile!");
      }
  }
  public void restituireLibro(Libro libro){
      for(int i=0;i<this.listaPrestiti.length;i++)
      {if(!this.listaPrestiti[i].getISBN().equals(libro.getISBN())){System.out.println("Il libro non e disponibile!"); return;}
         else if(this.listaPrestiti[i]!=null)
          {

              if(this.listaPrestiti[i].getISBN().equals(libro.getISBN()))
              {
              libro.restituireLibro2();
              System.out.println("\n"+libro.getTitolo()+" e restituita");
              this.listaPrestiti[i]=null;
              return;}

          }

      }
      System.out.println("\n Non e tua libro");
  }

  public void mostraLibriInPrestito() {

      for (int i = 0; i < this.listaPrestiti.length; i++) {
          if (this.listaPrestiti[i] != null) {
              System.out.println("Libri in prestiti:\n (" + i + ") " + listaPrestiti[i].getTitolo()+"\n");
          }
      }
  }





}




Resoluzione al esercizio:<br>


Traccia dell'esercizio: Sistema di Gestione Biblioteca<br>
Descrizione:<br>
Realizzare un sistema Java per gestire una biblioteca, in cui si possono registrare libri,
gestire prestiti e restituire libri.<br>
 Il sistema deve sfruttare concetti avanzati di OOP e gestire controlli per evitare operazioni non consentite.<br><br>
Requisiti:<br><br>

1. Classe Libro<br>
Attributi privati:<br>
titolo (String)<br>
autore (String)<br>
ISBN (String, univoco per ogni libro)<br>
disponibile (boolean, inizialmente true)<br>
Costruttore con parametri<br>
Metodi:<br>
getDettagli() → Restituisce una stringa con i dettagli del libro<br>
prestareLibro() → Imposta disponibile = false se il libro è disponibile, altrimenti stampa libro non disponibile<br>
restituireLibro() → Imposta disponibile = true se il libro era in prestito, altrimenti stampa un Errore<br><br>

2. Classe Utente<br>
Attributi privati:<br>
nome (String)<br>
cognome (String)<br>
IDUtente (String, univoco per ogni utente)<br>
listaPrestiti (Array di Libro, massimo 3 libri per utente)<br>
Costruttore con parametri<br>
Metodi:<br>
prendereInPrestito(Libro libro) → Aggiunge il libro alla lista e aggiorna la disponibilità<br>
restituireLibro(Libro libro) → Rimuove il libro dalla lista e aggiorna la disponibilità<br>
mostraLibriInPrestito() → Stampa i libri presi in prestito dall'utente<br><br>

3. Classe Biblioteca<br>
Attributi privati:<br>
nome (String)<br>
catalogoLibri (Array di oggetti Libro)<br>
utentiRegistrati (Array di oggetti Utente)<br>
Costruttore con parametri<br>
Metodi:<br>
aggiungiLibro(Libro libro) → Aggiunge un libro al catalogo se non esiste<br>
registraUtente(Utente utente) → Aggiunge un utente alla lista se non esiste<br>
prestitoLibro(String idUtente, String ISBN) → Permette a un utente di prendere in prestito un libro<br>
                                                (se disponibile) e se non ha già presi 3<br>
restituzioneLibro(String idUtente, String ISBN) → Permette a un utente di restituire un libro<br>
mostraCatalogo() → Stampa tutti i libri con la loro disponibilità<br>
mostraUtentiRegistrati() → Stampa tutti gli utenti registrati<br><br>

4. Classe Main<br>
Fare tutto tramite Scanner<br>
Creare almeno 5 libri e 3 utenti<br>
Aggiungere i libri al catalogo della biblioteca<br>
Registrare gli utenti nel sistema<br>
Simulare alcuni prestiti e restituzioni di libri<br>
Stampare lo stato della biblioteca prima e dopo i prestiti


# Sistema di Analisi Tweet

Un'applicazione Java per l'analisi dei dati degli utenti di Twitter, che gestisce informazioni sugli utenti e i loro tweet.

## Funzionalità
- Gestione degli utenti (identificati dal codice fiscale e città di residenza).
- Gestione dei tweet (con codice identificativo, utente autore, data, città e tag).
- Analisi dei dati con metodi specifici:
  - **cittaDiversa()**: restituisce gli utenti che twittano sempre da una città diversa dalla loro residenza.
  - **listaUtenti()**: restituisce gli utenti con almeno due tweet che non condividono tag.
  - **tagOfTheDay(data)**: restituisce il tag più utilizzato in una determinata data.

## Struttura del Progetto
Il progetto include le seguenti classi principali:
- `Sistema.java`: gestisce utenti e tweet e fornisce metodi per l'analisi.
- `Utente.java`: rappresenta un utente con codice fiscale e città di residenza.
- `Tweet.java`: rappresenta un tweet con ID, autore, data, città e lista di tag.
- `Main.java`: esempio di utilizzo del sistema.

## Esempio di Utilizzo
```java
Sistema sistema = new Sistema();
sistema.aggiungiUtente(new Utente("CF1", "Palermo"));
sistema.aggiungiTweet(new Tweet("Tw1", "CF1", 1, "Palermo", Arrays.asList("#capodanno2024", "#2023")));
System.out.println("Utenti fuori città: " + sistema.cittaDiversa());
```

## Requisiti
- Java 8+
- Visual Studio Code (VSC) con estensione Java

## Installazione
1. Clona il repository:
   ```bash
   git clone https://github.com/tuo-username/sistema-analisi-tweet.git
   ```
2. Apri il progetto in **Visual Studio Code**.
3. Assicurati di avere l'estensione Java installata.
4. Compila ed esegui `Main.java`.

## Contributi
Sentiti libero di contribuire con nuove funzionalità o miglioramenti! Fai una **fork** e apri una **pull request**.

## Licenza
Distribuito sotto la licenza MIT. Vedi `LICENSE` per maggiori dettagli.


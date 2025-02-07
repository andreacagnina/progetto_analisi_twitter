package it.gestione;

public class Utente {
    private String codiceFiscale;
    private String citta;

    public Utente(String codiceFiscale, String citta){
        this.codiceFiscale=codiceFiscale;
        this.citta = citta;
    }

    public String getCodiceFiscale(){
        return codiceFiscale;
    }
    public String getCitta(){
        return citta;
    }

    @Override
    public String toString(){
        return "CF: " + codiceFiscale + " città: " + citta;
    }
}

package it.gestione;
import java.util.List;

public class Tweet {
    private String codice;
    private String codiceFiscaleUtente;
    private int data;
    private String cittaTweet;
    private List<String> tag;

    public Tweet(String codice, String codiceFiscaleUtente, int data, String cittaTweet, List<String> tag){
        this.codice=codice;
        this.codiceFiscaleUtente=codiceFiscaleUtente;
        this.data=data;
        this.cittaTweet=cittaTweet;
        this.tag=tag;
        }
        
    public String getCodice(){
    return codice;
    }
    public String getCodiceFiscaleUtente(){
    return codiceFiscaleUtente;
    }
    public int getData(){
    return data;
    }
    public String getCittaTweet(){
    return cittaTweet;
    }
    public List<String> getTags(){
    return tag;
    }

@Override
public String toString(){
    return "codice: " + codice + " CF Utente: " + codiceFiscaleUtente + " data post: " + data + " città: " + cittaTweet + " tag: " + tag;
}
}

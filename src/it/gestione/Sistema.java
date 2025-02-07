package it.gestione;

import java.lang.Integer;

import java.util.*;

public class Sistema {
    private List<Utente> utenti = new ArrayList<>();
    private List<Tweet> tweets = new ArrayList<>();


    public void aggiungiUtente(Utente u){
        if(!utenti.contains(u)){utenti.add(u);}
    }

    public void aggiungiTweet(Tweet t){
        tweets.add(t);
    }


    public ArrayList<String> cittaDiversa(){
        ArrayList<String> codiciFiscali = new ArrayList<>();

        for(Utente utente : utenti){
            boolean sempreDiversa = true;
                for(Tweet tweet : tweets){
                    if(tweet.getCodiceFiscaleUtente().equals(utente.getCodiceFiscale()) && utente.getCitta().equals(tweet.getCittaTweet())){
                        sempreDiversa = false;
                        break;
            }
        }
        if(sempreDiversa){
            codiciFiscali.add(utente.getCodiceFiscale());
        }
    }
    return codiciFiscali;
    }

public ArrayList<String> listaUtenti() {
    ArrayList<String> codiciFiscali = new ArrayList<>();

    for (Utente utente : utenti) {
        List<Set<String>> tweetUtenteTags = new ArrayList<>();

        // 🔹 Raccogliamo i set di tag di ogni tweet dell'utente
        for (Tweet tweet : tweets) {
            if (utente.getCodiceFiscale().equals(tweet.getCodiceFiscaleUtente())) {
                tweetUtenteTags.add(new HashSet<>(tweet.getTags()));
            }
        }

        boolean haTagCompletamenteDiversi = false;

        // 🔹 Confrontiamo ogni coppia di tweet dell'utente
        for (int i = 0; i < tweetUtenteTags.size(); i++) {
            for (int j = i + 1; j < tweetUtenteTags.size(); j++) {
                Set<String> intersection = new HashSet<>(tweetUtenteTags.get(i));
                intersection.retainAll(tweetUtenteTags.get(j));  // 🔹 Troviamo i tag in comune

                if (intersection.isEmpty()) {  // ✅ I due tweet non hanno alcun tag in comune!
                    haTagCompletamenteDiversi = true;
                    break;
                }
            }
            if (haTagCompletamenteDiversi) {
                codiciFiscali.add(utente.getCodiceFiscale());
                break;
            }
        }
    }

    return codiciFiscali;
}




    public String tagOfTheDay(int data){
    Map<String, Integer> tagCount = new HashMap<>(); 
        
        for(Tweet tweet : tweets){
            if(tweet.getData() == data){
                for(String tag : tweet.getTags()){
                    tagCount.put(tag, tagCount.getOrDefault(tag, 0) +1);
                }
            }
        }

        String tagPiuUsato = null;
        int maxCount = 0;

        for (Map.Entry<String, Integer> entry : tagCount.entrySet()){
            if(entry.getValue() > maxCount){
                maxCount = entry.getValue();
                tagPiuUsato = entry.getKey();
            }
        }

    return (tagPiuUsato != null) ? tagPiuUsato : "Nessun tag disponibile per questa data";
}
    }


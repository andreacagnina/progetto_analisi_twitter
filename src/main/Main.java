package main;

import java.util.Arrays;

import it.gestione.*;

public class Main{
    public static void main(String[] args) {
        Sistema sistema = new Sistema();

        sistema.aggiungiUtente(new Utente("CF1", "Palermo"));
        sistema.aggiungiUtente(new Utente("CF2", "Catania"));
        sistema.aggiungiUtente(new Utente("CF3", "Palermo"));


        sistema.aggiungiTweet(new Tweet("Tw1", "CF1", 1, "Palermo",  Arrays.asList("#capodanno2024", "#2023")));
        sistema.aggiungiTweet(new Tweet("Tw2", "CF1", 1, "Catania", Arrays.asList("#capodanno2024", "#concerto")));
        sistema.aggiungiTweet(new Tweet("Tw3", "CF2", 2, "Palermo", Arrays.asList("#governo")));
        sistema.aggiungiTweet(new Tweet("Tw4", "CF3", 1, "Palermo", Arrays.asList("#capodanno2024")));
        sistema.aggiungiTweet(new Tweet("Tw5", "CF3", 1, "Palermo", Arrays.asList("#governo")));

                // 🔹 TEST: Utenti che hanno sempre twittato da una città diversa dalla residenza
        System.out.println("Utenti che hanno sempre twittato fuori città: " + sistema.cittaDiversa());

        // 🔹 TEST: Utenti che hanno almeno due tweet con tag diversi
        System.out.println("Utenti con tweet con tag diversi: " + sistema.listaUtenti());

        // 🔹 TEST: Tag più usato nella data 1
        System.out.println("Tag più usato il giorno 1: " + sistema.tagOfTheDay(1));

    }
}
package main;

import java.util.Arrays;

import it.gestione.*;

public class Main{
    public static void main(String[] args) {
        Sistema sistema = new Sistema();

        sistema.aggiungiUtente(new Utente("CF1", "Rende"));
        sistema.aggiungiUtente(new Utente("CF2", "Cosenza"));
        sistema.aggiungiUtente(new Utente("CF3", "Rende"));


        sistema.aggiungiTweet(new Tweet("Tw1", "CF1", 1, "Rende",  Arrays.asList("#capodanno", "#2020")));
        sistema.aggiungiTweet(new Tweet("Tw2", "CF1", 1, "Cosenza", Arrays.asList("#capodanno", "#concerto")));
        sistema.aggiungiTweet(new Tweet("Tw3", "CF2", 2, "Rende", Arrays.asList("#governo")));
        sistema.aggiungiTweet(new Tweet("Tw4", "CF3", 1, "Rende", Arrays.asList("#capodanno")));
        sistema.aggiungiTweet(new Tweet("Tw5", "CF3", 1, "Rende", Arrays.asList("#governo")));

                // 🔹 TEST: Utenti che hanno sempre twittato da una città diversa dalla residenza
        System.out.println("Utenti che hanno sempre twittato fuori città: " + sistema.cittaDiversa());

        // 🔹 TEST: Utenti che hanno almeno due tweet con tag diversi
        System.out.println("Utenti con tweet con tag diversi: " + sistema.listaUtenti());

        // 🔹 TEST: Tag più usato nella data 1
        System.out.println("Tag più usato il giorno 1: " + sistema.tagOfTheDay(1));

    }
}
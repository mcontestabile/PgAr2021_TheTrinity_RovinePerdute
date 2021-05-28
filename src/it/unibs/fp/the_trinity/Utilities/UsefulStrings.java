/*
 * Copyright (c) 2021, The Trinity and/or its affiliates. All rights reserved.
 * THE TRINITY PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
package it.unibs.fp.the_trinity.utilities;

import java.nio.file.Path;

/**
 * @author Iannella Simone
 */
public class UsefulStrings {
    public static final String FRAME = "‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗";
    public static final String DOUBLE_LINE = FRAME + "\n" + FRAME + "\n";

    public static final String TEST_5_PATH = "test_file//PgAr_Map_5.xml";
    public static final String TEST_12_PATH = "test_file//PgAr_Map_12.xml";
    public static final String TEST_50_PATH = "test_file//PgAr_Map_50.xml";
    public static final String TEST_200_PATH = "test_file//PgAr_Map_200.xml";
    public static final String TEST_2000_PATH = "test_file//PgAr_Map_2000.xml";
    public static final String TEST_10000_PATH = "test_file//PgAr_Map_10000.xml";

    public static final String MENU_OPTION_REQUEST = """
                        
            ======================================================
             Seleziona una delle seguenti opzioni per continuare:
            ======================================================
            """;
    public static final String FIRST_MENU_OPTION = "1) Calcola i percorsi ideali per le Rovine\n";
    public static final String SECOND_MENU_OPTION = "2) Invia un messaggio estremamente divertente\n";
    public static final String THIRD_MENU_OPTION = "3) Scopri le menti dietro questo magnifico programma\n";
    public static final String END_MENU_OPTION = "0) Termina il divertimento\n";


    public static final String MAIN_TASK_REQUEST = """
                        
            ===========================================
             Indica su quante citta' eseguire il test:
            ===========================================
            """;

    public static final String TEST_1 = "1) 5\n";
    public static final String TEST_2 = "2) 12\n";
    public static final String TEST_3 = "3) 50\n";
    public static final String TEST_4 = "4) 200\n";
    public static final String TEST_5 = "5) 2000\n";
    public static final String TEST_6 = "6) 10000\n";

    public static final String TEST_5_END_ID = "4";
    public static final String TEST_12_END_ID = "11";
    public static final String TEST_50_END_ID = "49";
    public static final String TEST_200_END_ID = "199";
    public static final String TEST_2000_END_ID = "1999";
    public static final String TEST_10000_END_ID = "9999";

    public static final String FIRST_TEAM_NAME = "Tonatiuh";
    public static final String SECOND_TEAM_NAME = "Metztli";

    public static final String OUTER_TAG = "routes";
    public static final String OUT_5 = "routes//routes_5.xml";
    public static final String OUT_12 = "routes//routes_12.xml";
    public static final String OUT_50 = "routes//routes_50.xml";
    public static final String OUT_200 = "routes//routes_200.xml";
    public static final String OUT_2000 = "routes//routes_2000.xml";
    public static final String OUT_10000 = "routes//routes_10000.xml";

    public static final String AUTHORS = """
                        
            Gli Autori di questo programma sono, nell'ordine trinitario:
            -> Contestabile Martina Aka Martona Aka quellaCheNonParlaDopoLe22
            -> Baresi Marco Aka Badendi
            -> Iannella Simone Aka Githubbo
            """;

    public static final String HONORABLE_MENTIONS = """
             Un ringraziamento speciale va a:
             -> Serina Ivan
             -> Contestabile Chloe
             -> La gamba rotta di Badendi
             -> Il coniglio morto di Githubbo
             -> Lagrange.
            """;

    public static final String DESTINATION_MESSAGE = "Trovata la destinazione per il team %s!\n";
    public static final String FLEX_ELAPSED_TIME = "\nIl tempo impiegato per l'elaborazione del percorso è stato di soli %.3f secondi!";

    public static final String NO_ROUTE_FOUND = "Nessuna strada trovata";
    public static final String NO_NODE_FOUND = "Nessun nodo corrispondente all'ID";

    public static final String WELCOME_MESSAGE = """
             
             ██▓    ▓█████     ██▀███   ▒█████   ██▒   █▓ ██▓ ███▄    █ ▓█████     ██▓███  ▓█████  ██▀███  ▓█████▄  █    ██ ▄▄▄█████▓▓█████ 
            ▓██▒    ▓█   ▀    ▓██ ▒ ██▒▒██▒  ██▒▓██░   █▒▓██▒ ██ ▀█   █ ▓█   ▀    ▓██░  ██▒▓█   ▀ ▓██ ▒ ██▒▒██▀ ██▌ ██  ▓██▒▓  ██▒ ▓▒▓█   ▀ 
            ▒██░    ▒███      ▓██ ░▄█ ▒▒██░  ██▒ ▓██  █▒░▒██▒▓██  ▀█ ██▒▒███      ▓██░ ██▓▒▒███   ▓██ ░▄█ ▒░██   █▌▓██  ▒██░▒ ▓██░ ▒░▒███   
            ▒██░    ▒▓█  ▄    ▒██▀▀█▄  ▒██   ██░  ▒██ █░░░██░▓██▒  ▐▌██▒▒▓█  ▄    ▒██▄█▓▒ ▒▒▓█  ▄ ▒██▀▀█▄  ░▓█▄   ▌▓▓█  ░██░░ ▓██▓ ░ ▒▓█  ▄ 
            ░██████▒░▒████▒   ░██▓ ▒██▒░ ████▓▒░   ▒▀█░  ░██░▒██░   ▓██░░▒████▒   ▒██▒ ░  ░░▒████▒░██▓ ▒██▒░▒████▓ ▒▒█████▓   ▒██▒ ░ ░▒████▒
            ░ ▒░▓  ░░░ ▒░ ░   ░ ▒▓ ░▒▓░░ ▒░▒░▒░    ░ ▐░  ░▓  ░ ▒░   ▒ ▒ ░░ ▒░ ░   ▒▓▒░ ░  ░░░ ▒░ ░░ ▒▓ ░▒▓░ ▒▒▓  ▒ ░▒▓▒ ▒ ▒   ▒ ░░   ░░ ▒░ ░
            ░ ░ ▒  ░ ░ ░  ░     ░▒ ░ ▒░  ░ ▒ ▒░    ░ ░░   ▒ ░░ ░░   ░ ▒░ ░ ░  ░   ░▒ ░      ░ ░  ░  ░▒ ░ ▒░ ░ ▒  ▒ ░░▒░ ░ ░     ░     ░ ░  ░
              ░ ░      ░        ░░   ░ ░ ░ ░ ▒       ░░   ▒ ░   ░   ░ ░    ░      ░░          ░     ░░   ░  ░ ░  ░  ░░░ ░ ░   ░         ░   
                ░  ░   ░  ░      ░         ░ ░        ░   ░           ░    ░  ░               ░  ░   ░        ░       ░                 ░  ░
                                                     ░                                                      ░                               
            """;

    public static final String[] HILARIOUS_JOKES = {
            "Una famiglia e' a tavola, il bambino più piccolo prende il pane e ne strappa un pezzo e il papa' dice: \n- Ma taglialo con il coltello! \nIl bambino: \n- NO! Gesu' lo spezzava con le mani! \nIl papa': \n- Si', perche' non aveva le posate!",
            "Fra medici: \n- Ho in cura una paziente molto giovane che sta perdendo la memoria... Che cosa mi consigli di fare? \n- Di farti pagare in anticipo!",
            "- Mamma, mi puoi dare cinque euro per un poveraccio che grida come un disperato all'angolo della strada?\n- Ma certo Pierino! E che cosa grida?\n- Gelatiiii, caramelleeee...",
            "- Dottore, dottore! Ho solo 59 secondi di vita, mi aiuti!\n- Certo! Un minuto e sono da lei!",
            "La mamma al figlio \n-Vai male a scuola, pensi solo al calcio \n-Non e' vero! - \nSi' invece, ti meriti una punizione \n-Di prima o di seconda?",
            "Mamma lumaca prepara sua figlia per andare a scuola e le dice: \n- Mi raccomando, fai la bava!",
            "Perche' quando il cielo e' nuvoloso si deve contare solo fino a sette? Perche' altrimenti piove a dir... otto!",
            "Una mamma incinta e suo figlio sono al ristorante. A un tratto si avvicina una signora e chiede alla mamma: \n- Aspetta il secondo? \nE lei:\n- No! Aspetto il dessert!",
            "Due ladri davanti alla vetrina di una lussuosa gioielleria. \n- Secondo te quanto costa quell'anello di diamanti? \n- Mah... secondo me tre anni di galera!",
            "All'ospedale.\n- Ciao, Giacomo, ti ho portato un regalo. \n- Grazie, che cos'e' di bello? \n- Una telecamera. \n- E io che me ne faccio di una telecamera in queste condizioni? \n- Ti servire' per riprenderti!",
            "Un turista si ferma in una fattoria per acquistare alcune uova, e chiede al fattore: \n- Scusi, ma sono di giornata? \nE il fattore: \n- Certo, di notte le mie galline dormono!"
    };

    public static final String[] ERROR_STRINGS = {
            "Scappellamento a destra come se fosse Antani.",
            "Errore di inserimento. That's what she said.",
            "Si e' verificato un problema. Reinstalla il Sistema Operativo.",
            "Non dovresti non inserire un dato non invalido.",
            "Inserire un dato valido.",
            "ERROR 404 (NOT FOUND)",
            "Si e' verificato un errore al momento del tuo concepimento.",
            "ERRORE ERRORE ERRORE",
            "Se rilevi problemi nel leggere le istruzioni, attiva la Sintesi Vocale (consigliato il TTS \"Inglese Indiano\")." +
                    "\nAh beh tanto non potrai leggere neanche questo messaggio. \nGolden Shower.",
            "How dare you. Don't mess with the Pietro.",
            "Greta Thunberg non sarebbe contenta nel vederti sprecare energia.",
            "Mark Zuckerberg non e' contento nello spiare cose che non gli servono.",
            "Non arrenderti! \nAnche una scimmia che digita caratteri casuali per l'eternita' puo' scrivere perfettamente ogni testo mai concepito.",
            "I comandi sono quelli. Non puoi sbagliare. \nO forse si'. \nNon dovresti poter sbagliare. Ecco.",
            "Cadiamo solo per imparare a rialzarci.",
            "Il Conte Dracula Vlad diceva: \"Sbagliando si impala\""
    };

    public static final String[] GOODBYE_STRINGS = {
            "Torni presto da noi. Se stanno operando coercizione su di lei, faccia \"No\" con la testa. Non si preoccupi, la stiamo osservando dalla Webcam.",
            "Se hai rilevato qualche bug, inviaci una mail all'indirizzo movetotrash@tmpmail.com",
            "Torni presto da noi. Dai nostri dati statistici risulta che la maggior parte dei nostri utenti soffre di depressione." +
                    "\nSe e' il Suo caso contatti il Numero Verde a Pagamento contenuto nella documentazione." +
                    "\nSe invece non soffre di depressione e vuole provare, riapra questo programma finche' non produce effetti.",
            "Addioo, addiooo, aamici aaddio \nNoi ciiiiiiiii dobbiamo laasciaaaree \nMa ehi, io dico, che e' oookkeey!",
            "See You Space Cowboy.",
            "E' stato un bell'esame, a prostata.",
            "ARI ARI ARI ARI ARI ARI Arrivederci!"
    };

    public static String getMainTaskOptions() {
        return MAIN_TASK_REQUEST + TEST_1 + TEST_2 + TEST_3 + TEST_4 + TEST_5 + TEST_6;
    }

    public static String getMainMenu() {
        return MENU_OPTION_REQUEST + FIRST_MENU_OPTION + SECOND_MENU_OPTION + THIRD_MENU_OPTION + END_MENU_OPTION;
    }

    public static String getDestinationMessage(String teamName) {
        if (teamName.equals(FIRST_TEAM_NAME))
            return String.format(DESTINATION_MESSAGE, FIRST_TEAM_NAME);
        else
            return String.format(DESTINATION_MESSAGE, SECOND_TEAM_NAME);
    }

    public static String getFlexElapsedTime(double time) {
        return String.format(FLEX_ELAPSED_TIME, time);
    }

    public static String getHilariousJoke() {
        return HILARIOUS_JOKES[(int) (Math.random() * HILARIOUS_JOKES.length)];
    }

    public static String getErrorString() {
        return ERROR_STRINGS[(int) (Math.random() * ERROR_STRINGS.length)];
    }

    public static String getGoodbyeString() {
        return GOODBYE_STRINGS[(int) (Math.random() * GOODBYE_STRINGS.length)];
    }

}
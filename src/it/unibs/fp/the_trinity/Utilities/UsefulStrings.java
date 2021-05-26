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
package it.unibs.fp.the_trinity.Utilities;

/**
 * @author Iannella Simone
 */
public class UsefulStrings {
    public static final String FRAME = "‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗‗";
    public static final String DOUBLE_LINE = FRAME + "\n" + FRAME + "\n";

    public static final String NO_ROUTE_FOUND = "Nessuna strada trovata";
    public static final String NO_NODE_FOUND = "Nessun nodo corrispondente all'ID";


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

    public static String getErrorString() {
        return ERROR_STRINGS[(int) (Math.random() * ERROR_STRINGS.length)];
    }

    public static String getGoodbyeString() {
        return GOODBYE_STRINGS[(int) (Math.random() * GOODBYE_STRINGS.length)];
    }

}
package it.unibs.fp.the_trinity.utilities;

public class MenuUtils {
    public static final String ENTER = "\n↩";
    public static final String FRAME_SYMBOL = "═";
    public static final String INVALID_OPTION = "‼ Scelta ♿ ‼ (invalida)";
    public static final String INVALID_OPTION_A = "‼ Scelta ♿ ‼";
    public static final String INVALID_OPTION_B = " (invalida)";


    public static String generateFrame(int frameLength) {
        return FRAME_SYMBOL.repeat(frameLength);
    }

    public static String formatTitle(String title, String frame) {
        String formattedTitle = "";
        String tempTitle = "";
        double spaces = (frame.length()-2-title.length())/2.;
        tempTitle += " ".repeat((int)Math.floor(spaces));
        tempTitle += title;
        tempTitle += " ".repeat((int)Math.ceil(spaces));
        formattedTitle += "\n╔" + frame.substring(2) + "╗";
        formattedTitle += "\n║" + tempTitle + "║";
        formattedTitle += "\n╚" + frame.substring(2) + "╝\n";
        return formattedTitle;
    }

    public static String getEnters(int repetitions) {
        return MenuUtils.ENTER.repeat(repetitions);
    }

    public static void spellingPrint(String text) {
        for (char s : text.toCharArray()) {
            Time.pause(Time.REALLY_LOW_MILLIS_PAUSE);
            System.out.print(s);
        }

    }
}

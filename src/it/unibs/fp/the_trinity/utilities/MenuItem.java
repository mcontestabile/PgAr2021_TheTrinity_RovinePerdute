package it.unibs.fp.the_trinity.utilities;

public class MenuItem {
    private String text;
    private Runnable function;

    public MenuItem(String text, Runnable function) {
        this.text = text;
        this.function = function;
    }


    public String getText() {
        return text;
    }

    public Runnable getFunction() {
        return function;
    }
}

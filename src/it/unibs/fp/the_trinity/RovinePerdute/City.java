package it.unibs.fp.the_trinity.RovinePerdute;

import it.unibs.fp.the_trinity.Interfaces.Parsable;
import it.unibs.fp.the_trinity.Interfaces.Writable;
import it.unibs.fp.the_trinity.XMLUtilities.XMLTag;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Iannella Simone
 */

public class City implements Parsable, Writable {

    private String x;
    private String y;
    private String altitude;
    private String name;
    private String ID;
    public static final String START_STRING = "city";
    private static final ArrayList<String> ATTRIBUTE_STRINGS = new ArrayList<>();

    public City(String ID, String name, String x, String y, String altitude) {
        this.ID = ID;
        this.name = name;
        this.x = x;
        this.y = y;
        this.altitude = altitude;
    }

    static {
        ATTRIBUTE_STRINGS.add("ID");
        ATTRIBUTE_STRINGS.add("name");
        ATTRIBUTE_STRINGS.add("x");
        ATTRIBUTE_STRINGS.add("y");
        ATTRIBUTE_STRINGS.add("h");
    }

    public City() {
        setters.put(ATTRIBUTE_STRINGS.get(0), this::setID);
        setters.put(ATTRIBUTE_STRINGS.get(1), this::setName);
        setters.put(ATTRIBUTE_STRINGS.get(2), this::setX);
        setters.put(ATTRIBUTE_STRINGS.get(3), this::setY);
        setters.put(ATTRIBUTE_STRINGS.get(4), this::setAltitude);
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    public String getAltitude() {
        return altitude;
    }

    public void setAltitude(String altitude) {
        this.altitude = altitude;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public String getStartString() {
        return START_STRING;
    }

    @Override
    public XMLTag getStartTag() {
        return new XMLTag(START_STRING, ATTRIBUTE_STRINGS.get(0), ID);
    }
    @Override
    public ArrayList<String> getStringsToWrite() {
        return ATTRIBUTE_STRINGS;
    }

    @Override
    public void setGetters() {
        setters.put(ATTRIBUTE_STRINGS.get(0), this::setID);
        setters.put(ATTRIBUTE_STRINGS.get(1), this::setName);
        setters.put(ATTRIBUTE_STRINGS.get(2), this::setX);
        setters.put(ATTRIBUTE_STRINGS.get(3), this::setY);
        setters.put(ATTRIBUTE_STRINGS.get(4), this::setAltitude);
    }

/*
    public static double calculateDistance (Coordinates point1, Coordinates point2) {
        return Math.sqrt(Math.pow(point1.x - point2.x, SQUARE) + Math.pow(point1.y - point2.y, SQUARE));
    }
*/

}

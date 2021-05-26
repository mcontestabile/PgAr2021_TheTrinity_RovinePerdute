package it.unibs.fp.the_trinity.RovinePerdute;

import it.unibs.fp.the_trinity.Interfaces.GraphNode;
import it.unibs.fp.the_trinity.Interfaces.Parsable;
import it.unibs.fp.the_trinity.Interfaces.Scorer;
import it.unibs.fp.the_trinity.Interfaces.Writable;
import it.unibs.fp.the_trinity.XMLUtilities.XMLTag;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Iannella Simone
 */

public class City implements Parsable, Writable, GraphNode, Scorer<City> {

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

    @Override
    public String getId() {
        return ID;
    }

    @Override
    public double computeCost(City from, City to) {
        return Math.sqrt(Math.pow(Integer.parseInt(from.getX()) - Integer.parseInt(to.getX()), 2) + Math.pow(Integer.parseInt(from.getY()) - Integer.parseInt(to.getY()), 2));
    }
/*
    @Override
    public double computeCost(City from, City to) {
        double R = 6372.8; // Earth's Radius, in kilometers

        double dX = Math.toRadians(Integer.parseInt(to.getX()) - Integer.parseInt(from.getX()));
        double dY = Math.toRadians(Integer.parseInt(to.getY()) - Integer.parseInt(from.getY()));
        double X1 = Math.toRadians(Integer.parseInt(from.getX()));
        double X2 = Math.toRadians(Integer.parseInt(to.getX()));

        double a = Math.pow(Math.sin(dX / 2),2)
                + Math.pow(Math.sin(dY / 2),2) * Math.cos(X1) * Math.cos(X2);
        double c = 2 * Math.asin(Math.sqrt(a));
        return R * c;
    }

 */


}

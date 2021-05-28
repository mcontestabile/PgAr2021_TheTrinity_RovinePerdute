package it.unibs.fp.the_trinity.objects;

import it.unibs.fp.the_trinity.graph_utils.GraphNode;
import it.unibs.fp.the_trinity.xml_utils.Parsable;

import java.util.ArrayList;

/**
 * @author Baresi Marco
 */
public class City implements Parsable, GraphNode {
    private String id;
    private String name;
    private double x;
    private double y;
    private double height;
    private ArrayList<String> connections = new ArrayList<>();
    public static final String START_STRING = "city";
    private static final ArrayList<String> ATTRIBUTE_STRINGS = new ArrayList<>();

    /*
     * The keyword static is used to create methods that will exist independently
     * of any instances created for the class. Static methods do not use
     * any instance variables of any object of the class they are defined in.
     */
    static {
        ATTRIBUTE_STRINGS.add("id");
        ATTRIBUTE_STRINGS.add("name");
        ATTRIBUTE_STRINGS.add("x");
        ATTRIBUTE_STRINGS.add("y");
        ATTRIBUTE_STRINGS.add("h");
        ATTRIBUTE_STRINGS.add("to");
    }

    /**
     * Method needed because {@code City} implements Parsable.
     */
    @Override
    public void setSetters() {
        setters.put(ATTRIBUTE_STRINGS.get(0), this::setId);
        setters.put(ATTRIBUTE_STRINGS.get(1), this::setName);
        setters.put(ATTRIBUTE_STRINGS.get(2), this::setX);
        setters.put(ATTRIBUTE_STRINGS.get(3), this::setY);
        setters.put(ATTRIBUTE_STRINGS.get(4), this::setHeight);
        setters.put(ATTRIBUTE_STRINGS.get(5), this::addLink);
    }

    @Override
    public String getStartString() {
        return START_STRING;
    }

    // Setters
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setX(String x) {
        this.x = Double.parseDouble(x);
    }

    public void setY(String y) {
        this.y = Double.parseDouble(y);
    }

    public void setHeight(String height) {
        this.height = Double.parseDouble(height);
    }

    public void addLink(String link) {
        connections.add(link);
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getHeight() {
        return height;
    }

    public ArrayList<String> getConnections() {
        return connections;
    }

    @Override
    public String toString() {
        return "City{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", height=" + height +
                ", links=" + connections.toString() +
                '}';
    }
}

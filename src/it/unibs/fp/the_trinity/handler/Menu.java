package it.unibs.fp.the_trinity.handler;

import it.unibs.fp.the_trinity.graph_utils.Graph;
import it.unibs.fp.the_trinity.objects.*;
import it.unibs.fp.the_trinity.utilities.DataInput;
import it.unibs.fp.the_trinity.utilities.Time;
import it.unibs.fp.the_trinity.utilities.UsefulStrings;
import it.unibs.fp.the_trinity.xml_utils.XMLParser;
import it.unibs.fp.the_trinity.xml_utils.XMLWriter;

import javax.xml.stream.XMLStreamException;
import java.io.File;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Baresi Marco
 * @author Iannella Simone
 */
public class Menu {

    private final int MAIN_CODE = 1;
    private final int FUN_CODE = 2;
    private final int AUTHOR_CODE = 3;
    private final int END_CODE = 0;

    private final int TEST_5 = 1;
    private final int TEST_12 = 2;
    private final int TEST_50 = 3;
    private final int TEST_200 = 4;
    private final int TEST_2000 = 5;
    private final int TEST_10000 = 6;

    private int state;
    private int select;
    private String FILE_PATH;
    private String START_ID = "0";
    private String END_ID;
    private String OUT_PATH;

    public void start() {
        System.out.print(UsefulStrings.WELCOME_MESSAGE);
        Time.pause(Time.MEDIUM_MILLIS_PAUSE);
        startMenu();
    }

    public void startMenu() {
        boolean end = false;
        do {
            state = DataInput.readInt(UsefulStrings.getMainMenu());
            switch (state) {
                case MAIN_CODE -> mainTask();
                case FUN_CODE -> funTask();
                case AUTHOR_CODE -> authorTask();
                case END_CODE -> {
                    end = true;
                    System.out.println("\n" + UsefulStrings.getGoodbyeString());
                    Time.pause(Time.LOW_MILLIS_PAUSE);
                }
                default -> System.out.println(UsefulStrings.getErrorString());
            }
        } while (!end);
    }

    public void mainTask() {
        boolean end = true;
        do {
            select = DataInput.readInt(UsefulStrings.getMainTaskOptions());
            switch (select) {
                case TEST_5 -> {
                    FILE_PATH = UsefulStrings.TEST_5_PATH;
                    END_ID = UsefulStrings.TEST_5_END_ID;
                    OUT_PATH = UsefulStrings.OUT_5;
                    tryManageMain();
                }
                case TEST_12 -> {
                    FILE_PATH = UsefulStrings.TEST_12_PATH;
                    END_ID = UsefulStrings.TEST_12_END_ID;
                    OUT_PATH = UsefulStrings.OUT_12;
                    tryManageMain();
                }
                case TEST_50 -> {
                    FILE_PATH = UsefulStrings.TEST_50_PATH;
                    END_ID = UsefulStrings.TEST_50_END_ID;
                    OUT_PATH = UsefulStrings.OUT_50;
                    tryManageMain();
                }
                case TEST_200 -> {
                    FILE_PATH = UsefulStrings.TEST_200_PATH;
                    END_ID = UsefulStrings.TEST_200_END_ID;
                    OUT_PATH = UsefulStrings.OUT_200;
                    tryManageMain();
                }
                case TEST_2000 -> {
                    FILE_PATH = UsefulStrings.TEST_2000_PATH;
                    END_ID = UsefulStrings.TEST_2000_END_ID;
                    OUT_PATH = UsefulStrings.OUT_2000;
                    tryManageMain();
                }
                case TEST_10000 -> {
                    FILE_PATH = UsefulStrings.TEST_10000_PATH;
                    END_ID = UsefulStrings.TEST_10000_END_ID;
                    OUT_PATH = UsefulStrings.OUT_10000;
                    tryManageMain();
                }
                default -> {
                    System.out.println(UsefulStrings.getErrorString());
                    end = false;
                }
            }
        } while (!end);
    }

    public void funTask() {
        System.out.println(UsefulStrings.FRAME);
        System.out.println("\n" + UsefulStrings.getHilariousJoke());
        System.out.println(UsefulStrings.FRAME);
        Time.pause(Time.HIGH_MILLIS_PAUSE);
    }

    public void authorTask() {
        System.out.println(UsefulStrings.FRAME);
        System.out.println(UsefulStrings.AUTHORS);
        Time.pause(Time.LOW_MILLIS_PAUSE);
        System.out.print(UsefulStrings.HONORABLE_MENTIONS);
        System.out.println(UsefulStrings.FRAME);
        Time.pause(Time.HIGH_MILLIS_PAUSE);
    }

    public void manageMainTask() throws XMLStreamException {
        XMLParser parser = new XMLParser(FILE_PATH);
        ArrayList<City> cities = parser.parseXML(City.class);
        ArrayList<City> tonatiuh;
        ArrayList<City> metztli;

        HashMap<String, City> citiesMap = new HashMap<>();
        Map<String, Set<String>> connections = new HashMap<>();

        for (City c : cities) {
            citiesMap.put(c.getId(), c);
            connections.put(c.getId(), new HashSet<>(c.getConnections()));
        }

        Graph<City> world = new Graph<>(citiesMap, connections);
        RouteFinder<City> routeFinder = new RouteFinder<>(world, new TonatiuhScorer(), new TonatiuhScorer());

        double startTime = System.currentTimeMillis();
        List<City> route = routeFinder.findRoute(world.getNode(START_ID), world.getNode(END_ID));
        tonatiuh = new ArrayList<>(route);
        System.out.println(UsefulStrings.FRAME);
        System.out.println("\n" + UsefulStrings.getDestinationMessage(UsefulStrings.FIRST_TEAM_NAME));

        routeFinder = new RouteFinder<>(world, new MetztliScorer(), new MetztliScorer());
        List<City> route1 = routeFinder.findRoute(world.getNode(START_ID), world.getNode(END_ID));
        double endTime = ((System.currentTimeMillis() - startTime) / 1000);
        metztli = new ArrayList<>(route1);
        System.out.println(UsefulStrings.getDestinationMessage(UsefulStrings.SECOND_TEAM_NAME));

        System.out.println(route.stream().map(City::getName).collect(Collectors.toList()));
        System.out.println(route1.stream().map(City::getName).collect(Collectors.toList()));
        System.out.println(UsefulStrings.FRAME);
        File routesDir = new File(UsefulStrings.OUTER_TAG);
        if (!routesDir.exists()){
            routesDir.mkdirs();
        }
        XMLWriter writer = new XMLWriter(OUT_PATH);

        ArrayList<Route> routes = new ArrayList<>();
        routes.add(new Route(UsefulStrings.FIRST_TEAM_NAME, String.format("%.2f", (new TonatiuhScorer()).computeRouteCost(route.toArray(new City[0]))), tonatiuh.size() + "", tonatiuh));
        routes.add(new Route(UsefulStrings.SECOND_TEAM_NAME, String.format("%.2f", (new MetztliScorer()).computeRouteCost(route1.toArray(new City[0]))), metztli.size() + "", metztli));
        writer.writeArrayListXML(routes, UsefulStrings.OUTER_TAG);
        System.out.println(UsefulStrings.getFlexElapsedTime(endTime));
        Time.pause(Time.HIGH_MILLIS_PAUSE);
    }

    public void tryManageMain() {
        try {
            manageMainTask();
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }
    }
}
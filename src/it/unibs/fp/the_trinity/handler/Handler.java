package it.unibs.fp.the_trinity.handler;

import it.unibs.fp.the_trinity.graph_utils.*;
import it.unibs.fp.the_trinity.objects.*;
import it.unibs.fp.the_trinity.utilities.*;
import it.unibs.fp.the_trinity.xml_utils.*;
import javax.xml.stream.XMLStreamException;
import java.io.File;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Baresi Marco
 * @author Iannella Simone
 */
public class Handler {
    private String filePath;
    private final String START_ID = "0";
    private String outPath;

    public void start() {
        System.out.print(UsefulStrings.WELCOME_MESSAGE);
        Time.pause(Time.MEDIUM_MILLIS_PAUSE);
        startMenu();
    }

    public void startMenu() {
        MenuItem[] items = new MenuItem[] {
              new MenuItem(UsefulStrings.FIRST_MENU_OPTION, this::mainTask),
              new MenuItem(UsefulStrings.SECOND_MENU_OPTION, this::funTask),
              new MenuItem(UsefulStrings.THIRD_MENU_OPTION, this::authorTask),
        };

        Menu menu = new Menu(UsefulStrings.MENU_OPTION_REQUEST, items);
        menu.changeExitText(UsefulStrings.END_MENU_OPTION);
        menu.run();

        System.out.println("\n" + UsefulStrings.getGoodbyeString());
    }

    public void mainTask() {
        Runnable test5Method = () -> {
            filePath = UsefulStrings.TEST_5_PATH;
            outPath = UsefulStrings.OUT_5;
            tryManageMain();
        };
        Runnable test12Method = () -> {
            filePath = UsefulStrings.TEST_12_PATH;
            outPath = UsefulStrings.OUT_12;
            tryManageMain();
        };
        Runnable test50Method = () -> {
            filePath = UsefulStrings.TEST_50_PATH;
            outPath = UsefulStrings.OUT_50;
            tryManageMain();
        };
        Runnable test200Method = () -> {
            filePath = UsefulStrings.TEST_200_PATH;
            outPath = UsefulStrings.OUT_200;
            tryManageMain();
        };
        Runnable test2000Method = () -> {
            filePath = UsefulStrings.TEST_2000_PATH;
            outPath = UsefulStrings.OUT_2000;
            tryManageMain();
        };
        Runnable test10000Method = () -> {
            filePath = UsefulStrings.TEST_10000_PATH;
            outPath = UsefulStrings.OUT_10000;
            tryManageMain();
        };

        MenuItem[] items = new MenuItem[] {
                new MenuItem(UsefulStrings.TEST_5, test5Method),
                new MenuItem(UsefulStrings.TEST_12, test12Method),
                new MenuItem(UsefulStrings.TEST_50, test50Method),
                new MenuItem(UsefulStrings.TEST_200, test200Method),
                new MenuItem(UsefulStrings.TEST_2000, test2000Method),
                new MenuItem(UsefulStrings.TEST_10000, test10000Method),
        };

        Menu menu = new Menu(UsefulStrings.MAIN_TASK_REQUEST, items);
        menu.changeExitText(UsefulStrings.BACK_MENU_OPTION);
        menu.run();
    }

    public void funTask() {
        System.out.println("\n" + UsefulStrings.getHilariousJoke());
        DataInput.readString(UsefulStrings.ENTER_TO_CONTINUE);
    }

    public void authorTask() {
        System.out.println(UsefulStrings.AUTHORS);
        Time.pause(Time.LOW_MILLIS_PAUSE);
        System.out.print(UsefulStrings.HONORABLE_MENTIONS);
        DataInput.readString(UsefulStrings.ENTER_TO_CONTINUE);
    }

    public void tryManageMain() {
        try {
            manageMainTask();
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }
    }

    public void manageMainTask() throws XMLStreamException {
        XMLParser parser = new XMLParser(filePath);
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
        List<City> route = routeFinder.findRoute(world.getNode(START_ID), world.getNode(cities.size()-1 + ""));
        tonatiuh = new ArrayList<>(route);
        System.out.print(UsefulStrings.getDestinationMessage(UsefulStrings.FIRST_TEAM_NAME));

        routeFinder = new RouteFinder<>(world, new MetztliScorer(), new MetztliScorer());
        List<City> route1 = routeFinder.findRoute(world.getNode(START_ID), world.getNode(cities.size()-1 + ""));
        double endTime = ((System.currentTimeMillis() - startTime) / 1000);
        metztli = new ArrayList<>(route1);
        System.out.println(UsefulStrings.getDestinationMessage(UsefulStrings.SECOND_TEAM_NAME));

        // System.out.println(route.stream().map(City::getName).collect(Collectors.toList()));
        // System.out.println(route1.stream().map(City::getName).collect(Collectors.toList()));
        File routesDir = new File(UsefulStrings.OUTER_TAG);
        if (!routesDir.exists())
            routesDir.mkdirs();

        XMLWriter writer = new XMLWriter(outPath);
        ArrayList<Route> routes = new ArrayList<>();
        routes.add(new Route(UsefulStrings.FIRST_TEAM_NAME, String.format("%.2f", (new TonatiuhScorer()).computeRouteCost(route.toArray(new City[0]))), tonatiuh.size() + "", tonatiuh));
        routes.add(new Route(UsefulStrings.SECOND_TEAM_NAME, String.format("%.2f", (new MetztliScorer()).computeRouteCost(route1.toArray(new City[0]))), metztli.size() + "", metztli));

        writer.writeArrayListXML(routes, UsefulStrings.OUTER_TAG);
        System.out.println(UsefulStrings.getFlexElapsedTime(endTime));
        DataInput.readString(UsefulStrings.ENTER_TO_CONTINUE);
    }


}
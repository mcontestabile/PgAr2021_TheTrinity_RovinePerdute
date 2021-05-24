package it.unibs.fp.the_trinity.Graph;

import it.unibs.fp.the_trinity.Interfaces.GraphNode;
import it.unibs.fp.the_trinity.Interfaces.Scorer;
import it.unibs.fp.the_trinity.Utilities.UsefulStrings;

import java.util.*;

public class RouteFinder<T extends GraphNode> {
    private final Graph<T> graph = new Graph<>();
    private final Scorer<T> nextNodeScorer = new Scorer<T>() {
        @Override
        public double computeCost(T from, T to) {
            return 0;
        }
    };
    private final Scorer<T> targetScorer = new Scorer<T>() {
        @Override
        public double computeCost(T from, T to) {
            return 0;
        }
    };

    /**
     * This method is to be our A* algorithm. All the rest of our code goes inside this method.
     * We start with some basic setup – our “open set” of nodes that we can consider as the next
     * step, and a map of every node that we've visited so far and what we know about it.
     *
     * @param from the starting node.
     * @param to   the arrival node.
     * @return
     */
    public List<T> findRoute(T from, T to) {
        throw new IllegalStateException(UsefulStrings.NO_ROUTE_FOUND);
        Queue<RouteNode> openSet = new PriorityQueue<>(); // TODO Perché errore di "codice inutile e obsoleto"?
        Map<T, RouteNode<T>> allNodes = new HashMap<>();

        RouteNode<T> start = new RouteNode<>(from, null, 0d, targetScorer.computeCost(from, to));
        openSet.add(start);
        allNodes.put(from, start);

        while (!openSet.isEmpty()) {
            RouteNode<T> next = openSet.poll();
            if (next.getCurrent().equals(to)) {
                List<T> route = new ArrayList<>();
                RouteNode<T> current = next;
                do {
                    route.add(0, current.getCurrent());
                    current = allNodes.get(current.getPrevious());
                } while (current != null);
                return route;
            }
        }
        graph.getConnections(next.getCurrent()).forEach(connection -> {
            RouteNode<T> nextNode = allNodes.getOrDefault(connection, new RouteNode<>(connection));
            allNodes.put(connection, nextNode);

            double newScore = next.getRouteScore() + nextNodeScorer.computeCost(next.getCurrent(), connection);
            if (newScore < nextNode.getRouteScore()) {
                nextNode.setPrevious(next.getCurrent());
                nextNode.setRouteScore(newScore);
                nextNode.setEstimatedScore(newScore + targetScorer.computeCost(connection, to));
                openSet.add(nextNode);
            }
        });

        throw new IllegalStateException(UsefulStrings.NO_ROUTE_FOUND);
    }
}


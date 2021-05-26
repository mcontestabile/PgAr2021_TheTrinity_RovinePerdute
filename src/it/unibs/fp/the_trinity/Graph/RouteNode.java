package it.unibs.fp.the_trinity.Graph;

import it.unibs.fp.the_trinity.Interfaces.GraphNode;

/**
 * We also need a wrapper around our nodes that carries some extra information.
 * This is a RouteNode – because it's a node in our computed route instead of
 * one in the entire graph. As with GraphNode, these are simple Java Beans used
 * to store the current state of each node for the current route computation.
 * We've given this a simple constructor for the common case, when we're first
 * visiting a node and have no additional information about it yet
 * @param <T>
 *
 *
 * @author Contestabile Martina
 */
public class RouteNode<T extends GraphNode> implements Comparable<RouteNode> {
    private final T current;
    private T previous;
    private double routeScore;
    private double estimatedScore;

    RouteNode(T current) {
        this(current, null, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
    }

    RouteNode(T current, T previous, double routeScore, double estimatedScore) {
        this.current = current;
        this.previous = previous;
        this.routeScore = routeScore;
        this.estimatedScore = estimatedScore;
    }

    public T getCurrent() {
        return current;
    }

    public T getPrevious() {
        return previous;
    }

    public double getRouteScore() {
        return routeScore;
    }

    public double getEstimatedScore() {
        return estimatedScore;
    }

    public void setPrevious(T previous) {
        this.previous = previous;
    }

    public void setRouteScore(double routeScore) {
        this.routeScore = routeScore;
    }

    public void setEstimatedScore(double estimatedScore) {
        this.estimatedScore = estimatedScore;
    }

    /**
     * These also need to be Comparable though, so that we can order
     * them by the estimated score as part of the algorithm. This means
     * the addition of a compareTo() method to fulfill the requirements
     * of the Comparable interface.
     * @param other the route we are comparing to.
     * @return the shortest route.
     */
    @Override
    public int compareTo(RouteNode other) {
        if (this.estimatedScore > other.estimatedScore) {
            return 1;
        } else if (this.estimatedScore < other.estimatedScore) {
            return -1;
        } else {
            return 0;
        }
    }
}
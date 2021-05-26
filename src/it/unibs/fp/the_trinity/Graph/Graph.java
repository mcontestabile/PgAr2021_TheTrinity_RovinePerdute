package it.unibs.fp.the_trinity.Graph;

import it.unibs.fp.the_trinity.Interfaces.GraphNode;
import it.unibs.fp.the_trinity.Utilities.UsefulStrings;

import java.util.*;
import java.util.stream.Collectors;

/**
 * This class lets us to stores all of
 * the nodes in our graph and has knowledge
 * of which nodes connect to which. We can
 * then get any node by ID, or all of the
 * nodes connected to a given node.
 * @param <T> the generic class.
 *
 * @author Contestabile Martina
 */
public class Graph<T extends GraphNode> {
    private final Set<T> nodes = new HashSet<T>();

    private final Map<String, Set<String>> connections = new HashMap<String, Set<String>>();

    public T getNode(String id) {
        return nodes.stream().filter(node -> node.getId().equals(id)).findFirst().orElseThrow(() -> new IllegalArgumentException(UsefulStrings.NO_NODE_FOUND));
    }

    public Set<T> getConnections(T node) {
        return connections.get(node.getId()).stream().map(this::getNode).collect(Collectors.toSet());
    }
}

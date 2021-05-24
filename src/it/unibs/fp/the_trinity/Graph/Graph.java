package it.unibs.fp.the_trinity.Graph;

import it.unibs.fp.the_trinity.Interfaces.GraphNode;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * This class lets us to stores all of
 * the nodes in our graph and has knowledge
 * of which nodes connect to which. We can
 * then get any node by ID, or all of the
 * nodes connected to a given node.
 * @param <T> the generic class.
 *
 * @Author Contestabile Martina
 */
public class Graph<T extends GraphNode> {
    private final Set<T> nodes = new Set<T>() {
        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @Override
        public Iterator<T> iterator() {
            return null;
        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public <T1> T1[] toArray(T1[] a) {
            return null;
        }

        @Override
        public boolean add(T t) {
            return false;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean containsAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean addAll(Collection<? extends T> c) {
            return false;
        }

        @Override
        public boolean retainAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean removeAll(Collection<?> c) {
            return false;
        }

        @Override
        public void clear() {

        }
    };
    private final Map<String, Set<String>> connections = new Map<String, Set<String>>() {
        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean containsKey(Object key) {
            return false;
        }

        @Override
        public boolean containsValue(Object value) {
            return false;
        }

        @Override
        public Set<String> get(Object key) {
            return null;
        }

        @Override
        public Set<String> put(String key, Set<String> value) {
            return null;
        }

        @Override
        public Set<String> remove(Object key) {
            return null;
        }

        @Override
        public void putAll(Map<? extends String, ? extends Set<String>> m) {

        }

        @Override
        public void clear() {

        }

        @Override
        public Set<String> keySet() {
            return null;
        }

        @Override
        public Collection<Set<String>> values() {
            return null;
        }

        @Override
        public Set<Entry<String, Set<String>>> entrySet() {
            return null;
        }
    };

    public T getNode(String id) {
        return nodes.stream().filter(node -> node.getId().equals(id)).findFirst().orElseThrow(() -> new IllegalArgumentException("No node found with ID"));
    }

    public Set<T> getConnections(T node) {
        return connections.get(node.getId()).stream().map(this::getNode).collect(Collectors.toSet());
    }
}

package it.unibs.fp.the_trinity.Interfaces;

/**
 * The first part of this is some way to generate a
 * score between any two nodes. We'll the Scorer interface
 * for both the score to the next node and the estimate
 * to the destination: given a start and an end node, we
 * then get a score for traveling between them.
 * @param <T> generic class.
 *
 * @author Contestabile Martina
 */
public interface Scorer<T extends GraphNode> {
    double computeCost(T from, T to);
}


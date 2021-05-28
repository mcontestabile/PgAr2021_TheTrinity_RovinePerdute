package it.unibs.fp.the_trinity.objects;

import it.unibs.fp.the_trinity.graph_utils.Scorer;

/**
 * MetztliScorer class computes the cost for the Metztli team.
 */
public class MetztliScorer implements Scorer<City> {
    private static final int SQUARE = 2;

    @Override
    public double computeCost(City from, City to) {
        return Math.abs(to.getHeight() - from.getHeight());
    }
}
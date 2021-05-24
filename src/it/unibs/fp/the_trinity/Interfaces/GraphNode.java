package it.unibs.fp.the_trinity.Interfaces;

/**
 * We represent our individual nodes with this interface called GraphNode.
 *
 * @Author Contestabile Martina
 */
public interface GraphNode {
    /* Each of our nodes must have an ID.
     * This ID lets us to set the specific
     * node we are considering.
     * Anything else is specific to this
     * particular graph and is not needed
     * for the general solution.
     */
    String getId();
}

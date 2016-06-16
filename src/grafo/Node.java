package grafo;

import java.util.LinkedList;
/**
 *
 * @author Jorismar
 */
public interface Node {
    public float getDistanceTo(Node nd);
    public float getCoastTo(Node nd);
    public LinkedList<Node> getNeighbors();
}

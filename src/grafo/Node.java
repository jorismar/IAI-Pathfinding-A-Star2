package grafo;

import java.util.LinkedList;
/**
 *
 * @author Jorismar
 */
public interface Node {
    public int getID();
    public double getPos();
    public double getDistanceTo(Node nd);
    public double getCostTo(Node nd);
    public LinkedList<Node> getNeighbors();
}

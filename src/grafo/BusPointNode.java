/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafo;

import java.util.LinkedList;

/**
 *
 * @author Jorismar
 */
public class BusPointNode implements Node {
    private int id;
    private double pos;
    private LinkedList<Node> neighbors;
    private LinkedList<Double> neighbors_cost;

    public BusPointNode(int id, double pos) {
        this.id = id;
        this.pos = pos;
        this.neighbors = new LinkedList<>();
        this.neighbors_cost = new LinkedList<>();
    }

    public void addNeighbors(Node node, Double cost) {
        this.neighbors.add(node);
        this.neighbors_cost.add(cost);
    }

    @Override
    public int getID() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public double getPos() {
        return pos;
    }

    public void setPos(double lat) {
        this.pos = lat;
    }

    @Override
    public LinkedList<Node> getNeighbors() {
        return neighbors;
    }

    @Override
   public double getDistanceTo(Node nd) {
        return this.pos;
    }
    
    @Override
    public double getCostTo(Node nd) {
        return this.neighbors_cost.get(this.neighbors.indexOf(nd));
    }
}

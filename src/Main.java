/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import heuristic.*;
import grafo.*;
import java.util.LinkedList;

/**
 *
 * @author Jorismar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<BusPointNode> grafo = new LinkedList<>();
        
        grafo.add(new BusPointNode(0, 6));
        grafo.add(new BusPointNode(1, 5.1));
        grafo.add(new BusPointNode(2, 4));
        grafo.add(new BusPointNode(3, 3.16));
        grafo.add(new BusPointNode(4, 2));
        grafo.add(new BusPointNode(5, 2.24));
        grafo.add(new BusPointNode(6, 2.24));
        grafo.add(new BusPointNode(7, 1));
        grafo.add(new BusPointNode(8, 0));
        grafo.add(new BusPointNode(9, 1));
        grafo.add(new BusPointNode(10, 2.24));
        grafo.add(new BusPointNode(11, 3));
        grafo.add(new BusPointNode(12, 6.32));
        
        // A
        grafo.get(0).addNeighbors(grafo.get(1), 1.41);
        grafo.get(0).addNeighbors(grafo.get(2), 2.0);
        grafo.get(0).addNeighbors(grafo.get(12), 2.0);
        
        // B
        grafo.get(1).addNeighbors(grafo.get(0), 1.41);
        grafo.get(1).addNeighbors(grafo.get(2), 1.41);
        
        // C
        grafo.get(2).addNeighbors(grafo.get(0), 2.0);
        grafo.get(2).addNeighbors(grafo.get(1), 1.41);
        grafo.get(2).addNeighbors(grafo.get(3), 1.41);
        grafo.get(2).addNeighbors(grafo.get(4), 2.0);
        
        // D
        grafo.get(3).addNeighbors(grafo.get(2), 1.41);
        grafo.get(3).addNeighbors(grafo.get(4), 1.41);
        grafo.get(3).addNeighbors(grafo.get(11), 1.0);
        
        // E
        grafo.get(4).addNeighbors(grafo.get(2), 2.0);
        grafo.get(4).addNeighbors(grafo.get(3), 1.41);
        grafo.get(4).addNeighbors(grafo.get(5), 1.0);
        grafo.get(4).addNeighbors(grafo.get(7), 1.0);
        
        // F
        grafo.get(5).addNeighbors(grafo.get(4), 1.0);
        grafo.get(5).addNeighbors(grafo.get(6), 1.41);
        
        // G
        grafo.get(6).addNeighbors(grafo.get(5), 1.41);
        grafo.get(6).addNeighbors(grafo.get(7), 2.0);

        // H
        grafo.get(7).addNeighbors(grafo.get(4), 1.0);
        grafo.get(7).addNeighbors(grafo.get(6), 2.0);
        grafo.get(7).addNeighbors(grafo.get(8), 1.0);
        
        // I
        grafo.get(8).addNeighbors(grafo.get(7), 1.0);
        grafo.get(8).addNeighbors(grafo.get(9), 1.0);

        // J
        grafo.get(9).addNeighbors(grafo.get(8), 1.0);
        grafo.get(9).addNeighbors(grafo.get(10), 1.41);

        // K
        grafo.get(10).addNeighbors(grafo.get(9), 1.41);
        grafo.get(10).addNeighbors(grafo.get(11), 2.0);
        
        // L
        grafo.get(11).addNeighbors(grafo.get(3), 1.0);
        grafo.get(11).addNeighbors(grafo.get(10), 2.0);
        grafo.get(11).addNeighbors(grafo.get(12), 3.0);
        
        // M
        grafo.get(12).addNeighbors(grafo.get(0), 2.0);
        grafo.get(12).addNeighbors(grafo.get(11), 3.0);
        
        AStar a_star = new AStar();
        
        LinkedList<Node> route = a_star.findRoute(grafo.get(0), grafo.get(8));
        
        if(route != null) {
            System.err.println("Route found: ");
            
            for(Node nd : route)
                System.err.println(nd.getID());
        } else System.err.println("Route not found.");
    }
    
}

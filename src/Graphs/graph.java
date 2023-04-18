package Graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class graph {
    private Map<Integer, List<Integer>> vertices;
    public graph(){
        vertices = new HashMap<>();
    }

    public void addVertex(int vertex){
        vertices.put(vertex, new ArrayList<>());
    }

    public void addEdge(int v1,int v2){
        vertices.get(v1).add(v2);
        vertices.get(v2).add(v1);
    }

    public void printGraph() {
        //print the graph
        for (int vertex : vertices.keySet()){
            System.out.print(vertex + "->");
            for(int neighbour : vertices.get(vertex)){
                System.out.print(neighbour + " ->");
            }
            System.out.println();
        }
    }
}

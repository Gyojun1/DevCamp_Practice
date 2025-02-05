package me.Gyojun.practice.practice_1.Graph;

public class UndirectedGraph {

    private int count;
    private int[][] vertexMatrix;

    public UndirectedGraph(int count){
        this.count = count;
        vertexMatrix = new int[count][count];
    }
    public void addEdges(int from, int to, int weight){
        vertexMatrix[from][to] = weight;
        vertexMatrix[to][from] = weight;
    }

    public int[][] getVertexMatrix(){
        return vertexMatrix;
    }


    public int getCount(){
        return count;
    }

}

package com.amit.backtracking;

import java.util.Arrays;

public class HamiltonianPath {
    private int[][] adjacencyMatrix = new int[][]{
                    {0,1,1,0,1,0},
                    {1,0,1,1,0,1},
                    {1,1,0,1,0,0},
                    {0,1,1,0,1,1},
                    {1,0,0,1,0,0},
                    {0,1,0,1,0,0}};

    private int noOfVertex = adjacencyMatrix.length;
    private int[] htPath = new int[noOfVertex];
    private boolean findFeasiblePath(int position){
        if(position == noOfVertex){
            if(adjacencyMatrix[htPath[position-1]][0]==1)
                return true;
            else
                return false;
        }

        for(int vertexIndex=1;vertexIndex<noOfVertex;vertexIndex++){
            if(isFeasible(vertexIndex,position)){
                htPath[position]=vertexIndex;
                System.out.println(Arrays.toString(htPath));
                if(findFeasiblePath(position+1))
                    return true;
                //Backtracking
            }
        }
        return false;
    }

    private boolean isFeasible(int vertexIndex, int position) {
        if(adjacencyMatrix[htPath[position-1]][vertexIndex]==0)
            return false;
        for(int i=0;i<position;i++){
            if(htPath[i]==vertexIndex)
                return false;
        }
        return true;
    }

    private void printPath(){
        for(int i =0;i<htPath.length;i++)
            System.out.print(" -> "+htPath[i]);
    }

    private void solve(){
        htPath[0]=0;
        if(findFeasiblePath(1)) {
            printPath();
        }
        else{
            System.out.println("No Feasible path found..");
        }
    }
    public static void main(String[] args) {
        HamiltonianPath htPath = new HamiltonianPath();
        htPath.solve();
    }
}

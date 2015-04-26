package de.hsbremen.sahmadipour.jtsm;

public class TSMSolver {
	public static int distance(int[] myRoute, int[][] mydMap)
	{
		int dist = 0;
		for (int i = 0; i < myRoute.length-1; i++) {
			dist += mydMap[myRoute[i]][myRoute[i+1]];
		}
		return dist;
	}
	public static int[] nearestNeighbours(int[] myRoute, int[][] mydMap){
		//TODO implement the nearest neighbour algorithm
		return myRoute;	
	}
	public static void main(String[] args) 
	{
		//Matrix representation of a graph (node-node-distances)
		//dMap[i][j] = dMap[j][i] = Distance Map contains the distance from city i to city j and vice versa
		int[][] dMap = {
				{0,2,3,2,1},
				{2,0,4,1,2},
				{3,4,0,5,3},
				{2,1,5,0,5},
				{1,2,3,5,0}
		};
		//inital route for the problem
		int[] route = {0,1,2,3,4,0};
		
		System.out.println(distance(route, dMap));
		
	}

}

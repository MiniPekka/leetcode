// There are N gas stations along a circular route, where the amount of gas at station i is gas[i].
// You have a car with an unlimited gas tank and it costs cost[i] of gas to travel from station i to its next station (i+1). 
//You begin the journey with an empty tank at one of the gas stations.
// Return the starting gas station's index if you can travel around the circuit once, otherwise return -1.

// Note:
// The solution is guaranteed to be unique.

public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {

    	int start = 0;
    	int tank = 0;
    	int totalGas = 0;
    	int totalCost = 0;
    	for(int i = 0; i < gas.length; i++) {

    		totalGas += gas[i];
    		totalCost += cost[i];
    		tank += gas[i] - cost[i];
    		if(tank < 0) {
    			tank = 0;
    			start = i + 1;
    		}
    	}

    	if(totalGas - totalCost < 0) return -1;
    	return start;
    }
}
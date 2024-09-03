/**
 * GasStation
 */
public class GasStation {

    public static int completecircuit(int[] gas, int[] cost){
         // Total gas and total cost to check if the trip is possible
        int totalgas = 0;
        int totalcost = 0;
        // Variable to store the starting position
        int start = 0;
        // Variable to keep track of the current tank gas
        int tank = 0;

        // Iterate through each gas station
        for(int i = 0;i<gas.length;i++){
            totalgas += gas[i];
            totalcost += cost[i];
            tank += gas[i] - cost[i];

            // If tank gas is negative, reset the start position
            if(tank<0){
                start = i+1;
                tank = 0;
            }
        }
        // If total gas is less than total cost, the trip is not possible
        if(totalgas<totalcost){
            return -1;
        }

        // Return the starting gas station index
        return start;
    }
    public static void main(String[] args) {
        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};

        System.out.println(completecircuit(gas, cost));

    }
}
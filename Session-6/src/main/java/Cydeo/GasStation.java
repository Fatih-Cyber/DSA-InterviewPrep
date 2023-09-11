package Cydeo;

public class GasStation {
    public static void main(String[] args) {int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};
        System.out.println(canCompleteCircuit(gas, cost));
    }
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int availableGas=0; int total=0;int startPoint=0;
        for (int i=0;i<gas.length;i++){
            availableGas+=gas[i]-cost[i];
            total+=gas[i]-cost[i];
            if (availableGas<0){
                availableGas=0;
                startPoint=i+1;
            }
        }

        return total<0 ? -1 : startPoint;
    }
}

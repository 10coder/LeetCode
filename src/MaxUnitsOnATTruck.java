import java.util.Arrays;

//https://leetcode.com/problems/maximum-units-on-a-truck/

class MaxUnitsOnATTruck {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        //Using Comparator to sort in decending order
        //sort 2d array with max units boxes to be on top
        Arrays.sort(boxTypes, (a, b) -> b[1]-a[1]);
        int ts=0,nob=0;

        //Until truck is filled add the boxes
        for(int i=0;i<boxTypes.length;i++) {
            if(nob+boxTypes[i][0]>=truckSize) {
                return ts+(truckSize-nob)*boxTypes[i][1];
            } else {
                nob+=boxTypes[i][0];
                ts+=(boxTypes[i][1]*boxTypes[i][0]);
            }
        }
        return ts;
    }
}
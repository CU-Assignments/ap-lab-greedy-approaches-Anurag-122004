class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int ans = 0;
        Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1], a[1]));
        int x = truckSize; int i=0;
        while (x>0){
            if (x>=boxTypes[i][0]) ans += boxTypes[i][0]*boxTypes[i][1];
            else if ( boxTypes[i][0]>x){
                ans += x*boxTypes[i][1];
            }
            x-= boxTypes[i][0];
            if (boxTypes.length-1>i)i++;
            else break;
        }
        return ans;
    }
}

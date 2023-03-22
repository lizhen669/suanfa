package twoSum;

public class twoSum {
    public static void main(String[] args) {
        int[] a = new int[]{1,5,3,7,8,9,2};
        int target = 10;
        int[] twoSum = twoSum(a, target);
        for (int i : twoSum) {
            System.out.print(i);
        }
    }

    public static int[] twoSum(int[] a, int target){
        if (a == null || a.length == 0) return new int[0];
        for(int i = 0; i < a.length; i++){
            for(int j = i + 1; j < a.length; j++){
                if(a[i] + a[j] == target){
                    return new int[]{i,j};
                }

            }
        }
        return new int[0];
    }
}

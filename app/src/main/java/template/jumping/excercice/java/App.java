package template.jumping.excercice.java;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {

        int[] arrayObstacles = getOrderedIntegerArray(args[0]);

        Integer minimumJump = getMinimumJump(arrayObstacles);

        System.out.println("The minimum jump to avoid all obstacles is: " + minimumJump);
    }

    private static Integer getMinimumJump(int[] arrayObstacles) {
        int maxNumber = arrayObstacles[arrayObstacles.length-1];

        for (int i = 1; i <= maxNumber ; i++) {
            int j = i;
            for(;j<=maxNumber;j=j+i){
                if(isContainedInArray(j, arrayObstacles)){
                    break;
                }
            }
            if(j>maxNumber){
                return i;
            }
        }

        return maxNumber+1;
    }

    private static boolean isContainedInArray(int j, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if(j==array[i]){
                return true;
            }
        }
        return false;
    }


    private static int[] getOrderedIntegerArray(String data) {
        String [] splitData = data.split(",");
        int [] integers = new int[splitData.length];
        for (int i = 0; i < splitData.length; i++) {
            integers[i]=Integer.valueOf(splitData[i]);
        }
        Arrays.sort(integers);
        return integers;
    }


    public String getGreeting() {
        return "Hello World!";
    }
}

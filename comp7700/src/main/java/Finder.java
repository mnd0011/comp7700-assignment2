public class Finder {
    static int findMax(int[] intArray){
        int maxNum = intArray[0];
        for (int num : intArray) maxNum = Math.max(num, maxNum);

        return maxNum;
    }

    static int findMin(int[] intArray){
        int minNum = intArray[0];
        for (int num : intArray) minNum = Math.min(num, minNum);

        return minNum;
    }

    public static boolean validateArray(String[] args){
        if(args == null || args.length == 0){
            System.out.println("No arguments provided.");
        }
        return false;
    }

    public static int[] convertArgs(String[] args){
        int[] numArgs = new int[args.length];
        int index = 0;

        try {
            for (String arg : args) {
                numArgs[index] = Integer.parseInt(arg);
                ++index;
            }
        }
        catch (NumberFormatException nfe){
            System.out.println("Arguments must be integers.");
            System.exit(1);
        }
        return numArgs;
    }

    public static void main (String[] args){
        int theMax;
        int theMin;

        boolean isValidArray = validateArray(args);
        if(isValidArray) {
            int[] numArgs = convertArgs(args);
            theMax = findMax(numArgs);
             theMin = findMin(numArgs);
             System.out.println("The maximum number is " + theMax + ".");
             System.out.println("The minimum number is " + theMin + ".");
        }
        else System.out.println("Input array is null or empty.");
     }
}

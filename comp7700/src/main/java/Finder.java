public class Finder {
    static int findMax(int[] intArray){
        int maxNum = intArray[0];

        for (int num : intArray) {
            maxNum = Math.max(num, maxNum);
        }
        return maxNum;
    }

    static int findMin(int[] intArray){
        int minNum = intArray[0];

        for (int num : intArray) {
            minNum = Math.min(num, minNum);
        }
        return minNum;
    }

    public static void main (String[] args){
        int theMax;
        int theMin;
        int[] numArgs = new int[args.length];
        int index = 0;

        for(String arg : args){
            try {
                // Parse the string argument into an integer value.
                numArgs[index] = Integer.parseInt(arg);
                ++index;
            }
            catch (NumberFormatException nfe) {
                System.out.println("Arguments must be integers");
                System.exit(1);
            }
        }

        if(numArgs.length == 0){
            System.out.println("No arguments provided.");
        }

        if(numArgs.length > 0) {
            theMax = findMax(numArgs);
            theMin = findMin(numArgs);
            System.out.println("The maximum number is " + theMax + ".");
            System.out.println("The minimum number is " + theMin + ".");
        }
    }
}

public class StringsAndLoops {
    public static void main(String[] args) {
        int myLoopControlVariable = 0;

        while (myLoopControlVariable <= 12) {
            System.out.println("myLoopControlVariable is... " + myLoopControlVariable);
            myLoopControlVariable++;
        }

        String[] myStrArray = {"this", "that", "the other"};

        for (int i = 0; i <= 2; i++) {
            System.out.println("myStrArray[" + i + "] = " + myStrArray[i]);
        }
    }
}
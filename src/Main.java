import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //task-1
        int[] arrayInt = new int[] {1, 2, 3};
        double[] arrayDouble = {1.57, 7.654, 9.986};
        boolean[] arrayBoolean = {true, false, true, false, false};

        //task-2
        for(int i = 0; i < arrayInt.length; i++) {
            System.out.print(arrayInt[i]);
            if(i == arrayInt.length - 1) {
                System.out.println();
                break;
            }
            System.out.print(", ");
        }

        for(int i = 0; i < arrayDouble.length; i++) {
            System.out.print(arrayDouble[i]);
            if(i == arrayDouble.length - 1) {
                System.out.println();
                break;
            }
            System.out.print(", ");
        }

        for(int i = 0; i < arrayBoolean.length; i++) {
            System.out.print(arrayBoolean[i]);
            if(i == arrayBoolean.length - 1) {
                System.out.println("\n");
                break;
            }
            System.out.print(", ");
        }

        //task-3
        for(int i = arrayInt.length - 1; i >= 0; i--) {
            System.out.print(arrayInt[i]);
            if(i == 0) {
                System.out.println();
                break;
            }
            System.out.print(", ");
        }

        for(int i = arrayDouble.length - 1; i >= 0; i--) {
            System.out.print(arrayDouble[i]);
            if(i == 0) {
                System.out.println();
                break;
            }
            System.out.print(", ");
        }

        for(int i = arrayBoolean.length - 1; i >= 0; i--) {
            System.out.print(arrayBoolean[i]);
            if(i == 0) {
                System.out.println("\n");
                break;
            }
            System.out.print(", ");
        }

        //task-4
        for(int i = 0; i < arrayInt.length; i++){
            if(arrayInt[i] % 2 != 0) arrayInt[i] += 1;
            //System.out.print(arrayInt[i] + ", "); //ещё вариант - распечатать массив
        }
        System.out.println(Arrays.toString(arrayInt));
    }
}
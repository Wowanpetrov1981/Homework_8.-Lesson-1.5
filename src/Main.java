public class Main {
    public static void main(String[] args) {
        int[] weights = new int[12];
        weights[0] = 90;
        int januaryWeights = weights[0];
        System.out.println(januaryWeights);
        System.out.println(weights[0]);
        System.out.println(weights[4]);
        int january = 0;
        System.out.println(weights[january]);
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.println(weights[i]);

        }
        System.out.println();
        task1();
        task2();
        task3();
        task4();


    }

    public static void task1() {
        System.out.println("Домашнее задание к уроку 1.5. Задача 1.");
        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        System.out.println(weight[0]);
        System.out.println(weight[1]);
        System.out.println(weight[2]);
        System.out.println();
        double[] array = {1.57, 7.654, 9.986};
        for (int i = 0; i < 3; i++) {
            System.out.println(array[i]);
        }
        System.out.println();
        int[] playerNumbers = new int[]{1, 4, 8, 13, 14, 15, 16, 20, 21, 22, 27, 33, 68, 70, 71, 86, 90, 99};
        for (int i = 0; i < playerNumbers.length; i++) {
            System.out.println(playerNumbers[i]);

        }
        System.out.println();
    }

    public static void task2() {
        System.out.println("Домашнее задание к уроку 1.5. Задача 2");
        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        System.out.println(weight[0] + ", " + weight[1] + ", " + weight[2]);

        double[] array = {1.57, 7.654, 9.986};
        for (int i = 0; i < 3; i++) {
            if (i != 2) System.out.print(array[i] + ", ");
            else
                System.out.print(array[i]);

        }
        System.out.println();
        int[] playerNumbers = {1, 4, 8, 13, 14, 15, 16, 20, 21, 22, 27, 33, 68, 70, 71, 86, 90, 99};
        for (int i = 0; i < playerNumbers.length; i++) {
            if (i != 17) System.out.print(playerNumbers[i] + ", ");
            else
                System.out.print(playerNumbers[i]);

        }
        System.out.println();
        System.out.println();
    }

    public static void task3() {
        System.out.println("Домашнее задание к уроку 1.5. Задача 3");
        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        System.out.println(weight[2] + ", " + weight[1] + ", " + weight[0]);

        double[] array = {1.57, 7.654, 9.986};
        int i = 3;
        while (i >= 1) {
            i--;
            if (i != 0) System.out.print(array[i] + ", ");
            else
                System.out.print(array[i]);
        }
        System.out.println();
        int[] playerNumbers = {1, 4, 8, 13, 14, 15, 16, 20, 21, 22, 27, 33, 68, 70, 71, 86, 90, 99};
        for (int l = 17; l >= 0; l--) {
            if (l != 0) System.out.print(playerNumbers[l] + ", ");
            else
                System.out.print(playerNumbers[l]);
        }

        System.out.println();
    }

    public static void task4() {
        System.out.println();
        System.out.println("Домашнее заданиек уроку 1.5. Задача 4");
        int[] playerNumbers = {1, 4, 8, 13, 14, 15, 16, 20, 21, 22, 27, 33, 68, 70, 71, 86, 90, 99};
        for (int i = 0; i < playerNumbers.length; i++) {
            if (playerNumbers[i] % 2 != 0) {
                playerNumbers[i] = playerNumbers[i] + 1;
            }
            if (i != 17) System.out.print(playerNumbers[i] + ", ");
            else
                System.out.print(playerNumbers[i]);

        }

    }
}

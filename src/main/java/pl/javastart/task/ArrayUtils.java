package pl.javastart.task;

import java.util.Scanner;

class ArrayUtils {
    private static final Scanner INPUT = new Scanner(System.in);

    double[] createFloatArray() {
        System.out.println("Podaj rozmiar tablicy liczb zmiennoprzecinkowych:");
        int arraySize = 0;
        while (!(arraySize > 0)) {
            arraySize = INPUT.nextInt();
            if (arraySize < 0) {
                System.out.println("Podano ujemny rozmiar tablicy");
            } else if (arraySize == 0) {
                System.out.println("Podano zerowy rozmiar tablicy");
            }
        }

        double[] array = new double[arraySize];

        System.out.println("Wprowadź " + array.length + " liczb");
        for (int i = 0; i < array.length; i++) {
            array[i] = INPUT.nextDouble();
        }

        return array;
    }

    double getSumOfSquares(double[] array) {
        double sumOfSquares = 0;
        for (double number : array) {
            sumOfSquares += Math.pow(number, 2);
        }
        return sumOfSquares;
    }

    void close() {
        INPUT.close();
    }
}

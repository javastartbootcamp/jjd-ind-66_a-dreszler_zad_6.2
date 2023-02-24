package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        ArrayUtils arrayUtils = new ArrayUtils();

        double[] array = arrayUtils.createFloatArray();
        double sumOfSquares = arrayUtils.getSumOfSquares(array);
        arrayUtils.close();
        System.out.println("Suma kwadratów liczb wprowadzonych do tablicy wynosi: " + sumOfSquares);
    }
}
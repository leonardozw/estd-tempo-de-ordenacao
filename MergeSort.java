import java.util.Random;

public class MergeSort {

    Random rand = new Random();
    int[] randVector = new int[100000];
    int[] descVector = new int[100000];
    
    public int[] mergeSort(int[] vector){
        if (vector.length <= 1) {
            return null;
        }

        int meio = vector.length / 2;
        int[] esquerda = new int[meio];
        int[] direita = new int[vector.length - meio];

        for (int i = 0; i < meio; i++) {
            esquerda[i] = vector[i];
        }
        for (int i = meio; i < vector.length; i++) {
            direita[i - meio] = vector[i];
        }

        mergeSort(esquerda);
        mergeSort(direita);

        int[] sortedVector = merge(vector, esquerda, direita);
        return sortedVector;
    }

    public int[] merge(int[] vector, int[] esquerda, int[] direita) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < esquerda.length && j < direita.length) {
            if (esquerda[i] <= direita[j]) {
                vector[k] = esquerda[i];
                i++;
            } else {
                vector[k] = direita[j];
                j++;
            }
            k++;
        }
        while (i < esquerda.length) {
            vector[k] = esquerda[i];
            i++;
            k++;
        }
        while (j < direita.length) {
            vector[k] = direita[j];
            j++;
            k++;
        }
        return vector;
    }

    public int[] randomVec(){
        for(int i = 0; i < randVector.length; i++){
            randVector[i] = rand.nextInt(10);
        }
        return randVector;
    }

    public int[] descVec(){
        for(int i = 0; i < descVector.length; i++){
            descVector[i] = descVector.length - i;
        }
        return descVector;
    }

    public Result[] sortAndResult(int[] vector){
        Result[] results = new Result[10];
        for(int i = 0; i < 10; i++){
            long startTime = System.currentTimeMillis();
            mergeSort(vector);
            long endTime = System.currentTimeMillis();
            long elapsedTime = (endTime - startTime);
            results[i] = new Result(elapsedTime, "Test: " + (i+1));
        }
        return results;
    }

    public Result[] sortAndResultDesc(){
        Result[] results = new Result[10];
        for(int i = 0; i < 10; i++){
            int[] vector = descVec();
            long startTime = System.currentTimeMillis();
            mergeSort(vector);
            long endTime = System.currentTimeMillis();
            long elapsedTime = (endTime - startTime);
            results[i] = new Result(elapsedTime, "Test: " + (i+1));
        }
        return results;
    }

    public Result[] sortAndResultRandom(){
        Result[] results = new Result[10];
        for(int i = 0; i < 10; i++){
            int[] vector = randomVec();
            long startTime = System.currentTimeMillis();
            mergeSort(vector);
            long endTime = System.currentTimeMillis();
            long elapsedTime = (endTime - startTime);
            results[i] = new Result(elapsedTime, "Test: " + (i+1));
        }
        return results;
    }


}

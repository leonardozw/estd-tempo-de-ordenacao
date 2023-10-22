import java.util.Random;

public class SelectionSort {
    
    Random rand = new Random();
    int[] randVector = new int[100000];
    int[] descVector = new int[100000];

    public int[] selectionSort(int[] vector){
        int aux;
        for(int i = 0; i < vector.length; i++){
            int min = i;
            for(int j = i + 1; j < vector.length; j++){
                if(vector[j] < vector[min]){
                    min = j;
                }
            }
            aux = vector[i];
            vector[i] = vector[min];
            vector[min] = aux;
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
            selectionSort(vector);
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
            selectionSort(vector);
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
            selectionSort(vector);
            long endTime = System.currentTimeMillis();
            long elapsedTime = (endTime - startTime);
            results[i] = new Result(elapsedTime, "Test: " + (i+1));
        }
        return results;
    }
}

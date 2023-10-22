import java.util.Random;

public class InsertSort {

    Random rand = new Random();
    int[] randVector = new int[100000];
    int[] descVector = new int[100000];
    
    public void sort(int[] vector){
        for(int i = 1; i < vector.length; i++){
            int aux = vector[i];
            int j = i - 1;
            while(j >= 0 && vector[j] > aux){
                vector[j + 1] = vector[j];
                j--;
            }
            vector[j + 1] = aux;
        }
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
            sort(vector);
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
            sort(vector);
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
            sort(vector);
            long endTime = System.currentTimeMillis();
            long elapsedTime = (endTime - startTime);
            results[i] = new Result(elapsedTime, "Test: " + (i+1));
        }
        return results;
    }
}

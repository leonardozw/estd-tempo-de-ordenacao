import java.util.Random;

public class BubbleSort {

    Random rand = new Random();
    int[] randVector = new int[100000];
    int[] descVector = new int[100000];
    
    public int[] sort(int[] vector){
        int aux;
        for(int i = 0; i < vector.length; i++){
            for(int j = 0; j < vector.length - 1; j++){
                if(vector[j] > vector[j + 1]){
                    aux = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = aux;
                }
            }
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

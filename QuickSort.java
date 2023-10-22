import java.util.Random;
import java.util.Stack;

public class QuickSort {

    Random rand = new Random();
    int[] randVector = new int[100000];
    int[] descVector = new int[100000];
    
    public int[] quickSort(int[] vector){
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        stack.push(vector.length - 1);
        
        while (!stack.isEmpty()) {
            int right = stack.pop();
            int left = stack.pop();
            int pivotIndex = partition(vector, left, right);
            
            if (pivotIndex - 1 > left) {
                stack.push(left);
                stack.push(pivotIndex - 1);
            }
            if (pivotIndex + 1 < right) {
                stack.push(pivotIndex + 1);
                stack.push(right);
            }
        }
        return vector;
    }

    public int partition(int[] vector, int left, int right) {
        int pivot = vector[right];
        int i = (left - 1);
        
        for (int j = left; j < right; j++) {
            if (vector[j] <= pivot) {
                i++;
                int temp = vector[i];
                vector[i] = vector[j];
                vector[j] = temp;
            }
        }
        
        int temp = vector[i + 1];
        vector[i + 1] = vector[right];
        vector[right] = temp;

        return i + 1;
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
            quickSort(vector);
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
            quickSort(vector);
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
            quickSort(vector);
            long endTime = System.currentTimeMillis();
            long elapsedTime = (endTime - startTime);
            results[i] = new Result(elapsedTime, "Test: " + (i+1));
        }
        return results;
    }
}

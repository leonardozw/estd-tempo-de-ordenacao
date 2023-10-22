public class Program{
    public static void main(String[] args){
        int[] ascVector = new int[100000];

        BubbleSort bubbleSort = new BubbleSort();
        MergeSort mergeSort = new MergeSort();
        QuickSort quickSort = new QuickSort();
        InsertSort insertSort = new InsertSort();
        SelectionSort selectionSort = new SelectionSort();


        // Cria o vetor de 100000 posições com números em ordem crescente
        for(int i = 0; i < ascVector.length; i++){
            ascVector[i] = i;
        }

        //Substitua pelo algoritimo para teste
        /*
         * bubbleSort (demora bastante)
         * mergeSort (bem rapido)
         * quickSort (demora)
         * insertSort (rapido)
         * selectionSort (rapido)
         */
        long aux = 0;
        Result[] randResults = selectionSort.sortAndResultRandom();
        Result[] ascResults = selectionSort.sortAndResult(ascVector);
        Result[] descResults = selectionSort.sortAndResultDesc();
        
        System.out.println("Testes com vetor randomizado: ");
        for(Result r : randResults){
            System.out.println(r.getTag() + " - " + r.getTime() + "ms");
            aux += r.getTime();
        }
        System.out.println("Avg: " + aux/10 + "ms");
        aux = 0;
        System.out.println("-----------");
        System.out.println("Testes com vetor em ordem crescente: ");
        for(Result r : ascResults){
            System.out.println(r.getTag() + " - " + r.getTime() + "ms");
            aux += r.getTime();
        }
        System.out.println("Avg: " + aux/10 + "ms");
        aux = 0;
        System.out.println("-----------");
        System.out.println("Testes com vetor em ordem decrescente: ");
        for(Result r : descResults){
            System.out.println(r.getTag() + " - " + r.getTime() + "ms");
            aux += r.getTime();
        }
        System.out.println("Avg: " + aux/10 + "ms");
        aux = 0;
    
    }
}
# estd-tempo-de-ordenação

para realizar os testes substitua a seguinte parte em `Program.java`
```
Result[] randResults = algoritimo.sortAndResultRandom();
Result[] ascResults = algoritimo.sortAndResult(ascVector);
Result[] descResults = algoritimo.sortAndResultDesc();
```
susbtitua 'algoritimo' por um dos seguintes algoritimos:
- bubbleSort
- mergeSort
- quickSort
- insertSort
- selectionSort

ex:
```
Result[] randResults = bubbleSort.sortAndResultRandom();
```

## Relatório

...

UNIVERSIDADE DA REGIÃO DE JOINVILLE
BACHARELADO EM SISTEMAS DE INFORMAÇÃO













TEMPO DE ORDENAÇÃO DOS ALGORITMOS MergeSort, QuickSort, BubleSort, InsertSort e SelectionSort
GABRIEL BATISTA DA ROCHA
LEONARDO ZWIERZYKOWSKI







PROFESSOR LEANDERSON ANDRÉ
Estrutura de Dados II




Joinville – SC
2023
 
SUMÁRIO


RESUMO	3
1.	MATERIAIS E MÉTODOS	4
2.	MERGE SORT 	5
3.	QUICK SORT	6
4.	BUBLE SORT	7
5.	INSERT SORT	8
6.	SELECTION SORT	9 
7.	CONSIDERAÇÕES FINAIS	10










 
RESUMO

Algoritmos de ordenação diferem em eficiência, especialmente quando aplicados a diferentes tipos de entradas. Este experimento visa comparar o desempenho de cinco algoritmos populares de ordenação em três cenários distintos.

 
1.	MATERIAIS E MÉTODOS

Algoritmos de Ordenação: Foram testados os seguintes algoritmos: Mergesort, Quicksort, Bubblesort, Insertion Sort e Selection Sort.

Dados de Entrada: Foi utilizado um vetor de 100.000 números únicos em cada cenário.

Cenários:

Aleatório: O vetor foi preenchido com números únicos em ordem aleatória.

Decrescente: O vetor foi preenchido com números únicos em ordem decrescente.

Crescente: O vetor foi preenchido com números únicos em ordem crescente.

Execução dos Algoritmos: Cada algoritmo foi executado 10 vezes em cada cenário. O tempo de execução foi medido e, em seguida, calculada a média do tempo de execução para cada algoritmo em cada cenário.













2.	MERGE SORT

O algoritmo de ordenação Merge Sort é o que possui o melhor desempenho dentre os que foram experimentados, tendo uma média geral de 9ms, sendo o cenário mais rápido o DECRESCENTE, conforme os resultados a seguir:

Testes com vetor randomizado: 
Test: 1 - 21ms
Test: 2 - 23ms
Test: 3 - 7ms
Test: 4 - 8ms
Test: 5 - 17ms
Test: 6 - 6ms
Test: 7 - 8ms
Test: 8 - 6ms
Test: 9 - 11ms
Test: 10 - 15ms
Avg: 12ms
-----------
Testes com vetor em ordem crescente: 
Test: 1 - 12ms
Test: 2 - 13ms
Test: 3 - 12ms
Test: 4 - 11ms
Test: 5 - 11ms
Test: 6 - 11ms
Test: 7 - 11ms
Test: 8 - 11ms
Test: 9 - 12ms
Test: 10 - 12ms
Avg: 11ms
-----------
Testes com vetor em ordem decrescente: 
Test: 1 - 4ms
Test: 2 - 3ms
Test: 3 - 5ms
Test: 4 - 5ms
Test: 5 - 4ms
Test: 6 - 4ms
Test: 7 - 4ms
Test: 8 - 5ms
Test: 9 - 4ms
Test: 10 - 4ms
Avg: 4ms

3.	QUICK SORT
O algoritmo Quick Sort é o segundo menos eficaz dos que foram analisados pois a escolha do pivô é fundamental para o seu desempenho. No experimento atingiu uma velocidade média nos 3 cenários de 3439ms, sendo o cenário mais rápido o ALEATÓRIO, conforme os testes a seguir:

Testes com vetor randomizado: 
Test: 1 - 408ms
Test: 2 - 555ms
Test: 3 - 579ms
Test: 4 - 567ms
Test: 5 - 569ms
Test: 6 - 558ms
Test: 7 - 559ms
Test: 8 - 560ms
Test: 9 - 542ms
Test: 10 - 537ms
Avg: 543ms
-----------
Testes com vetor em ordem crescente: 
Test: 1 - 5431ms
Test: 2 - 5550ms
Test: 3 - 5409ms
Test: 4 - 5496ms
Test: 5 - 5747ms
Test: 6 - 5550ms
Test: 7 - 5409ms
Test: 8 - 5541ms
Test: 9 - 5367ms
Test: 10 - 5431ms
Avg: 5493ms
-----------
Testes com vetor em ordem decrescente: 
Test: 1 - 4440ms
Test: 2 - 4416ms
Test: 3 - 4219ms
Test: 4 - 4258ms
Test: 5 - 4189ms
Test: 6 - 4209ms
Test: 7 - 4263ms
Test: 8 - 4251ms
Test: 9 - 4242ms
Test: 10 - 4351ms
Avg: 4283ms

4.	BUBLE SORT

Sem dúvidas é o algoritmo de ordenação mais famoso, porém, sua fama não condiz com o seu desempenho para ordenação, atingindo velocidade média nos cenários de 8639ms por conta do seu método de comparação e troca muito repetitivo. O cenário mais rápido foi o de CRESCENTE, conforme testes a seguir:

Testes com vetor randomizado: 
Test: 1 - 13705ms
Test: 2 - 13611ms
Test: 3 - 13467ms
Test: 4 - 13435ms
Test: 5 - 13564ms
Test: 6 - 13616ms
Test: 7 - 13885ms
Test: 8 - 13485ms
Test: 9 - 13670ms
Test: 10 - 13915ms
Avg: 13635ms
-----------
Testes com vetor em ordem crescente: 
Test: 1 - 3787ms
Test: 2 - 3985ms
Test: 3 - 3763ms
Test: 4 - 3917ms
Test: 5 - 3783ms
Test: 6 - 3723ms
Test: 7 - 3617ms
Test: 8 - 3846ms
Test: 9 - 3739ms
Test: 10 - 3683ms
Avg: 3784ms
-----------
Testes com vetor em ordem decrescente: 
Test: 1 - 8430ms
Test: 2 - 8752ms
Test: 3 - 8522ms
Test: 4 - 8496ms
Test: 5 - 8486ms
Test: 6 - 8474ms
Test: 7 - 8444ms
Test: 8 - 8450ms
Test: 9 - 8480ms
Test: 10 - 8472ms
Avg: 8500ms






5.	INSERT SORT

É um algoritmo que mantém a ordem relativa de elementos com valores iguais. Bastante eficaz para pequenos conjuntos de dados ou quando a maior parte do conjunto já está ordenada, mas pode ser ineficiente para grandes conjuntos de dados, devido à sua complexidade quadrática.  Podemos verificar que no cenário CRESCENTE a velocidade média foi de 0ms por conta da já “ordenação” do vetor.

Testes com vetor randomizado: 
Test: 1 - 2240ms
Test: 2 - 2188ms
Test: 3 - 611ms
Test: 4 - 612ms
Test: 5 - 611ms
Test: 6 - 610ms
Test: 7 - 609ms
Test: 8 - 608ms
Test: 9 - 609ms
Test: 10 - 609ms
Avg: 930ms
-----------
Testes com vetor em ordem crescente: 
Test: 1 - 1ms
Test: 2 - 0ms
Test: 3 - 0ms
Test: 4 - 0ms
Test: 5 - 0ms
Test: 6 - 0ms
Test: 7 - 0ms
Test: 8 - 1ms
Test: 9 - 0ms
Test: 10 - 0ms
Avg: 0ms
-----------
Testes com vetor em ordem decrescente: 
Test: 1 - 1361ms
Test: 2 - 1360ms
Test: 3 - 1359ms
Test: 4 - 1359ms
Test: 5 - 1361ms
Test: 6 - 1422ms
Test: 7 - 1371ms
Test: 8 - 1344ms
Test: 9 - 1341ms
Test: 10 - 1343ms
Avg: 1362ms

6.	SELECTION SORT

É um algoritmo famoso e eficaz para conjuntos pequenos, mas ineficiente em grandes conjuntos devido à sua complexidade quadrática pois ele divide o vetor em duas partes, sendo uma ordenada e outra não, encontrando o valor mínimo de uma parte e leva para a outra até que tudo esteja ordenado. O cenário mais rápido foi o CRESCENTE e obteve uma velocidade média nos três cenários de 1985ms.

Testes com vetor randomizado: 
Test: 1 - 1906ms
Test: 2 - 1882ms
Test: 3 - 1908ms
Test: 4 - 1869ms
Test: 5 - 1888ms
Test: 6 - 1845ms
Test: 7 - 1825ms
Test: 8 - 1834ms
Test: 9 - 1846ms
Test: 10 - 1836ms
Avg: 1863ms
-----------
Testes com vetor em ordem crescente: 
Test: 1 - 1702ms
Test: 2 - 1677ms
Test: 3 - 1678ms
Test: 4 - 1680ms
Test: 5 - 1684ms
Test: 6 - 1691ms
Test: 7 - 1687ms
Test: 8 - 1675ms
Test: 9 - 1679ms
Test: 10 - 1672ms
Avg: 1682ms
-----------
Testes com vetor em ordem decrescente: 
Test: 1 - 2709ms
Test: 2 - 2380ms
Test: 3 - 2399ms
Test: 4 - 2387ms
Test: 5 - 2369ms
Test: 6 - 2371ms
Test: 7 - 2370ms
Test: 8 - 2370ms
Test: 9 - 2366ms
Test: 10 - 2383ms
Avg: 2410ms 
CONSIDERAÇÕES FINAIS

Ao final desse experimento, podemos perceber quais os algoritmos mais eficazes nos cenários apresentados e os menos eficazes, obtendo os seguintes resultados:

MAIS RÁPIDO GERAL: Merge Sort
MAIS LENTO GERAL: Buble Sort
CENÁRIO MAIS RÁPIDO GERAL: Crescente



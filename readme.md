# estd-tempo-de-ordenação

## !!! Importante, para evitar a espera muito longa ao rodar todos os algoritimos de uma vez deve-se utilizar o programa da forma descrita abaixo !!!

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

ex com bubbleSort:
```
Result[] randResults = bubbleSort.sortAndResultRandom();
Result[] ascResults = bubbleSort.sortAndResult(ascVector);
Result[] descResults = bubbleSort.sortAndResultDesc();
```

Em seguida execute o programa.

## Relatório 

Algoritmos de ordenação diferem em eficiência, especialmente quando aplicados a diferentes tipos de entradas. Este experimento visa comparar o desempenho de cinco algoritmos populares de ordenação em três cenários distintos.

### Sumário:

-	[MATERIAL](#Material)	
-	[MERGE SORT](#MERGE-SORT) 	
- [QUICK SORT](#QUICK-SORT)	
- [BUBBLE SORT](#BUBBLE-SORT)	
- [INSERT SORT](#INSERT-SORT)	
- [SELECTION SORT](#SELECTION-SORT)
- [CONSIDERAÇÕES FINAIS](#CONSIDERAÇÕES-FINAIS)	

# Material

**Foram testados os seguintes algoritmos:**
- Mergesort
- Quicksort
- Bubblesort
- Insertion Sort
- Selection Sort

**Dados de Entrada:** 
- Foi utilizado um vetor de 100.000 números em cada cenário.

**Cenários:**

- Aleatório: O vetor foi preenchido com números em ordem aleatória.

- Decrescente: O vetor foi preenchido com números em ordem decrescente.

- Crescente: O vetor foi preenchido com números em ordem crescente.

**Execução dos Algoritmos:** 
- Cada algoritmo foi executado 10 vezes em cada cenário. O tempo de execução foi medido e, em seguida, calculada a média do tempo de execução para cada algoritmo em cada cenário.

#	MERGE-SORT

O algoritmo de ordenação Merge Sort é o que possui o melhor desempenho dentre os que foram experimentados, tendo uma média geral de 9ms, sendo o cenário mais rápido o DECRESCENTE, conforme os resultados a seguir:

**Vetor randomizado**:

| Nº Teste  | Tempo/ms  |
|---|---|
| 1  | 21ms  |
| 2  | 23ms  |
| 3  | 7ms  |
| 4  | 8ms  |
| 5  | 17ms  |
| 6  | 6ms  |
| 7  | 8ms  |
| 8  | 6ms  |
| 9  | 11ms  |
| 10  | 15ms  |

| Média  |
|---|
| 12ms |

**Vetor crescente**:

| Nº Teste  | Tempo/ms  |
|---|---|
| 1  | 12ms  |
| 2  | 13ms  |
| 3  | 12ms  |
| 4  | 11ms  |
| 5  | 11ms  |
| 6  | 11ms  |
| 7  | 11ms  |
| 8  | 11ms  |
| 9  | 12ms  |
| 10  | 12ms  |

| Média  |
|---|
| 11ms |

**Vetor decrescente**: 

| Nº Teste  | Tempo/ms  |
|---|---|
| 1  | 4ms  |
| 2  | 3ms  |
| 3  | 5ms  |
| 4  | 5ms  |
| 5  | 4ms  |
| 6  | 4ms  |
| 7  | 4ms  |
| 8  | 5ms  |
| 9  | 4ms  |
| 10  | 4ms  |

| Média  |
|---|
| 4ms |

#	QUICK-SORT
O algoritmo Quick Sort é o segundo menos eficaz dos que foram analisados pois a escolha do pivô é fundamental para o seu desempenho. No experimento atingiu uma velocidade média nos 3 cenários de 3439ms, sendo o cenário mais rápido o ALEATÓRIO, conforme os testes a seguir:

**Vetor randomizado**:

| Nº Teste  | Tempo/ms  |
|---|---|
| 1  | 408ms  |
| 2  | 555ms  |
| 3  | 579ms  |
| 4  | 567ms  |
| 5  | 569ms  |
| 6  | 558ms  |
| 7  | 559ms  |
| 8  | 560ms  |
| 9  | 542ms  |
| 10  | 537ms  |

| Média  |
|---|
| 543ms |

**Vetor crescente**:

| Nº Teste  | Tempo/ms  |
|---|---|
| 1  | 5431ms  |
| 2  | 5550ms  |
| 3  | 5409ms  |
| 4  | 5496ms  |
| 5  | 5747ms  |
| 6  | 5550ms  |
| 7  | 5409ms  |
| 8  | 5541ms  |
| 9  | 5367ms  |
| 10  | 5431ms  |

| Média  |
|---|
| 5493ms |

**Vetor decrescente**:

| Nº Teste  | Tempo/ms  |
|---|---|
| 1  | 4440ms  |
| 2  | 4416ms  |
| 3  | 4219ms  |
| 4  | 4258ms  |
| 5  | 4189ms  |
| 6  | 4209ms  |
| 7  | 4263ms  |
| 8  | 4251ms  |
| 9  | 4242ms  |
| 10  | 4351ms  |

| Média  |
|---|
| 4283ms |

#	BUBBLE-SORT

Sem dúvidas é o algoritmo de ordenação mais famoso, porém, sua fama não condiz com o seu desempenho para ordenação, atingindo velocidade média nos cenários de 8639ms por conta do seu método de comparação e troca muito repetitivo. O cenário mais rápido foi o de CRESCENTE, conforme testes a seguir:

**Vetor randomizado**:

| Nº Teste  | Tempo/ms  |
|---|---|
| 1  | 13705ms  |
| 2  | 13611ms  |
| 3  | 13467ms  |
| 4  | 13435ms  |
| 5  | 13564ms  |
| 6  | 13616ms  |
| 7  | 13885ms  |
| 8  | 13485ms  |
| 9  | 13670ms  |
| 10  | 13915ms  |

| Média  |
|---|
| 13635ms |

**Vetor crescente**:

| Nº Teste  | Tempo/ms  |
|---|---|
| 1  | 3787ms  |
| 2  | 3985ms  |
| 3  | 3763ms  |
| 4  | 3917ms  |
| 5  | 3783ms  |
| 6  | 3723ms  |
| 7  | 3617ms  |
| 8  | 3846ms  |
| 9  | 3739ms  |
| 10  | 3683ms  |

| Média  |
|---|
| 3784ms |

**Vetor decrescente**:

| Nº Teste  | Tempo/ms  |
|---|---|
| 1  | 8430ms  |
| 2  | 8752ms  |
| 3  | 8522ms  |
| 4  | 8496ms  |
| 5  | 8486ms  |
| 6  | 8474ms  |
| 7  | 8444ms  |
| 8  | 8450ms  |
| 9  | 8480ms  |
| 10  | 8472ms  |

| Média  |
|---|
| 8500ms |

#	INSERT-SORT

É um algoritmo que mantém a ordem relativa de elementos com valores iguais. Bastante eficaz para pequenos conjuntos de dados ou quando a maior parte do conjunto já está ordenada, mas pode ser ineficiente para grandes conjuntos de dados, devido à sua complexidade quadrática.  Podemos verificar que no cenário CRESCENTE a velocidade média foi de 0ms por conta da já “ordenação” do vetor.

**Vetor randomizado**:

| Nº Teste  | Tempo/ms  |
|---|---|
| 1  | 2240ms  |
| 2  | 2188ms  |
| 3  | 611ms  |
| 4  | 612ms  |
| 5  | 611ms  |
| 6  | 610ms  |
| 7  | 609ms  |
| 8  | 608ms  |
| 9  | 609ms  |
| 10  | 609ms  |

| Média  |
|---|
| 930ms |

**Vetor crescente**:

| Nº Teste  | Tempo/ms  |
|---|---|
| 1  | 1ms  |
| 2  | 0ms  |
| 3  | 0ms  |
| 4  | 0ms  |
| 5  | 0ms  |
| 6  | 0ms  |
| 7  | 0ms  |
| 8  | 1ms  |
| 9  | 0ms  |
| 10  | 0ms  |

| Média  |
|---|
| 0ms |

-----------
**Vetor decrescente**: 

| Nº Teste  | Tempo/ms  |
|---|---|
| 1  | 1361ms  |
| 2  | 1360ms  |
| 3  | 1359ms  |
| 4  | 1359ms  |
| 5  | 1361ms  |
| 6  | 1422ms  |
| 7  | 1371ms  |
| 8  | 1344ms  |
| 9  | 1341ms  |
| 10  | 1343ms  |

| Média  |
|---|
| 1362ms |

#	SELECTION-SORT

É um algoritmo famoso e eficaz para conjuntos pequenos, mas ineficiente em grandes conjuntos devido à sua complexidade quadrática pois ele divide o vetor em duas partes, sendo uma ordenada e outra não, encontrando o valor mínimo de uma parte e leva para a outra até que tudo esteja ordenado. O cenário mais rápido foi o CRESCENTE e obteve uma velocidade média nos três cenários de 1985ms.

**Vetor randomizado**: 

| Nº Teste  | Tempo/ms  |
|---|---|
| 1  | 1906ms  |
| 2  | 1882ms  |
| 3  | 1908ms  |
| 4  | 1869ms  |
| 5  | 1888ms  |
| 6  | 1845ms  |
| 7  | 1825ms  |
| 8  | 1834ms  |
| 9  | 1846ms  |
| 10  | 1836ms  |

| Média  |
|---|
| 1863ms |

**Vetor crescente**:

| Nº Teste  | Tempo/ms  |
|---|---|
| 1  | 1702ms  |
| 2  | 1677ms  |
| 3  | 1678ms  |
| 4  | 1680ms  |
| 5  | 1684ms  |
| 6  | 1691ms  |
| 7  | 1687ms  |
| 8  | 1675ms  |
| 9  | 1679ms  |
| 10  | 1672ms  |

| Média  |
|---|
| 1682ms |

**Vetor decrescente**:

| Nº Teste  | Tempo/ms  |
|---|---|
| 1  | 2709ms  |
| 2  | 2380ms  |
| 3  | 2399ms  |
| 4  | 2387ms  |
| 5  | 2369ms  |
| 6  | 2371ms  |
| 7  | 2370ms  |
| 8  | 2370ms  |
| 9  | 2366ms  |
| 10  | 2383ms  |

| Média  |
|---|
| 2410ms |

# CONSIDERAÇÕES-FINAIS

| Algoritimo  | RANDOM/avg(ms)  | ASC/avg(ms)  | DESC/avg(ms) |
|---|---|---|---|
| bubbleSort  | 13635ms  | 3784ms  | 8500ms  |
| mergeSort  | 12ms  | 11ms  | 4ms  |
| quickSort  | 543ms  | 5493ms  | 4283ms  |
| insertSort  | 930ms  | 0ms  | 1362ms  |
| selectionSort  | 1863ms  | 1682ms  | 2410ms  |

Ao final desse experimento, podemos perceber quais os algoritmos mais eficazes nos cenários apresentados e os menos eficazes, obtendo os seguintes resultados:

MAIS RÁPIDO GERAL:
- **Merge Sort**

MAIS LENTO GERAL:
- **Bubble Sort**

CENÁRIO MAIS RÁPIDO GERAL:
- **Vetor Crescente**



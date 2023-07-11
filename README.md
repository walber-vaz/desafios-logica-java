# Desafios de logica de programação em Java

## Desafio 1 - Pares e Ímpares

Considerando a entrada de valores inteiros não negativos, ordene estes valores segundo
o seguinte critério:

- Primeiro os Pares
- Depois os Ímpares

Sendo que deverão ser apresentados os pares em ordem crescente e depois os ímpares
em ordem decrescente.

## Entrada

A primeira linha de entrada contém um único inteiro positivo N (1 < N <= 105) Este é o
número de linhas de entrada que vem logo a seguir. As próximas N linhas conterão, cada
uma delas, um valor inteiro não negativo.

## Saída

Apresente todos os valores lidos na entrada segundo a ordem apresentada acima. Cada
número deve ser impresso em uma linha, conforme exemplo abaixo.

---

| Exemplo de Entrada | Exemplo de Saída |
| ------------------ | ---------------- |
| 10<br>4<br>32<br>34<br>543<br>3456<br>654<br>567<br>87<br>6789<br>98 | 4<br>32<br>34<br>98<br>654<br>3456<br>6789<br>567<br>543<br>87 |

---

## Desafio 2 - Valor em Notas e Moedas

Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor
monetário. A seguir, calcule o menor número de notas e moedas possíveis no qual o valor
pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas
possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a relação de notas
necessárias.

## Entrada

O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).

## Saída

Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial,
conforme exemplo fornecido.

Obs: Utilize ponto (.) para separar a parte decimal.

---

| Exemplo de Entrada | Exemplo de Saída |
| ------------------ | ---------------- |
| 576.73 | NOTAS:<br>5 nota(s) de R$ 100.00<br>1 nota(s) de R$ 50.00<br>1 nota(s) de R$ 20.00<br>0 nota(s) de R$ 10.00<br>1 nota(s) de R$ 5.00<br>0 nota(s) de R$ 2.00<br>MOEDAS:<br>1 moeda(s) de R$ 1.00<br>1 moeda(s) de R$ 0.50<br>0 moeda(s) de R$ 0.25<br>2 moeda(s) de R$ 0.10<br>0 moeda(s) de R$ 0.05<br>3 moeda(s) de R$ 0.01 |

---

# Desafio 3 - Numero de pares entres os elementos de um vetor

Dado um array de inteiros e um valor alvo, determine o número de pares entre os elementos
do array em que a sua diferença seja igual ao valor alvo.

## Exemplo

k = 1

arr = [1, 2, 3, 4]

Existem 3 valores cuja é igual ao valor alvo l: 2 - 1 = 1, 3 - 2 = 1 e 4 - 3 = 1.

## Descrição do Problema

Os pares têm o seguinte parâmetros:

int k: Um inteiro, a diferença alvo

int arr[n]: Um array de inteiros

## Retorno da função

int: o número de pares de inteiros cuja diferença é k

## Formato de entrada

A primeira linha contém dois inteiros n e k, o tamanho do array e o valor alvo.

A segunda linha contém n inteiros separados por espaço, os elementos do array.

## Exemplo de entrada

```
5 2
1 5 3 4 2
```

## Formato de saída

Um inteiro que representa o número de pares de inteiros cuja diferença é k.

## Exemplo de saída

```
3
```

## Desafio 4 - Decifrando erro da impressora

A sua impressora foi infectada por um vírus e está imprimindo de forma incorreta. Depois
de olhar para várias páginas impressas por um tempo, você percebe que ele está
imprimindo cada linha de dentro para fora. Em outras palavras, a metade esquerda de cada
linha está sendo impressa a partir do meio da página até a margem esquerda. Do mesmo
modo, a metade direita de cada linha está sendo impressa à partir da margem direita e
prosseguindo em direção ao centro da página.

Por exemplo a linha:

```
THIS LINE IS GIBBERISH
```

está sendo impressa como:

```
I ENIL SIHTHSIREBBIG S
```

Da mesma foma, a linha " MANGOS " está sendo impressa incorretamente como "NAM
OSG".

Sua tarefa é desembaralhar (decifrar) a string a partir da forma como ela foi impressa para a sua forma original. Você pode assumir que cada linha conterá um número par de caracteres.

## Entrada

A entrada contém vários casos de teste. A primeira linha de entrada contém um inteiro N

que indica a quantidade de casos de teste. Seguem N linhas, cada uma com uma frase com

no mínimo 2 e no máximo 100 caracteres de letras maiúsculas e espaços que deverá ser

desembaralhada (decifrada) à partir da forma impressa para a forma original, conforme

exemplo abaixo.

## Saída

Para cada linha de entrada deverá ser impressa uma linha de saída com a frase decifrada,

conforme exemplo abaixo.

---

| Exemplo de Entrada | Exemplo de Saída |
| ------------------ | ---------------- |
| 3<br>I ENIL SIHTHSIREBBIG S<br>LEVELKAYAK<br>H YPPAHSYADILO | THIS LINE IS GIBBERISH<br>KAYAK LEVEL<br>HAPPY HOLIDAYS |

---

## Autor

- [Walber vaz](https://www.linkedin.com/in/walber-vaz/)

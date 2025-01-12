## Pilha: 
- **push** : A complexidade de tempo e espaço do método push é O(1), assumindo que o array dados já está alocado e não necessita redimensionamento.
- **pop** : A complexidade de tempo e espaço do método pop é O(1), pois todas as operações realizadas (decremento, acesso e modificação do array) são constantes.

## Fila:
- **enqueue** : A complexidade de tempo e espaço do método enqueue é O(1), considerando que o array dados já está alocado e não precisa ser redimensionado.
- **dequeue** : A complexidade de tempo do método dequeue é O(n), devido à cópia de n−1 elementos do array, e a complexidade de espaço é O(n), pois um novo array de tamanho nn é alocado.
- **rear** : A complexidade de tempo e espaço do método rear é O(1), pois ele apenas acessa um elemento do array sem alocar memória adicional.
- **front** : A complexidade de tempo e espaço do método front é O(1), pois ele apenas acessa o primeiro elemento do array sem alocar memória adicional.

## Lista:
- **push** : A complexidade de tempo do método push é O(1), pois as operações realizadas (atribuições e chamadas de método) são constantes, e a complexidade de espaço também é O(1), assumindo que o array dados já está alocado.
- **pop** : A complexidade de tempo do método pop é O(1), pois todas as operações realizadas (atribuições e chamadas de método) são constantes, e a complexidade de espaço também é O(1), já que não há alocação adicional de memória significativa.
- **insert** : A complexidade de tempo do método insert é O(n), devido à cópia dos elementos para o novo array, e a complexidade de espaço é O(n), pois um novo array é alocado com tamanho n+1.
- **elementAt** : A complexidade de tempo e espaço do método elementAt é O(1), pois ele apenas acessa um elemento específico do array sem alocar memória adicional.
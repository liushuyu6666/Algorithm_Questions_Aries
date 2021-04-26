# Prime

## Sieve of Eratosthenes 厄拉多塞筛法

### derivation

how to judge if `m` is a prime?

```java
int i = 2;
for(int i = 2; i < m; i++){
    if(m % i == 0) return false;
}
else return true;
```

This can be simplified, if `m % 2 != 0`, we just need to check `i < m/2`, since if `i > m/2`, `m` must can't be divided exactly by `i`. Similarly, if `m % 3 != 0`, we just need to check `i < m /3`. if `m % 4 != 0`, we just need to check `i < m / 4`..., which means

```java
int i = 2;
for(int i = 2; i * i < m; i++){
    if(m % i == 0) return false;
}
else return true;
```

### Eratosthenes

We need an extra memory to implement this algorithm: `boolean prime[m]`

```java
boolean[] prime = new boolean[m + 1];
Arrays.fill(prime, true);
prime[0] = false;
prime[1] = false;
if(m == 1) return false;
for(int i = 2; i * i <= m; i++){
    if(prime[i]){
        for(int j = i * i; j <= m; j = j + i){
            prime[j] = false;
        }
    }
}
```

- predefine `pirme[0] = prime[1] = false`.
- if `prime[i] == true`, we set `prime[i*i]`, `prime[i*(i+1)]`, `prime[i*(i+2)]`... to true.
  - why from `prime[i*i]`? for example, if `i = 3`, we need set from `prime[3 * 3]` since `prime[2*3]` has been set when `i=2`.
- this algorithm is used to count the prime number before a certain value.
# Map



# Algorithm

## Unique Prime Multiplication

### Intro

<img src="img/unique_prime_factorization.png" style="zoom:50%;" />

The **Fundamental Theorem of Arithmetic** states that every natural number greater than 1 can be written as a product of prime numbers.

In computing algorithm, it can be utilized to acquire the eigenvalue of a "string" regardless of the position of each "character". So, "abc" and "bca" could get the same eigenvalue via Unique Prime Multiplication.

### caveat

- the range of this eigenvalue might be larger than the max bound of the integer.

### example

| website  | No.                |
| -------- | ------------------ |
| LeetCode | 49. Group Anagrams |
|          |                    |
|          |                    |

## Update the Range Along the Array

### Intro

Image you have a Character String and you need to find the longest substring within in without any redundant character.

<img src="img/dynamic_programming.png" style="zoom:50%;" />

- The blue arrow will traverse the entire `String` character by character.
- The red arrow will check the table and find the position of the nearest repeating character of the blue arrow points to.
- In this way the blue arrow always points to the end of the satisfied substring and the red arrow resides at the beginning.
- The table will be updated, recording the position of the latest character.
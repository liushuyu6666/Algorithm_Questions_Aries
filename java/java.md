#### java data structure used
1.  HashSet: Contain_Duplicate.java

2.  StringBuilder: Count_and_say.java
     - toString()

#### algorithm improvements
1. First_unique_character_in_string:
   - don't find the min of the hashmap, try to scan the String again.
   - don't use the hashmap since the string only contains lowercase english letters.

2. Delete_node_in_a_linked_list:
    - move val and node.next = node.next.next

3. String_to_integer:
    - the only possible position that the symbol will appear is the first non-zero character, if not, any '+' or '-' after that position will be regard as normal character. So, we need to test the symbol at that place, don't combine the test of symbol and digit together, which will complicate the testing.

4. Convert_sorted_array_to_binary_tree:
    - find the middle value, double pointers or left + (end - left + 1) / 2


#### bit manipulation
1. n & (n - 1): Number_of_1_bits.java
    - flip the least-significant 1-bit of the number to 0

`       n: ... 1 1 0 1 0 0`  
`   n-1:  ... 1 1 0 0 1 1`

2. bit integer is not 32-bits representation in java: Reverse_bits.java


#### auxiliary function
1. String:
    - Character.isDigit(c)
    - Character.isLetter(c)

2. Integer:
    - Integer.MAX_VALUE
    - Integer.MIN_VALUE


#### take care:
1. First_unique_character_in_string:
    - check if index == -1 before using charAt(index).
    - check if input String s.length() < 1 to avoid s = "".
    - when use letter[26] to represent the frequency of letter appears in the String, the index of letter should be c-'a'.

2. Reverse Integer:
    - the max and min range of integer respectively.
    - check before update reserve and remain.


3. Valid Palindrome:
   - when facing the String, please check if index beyond the range of the string.

4. Remove Nth Node From End:
    - when ListNode curr points to the node, we can't end the list by assignning curr = null. The correct is to make prev.next = null. 

5. TreeNode.java:
    - return an anonymous array: return new int[] {1, 2, 3};
    - if(i < nums.length && nums[i] != null) then in the else if, we still need to check if i < nums.length:
    if(i < nums.length && nums[i] != null){
          statement1;
    }
    else if(i < nums.length && nums[i] == null){
          statement2;
    }

6. When handle with TreeNode, sometimes need to add null to the Queue even if the root.left or root.right are null.

#### have no thread
1. Best_time_to_buy_and_sell_stock.java:
    - dynamic programming

#### summary
1. For String
    - letter[26] or character[256] need to use when concerning about frequency.

2. For ListNode:
    - remove one node, Delete_node_in_a_linked_list.java

3. Tree
    - the null child nodes sometime need to be placeholder, so don't forget to put them in the Queue. For example, Maximum_depth_of_binary_tree.java and Validate_binary_search_tree

4. Math relavant, power
    - base conversion, use Integer.toString(num, base);

5. Regex
    - string.matches("")


## category by question
1. Sum3.java
### structure
1. Set<List<Integer>> set = new HashSet<>(): try to avid adundant values
2. Arrays.sort()
3. Arrays.asList(a, b, c): don't need to use add
4. convert set to array: new ArrayList<>(set)



# Data Structure

## `ArrayList`

- can be printed directly, even if it is a nested `List`

  ```java
  System.out.println(l);
  ```

  

## `HashMap`

- Create a dictionary

  ```java
  HashMap<Character, Integer> prime = new HashMap<>();
  prime.put('a', 2);
  prime.put('b', 3);
  prime.put('c', 5);
  ```

  

- create a elastic `List` or dynamic `List` if you want `[["hello"], ["good morning", "good afternoon", "good evening", "good night"]]`

  ```java
  HashMap<Character, List<String>> dict = new HashMap<>();
  List<String> l = new ArrayList()<>;
  l.add("good morning");
  l.add("good afternoon");
  dict.put('g', l);
  return new ArrayList<>(dict.values());
  ```

  

## `String[]`

- declare

  ```java
  String[] strs = {"eat", "dog", "dot"};
  ```

  
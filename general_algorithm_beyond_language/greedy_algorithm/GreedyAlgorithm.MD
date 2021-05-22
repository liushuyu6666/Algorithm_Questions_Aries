# Start



# Questions

## (leetcode) 621. Task Scheduler

### description

Given a characters array tasks, representing the tasks a CPU needs to do, where each letter represents a different task. Tasks could be done in any order. Each task is done in one unit of time. For each unit of time, the CPU could complete either one task or just be idle.

However, there is a non-negative integer n that represents the cooldown period between two same tasks (the same letter in the array), that is that there must be at least n units of time between any two same tasks.

Return the least number of units of times that the CPU will take to finish all the given tasks.

### solution

- 如果n = 0, 返回length;
- 一般情况下：假设数组 ["A","A","A","B","B","C"]，n = 2，A的频率最高，记为count = 3，所以两个A之间必须间隔2个任务，才能满足题意并且是最短时间（一般情况下两个A的间隔大于2的总时间必然不是最短），因此执行顺序为： A->X->X->A->X->X->A，这里的X表示除了A以外其他字母，或者是待命，不用关心具体是什么，反正用来填充两个A的间隔的。上面执行顺序的规律是： 有count - 1个A，其中每个A需要搭配n个X，再加上最后一个A，所以总时间为 (count - 1) * (n + 1) + 1
- 要注意可能会出现多个频率相同且都是最高的任务，比如 ["A","A","A","B","B","B","C","C"]，所以最后会剩下一个A和一个B，因此最后要加上频率最高的不同任务的个数 maxCount
- 特殊情况下：公式算出的值可能会比数组的长度小，如["A","A","A","B","B","C","C","D","D"]，n = 2; 仔细考虑会发现这种情况下我们得到: A->B->C->D->A->B->C->D->A，每个A之间间隔大于n，按照之前的算法得出的结论小于数组长度，但是仔细观察会发现我没没必要引入idle time，因此此时取数组的长度即可。

from [horanol](https://leetcode-cn.com/problems/task-scheduler/comments/)
## Value

* Basic implementation: 10 points
* Basic unit tests: 5 points
* Extra credit implementation: 10 points
* Extra credit unit tests: 5 points

## Basic task

In this task, you will implement a method to generate values from the _Padovan sequence_.

The Padovan sequence resembles the Fibonacci sequence, in that each term is the sum of 2 terms appearing earlier in the sequence. However, while the Fibonacci sequence uses the sum of 2 adjacent terms to generate the term immediately following, the Padovan sequence uses the sum of 2 adjacent terms to generate the term that immediately follows the term immediately following the 2 that we add together.

In other words,

$$\begin{aligned}
P &= p_0, p_1, p_2, \ldots
\end{aligned}$$

where

$$\begin{aligned}
p_0 &= 0, \\
p_1 &= 1, \\ 
p_2 &= 1, \\ 
p_n &= p_{n - 3} + p_{n - 2}, \text{for }n > 2.
\end{aligned}$$

This recurrence relationship produces the sequence

$$\begin{aligned}
P &= 0, 1, 1, 1, 2, 2, 3, 4, 5, 7, \ldots
\end{aligned}$$

### Implementation

The `edu.cnm.deepdive.Padovan` class includes the following method (currently with a skeletal implementation):

```java
public static long generate(int n)
```

For more declaration details, see the [Javadoc](docs/api/) documentation for the [`Padovan.generate` method](docs/api/edu/cnm/deepdive/Padovan.html#generate(int)).

### Unit tests

For unit testing credit, create a JUnit5 test class, and use the appropriate assertions in one or more test methods to test the following inputs vs. expected outputs: 


| `n` | `Padovan.generate(n)` |
|:---:|:---------------------:|
| 0 | 0 |
| 1 | 1 |
| 5 | 2 |
| 10 | 9 |
| 20 | 151 | 

In evaluating your implementation, we reserve the right to include additional test cases; code that satisfies the requirements stated above should pass all such additional tests.

### Hints

* You may find it useful to create one or more additional methods as “helpers”; the problem can be solved without doing so, however.

* Don't hesitate to declare any constants (`static final` fields) that you feel might simplify or clarify your code.

* The method to be completed includes `TODO` comments to that effect.

* **Important**: Please note the comments in the class regarding the sections relevant to the basic problem, and those relevant to the extra credit problem!

* **Important**: In the basic problem, there is no need to create instances of the `Padovan` class! The `generate` method is `static`, and can be invoked using the class itself, rather than an instance of the class.

## Extra credit

### Implementation

Complete the implementation of the `Padovan` constructor and the nested `PadovanIterator` class, to fully implement the `Iterable<Long>` interface. Note that the `PadovanIterator` class includes a constructor and 2 methods; _all_ of these must be modified for a completed implementation.

For more declaration details, see the [Javadoc](docs/api/) documentation for the [constructor](docs/api/edu/cnm/deepdive/Padovan.html#<init>(int)), the [`PadovanIterator` class](docs/api/edu/cnm/deepdive/Padovan.html#PadovanIterator), and the [`Iterable` interface](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html) and [`Iterator` interface](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Iterator.html) in the Java standard library.

### Unit tests 

For unit testing extra credit, create a new JUnit5 test class, and use the appropriate assertions in one or more test methods, to test the following lengths (as supplied to the constructor) vs. the expected sequences produced by instances of `Padovan`. 


| `length` | Sequence generated |
|:--------------:|:-------------:|
| `0` | `[]` |
| `1` | `[0]` |
| `5` | `[0, 1, 1, 1, 2]` |
| `10` | `[0, 1, 1, 1, 2, 2, 3, 4, 5, 7]` |
| `20` | `]0, 1, 1, 1, 2, 2, 3, 4, 5, 7, 9, 12, 16, 21, 28, 37, 49, 65, 86, 114]` |

**Important**: An `Iterable` doesn't simply produce an array; instead, what is shown for each expected sequence (above) is the  string representation of the list that would be produced if we were to gather the terms of the corresponding `Iterable` (e.g. using an _enhanced for_ loop) into a list, and then invoke the `toString()` method on the list.

In evaluating your implementation, we reserve the right to include additional test cases; code that satisfies the requirements stated above should pass all such additional tests.

### Hints

* You will almost certainly need to define instance fields in the `PadovanIterator` class.

* You may find it useful to create one or more additional methods as "helpers"; however, the problem can be solved without any such methods.

* Don't hesitate to declare any constants (`static final` fields) that you feel might simplify or clarify your code.

* The methods to be completed include `TODO` comments to that effect.    


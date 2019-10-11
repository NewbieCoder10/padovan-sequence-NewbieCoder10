## Value

* Implementation: 10 points
* Unit tests: 5 points
* Extra credit: None

## Task

In this task, you will implement a method to generate values from the _Padovan sequence_.

The Padovan sequence resembles the Fibonacci sequence, in that each term is the sum of 2 terms appearing earlier in the sequence. However, while the Fibonacci sequence uses the sum of 2 adjacent terms to generate the term immediately following, the Padovan sequence uses the sum of 2 adjacent terms to generate the term that immediately follows the term immediately following the 2 that we add together.

In other words,

> ***P*** = _P_<sub>0</sub>, _P_<sub>1</sub>, _P_<sub>2</sub>, &hellip;

where

> _P_<sub>0</sub> = 0  
> _P_<sub>1</sub> = 1  
> _P_<sub>2</sub> = 1  
> _P_<sub>_n_</sub> = _P_<sub>(_n_-3)</sub> + _P_<sub>(_n_-2)</sub>, for _n_ > 2.

This produces the sequence

> ***P*** = 0, 1, 1, 1, 2, 2, 3, 4, 5, 7, &hellip;

### Implementation

The `edu.cnm.deepdive.Padovan` class includes the following method (currently with a skeletal implementation):

```java
public static long[] generate(int n)
```

For more declaration details, see the [Javadoc](docs/api/) documentation for the [`Padovan.generate`](docs/api/edu/cnm/deepdive/Padovan.html#generate(int)) method.

### Unit tests

For unit testing credit, create a JUnit5 test class, and use the appropriate assertions in one or more test methods to test the following inputs vs. expected outputs: 


| `n` | Expected return value of `Padovan.generate(n)` |
|:---:|:----------------------------------------------:|
| `0` | `{}` |
| `1` | `{0}` |
| `5` | `{0, 1, 1, 1, 2}` |
| `10` | `{0, 1, 1, 1, 2, 2, 3, 4, 5, 7}` |
| `20` | `{0, 1, 1, 1, 2, 2, 3, 4, 5, 7, 9, 12, 16, 21, 28, 37, 49, 65, 86, 114}` | 

In evaluating your implementation, we reserve the right to include additional test cases; code that satisfies the requirements stated above should pass all such additional tests.

### Hints

* The `generate` method to be completed is `static`; there is no need to create instances of `Padovan` (and arguably no benefit in doing so). 

* You may find it useful to create one or more additional methods as “helpers”; the problem can be solved without doing so, however.

* Don't hesitate to declare any constants (`static final` fields) that you feel might simplify or clarify your code.

* The method to be completed includes a `TODO` comment to that effect.

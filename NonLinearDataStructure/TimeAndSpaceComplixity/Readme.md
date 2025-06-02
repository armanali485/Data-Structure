# **Time and Space Complexity Cheat Sheet**

This cheat sheet provides a quick reference for common time and space complexities, along with explanations and examples.

---

## **1. Time Complexity**

Time complexity measures how the runtime of an algorithm grows as the input size increases.

### **Big-O Notation (O)**
- Describes the **upper bound** of an algorithm's runtime.
- Represents the **worst-case** scenario.

| **Complexity**  | **Name**          | **Explanation**                                                                 | **Example**                          |
|-----------------|-------------------|---------------------------------------------------------------------------------|---------------------------------------|
| **O(1)**        | Constant Time     | Runtime does not depend on input size.                                          | Accessing an array element by index. |
| **O(log n)**    | Logarithmic Time  | Runtime grows logarithmically with input size (halving the problem each step).  | Binary search.                       |
| **O(n)**        | Linear Time       | Runtime grows linearly with input size.                                         | Iterating through an array.          |
| **O(n log n)**  | Linearithmic Time | Runtime grows in proportion to `n log n`.                                       | Merge sort, Quick sort.              |
| **O(n²)**       | Quadratic Time    | Runtime grows quadratically with input size.                                    | Nested loops (e.g., Bubble sort).    |
| **O(n³)**       | Cubic Time        | Runtime grows cubically with input size.                                        | Triple nested loops.                 |
| **O(2ⁿ)**       | Exponential Time  | Runtime doubles with each additional input.                                     | Recursive Fibonacci (naive).         |
| **O(n!)**       | Factorial Time    | Runtime grows factorially (worst-case for brute-force permutations).            | Traveling Salesman (brute-force).    |

---

### **Time Complexity Comparison Graph**
```
O(1) < O(log n) < O(n) < O(n log n) < O(n²) < O(2ⁿ) < O(n!)
```

---

## **2. Space Complexity**
Space complexity measures how much **additional memory** an algorithm uses relative to input size.

| **Complexity**  | **Explanation**                                                                 | **Example**                          |
|-----------------|---------------------------------------------------------------------------------|---------------------------------------|
| **O(1)**        | Constant space (fixed memory, no dependency on input size).                     | Iterative Fibonacci.                 |
| **O(n)**        | Linear space (memory grows proportionally with input size).                     | Storing an array of size `n`.        |
| **O(log n)**    | Logarithmic space (memory grows logarithmically, common in recursive calls).     | Recursive binary search.             |
| **O(n²)**       | Quadratic space (memory grows quadratically, e.g., 2D arrays).                  | Storing a matrix of size `n × n`.    |

---

## **3. Common Algorithms & Their Complexities**
| **Algorithm**       | **Time Complexity** | **Space Complexity** | **Notes**                              |
|---------------------|--------------------|---------------------|----------------------------------------|
| **Binary Search**   | O(log n)           | O(1) (iterative)    | Requires sorted input.                 |
| **Merge Sort**      | O(n log n)         | O(n)                | Stable, divide & conquer.              |
| **Quick Sort**      | O(n log n) (avg)   | O(log n) (recursion)| Worst case O(n²), but in-place.        |
| **Bubble Sort**     | O(n²)              | O(1)                | Inefficient for large datasets.        |
| **DFS/BFS**         | O(V + E)           | O(V)                | V = vertices, E = edges (graph).       |
| **Dijkstra’s**      | O((V + E) log V)   | O(V)                | With priority queue (binary heap).     |

---

## **4. Key Takeaways**
- **Time Complexity** → How fast an algorithm runs.
- **Space Complexity** → How much extra memory it uses.
- **Best Practices**:
  - Prefer **O(1)** or **O(log n)** when possible.
  - Avoid **O(n!)** and **O(2ⁿ)** for large inputs.
  - **Trade-offs**: Sometimes, better time complexity means worse space complexity (e.g., memoization).

---

### **Example: Fibonacci Sequence**
- **Naive Recursive**: O(2ⁿ) time, O(n) space (call stack).
- **Memoization (DP)**: O(n) time, O(n) space.
- **Iterative**: O(n) time, O(1) space.


# **Complete Guide to Asymptotic Notations (Big-O, Big-Ω, Big-Θ, Little-o, Little-ω)**

This guide explains **all asymptotic notations** used in algorithm analysis, including **definitions, mathematical explanations, graphs, and code examples**.

---

## **1. What are Asymptotic Notations?**
Asymptotic notations describe **how an algorithm's runtime or space requirements grow** as input size (`n`) approaches infinity. They help compare algorithms **independent of hardware or programming language**.

---

## **2. The Five Asymptotic Notations**

| Notation       | Name             | Meaning                                                                 | Use Case                              |
|---------------|------------------|-------------------------------------------------------------------------|---------------------------------------|
| **Big-O (O)**  | Upper Bound      | "Worst-case" growth rate (algorithm takes **at most** this time).       | Guaranteeing performance limits.      |
| **Big-Ω (Ω)**  | Lower Bound      | "Best-case" growth rate (algorithm takes **at least** this time).       | Proving minimum resources needed.     |
| **Big-Θ (Θ)**  | Tight Bound      | "Average-case" growth rate (algorithm **grows exactly** at this rate).  | Precise performance classification.   |
| **Little-o (o)** | Strict Upper Bound | "Grows strictly slower than" (never equal, unlike Big-O).             | Comparing strict dominance.           |
| **Little-ω (ω)** | Strict Lower Bound | "Grows strictly faster than" (never equal, unlike Big-Ω).             | Comparing strict inferiority.         |

---

## **3. Detailed Explanation of Each Notation**

### **(1) Big-O Notation (O) — Upper Bound**
- **Definition**:  
  \( f(n) = O(g(n)) \) if there exist constants \( c > 0 \) and \( n_0 \) such that:  
  \( 0 \leq f(n) \leq c \cdot g(n) \) for all \( n \geq n_0 \).  
- **Interpretation**:  
  _"f(n) grows no faster than g(n)."_  
- **Example**:  
  \( 3n^2 + 2n + 1 = O(n^2) \) because for \( c = 6 \) and \( n_0 = 1 \),  
  \( 3n^2 + 2n + 1 \leq 6n^2 \) for all \( n \geq 1 \).  

#### **Big-O Complexity Chart**
```
O(1) < O(log n) < O(n) < O(n log n) < O(n²) < O(2ⁿ) < O(n!)
```

---

### **(2) Big-Ω Notation (Ω) — Lower Bound**
- **Definition**:  
  \( f(n) = \Omega(g(n)) \) if there exist constants \( c > 0 \) and \( n_0 \) such that:  
  \( 0 \leq c \cdot g(n) \leq f(n) \) for all \( n \geq n_0 \).  
- **Interpretation**:  
  _"f(n) grows at least as fast as g(n)."_  
- **Example**:  
  \( 3n^2 + 2n + 1 = \Omega(n^2) \) because for \( c = 1 \) and \( n_0 = 0 \),  
  \( n^2 \leq 3n^2 + 2n + 1 \) for all \( n \geq 0 \).  

#### **When to Use Big-Ω?**
- To prove an algorithm **cannot** run faster than a certain rate.  
- Example:  
  - Comparison-based sorting algorithms (e.g., Merge Sort) have a **lower bound of Ω(n log n)**.  

---

### **(3) Big-Θ Notation (Θ) — Tight Bound**
- **Definition**:  
  \( f(n) = \Theta(g(n)) \) if there exist constants \( c_1, c_2 > 0 \) and \( n_0 \) such that:  
  \( 0 \leq c_1 \cdot g(n) \leq f(n) \leq c_2 \cdot g(n) \) for all \( n \geq n_0 \).  
- **Interpretation**:  
  _"f(n) grows exactly at the rate of g(n)."_  
- **Example**:  
  \( 3n^2 + 2n + 1 = \Theta(n^2) \) because it is both \( O(n^2) \) and \( \Omega(n^2) \).  

#### **When to Use Big-Θ?**
- When an algorithm’s **best-case and worst-case are the same**.  
- Example:  
  - Merge Sort is **Θ(n log n)** in **all cases**.  

---

### **(4) Little-o Notation (o) — Strict Upper Bound**
- **Definition**:  
  \( f(n) = o(g(n)) \) if for **every** constant \( c > 0 \), there exists \( n_0 \) such that:  
  \( 0 \leq f(n) < c \cdot g(n) \) for all \( n \geq n_0 \).  
- **Interpretation**:  
  _"f(n) grows strictly slower than g(n)."_  
- **Example**:  
  \( 2n = o(n^2) \) because \( 2n \) grows slower than \( n^2 \).  
  But \( 2n \neq o(n) \) because it grows at the **same rate**.  

#### **Difference Between Big-O and Little-o**
| Big-O (O)       | Little-o (o)       |
|----------------|--------------------|
| \( f(n) \leq c \cdot g(n) \) | \( f(n) < c \cdot g(n) \) |
| Allows equality (e.g., \( n = O(n) \)) | **Strictly** smaller (e.g., \( n = o(n^2) \)) |

---

### **(5) Little-ω Notation (ω) — Strict Lower Bound**
- **Definition**:  
  \( f(n) = \omega(g(n)) \) if for **every** constant \( c > 0 \), there exists \( n_0 \) such that:  
  \( 0 \leq c \cdot g(n) < f(n) \) for all \( n \geq n_0 \).  
- **Interpretation**:  
  _"f(n) grows strictly faster than g(n)."_  
- **Example**:  
  \( n^2 = \omega(n) \) because \( n^2 \) grows faster than \( n \).  
  But \( n^2 \neq \omega(n^2) \) because they grow at the **same rate**.  

#### **Difference Between Big-Ω and Little-ω**
| Big-Ω (Ω)       | Little-ω (ω)       |
|----------------|--------------------|
| \( f(n) \geq c \cdot g(n) \) | \( f(n) > c \cdot g(n) \) |
| Allows equality (e.g., \( n^2 = \Omega(n^2) \)) | **Strictly** larger (e.g., \( n^2 = \omega(n) \)) |

---

## **4. Summary of Relationships**
| **Notation** | **Mathematical Meaning**          | **Example**                     |
|-------------|----------------------------------|---------------------------------|
| **Big-O (O)**  | \( f(n) \leq c \cdot g(n) \)     | \( 3n^2 + 5n = O(n^2) \)       |
| **Big-Ω (Ω)**  | \( f(n) \geq c \cdot g(n) \)     | \( 3n^2 + 5n = \Omega(n^2) \)  |
| **Big-Θ (Θ)**  | \( c_1 \cdot g(n) \leq f(n) \leq c_2 \cdot g(n) \) | \( 3n^2 + 5n = \Theta(n^2) \) |
| **Little-o (o)** | \( f(n) < c \cdot g(n) \)       | \( 2n = o(n^2) \)              |
| **Little-ω (ω)** | \( f(n) > c \cdot g(n) \)       | \( n^2 = \omega(n) \)          |

---

## **5. Practical Applications**
1. **Big-O (O)** → Used in **industry** to describe worst-case performance.  
   - Example: "This algorithm runs in O(n log n) time."  
2. **Big-Ω (Ω)** → Used in **theoretical proofs** (e.g., sorting lower bounds).  
3. **Big-Θ (Θ)** → Used when **best and worst cases match**.  
4. **Little-o (o)** → Used in **advanced algorithm analysis** (e.g., proving one algorithm is strictly better).  
5. **Little-ω (ω)** → Rarely used, but important in **mathematical proofs**.  

---

## **6. Final Comparison**
| **Notation** | **Analogy**                     | **Example**                  |
|-------------|--------------------------------|------------------------------|
| **O(n²)**   | "Takes at most n² steps."      | Bubble Sort (worst case).    |
| **Ω(n log n)** | "Takes at least n log n steps." | Merge Sort (best case).      |
| **Θ(n log n)** | "Always takes n log n steps."  | Merge Sort (all cases).      |
| **o(n²)**   | "Strictly better than n²."     | \( n^{1.999} = o(n^2) \).   |
| **ω(n)**    | "Strictly worse than n."       | \( n^2 = \omega(n) \).      |

---

### **Key Takeaways**
✅ **Big-O** → **Upper bound (worst-case).**  
✅ **Big-Ω** → **Lower bound (best-case).**  
✅ **Big-Θ** → **Tight bound (exact growth rate).**  
✅ **Little-o** → **Strictly better than.**  
✅ **Little-ω** → **Strictly worse than.**  

This guide covers **all asymptotic notations** with precise definitions and examples. Let me know if you need further clarifications! 🚀
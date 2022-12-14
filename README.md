# Optimizations
This is a simple program that shows the performance differences of different styles of coding and built in methods.
I have a fairly fast machine, so results may be somewhat different on someone else's machine.

Some notes about this project:

- ContainsMethodTest
  - This tests the speed of the build in contains method in the List, Set, Queue, and Stack collections. The collection
  type is built in the background before execution. There are 2 versions for every method. One version has a target
  value of the collections size - 1 and the other has a target value of 1. As suspected, the results of the methods with
  the low-end target value are all about the same. Also, as suspected, the Set is almost always
  the fastest one of the 4. With the high-end target value, as expected, the Set is also the fastest one every time
  , although it is much slower than the low-end target contains. Unexpectedly, the other 3 results all have very similar 
  times. This leads me to believe that the contains method for List, Queue, and Stack all start at the left most
  element in their search (bottom for the stack).


- AddMethodTest
  - This tests the speed of creation of a collection with the collections' built in add method. This test includes a 
  List, Set, Queue, and Stack (yes, I used add() instead of push() for stack). Although results are somewhat similar, it
  appears that the list is generally the fastest, and the set is generally the slowest. 
  

- BinarySearchOptimizationsTest
  - This tests the effectiveness of a binary search vs an iterative approach on a sorted array. I think this one is 
  fairly self-explanatory. As expected, the binary search is drastically faster.


- BinaryTreeOptimizationsTest
  - I did my best to implement optimizations for a balanced binary tree. First, I implemented methods for testing the
  processing time of a recursive vs iterative depth-first search and a depth-first vs breadth first iterative search.
  Then I had the idea to test the memory usage of each method. I started by
  calculating the memory in the same methods I used to calculate time, however that caused the results of the process
  speeds to be opposite of expected. I realized that the extra calls to record the memory usage were slowing down the
  methods enough to give "false" readings. The solution I decided on was to duplicate all the methods and remove the methods
  to measure process time and replace them with methods to measure memory usage. This required double the amount of method
  calls, however, it separated the processes to achieve more accurate results. The problems with it is that there is a
  certain amount of overhead involved in the actual memory measurement process. I've yet to figure out how to eliminate it
  ,and I'm not entirely sure its avoidable.
  

- ConcurrencyOptimizationsTest
  - This tests the effectiveness of a iterative approach vs concurrency. I think this one is also fairly self-explanatory.
  As expected, concurrency is drastically faster.


- ObjectInstantiationOptimizationsTest
  - This tests the effectiveness of declaring your variable outside a loop as opposed to inside a loop. The average times
  are actually quite eye-opening to the little things you can do to make a big difference. According to the test results,
  reusing an object outside a loop for every iteration is much faster than declaring and instantiating inside the loop.


- VariableInstantiationOptimizationsTest
  - This tests the effect of using a primitive's Wrapper class vs using the primitive itself. The results were fairly
  surprising to me, although expected. Creating an instance of a wrapper class is more costly than creating a primitive.
  Interestingly, the creation of the double and float (both primitive and wrapper) are somewhat longer that the other 3.
  
- LoopsAndStreamsOptimizationTest
  - This tests the effect of using a stream over a traditional for loop. Surprisingly, the stream is drastically slower
  than the traditional for loop. I suspected that the stream might be slower in general, but the actual difference
  between them was the most surprising aspect. 



Source: https://www.infoworld.com/article/2077647/make-java-fast--optimize-.html?page=3


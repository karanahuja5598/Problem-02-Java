# Count Duplicates Problem

In the following challenge you are given the following class

```
public class CountDuplicates {
    /**
     * Example of overloading a function that accepts a Array String
     * @param input
     * @return
     */
    public Integer countDuplicates(String[] input){
        return null;
    }

    /**
     * Example of overloading a function that accepts a Array of Integers
     * @param input
     * @return
     */
    public Integer countDuplicates(Integer[] input){
        return null;
    }
}

```

The class has two functions that are overloaded called ```countDuplicates```:

1.  The first function accepts an array of Strings.
2.  The second function accepts an array of Integers.

Your job is to count the number of duplicate entries in the provided array. For example :

```
Integer[] integers = {1,1,1,2,2,3,4,4};
```

In the above array 

1. 1 appears 3 times, but should be considered 1 set of duplicates.
2. 2 appears 2 times, but should only be considered as 1 set of duplicates.
3. 3 appears once and SHOULD NOT be considered a duplicate.
4. 4 appears 2 times, and should only be considered as 1 set of duplicates.

So the above array as 3 sets of duplicates and should return the value of 3.




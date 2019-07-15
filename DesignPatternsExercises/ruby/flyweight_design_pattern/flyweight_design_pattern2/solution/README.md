# Flyweight Design Pattern Exercise in Ruby

## Description
* Flyweight Design Pattern is reviewed in this example and exercise.
* It is Structural Design Pattern.
* Re-uses shared objects that are similar in some way instead of creating new ones.
* Dramatically increases the speed of the code whenever shared objects are re-used instead of dealing with distinct
objects in memory.
* Reduces the cost of complex object models.
* Reduces memory usage and saves memory: 
  * Shared objects already created
  * Does not require allocation of additional memory
  * Mitigates utilization of memory
    * Swapping of objects in memory
* Promotes sharing of states:
  * Intrinsic  State:
    * That is what shared by many objects
  * Extrinsic State
* Creates new object only if the object to be used has "new" (non-common) intrinsic state.
* It allows:
  * Save memory
  * Reduce machine resources:
    * Complexity and Cost of creating new object(s)
    * Memory utilization
* It is used when:
  * There is a need to create a large number of similar objects
  * Sharing to support large numbers of fine-grained objects efficiently
  * Need to reduce memory usage
* Example(s):
  * Testing a system by feeding large number of objects with the same properties:
    * There is a need for N number of objects for an adequate system test
    * Create only M << N number objects that have different intrinsic state
    * System treats each shared objects as completely separate object as long as it shares the same intrinsic state
    * If intrinsic state changes, it requires creation of a new object
  * Displaying large number of Squares on the user screen:
    * There is a need to display N number of Squares on the screen that vary only by color:
      * There are M << N different colors
    * Create only M Squares:
      * 1 per different color
    * Keep re-using M Squares for displaying N number of squares on the screen
    * User sees no difference whether each Square is separate object in memory or if it is the same shared object

## Run the program
To execute the program from command line, please use the following command:

```
ruby flyweight_design_pattern2.rb
```

## Exercise
* In this example, Flyweight Design Pattern is created to re-use the same `Flight` objects and print it with some random
parameters:
  * Flight number
  * Latitude
  * Longitude
* There is only one parameter that defines intrinsic state of a `Flight` object:
  * Company
* Program calls `FlightFacotry` to get a "new" `Flight` object:
  * If an object object has already been created with corresponding flight company, it returns existing object
  * If not, it creates new flight object, stores into memory (HashMap), and returns it
* Upon receiving a flight object, program prints its company and randomly generated flight number, latitude, and
longitude.
* This Flyweight Design Pattern is incomplete.
* Please fill in the `____________________`  blanks to make the program run successfully to follow Flyweight Design
Pattern.
* Check each file for blanks.
* Enter filled in blanks into Google Doc Exercise.
* Start with `flyweight_design_pattern2.rb` file.

## Expected Output
Since this program generates some random values for shared objects, the output generated by the program will vary from
run to run. However, upon executing the program, you should see very similar output provided below (assuming blanks are
filled in correctly):

```
KLM flight 573 is currently at latitude 15 and 145 longitude
American Airlines flight 734 is currently at latitude 17 and 144 longitude
BA flight 789 is currently at latitude 15 and 151 longitude
United Airlines flight 348 is currently at latitude 33 and 142 longitude
Delta flight 310 is currently at latitude 84 and 96 longitude
KLM flight 893 is currently at latitude 50 and 176 longitude
American Airlines flight 760 is currently at latitude 69 and 59 longitude
United Airlines flight 477 is currently at latitude 41 and 155 longitude
KLM flight 394 is currently at latitude 74 and 125 longitude
American Airlines flight 784 is currently at latitude 68 and 8 longitude
```
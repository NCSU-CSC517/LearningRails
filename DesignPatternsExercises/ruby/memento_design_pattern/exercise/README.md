# Memento Design Pattern Exercise in Ruby

## Description
* Memento Design Pattern is reviewed in this example and exercise.
* It is Behavioral Design Pattern.
* Provides a way to store previous states of an Object.
* Provides a way to restore an object to any of its previous states.
* It does not require multiple classes to reimplement the same method.
* It does not use Inheritance.
* It has 3 (three) main classes where all the work is done:
  * `Memento`:
    * Basic object that is stored in different states
  * `Originator`:
    * Sets and Gets values from the currently targeted Memento
    * Creates new Mementos and assigns current values to them
  * `Caretaker`:
    * Holds an ArrayList that contains all previous versions of the Memento
    * It can store and retrieve stored Mementos
* It allows:
  * Store all the states of an object
  * Restore object to any of its previous states
* It is used when:
  * Object's states must be recorded and retrieved in the future
* Example(s):
  * An undo function in a calculator
  * Changing a tire by referring to the wheel on the other side to see how everything fits together

## Run the program
To execute the program from command line, please use the following command:

```
ruby memento_design_pattern.rb
```

## Exercise
* In this example, `HomeTheatre` is the Originator:
  * All possible instances of `HomeTheatre` are instantiated with permutation of given `LedTV` and `Speaker` objects:
    * TV1, Speaker1
    * TV1, Speaker2
    * TV2, Speaker1
    * TV2, Speaker2
  * It creates new Mementos via `memento` method call
* `Warehouse` is the Caretaker that contains all previous versions of the Memento:
  * It stores newly created and retrieves previously stored Mementos.
* `Memento` stores different permutations of `LedTV` and `Speaker` objects mirrored at `HomeTheatre` objects.
* This example is incomplete.
* Please fill in the `____________________`  blanks to make the program run successfully to follow Memento Design
Pattern.
* Check each file for blanks.
* Enter filled in blanks into Google Doc Exercise.
* Start with `memento_design_pattern.rb` file.

## Expected Output
Upon executing the program, you should see the following output (assuming blanks are filled in correctly):

```
-- -- Current Home Theatre State is 3 -- --
Home Theatre State 3:
    Led TV:
        size: 20, price: $200
    Speaker:
        wattage: 2000
-- -- Rollback to Home Theatre State 0 -- --
Home Theatre State 0:
    Led TV:
        size: 10, price: $100
    Speaker:
        wattage: 1000
```

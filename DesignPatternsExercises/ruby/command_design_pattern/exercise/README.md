# Command Design Pattern Exercise in Ruby

## Description
* Command Design Pattern is reviewed in this example and exercise.
* It is Behavioral Design Pattern.
* It creates objects which encapsulate actions and parameters.
* An object is used to represent and encapsulate all the information needed to call a method at a later time
  * Information includes the method name, the object that owns the method and values for the method parameters
* It allows to store lists of code that is executed at a later time or many times
  * Storing command for later use
  * Class is a great place to store procedures to be executed
  * Multiple commands in a class can be stored to be used over again
* Client may want a specific Command to run when execute() is called on one of the encapsulated (hidden) Objects.
* An Object called the Invoker transfers Command to another Object called a Receiver to execute the right code.
* Allows to implement undo procedures for past commands
* It is mainly used when something needs to be set up and done int in the Future
  * At the moment it is unknown whether and when it is going to be done
* The concept here is exactly same as strategy pattern example worked out earlier, but of course, some implementation
changes as per Command Design Pattern.
* Difference between Strategy Design Pattern and Command Design Pattern:
  * The Command Design Pattern is to store many commands needed to execute
  * The Strategy Design Pattern is to decide different way to solve the problem
* Example:
  * A general purpose thread pool class that maintains a queue of tasks to be taken care of by threads

## Run the program
To execute the program from command line, please use the following command:

```
ruby command_design_pattern.rb
```

## Exercise
* In this example, extracting tool of the file is created, but incomplete.
* Please fill in the `____________________`  blanks to make the program run successfully to follow Command Design
Pattern.
* Check each file for blanks.
* Enter missing statements (blanks) into Google Doc Exercise.
* To match the "correct" answers, if some method takes a file parameter, name the parameter a.csv, b.xx, c.xx, etc.,
where "xx" is the correct file extension.
* The correct extraction algorithm needs to be called in a way that reflects use of the Command Design Pattern.
* Start with `command_design_pattern.rb` file.
* Hint: Extraction interface is analogous to command interface and subsequent concrete classes are analogous to concrete
 command.

## Expected Output
Upon executing the program, you should see the following output:

```
Extracting as CSV...
Extracting as TSV...
Extracting as database...
```

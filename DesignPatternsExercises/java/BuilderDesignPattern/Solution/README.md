# Builder Design Pattern Exercise in Java

## Description
* Builder Design Pattern is reviewed in this example and exercise.
* It is Creational Design Pattern.
* Creates objects made from bunch of other objects at run time.
  * By having different classes building the object it can then easily create many different types of objects without
  being forced to rewrite code
* Hides creation of the complex object's parts from the client (`BuilderDesignPattern` class in this example) class
  * Both client class and builder class are independent of each other
* In creating a complex object, uses more than one creation method to create a single object.
* Provides different way to create complex objects such as objects created using the Abstract Factory design pattern.
* Only the builder knows the specifics and no other class does
* It allows:
  * Create complex objects with help of other classes
  * Creation process of objects' parts to be independent of the main object
  * Hide creation of the complex object's parts from the client (`BuilderDesignPattern` class in this example) class
    * Both client class and builder class are independent of each other
* It is used when:
  * Creating complex objects
  * Building an object made up from other objects
  * Any time building complex object and sending messages to it to customize it:
    * Especially Cascade the messages (one sent message results in sending additional message to it).
* Example:
  * At ABC showroom class `Car` may have following properties:
    * Model: Audi, BMW, Mercedes, etc.
    * Transmission: automatic or manual
    * Airbags: true or false
    * Convertible: true or false
  * Having complex Car object design builder pattern in the following way:
    * `void setMake(String Make)  { // Set the make }`
    * `void setTransmissionType() { // Make the system remember the transmission type }`
    * `void setConvertible()      { // Make the system remember this is a convertible or not }`
    * `void setWithAirbags()      { // Make the system remember this car comes with airbags or not }`

## Run the program
To execute the program from command line, please use the following command:

```
javac BuilderDesignPattern.java
java BuilderDesignPattern
```

## Exercise
* In this example, complex `Computer` object is created with help of `ComputerEngineer` and `ComputerBuilder`, but
incomplete.
* It utilizes `ComputerEngineer` object to create `ComputerBuilder`, which creates `Computer` object.
* `ComputerBuilder` class is used to build complex computer system with multiple HW components added to it.
* Computer may or may not have the following HW properties:
  * Multiple monitors
  * Multiple RAMs
  * Multiple HDDs
  * Different type of Mouse
  * etc
* Please fill in the `____________________`  blanks to make the program run successfully to follow Builder Design
Pattern.
* Check each file for blanks.
* Enter filled in blanks into Google Doc Exercise.
* Start with `BuilderDesignPattern.java` file.

## Expected Output
Upon executing the program, you should see the following output (assuming blanks are filled in correctly):

```
Computer is assembled and with the following parts.
List of Monitors:
    17 inches
    28 inches
List of RAMs:
    256 MB
Total Ram Capacity = 256 MB
List of HDDs:
    64 GB
    512 GB
    1024 GB
    2048 GB
Total HDD Capacity = 3648 GB
Computer Mouse Type = Optical
```
# SOLID principles
Good software systems begin with clean code. On the one hand, if the bricks aren’t well made, the architecture of the building doesn’t matter much. On the other hand, you can make a substantial mess with well-made bricks. This is where the SOLID principles come in.
The SOLID principles tell us how to arrange our functions and data structures into classes, and how those classes should be interconnected. The use of the word “class” does not imply that these principles are applicable only to object-oriented software.A class is simply a coupled grouping of functions and data. Every software system has such groupings, whether they are called classes or not. The SOLID principles apply to those groupings.
## The goal of the principles
The goal of the principles is the creation of mid-level software structures that:

• Tolerate change,

• Are easy to understand, and

• Are the basis of components that can be used in many software systems.

The term “mid-level” refers to the fact that these principles are applied by programmers working at the module level. They are applied just above the level of the code and help to define the kinds of software structures used within modules and components.
## If we don’t follow SOLID Principles
1-We end up with tight or strong coupling of the code with many other modules/applications

2-Tight coupling causes time to implement any new requirement, features or any bug fixes and some times it creates unknown issues

3-End up with a code which is not testable

4-End up with duplication of code

5-End up creating new bugs by fixing another bug

6-End up with many unknown issues in the application development cycle

## SOLID Acronym
• S : Single Responsibility Principle (SRP) 

• O : Open closed Principle (OSP)

• L : Liskov substitution Principle (LSP)

• I : Interface Segregation Principle (ISP)

• D : Dependency Inversion Principle (DIP)
### 1-SRP: The Single Responsibility Principle
A class should have one, and only one responsibility/ reason to change.
All methods and properties of a class should be cohesive i.e. directly relate to its responsibility, by working towards a common goal. When a class serves multiple purposes/ responsibilities, it becomes really difficult to read, repair or to expand it, at which point it should be made into a new class. This principle is very noticeable in case of an application that begins to grow with time, with enriched functionalities added to already existing classes and their capabilities.
### 2-OCP: The Open-Closed Principle
Software entities should be open for extension, but closed for modification.
Software entities (classes, modules, functions, etc.) should be extendable without actually changing contents of class being extended. If this principle is followed strongly enough, it is possible to then modify behaviour of code without ever touching the piece of original code. The application must be ready for extensions, as it has to continuously evolve based on the changes of external system.
### 3-LSP: The Liskov Substitution Principle
Barbara Liskov’s famous definition of subtypes, from 1988. In short, this principle says that to build software systems from interchangeable parts, those parts must adhere to a contract that allows those parts to be substituted one for another.
### 4-ISP: The Interface Segregation Principle
This principle advises software designers to avoid depending on things that they don’t use.
### 5-DIP: The Dependency Inversion Principle
Depend on abstractions, not on concretions.
High-level modules should not depend on low-level modules. Both should depend on abstractions. Abstractions should not depend on details. Details should depend on abstractions.


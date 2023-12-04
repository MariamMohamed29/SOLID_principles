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
An active corollary to Conway’s law: The best structure for a software system is heavily influenced by the social structure of the organization that uses it so that each software module has one, and only one, reason to change.


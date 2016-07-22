Generics
Difference.java in generics package
Problems with above code
* typecast needed.
* no type safety at compile time (run-time surprise - ClassCastException)

Why Generics?
* Stronger type checks at compile time.
* Elimination of casts.
* enables to implement generic algorithms.

Solution - Generic type - multiple parameters supported which may be bounded like <T extends Animal>

Wild card
* The question mark (?) wildcard character can be used to represent an unknown type using generic code. Wildcards can be used with parameters, fields, local variables, and return types.
* can be upperbound as well
* can be lowerbounded e.g. ? super Integer

Doesnt support primitive type:
* autoboxing reduces the impact.
* virtual machines/ runtime enviroment expect references. List<Integer> compiles to List.class

Annotation
* Information for the compiler - to detect errors or suppress warnings.
* Compile-time and deployment-time processing - to generate code, XML files.
* Runtime processing

they dont extend - reason as per JSR - simplicity

Enum
enum Season { WINTER, SPRING, SUMMER, FALL}
This will be expanded to a class

  final class Season extends Enum<Season>

definition from java
public abstract class Enum<E extends Enum<E>> implements Comparable<E>, Serializable {...}
It is  common base class of all Java language enumeration types.
It means that the type argument for enum has to derive from an enum which itself has the same type argument.

e.g.
public class PhoneType extends Enum<PhoneType>
It means that the type argument for enum has to derive from an enum which itself has the same type argument.

thread safety / multi-threading issue
* volatile - thread visibility
* synchronization
* wait notify

exception handling
* checked & runtime
* wrapping up
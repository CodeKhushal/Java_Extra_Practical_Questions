
# Assignment - classes and inheritance

(Given on 14th June 2021)

# Q1. What will be the output of the below program?

# a)
```java
class A
{
    public A()
    {
        System.out.println("Class A Constructor");
    }
}
class B extends A
{
    public B()
    {
        System.out.println("Class B Constructor");
    }
}
class C extends B
{
    public C()
    {
        System.out.println("Class C Constructor");
    }
}
public class MainClass
{
    public static void main(String[] args)
    {
        C c = new C();
    }
}
```
# Answer
Class A Constructor

Class B Constructor

Class C Constructor

# b)
```java
class A
{
    String s = "Class A";
}
class B extends A
{

    String s = "Class B";
    {
        System.out.println(super.s);
    }
}
class C extends B
{
    String s = "Class C";
    {
        System.out.println(super.s);
    }
}
public class MainClass
{
    public static void main(String[] args)
    {
        C c = new C();
        System.out.println(c.s);
    }
}
```
# Answer
Class A

Class B

Class C

# c)
```java
public class classCommLine {
    public static void main(String args[]) {
        for(int i=0; i<args.length; i++)
            System.out.println("args[" + i + "]: " + args[i]);
    }
}
```
# Answer
# Command line Commands and output:

@khushal-:/Documents$ javac CommLine.java

@khushal-:/Documents$ java CommLine 45 65 75 85 33 44

args[0]: 45

args[1]: 65

args[2]: 75

args[3]: 85

args[4]: 33

args[5]: 44


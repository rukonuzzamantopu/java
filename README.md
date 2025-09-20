# Java OOP Practice Repository

This repository is dedicated to learning and practicing **Object-Oriented Programming (OOP)** in Java.  
It contains structured exercises, lab problems, and worked examples to help learners master OOP concepts step by step.  

---

## 📘 What You'll Learn
- **Classes & Objects:** How to design and create reusable classes and instantiate objects.  
- **Encapsulation:** Hiding data with access modifiers and getter/setter methods.  
- **Constructors:** Using default and parameterized constructors.  
- **Methods:** Defining, overloading, and calling methods effectively.  
- **Inheritance:** Building relationships between classes and reusing code.  
- **Polymorphism:** Overriding methods and demonstrating dynamic binding.  
- **Abstraction:** Designing abstract classes and interfaces.  
- **Recursion & Loops:** Supporting concepts for solving problems in an OOP style.  
- **GUI Programming:** Extending OOP concepts into graphical applications using Java Swing.  

---
 
## 📝 Sample Programs

### 1. Class & Object Example
```java
class Person {
    String name;
    int age;

    void introduce() {
        System.out.println("Hi, my name is " + name + " and I am " + age + " years old.");
    }
}

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Alice";
        p1.age = 22;
        p1.introduce();
    }
}


### Inheritance Example
class Animal {
    void sound() {
        System.out.println("Animals make sounds");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog(); // Polymorphism in action
        a.sound();
    }
}

## GUI Example (Swing)
import javax.swing.*;

public class SimpleGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello GUI");
        JButton button = new JButton("Click Me");

        frame.add(button);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

## 🎯 Purpose

1.This repository is designed for:

2.Students preparing for Java lab exams.

3.Beginners practicing object-oriented concepts through real examples.

4.Learners who want to bridge basic syntax with advanced OOP design.

5.By working through these exercises, you will gain a strong foundation in both Java fundamentals and core OOP principles.

## 🤝 Contribution

1.You are welcome to contribute by:

2.Forking the repository.

3.Creating a new branch for your changes.

4.Submitting a pull request.

Contributions can include bug fixes, new examples, or improved explanations.
## 🚀 Getting Started  

### 1. Clone the repository  
```bash
https://github.com/rukonuzzamantopu/java

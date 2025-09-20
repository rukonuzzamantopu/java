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

## 📂 Folder Structure

---

## 🚀 Usage
To compile and run any Java program:  

```bash
# Compile
javac FileName.java

# Run
java FileName
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
git clone https://github.com/your-username/your-repository-name.git

---

👉 Do you want me to also add a **section with learning roadmap** (e.g., “Start with basics → then constructors → then inheritance → then polymorphism”), so that the README doubles as a study guide?

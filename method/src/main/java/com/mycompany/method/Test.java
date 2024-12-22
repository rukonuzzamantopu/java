
package com.mycompany.method;


public class Test {
    public static void main(String args[])
    {
        Student stu1=new Student();
        stu1.name="topu";
        stu1.gennder="male";
        stu1.id=232002280;
        stu1.displayinfor();
        
        Student stu2=new Student();
        stu2.name="fuck";
        stu2.gennder="male";
        stu2.id=232002;
        
        System.out.println("name :"+stu2.name);
        System.out.println("gender :"+stu2.gennder);
        System.out.println("student id :"+stu2.id);

        
        
    }
    
}

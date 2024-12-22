

package com.mycompany.constructor;

public class Constructor {

    public static void main(String[] args) {
      Student stu1=new Student("topu","male",232002280);
      stu1.displayinformtion();
      Student stu2=new Student("topu","male");
      stu2.displayinformtion();

        
        Student stu3=new Student("nothing","fuck",232002789);
        stu3.displayinformtion();
        
        Student stu4=new Student();

        
              
    }
}

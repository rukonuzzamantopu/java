
package com.mycompany.constructor;
public class Student {
    String name;
    String gennder;
    int id;
    Student (String n,String m,int a)
    {
        name=n;
        gennder=m;
        id=a;
        
    }
    
     Student (String n,String m)
    {
        name=n;
        gennder=m;
    }
     Student (){
         System.out .println("nothing");
     }

    void displayinformtion(){
        System.out.println("name :"+name);
        System.out.println("gender :"+gennder);
        System.out.println("student id :"+id);
        
    }
}

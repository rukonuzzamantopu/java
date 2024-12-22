
package com.mycompany.classobjeact;

public class Student {
    String name;
    String gennder;
    int id;
    void setinformation(String n,String m,int a)
    {
        name=n;
        gennder=m;
        id=a;
        
    }
    void displayinformtion(){
        System.out.println("name :"+name);
        System.out.println("gender :"+gennder);
        System.out.println("student id :"+id);
        
    }
}

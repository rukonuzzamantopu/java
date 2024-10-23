
import java.util.*;

public class m3 {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
      
      Employe asif = new Employe(1, 2023, 20000.0);
      
      Management murad = new Management(2, 2022, 50000.0);
      
      asif.show_info();
      murad.show_info();
      
      asif.salary_increment();
      murad.salary_increment();
      
      asif.show_info();
      murad.show_info();

  }
}

class Employe{
  int id, joining_year;
  double starting_salary;
  
  Employe(int a, int b, double c){
    id = a;
    joining_year = b;
    starting_salary = c;
  }
  
  void show_salary(){
    System.out.println(starting_salary);
  }
  
  void salary_increment(){
    starting_salary = starting_salary*1.1;
  }
  
  
  void show_info(){
    System.out.println("----------------------");
    System.out.println("ID:" + id );
    System.out.println("Joining year:" + joining_year );
    System.out.println("Salary: " + starting_salary );
  }
}


class Management extends Employe{
  
  Management(int a, int b, double c){
    super(a, b, c);
  }
  
  @Override
  void salary_increment(){
    starting_salary = starting_salary*1.2;
  }
  
  
}
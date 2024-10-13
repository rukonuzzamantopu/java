class student{
    int id;
    String name;
    student (int i, String n){
        this.id = i;
        this.name = n;
    }
    void printCons(){
        System.out.println("ID: "+id+"\n"+"Name: "+name);
    }
}
public class LB4_2{
public static void main(String[] args) {
    student obj = new student(232002280, "topu");
    obj.printCons();
}
}

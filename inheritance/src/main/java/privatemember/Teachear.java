
package privatemember;

public class Teachear extends Persion {
    private String qulification;

    public String getQulification() {
        return qulification;
    }

    public void setQulification(String qulification) {
        this.qulification = qulification;
    }
    

void displayinformation()
{
    System.out .println("Name is:"+getName());
        System.out .println("Age is :"+getAge());
        System.out .println("Qulification is:"+getQulification());
        System.out.println("\n\n");
}
}

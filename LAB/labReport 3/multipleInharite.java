interface A{
    public void showA();
}

interface B{
    public void showB();
}

class C implements A, B {
    @Override
    public void showA(){
        System.out.println("Class A");
    }

    @Override
    public void showB(){
        System.out.println("Class B");
    }

    private void showC(){
        System.out.println("Class C");
    }

    protected void callShowC(){
        showC();
    }
}

public class multipleInharite {
    public static void main(String[] args) {
        C objC = new C();

        objC.showA();
        objC.showB();
        objC.callShowC();
    }
}

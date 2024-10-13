interface X {
    void methodX();
}

interface Y {
    void methodY();
}

interface Z {
    void methodZ();
}

class D implements X, Y, Z {
    public void methodX() {
        System.out.println("This is methodX from interface X");
    }

    public void methodY() {
        System.out.println("This is methodY from interface Y");
    }

    public void methodZ() {
        System.out.println("This is methodZ from interface Z");
    }
}

public class topu {
    public static void main(String[] args) {
        D obj = new D();
        obj.methodX();
        obj.methodY();
        obj.methodZ();
    }
}

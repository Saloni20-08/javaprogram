class Finalizer {
    public Finalizer() {
        System.out.println("This is the constructor");
    }
    @Override
    protected void finalize() throws Throwable {
        try {
            System.out.println("This is the finalizer");
        } finally {
          super.finalize();;
        }
    }
    public void set() {
        System.out.println("This is the set method");
    }
}

public class finalizerdemo {
    public static void main(String[] args) {
        System.out.println("Main starts");
        Finalizer f1 = new Finalizer();
        f1.set();

        System.out.println("Main ends");
        f1 = null; 
        System.gc();
    }
}
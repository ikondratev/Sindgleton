package singleton;

/**
 * Attention!
 * private constrictor
 * public static method getInstance
 * only one instance of object may be
**/

public class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton(){}

    private String varInst;

    public static Singleton getInstance() {
        return instance;
    }

    @Override
    public String toString() {
        return "Hello it's Singleton";
    }

    public String getVarInst() {
        return varInst;
    }

    public void setVarInst(String varInst) {
        this.varInst = varInst;
    }
}

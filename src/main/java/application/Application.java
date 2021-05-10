package application;

import singleton.Singleton;

public class Application {
    public static void main(String[] args) {
        Singleton con = Singleton.getInstance();
        con.setVarInst("First object");
        System.out.println("Hello world it's singleton: " + con.toString());
        System.out.println("Singleton says: " + con.getVarInst());
    }
}

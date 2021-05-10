package singleton;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;
@RunWith(JUnit4.class)
public class SingletonTest {
    public Singleton singleton;
    public String var = "FIRST_VAR";

    @Before
    public void preset() {
        singleton = Singleton.getInstance();
        singleton.setVarInst(var);
    }

    @Test
    public void testUnicSingleton() {
        Singleton singletonSecond = Singleton.getInstance();
        String secondVar = singletonSecond.getVarInst();
        assertEquals(var, secondVar);
    }
}
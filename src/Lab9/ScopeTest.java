package Lab9;

import java.sql.SQLOutput;

public class ScopeTest {
    int test = 10;

    void pirntTest () {
        int test = 20;
        System.out.println("test " + test);


    }

    public static void main(String[] args) {
        ScopeTest st = new ScopeTest();
        st.pirntTest();
    }

}

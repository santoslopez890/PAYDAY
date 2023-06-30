package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void main() {

    }

    @Test
    void pay() {
        PayDAY payday1=new PayDAY();

        java.lang.String string1= payday1.pay("Kris",21.5,10,.05);
        assertEquals("Kris 215.00 10.75 204.25", string1);
    }
}

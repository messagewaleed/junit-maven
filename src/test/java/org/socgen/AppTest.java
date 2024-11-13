package org.socgen;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest{

    //App app;

//    @Test
//    void dummy(){
//        fail("Intentionally failing this...");
//    }

    @Test
    //@Disabled
    void testDivide(){
        App app = new App();
        int result = new App().divide(450, 50);
//        assertEquals(9, result);
//        assertNotEquals(450, result);
//        assertNotNull(app);

        assertAll(
                ()-> assertEquals(9, result),
                ()-> assertEquals(10, app.divide(0, 80)),
                () -> assertEquals(2, app.divide(100, 50))
        );
    }

    @ParameterizedTest
    @ValueSource(strings = {"ABCDE", "NITIN", "MADAM"})
    //@EnabledOnOs(OS.WINDOWS)
   // @EnabledOnJre(JRE.JAVA_11)
    void testCheckForPalindrome(String value){
        App app = new App();

        assertEquals(true, app.checkForPalindrome(value));

    }

}

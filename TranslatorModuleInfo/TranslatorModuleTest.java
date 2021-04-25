import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class TranslatorModuleTest {

//    @Test
//    void messageCallerTest()
//    {
//        String s = TranslatorModule.messageCaller(813);
//        assertEquals("Language Not Found", s);
//        s = TranslatorModule.messageCaller(805);
//        assertEquals("Word Not Found", s);
//    }
    @Test
    void searchLangFileTest() throws IOException {
        TranslatorModule.myPath = "german.txt";
        boolean b = TranslatorModule.searchTransFile("France");
        assertEquals(false,b);
        b = TranslatorModule.searchTransFile("GERMAN");
        assertEquals(true,b);
    }
    @Test
    void searchTransFileTest() throws IOException {
        TranslatorModule.myPath = "spanish.txt";
        boolean b = TranslatorModule.searchLangFile("france");
        assertEquals(false,b);
        b = TranslatorModule.searchLangFile("dog");
        assertEquals(true,b);
    }

}
import org.junit.Before;
import org.junit.Test;

public class ChimpanzeeTest {
    Chimpanzee chimpanzee;


    @Before
    public void before() {
        chipanzee = new Chimpanzee();
    }

    @Test
    public String canTalk(String language) {
        return("Hello" + language);
    }
}

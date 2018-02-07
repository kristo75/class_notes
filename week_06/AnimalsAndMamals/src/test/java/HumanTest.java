import org.junit.Before;
import org.junit.Test;

public class HumanTest {

    @Before
    public void before() {
        human = new Human();
    }

    @Test
    public String canTalk(String language) {
        return("Hello" + language);
    }
}

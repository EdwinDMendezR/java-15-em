package sealed.classes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SealedClassesTest {

    @Test
    public void methodTest() {
        Assertions.assertEquals("ObjectA::getMessage", new ObjectA().getMessage());
        Assertions.assertEquals("ObjectB::getMessage", new ObjectB().getMessage());
        Assertions.assertEquals("ObjectC::getMessage", new ObjectC().getMessage());
    }

}

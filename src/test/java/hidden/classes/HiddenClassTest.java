package hidden.classes;

import org.junit.jupiter.api.Test;

public class HiddenClassTest {

    @Test
    public void hiddenClassTest() {
        HiddenClassCreator hcc = new HiddenClassCreator();
        HiddenClass hc = hcc.createHiddenClass();
        hc.printHello();
    }


    class HiddenClass {
        public void printHello() {
            System.out.println("Hello from the hidden class!");
        }
    }

    class HiddenClassCreator {
        public HiddenClass createHiddenClass() {
            return new HiddenClass();
        }

        private class PrivateHiddenClass {
            public void printGoodbye() {
                System.out.println("Goodbye from the private hidden class!");
            }
        }
    }


}

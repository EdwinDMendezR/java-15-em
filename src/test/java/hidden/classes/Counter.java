package hidden.classes;

public class Counter {
    private int count;

    public Counter() {
        // Inicializamos el contador a cero
        count = 0;
    }

    public void increment() {
        // Incrementamos el contador en 1 cada vez que se llama al método
        count++;
    }

    // Creamos una Hidden Class para ocultar el contador
    private static class HiddenCounter {
        private int count;

        public HiddenCounter() {
            // Inicializamos el contador a cero
            count = 0;
        }

        public void increment() {
            // Incrementamos el contador en 1 cada vez que se llama al método
            count++;
        }

        public int getCount() {
            // Devolvemos el valor del contador
            return count;
        }
    }

    // Creamos un método público que devuelve el valor del contador utilizando la Hidden Class
    public int getCount() {
        return new HiddenCounter().getCount();
    }

}

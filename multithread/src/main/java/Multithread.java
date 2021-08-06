public class Multithread {
    public static void main(String[] args)
    {
        int n = 8; // Number of threads
        for (int i = 0; i < n; i++) {
            Multithreading1 object
                    = new Multithreading1();
            object.start();
        }
    }
}

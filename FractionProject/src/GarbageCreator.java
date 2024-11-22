public class GarbageCreator {
    public static void main(String[] args) {
        System.out.println("Starting GarbageCreator...");

        try {
            while (true) {
                // Create large garbage repeatedly
                String[] garbage = new String[1000000];
                for (int i = 0; i < garbage.length; i++) {
                    garbage[i] = new String("Garbage" + i); // Forces new String creation
                }

                // Optional sleep to slow down a bit
                Thread.sleep(100); 
            }
        } catch (OutOfMemoryError e) {
            System.err.println("OutOfMemoryError occurred! Too much garbage created.");
        } catch (Exception e) {
            System.err.println("An exception occurred: " + e.getMessage());
        }
    }
}

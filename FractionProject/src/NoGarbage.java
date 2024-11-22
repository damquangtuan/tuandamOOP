public class NoGarbage {
    public static void main(String[] args) {
        System.out.println("Starting NoGarbage...");

        try {
            while (true) {
                // Use reusable objects instead of creating unnecessary garbage
                StringBuilder builder = new StringBuilder();

                for (int i = 0; i < 1000000; i++) {
                    builder.append("ReusableGarbage").append(i).append(" ");
                }

                // Clear the builder for reuse
                builder.setLength(0);

                // Optional sleep to mimic the GarbageCreator timing
                Thread.sleep(100);
            }
        } catch (OutOfMemoryError e) {
            System.err.println("OutOfMemoryError occurred! This should not happen in NoGarbage.");
        } catch (Exception e) {
            System.err.println("An exception occurred: " + e.getMessage());
        }
    }
}

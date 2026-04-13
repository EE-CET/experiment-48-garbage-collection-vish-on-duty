public class GarbageCollection {
    
    @Override
    protected void finalize() {
        System.out.println("Garbage Collected");
    }

    public static void main(String[] args) {
        GarbageCollection obj = new GarbageCollection();
        obj = null;
        System.gc();
        // Adding a small delay or suggesting the JVM to run finalizers
        System.runFinalization();
    }
}

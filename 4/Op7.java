package Op7;

class Resource {
    private String id;

    public Resource(String id) {
        this.id = id;
        System.out.println("Resource " + id + " created.");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Resource " + id + " finalized (destroyed).");
        super.finalize();
    }
}

public class Op7 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();

        Resource r1 = new Resource(s1);
        Resource r2 = new Resource(s2);
        Resource r3 = new Resource(s3);

        r1 = null;
        r2 = null;
        r3 = null;

        System.gc();
        try { Thread.sleep(1000); } catch (Exception e) {}

        System.gc();
        try { Thread.sleep(1000); } catch (Exception e) {}

        sc.close();
    }
}

public class PCFixed {
    public static void main(String[] args) {
        Q q = new Q();
        Producer p = new Producer(q);
        Producer c = new Producer(q);

        p.t.start();
        c.t.start();

        System.out.println("Press control-C to stop.");
    }
}

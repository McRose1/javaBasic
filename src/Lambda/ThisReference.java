package Lambda;

public class ThisReference {

    public void doProcess(int i, Process p) {
        p.process(i);
    }

    public void execute() {
        // this ==
        doProcess(10, i -> {
            System.out.println("Value of i is " + i);
            System.out.println(this);  // This will work
        });
    }

    public static void main(String[] args) {

        ThisReference thisReference = new ThisReference();

        thisReference.execute();
        /*
        thisReference.doProcess(10, i -> {
            System.out.println("Value of i is " + i);
            // System.out.println(this);  This will not work
        });

        /*new Process() {
            @Override
            public void process(int i) {
                System.out.println("Value of i is " + i);
                System.out.println(this);
            }

            public String toString() {
                return "This is the anonymous inner class";
            }
        });

                 */
    }

    public String toString() {
        return "This is the the main ThisReference class";
    }
}

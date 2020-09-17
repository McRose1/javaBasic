package Lambda;

public class Pass {

    public static void greet(Greeting greeting) {
        greeting.perform();
    }

    public static void main(String[] args) {

        // creates a new class
        Greeting helloWorldGreeting = new HelloWorldGreeting();
        // creates a new function
        Greeting lambdaGreeting = () -> System.out.println("Hello World from Lambda!");

        Greeting innerClassGreeting = new Greeting() {
            @Override
            public void perform() {
                System.out.println("Hello World from Inner Class!");
            }
        };

        helloWorldGreeting.perform();
        lambdaGreeting.perform();
        innerClassGreeting.perform();

        Pass.greet(() -> System.out.println("Hello World from Lambda!"));
        Pass.greet(innerClassGreeting);

        // MyAdd addFunc = (int a, int b) -> a + b;
    }
}

/*
interface MyLambda {
    void foo();
}

interface MyAdd {
    int add(int x, int y);
}
 */
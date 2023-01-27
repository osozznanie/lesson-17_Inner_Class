package Ex1Minimum_InnerClass;

public class Application {
    public static void main(String[] args) {

        Collection collection = new Collection(new Number[]{});
        Iterator iteratorForward = collection.forward();

        while (iteratorForward.hashNext()) {
            iteratorForward.next();
        }

        System.out.println("-----------");

        Iterator iteratorBackward = collection.backward();


        while (iteratorBackward.hashNext()) {
            iteratorBackward.next();
        }
    }
}

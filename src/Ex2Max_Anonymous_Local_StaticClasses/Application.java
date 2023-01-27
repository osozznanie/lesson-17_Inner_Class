package Ex2Max_Anonymous_Local_StaticClasses;

public class Application {
    public static void main(String[] args) {
        Number[] arr = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};

        Collection collection = new Collection(arr);
        Iterator iteratorAnon = collection.createAnonymousClass();

        while (iteratorAnon.hashNext()){
            iteratorAnon.next();
        }

        Number[] arr2 = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};

        Collection collection2 = new Collection(arr2);
        Iterator iteratorLocal = collection2.myMethod();

        while (iteratorLocal.hashNext()){
            iteratorLocal.next();
        }

        System.out.println("---------");
        Collection collection3 = new Collection();
        Iterator iteratorStatic = Collection.createStaticClass();

        while (iteratorStatic.hashNext()){
            iteratorStatic.next();
        }
    }
}

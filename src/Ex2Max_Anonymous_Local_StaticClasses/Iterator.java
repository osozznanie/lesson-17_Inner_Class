package Ex2Max_Anonymous_Local_StaticClasses;

public interface Iterator {
    boolean hashNext();

    void next();
}

class Collection {
    Number[] arr;
    int num;

    Collection(Number[] arr) {
        this.arr = arr;
    }

    public Collection() {
    }

    public static StaticClass createStaticClass() {
        return new StaticClass();
    }

    public Iterator createAnonymousClass() {

        return new Iterator() {
            @Override
            public boolean hashNext() {
                return num < arr.length;
            }

            @Override
            public void next() {
                if ((num += 3) % 2 == 1) {
                    System.out.println(num);
                }
            }
        };
    }

    Iterator myMethod() {
        System.out.println("----------");
        class localClass implements Iterator {

            @Override
            public boolean hashNext() {
                return num < arr.length;
            }

            @Override
            public void next() {
                if ((num += 5) % 2 == 0) {
                    System.out.println(num - 100);
                }
            }
        }
        return new localClass();
    }

    public static class StaticClass implements Iterator {
        int num;
        Number[] arr = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};

        @Override
        public boolean hashNext() {
            return num < arr.length;
        }

        @Override
        public void next() {
            if ((num += 5) % 2 == 0) {
                System.out.println(num+1);
            }
        }
    }
}



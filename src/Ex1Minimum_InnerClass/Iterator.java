package Ex1Minimum_InnerClass;

public interface Iterator {

    boolean hashNext();

    void next();
}

class Collection {
    Number[] arr;
    private int number;

    Collection(Number[] arr) {
        this.arr = new Number[]{2, 3, 4, 5, 6, 7, 8, 9, 10};
    }

    public Forward forward() {
        return new Forward();
    }

    public Backward backward() {
        return new Backward();
    }

    public class Forward implements Iterator {

        @Override
        public boolean hashNext() {
            return number < arr.length;
        }

        @Override
        public void next() {
            if (number % 2 == 1) {
                arr[number] = 0;
            }
            System.out.println(arr[number++]);
        }
    }

    public class Backward implements Iterator {

        int currentNum = arr.length - 1;

        @Override
        public boolean hashNext() {
            return currentNum > 0;
        }

        @Override
        public void next() {
            System.out.println(arr[currentNum -= 2]);
        }
    }
}




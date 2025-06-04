public class ABB<T extends Comparable<T>> {
    public class No<E extends Comparable<T>> {
        public E value;
        public No<E> left;
        public No<E> right;
        public No(E value) {
            this.value = value;
        }
    }

    public No<T> root;

    public void print() {
        print(this.root);
    }

    private void print(No<T> i) {
        if(i.left != null) print(i.left);
        System.out.println(i.value);
        if(i.right != null) print(i.right);
        
        //if (i != null) {
        //    print(i.left);
        //    System.out.println(i.value);
        //    print(i.right);
        //}
    }

    public void insert(T value) {
        root = insert(root, value);
    }

    private No<T> insert(No<T> i, T value) {
        if (i == null) return new No<>(value);

        if (value.compareTo(i.value) < 0) {
            i.left = insert(i.left, value);
        } else {
            i.right = insert(i.right, value);
        }

        return i;
    }

    public static void main(String[] args) {
        ABB<Integer> a = new ABB<>();
        Integer[] values = new Integer[] {16, 8, 4, 5, 23};

        for (Integer value : values) {
            a.insert(value);
        }

        a.print();
    }
}

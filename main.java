class Cal {

    public int add(int a, int b) {
        int c = a + b;
        return c;
    }

    public int Multiplication(int e, int f) {
        int g = e * f;
        return g;
    }

    public static void main(String args[]) {

        Cal c1 = new Cal();

        int d = c1.add(5, 6);

        System.out.println(d);

        int h = c1.Multiplication(5, 6);

        System.out.println(h);

    }
}

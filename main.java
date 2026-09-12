class Cal {

    public int add(int a, int b) {
        int c = a + b;
        return c;
    }

    public static void main(String args[]) {

        Cal c1 = new Cal();

        int d = c1.add(5, 6);

        System.out.println(d);
    }
}

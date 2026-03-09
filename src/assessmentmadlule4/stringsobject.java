package AssesmentMadule1;

class StringImmutableDemo {
    public static void main(String[] args) {

        String s = "Hello";

        // trying to change the string
        s.concat(" World");

        // original string remains unchanged
        System.out.println("String after concat: " + s);

        // storing the result in new string
        s = s.concat(" World");
        System.out.println("After assigning: " + s);
    }
}

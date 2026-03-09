package AssesmentMadule1;

 class stringbuffer {
    public static void main(String[] args) {

        // String (immutable)
        String s = "Hello";
        s.concat(" World");
        System.out.println("String: " + s);

        // StringBuilder (mutable)
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println("StringBuilder: " + sb);

        // StringBuffer (mutable and thread-safe)
        StringBuffer sf = new StringBuffer("Hello");
        sf.append(" World");
        System.out.println("StringBuffer: " + sf);
    }
}
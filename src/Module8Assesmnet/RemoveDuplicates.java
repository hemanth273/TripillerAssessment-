package Module8;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "programming";
        boolean[] visited = new boolean[256];
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!visited[ch]) {
                visited[ch] = true;
                result = result + ch;
            }
        }
        System.out.println("String after removing duplicates: " + result);
    }
}

public class String06 {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++) {
            // in this a + i is converted into char ;
            char ch = (char) ('a' + i);
            series += ch;

        }
        System.out.println(series);
        // this is not optimal solution because series -> ""
        // then after one iteration series -> "a"
        // then after this series-> "ab"
        // and soon
        // it will occupied lots of memory
        // and time complexity is O(n^2);

        // so what will be solution for storing the char together in string series in
        // one iteration or which will take less time complexity

        // there is a concept call string builder which we will disscuse in next code

    }
}

class countVowel {
    public static int countVowels(char[] CharArr) {
        int count = 0;
        for (char c : CharArr) {

            try {
                if (!(c == 'x' || c == 'X')) {

                    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I'
                            || c == 'O'
                            || c == 'U') {
                        count++;
                    }
                }else{
                    System.out.println("X in the array");
                }
            } catch (Exception ex) {
                System.out.println(ex);
            }

        }
        return count;
    }

    public static void main(String[] args) {
        char[] vowels = { 'r', 's', 't', 'u', 'v', 'x' };
        // calling the method
        int vowelsCount = countVowels(vowels);
        System.out.println(vowelsCount);

    }

}

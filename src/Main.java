
public class Main {


    public static boolean isPalindrome(int number){
      String strNumber = String.valueOf(Math.abs(number));
      return strNumber.equals(new StringBuilder(strNumber).reverse().toString());
    };

    public static boolean isPerfectNumber(int sayi){
        if (sayi <= 0) {
            return false;
        }
        int toplam = 0;
        for(int i = 1; i <= sayi/2  ; i++){
            if(sayi % i == 0){
                toplam += i;
            }
        }
        return toplam == sayi;
    };

    public static String numberToWords(int number) {
        if (number < 0) {
            return "Invalid Value";
        }

        String result = "";
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            temp = temp / 10;

            switch (digit) {
                case 0:
                    result = "Zero " + result;
                    break;
                case 1:
                    result = "One " + result;
                    break;
                case 2:
                    result = "Two " + result;
                    break;
                case 3:
                    result = "Three " + result;
                    break;
                case 4:
                    result = "Four " + result;
                    break;
                case 5:
                    result = "Five " + result;
                    break;
                case 6:
                    result = "Six " + result;
                    break;
                case 7:
                    result = "Seven " + result;
                    break;
                case 8:
                    result = "Eight " + result;
                    break;
                case 9:
                    result = "Nine " + result;
                    break;
            }
        }

        return result;
    }


    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(11212));
        System.out.println(isPalindrome(707));

        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));

        System.out.println(numberToWords(-12));
        System.out.println(numberToWords(1010));
        System.out.println(numberToWords(35741));
    };
}
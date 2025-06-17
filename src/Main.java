
public class Main {
    public static void main(String[] args) {
        String input = "2,a34";

        try {
            int result = multiply(input);

            System.out.println(result);

        }catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            System.out.println("에러!");
        }

    }

    public static int multiply(String input) throws NumberFormatException {
        if(input.length() != 2){
            throw new NumberFormatException("숫자 두개 여야함");
        }
        int inputA = Integer.parseInt(input.substring(0,1));
        int inputB = Integer.parseInt(input.substring(1));

        return inputA * inputB;

    }
}


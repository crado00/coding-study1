
public class Main {
    public static void main(String[] args) {
        String string = "123a";

        try {
            int num = convertToInt(string);
        }catch (NumberFormatException e) {
            System.out.println("숫자 형식 오류");
        }
    }

    public static int convertToInt(String s) throws NumberFormatException{
        return Integer.parseInt(s);
    }
}


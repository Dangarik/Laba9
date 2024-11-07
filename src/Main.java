public class Main {
    public static void main(String[] args) {
        String[] mass1 = {"10101"};
        String[] mass2 = {"111"};
        String[] mass4 = {""};
        String[] mass5 = null;

        printResults1(mass1);
        printResults1(mass2);
        printResults1(mass4);
        printResults1(mass5);
    }

    public static void printResults1(String[] mass) {
        try {
            double sum = sumBinaryStrings(mass);
            System.out.println("Сума елементів: " + sum);
        } catch (IllegalArgumentException | NullPointerException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }

    public static int binaryStringToInt(String s) {
        if (s == null) {
            throw new NullPointerException("Рядок не може бути null.");
        }

        if (s.isEmpty()) {
            throw new IllegalArgumentException("Рядок не може бути порожнім.");
        }

        if (!s.matches("[01]+")) {
            throw new IllegalArgumentException("Рядок повинен містити лише символи '0' та '1'.");
        }

        return Integer.parseInt(s, 2);
    }

    public static double sumBinaryStrings(String[] mass) {
        if (mass == null) {
            throw new NullPointerException("Масив не може бути null.");
        }

        int sum = 0;
        for (String binaryString : mass) {
            int decimalValue = binaryStringToInt(binaryString);
            sum += decimalValue;
        }
        return sum;
    }
}

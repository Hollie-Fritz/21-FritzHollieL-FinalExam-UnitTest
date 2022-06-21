public class StringCalculator {
    public static int add(final String numbers) throws Exception {
        int returnValue = 0;
        String[] numbersArray = numbers.split(",|\n");
        for (String number : numbersArray) {
            if (Integer.parseInt(number) <= -1){
                throw new Exception("negatives not allowed.");
            }
            if (Integer.parseInt(number) >= 1000){
                continue;
            }
            if (!number.trim().isEmpty()) {
                returnValue += Integer.parseInt(number.trim());
            }
        }
        return returnValue;
    }
}

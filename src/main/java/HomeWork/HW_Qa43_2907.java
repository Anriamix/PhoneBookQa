package HomeWork;
import java.security.SecureRandom;
public class HW_Qa43_2907 {


    /**

     * @param length The length of the generated string. Must be a positive integer not greater than 1000.
     * @return A random string of a given length. If length is greater than 1000, returns an empty string.
     * @throws IllegalArgumentException If the length is less than 1 or greater than 1000.
     */

    public String generateRandomString(int length) {
        // Check that the length is not less than 1 and not more than 1000.
        if (length <= 0 || length > 1000) {
            throw new IllegalArgumentException("The length of the string must be between 1 and 1000");
        }


        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder rs = new StringBuilder(length);
        SecureRandom random = new SecureRandom();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            rs.append(characters.charAt(index));
        }

        return rs.toString();
    }
}

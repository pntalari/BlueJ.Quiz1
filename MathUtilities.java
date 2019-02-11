
public class MathUtilities{

    /**
     * Add two number together
     * @param baseValue first number
     * @param valueToAdd number
     * @return the sum of the two numbers
     */
    public Integer add(Integer baseValue, Integer valueToAdd){
        int iSum = baseValue + valueToAdd;
        return iSum;
    }

    /**
     * Add two number together
     * @param baseValue first number
     * @param valueToAdd second number
     * @return the sum of the two numbers
     */
    public Double add(Double baseValue, Double valueToAdd){
        double dSum = baseValue + valueToAdd;
        return dSum;
    }

    /**
     * Get half the value of the number
     * @param number the number given
     * @return the half of the number in double
     */
    public Double half(Integer number) {
        double num = number / 2;
        return num;
    }

    /**
     * Determine if the number is odd
     * @param number the number given
     * @return true if the number is odd, false if it is even
     */
    public Boolean isOdd(Integer number){
        boolean isNum = true;
        if ((number % 2) == 0)
        {
            isNum = false;
        }
        else
        {
            isNum = true;
        }
        return isNum;
    }

    /**
     * Multiply the number by itself
     * @param number the number given
     * @return the result of the number multiply by itself
     */
    public Integer square(Integer number) {
        int mNum = number * number;
        return mNum;
    }

}

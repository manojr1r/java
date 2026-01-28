package AMRself;

public class Comments {

    // ! critical comment
    // * highlight Comment
    // Todo: this is a todo comment
    // ? this is question Comment

    //

     /*
     multi
     line comments
      */

    // and also for documenation
    /**
     * Calculates the total price including tax.
     *
     * @param price base price
     * @param taxRate tax percentage
     * @return total price including tax
     * @throws IllegalArgumentException if price is negative
     * @since 1.0
     */
    public double calculateTotal(double price, double taxRate) {
    if (price<0){throw new IllegalArgumentException();}

        System.out.println("""
                this
                is multi line 'String' @from 15""");
    return price*taxRate;
    }


}

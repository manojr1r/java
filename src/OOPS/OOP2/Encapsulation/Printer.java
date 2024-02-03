package OOPS.OOP2.Encapsulation;

public class Printer {
    private int tonerLevel , pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        //tonerLevel must be greater than -1 but less than or equal to 100.
        // If it does not meet these conditions then it should be initialized to -1.
        if (tonerLevel <= 0 || tonerLevel >= 100 ){
            tonerLevel= -1;
        }
        this.tonerLevel = tonerLevel;
        this.duplex = duplex;
        pagesPrinted = 0;
    }
    public int addToner(int tonerAmount){
        // First off, tonerAmount should be greater than 0 and less than or equal to 100.
        if (tonerAmount > 0 && tonerAmount <= 100) {

            // included to test whether tonerLevel plus tonerAmount is greater than 100.
            if ( this.tonerLevel + tonerAmount > 100) {
                return -1;
            }
            return  tonerLevel += tonerAmount;
        }
        else
            return -1;
    }


    public int printPages(int pages ){
       int pagesToPrint = pages;
        if  (duplex){
            pagesToPrint = pages / 2 + pages % 2;
        }
        pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted(){
        return pagesPrinted;
    }

}

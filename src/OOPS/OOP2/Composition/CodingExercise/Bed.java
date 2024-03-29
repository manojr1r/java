package OOPS.OOP2.Composition.CodingExercise;

public class Bed {
    private String style ;
    private int pillows, height, sheets, quilt;

    public Bed(String style, int pillows, int height, int sheets, int quilt) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;
    }

    public void make(){
        System.out.println("the effect that the bed is being made;");
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public void setPillows(int pillows) {
        this.pillows = pillows;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setSheets(int sheets) {
        this.sheets = sheets;
    }

    public void setQuilt(int quilt) {
        this.quilt = quilt;
    }

}

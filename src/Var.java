public class Var {
    public static void main(String[] args) {
        var a = "Str";
        a = "10";

        var b = 10.0;
        b=6.5;

        var x = 5;
        var y = ++x;// pre increment
        var z = y++;// post increment
        System.out.println("y = "+y);
        System.out.println("z = "+z);
    }
}

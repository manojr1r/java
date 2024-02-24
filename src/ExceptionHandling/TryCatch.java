package ExceptionHandling;

public class TryCatch {
    public static void main(String[] args) {
        try {
            System.out.println(2/0);
            /*
            What difference b/w catch and throwable?
            If you use Throwable in a catch clause, it will not only catch all exceptions; it will also catch all errors.
            */
        }catch (Throwable e){
            System.out.println("found issue in try");
        }
    }
}

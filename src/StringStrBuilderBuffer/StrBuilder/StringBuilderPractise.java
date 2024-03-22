package StringStrBuilderBuffer.StrBuilder;

public class StringBuilderPractise {
    public static void main(String[] args) {
        String helloWorld= " Hello World";
        StringBuilder builder = new StringBuilder("Hello World");
        StringBuilder empty32 = new StringBuilder(32);

        helloWorld.concat(" and Good Bye"); // String Method need to reassign
        builder.append(" and Good Bye");   //StrBuilder Method to add/ join

        System.out.println("length " + builder.length());
        System.out.println("capacity " + builder.capacity());
        System.out.println("capa.32 " + empty32.capacity());

        builder.deleteCharAt(6);
        System.out.println("deleteCharAt(6) " + builder);
        builder.delete(6,10);
        System.out.println("delete(6,10) "+ builder);

        builder.insert(6,"orld");
        System.out.println("insert(6,\"orld\"); = " + builder);

        builder.replace(6,6,"W");
        System.out.println("replace(6,6,\"W\") "+builder);

        builder.setLength(11); // will cut the rest of the part
        System.out.println("SetLength(11)  "+builder);

        builder.reverse();
        System.out.println("reverse()  "+builder);

    }
}

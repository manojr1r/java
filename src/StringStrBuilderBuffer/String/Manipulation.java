package StringStrBuilderBuffer.String;

public class Manipulation {
    public static void main(String[] args) {
         //repeat -- JDK11
        //indent  -- JDK15
        //trim    -- JDK11

        String date =  String.join("/","25","10","1957");    // string has concatenate with + !!
int  yearIndex = date.indexOf("19");        //Inspection method
        String year = date.substring(yearIndex); //overload
        System.out.println(date.substring(3, 5));
        System.out.println(year);


        System.out.println(date.replace('/' , '-')); //overload
        System.out.println(date.replace("2" , "00"));
// Used for regex
        System.out.println(date.replaceFirst("/" , "-")); // regex
        System.out.println(date.replaceFirst("/" , "---"));

            System.out.println("ABc \n".repeat(3));
            System.out.println("-".repeat(15));
//to indent can use '+ve' and '-ve' no.'s
            System.out.println("ABc \n".repeat(3).indent(8));
            System.out.println("-".repeat(15));

            System.out.println(stringBlock().indent(-2));  // just like word will indent multiple lines

// concat
        date = "7";
        date = date.concat("/");
        date = date.concat("2");
        date = date.concat("/");
        date = date.concat("69");
        System.out.println(date);
        date = "7" + "/" + "2" + "/" + "69";
        date = "7".concat("/").concat("2").concat("/").concat("69"); //Style : method chaining
        // Use String Builder for above functionality
        System.out.println(date);
    }
    public static String stringBlock(){
             String str= """
                    no space
                        tab
                      2 spaces used
                                2 tabs
                    no space  \s
                    """;
            return str;
    }

}

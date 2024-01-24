package POJO;

public record StudentRecord(String id, String name, String dateofBirth, String classList) {
    // It will create fields with same name as above
        /* all fields are "private" and "final" declared type "record" */
    /* Will create "constructor"
    * and "getters" (but no special prefix like "get" or "is")
    * can use direct field name like, "s.id()"
    */
    // will create "toString"
// "NoSETTER" as all fields are final

}

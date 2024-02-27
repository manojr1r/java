package RecordPOJO.ImplicitEqual;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<JobHolders> jobHoldersClass = new ArrayList<>();
    static List<JobHolderRecord> jobHoldersRecord = new ArrayList<>();
    public static void main(String[] args) {

        JobHolders amr = new JobHolders("121","mr","19","java");
        JobHolders amrJava = new JobHolders("121","mr","19","java"); //same as amr record
        JobHolders sunny = new JobHolders("121","mr","19","Devops");

        addRecord(amr);
        addRecord(amrJava);// even though same will check object reference but not the values inside
        addRecord(amrJava);
        addRecord(sunny);

        for (JobHolders jobHolder : jobHoldersClass)
        {
            System.out.println("List of records added " +jobHolder.toString());
        }

        System.out.println("\n******** Using Record same Entries\n");

        JobHolderRecord amr1 = new JobHolderRecord("121","mr","19","java");
        JobHolderRecord amrJava1 = new JobHolderRecord("121","mr","19","java"); //same as amr record
        JobHolderRecord sunny1 = new JobHolderRecord("121","mr","19","Devops");

        addRecord(amr1);
        addRecord(amrJava1);
        addRecord(sunny1);

        System.out.println("List of records added "+ jobHoldersRecord);

        System.out.println("\nActual Records "+ amr1 + amrJava1 + sunny1 );

    }

    public static void addRecord(JobHolders object){

        if (!jobHoldersClass.contains(object)) {
            jobHoldersClass.add(object);
        }else{
            System.out.println("adding same OBJECT so will not add");
        }
    }

    public static void addRecord(JobHolderRecord record){

        if (!jobHoldersRecord.contains(record)) {
            jobHoldersRecord.add(record);
        }else System.out.println("adding same VALUES so will not add to list, but will create new record!!");
    }
}

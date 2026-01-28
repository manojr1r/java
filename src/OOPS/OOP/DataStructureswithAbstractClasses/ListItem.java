package OOPS.OOP.DataStructureswithAbstractClasses;

public  abstract class ListItem {
    protected ListItem rightLink;
    protected ListItem leftLink;
    protected Object value;
    public ListItem(Object value){
        this.value = value;
    }
    protected abstract ListItem next();
    abstract ListItem setNext(ListItem item);
    protected abstract ListItem setPrevious(ListItem item);
    protected abstract int compareTo(ListItem item);

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}

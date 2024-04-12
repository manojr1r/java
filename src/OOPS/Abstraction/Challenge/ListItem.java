package OOPS.Abstraction.Challenge;

public abstract class ListItem {
    ListItem rightLink;
    ListItem leftLink;
    Object value;
    public ListItem(Object value){
        this.value = value;
    }
    protected abstract void next();
    protected abstract void setNext();
    protected abstract void setPrevious();
    protected abstract void compareTo();

    public Object getValue(){
        return value;
    }
    public void setValue(Object value){
        this.value = value;
    }

}

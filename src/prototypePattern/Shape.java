package prototypePattern;

public abstract class Shape implements Cloneable {
    private String id;

    public String getType() {
        return type;
    }

    protected String type;

    abstract void draw();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    protected Object clone()  {
        Object clone = null;
        try {
            super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}

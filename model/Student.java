package model;

public class Student extends Updater
{
    private int id;
    private String name;
    public Student()
    {
    }

    public void set(int id, String name)
    {
        this.id=id;
        this.name=name;
        updateViews();
    }
    
    public int getId()
    {
        return id;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String toString()
    {
        return "Student set: id " + id + " name: " + name;
    }
}

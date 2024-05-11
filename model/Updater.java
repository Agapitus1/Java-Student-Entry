package model;
import java.util.*;
public class Updater
{
    protected LinkedList<MyObserver>views = new LinkedList<MyObserver>();
    public Updater()
    {
    }

    public void attach(MyObserver A)
    {
        views.add(A);
    }
    
    public void dettach(MyObserver D)
    {
        views.add(D);
    }
    
    public void updateViews()
    {
        for(MyObserver view : views)
        view.update();
    }
}

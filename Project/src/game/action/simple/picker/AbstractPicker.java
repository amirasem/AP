package game.action.simple.picker;

import ui.command.CommandLineHelper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by jun on 5/19/17.
 * A simple LyAndroid Code.
 */
public class AbstractPicker<Type> {
    private final String title;
    private final ArrayList<Type> items;

    public AbstractPicker(String title, ArrayList<Type> items) {
        this.title = title;
        this.items = items;
    }
    public void print() {
//      for (int i =  0; i < items.size() ; i++) System.out.println(i + "." + items.get(i) + findFrequency(items.get(i)));
        for (int  i = 0 ;i<items.size() ; i++) System.out.println(i + "."  + items.get(i));
    }

    public void backPackPrint() {
        int index = 0;
        for (int  i = 0 ;i<items.size()-1 ;i++)
        {
            if(Repeat(items.get(i)) && items.indexOf(items.get(i+1))!=items.indexOf(items.get(i))){

                System.out.println(index + "." + items.get(i) + findFrequency(items.get(i)));
                index++;
            }

        }
    }
    public void Print(Type t, int index)
    {
        System.out.println(index + "." + t + findFrequency(t));
    }
    public int findFrequency(Type t)
    {
        int frequency = 0 ;
        for (int  i = 0 ;i<items.size();i++)
        {
            if (items.get(i) == t) frequency++;
        }
        return frequency;
    }

    public Type choose() {
        System.out.println(title + ":");
//        backPackPrint();
        print();

        int index = Integer.parseInt(CommandLineHelper.getInstance().next());
        return items.get(index);
    }
    public int findSize()
    {
        int counter = 0;
        for (int i = 0 ;i<items.size()-1 ; i++)
        {
            if (items.get(i)!=items.get(i+1)) counter++;
        }
        return counter;
    }
    public boolean Repeat(Type t)
    {
        return findFrequency(t) > 1;
    }
}

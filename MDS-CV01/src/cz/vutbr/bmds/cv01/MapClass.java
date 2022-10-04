package cz.vutbr.bmds.cv01;

import java.util.HashMap;
import java.util.Map;

public class MapClass
{
    private Map<Integer,String> pole = null;

    public MapClass()
    {
        pole = new HashMap<>();

    }

    public void store(int id, String value) throws ArrayStoreException
    {
        try
        {
            pole.put(id,value);

        }
        catch(ArrayStoreException e)
        {
            System.err.print("Element already exists");
        }
    }

    public String getValue(int id) throws NoSuchFieldException
    {
        if(pole.containsKey(id))
        {
            return pole.get(id);
        }
        else
        {
            throw new NoSuchFieldException("Value already exists");
        }
    }

    public void deleteKey(int id) throws NoSuchFieldException
    {
        if(pole.containsKey(id))
        {
            pole.remove(id);
        }
        else
        {
            throw new NoSuchFieldException("Value does not exist");
        }
    }

    public int getSize()
    {
        return pole.size();
    }

    public void print()
    {
        for (int i: pole.keySet())
        {
            System.out.println("<"+ i +">-><" + pole.get(i) + ">");
        }
    }

}

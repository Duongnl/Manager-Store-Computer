package 1.Manager-Store-Computer;
import java.util.ArrayList;
import java.util.Scanner;
import do_an.phieuxuat;
public class list_phieuxuat {
    ArrayList<phieuxuat> list1;
    public list_phieuxuat()
    {
        this.list1 = new ArrayList<phieuxuat>();
    }
    public list_phieuxuat(ArrayList<phieuxuat> list)
    {
        this.list1 = list;
    }
    // add
    public void add_pn(phieuxuat pn)
    {
        this.list1.add(pn);
    }
    // output
    public void output()
    {
        for( int i =0 ; i < list1.size(); i++)
        {
            System.out.println(list1.get(i));
        }
    }
    //delete
    public boolean delete(phieuxuat pn)
    {
        return this.list1.remove(pn);
    }
}

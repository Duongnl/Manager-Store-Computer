package 1.Manager-Store-Computer;
import java.util.ArrayList;
import java.util.Scanner;

import do_an.phieunhap;
public class list_phieunhap {
    ArrayList<phieunhap> list;
    public list_phieunhap()
    {
        this.list = new ArrayList<phieunhap>();
    }
    public list_phieunhap(ArrayList<phieunhap> list)
    {
        this.list = list;
    }
    // add
    public void add_pn(phieunhap pn)
    {
        this.list.add(pn);
    }
    // output
    public void output()
    {
        for( int i =0 ; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
    }
    //delete
    public boolean delete(phieunhap pn)
    {
        return this.list.remove(pn);
    }
    
 

}

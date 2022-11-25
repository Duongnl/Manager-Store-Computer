import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class List_NSX {
    private ArrayList <NhaSanXuat> ListNSX;

    public List_NSX()
    {
        this.ListNSX=new ArrayList<NhaSanXuat>();
    }
    public List_NSX(ArrayList<NhaSanXuat> ListNSX)
    {
        this.ListNSX=ListNSX;
    }
    public void Them_NSX(String mansx)
    {
        NhaSanXuat Nsx = new NhaSanXuat();
        Nsx.Input(mansx);
        this.ListNSX.add(Nsx);
        Ghifile_NSX();
    }
    public void Xuat_NSX()
    {
        System.out.println("\n----------------------THONG-TIN-NHA-NHA SAN-XUAT----------------------");
        if(ListNSX.size()==0)
        {
            System.out.println("NULL!!");
        }
        else
        {
            System.out.printf("%-20s%-20s%-15s\n","MA NSX", "TEN NSX", "QUOC GIA");
            System.out.println("---------------------------------------------------------------");
            for (int i = 0; i < ListNSX.size(); i++) 
            {
                ListNSX.get(i).Output();
            }
        }
    }
    public void Ghifile_NSX()  
    {
        try {
            File NSX = new File("C:/OOP/BTlaptrinh/DOAN_OOP/NSX.txt");
            if(!NSX.exists()){
                NSX.createNewFile();
            }
            FileWriter fw = new FileWriter(NSX);
            BufferedWriter bw = new BufferedWriter(fw);
            for(int i=0; i<ListNSX.size();i++)
            {
                bw.write(ListNSX.get(i).toString());
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (IOException ioe) {
            System.out.println("Exception occurred : ");
            ioe.printStackTrace();
        }   
    }
    public ArrayList<List_NSX> DocFile_NSX() {
        ArrayList<List_NSX> list = new ArrayList<>();
        try {
            FileReader fr = new FileReader("NSX.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while (true) {
                line = br.readLine(); 
                if (line == null) {
                    break;
                }
                String txt[] = line.split(";");
                String Mansx = txt[0];
                String Tennsx = txt[1];
                String Quocgia = txt[2];
                ListNSX.add(new NhaSanXuat(Mansx,Tennsx,Quocgia));
            }
          fr.close();
          br.close();
        } catch (Exception e) {
        }
        return list;
    }
    public Boolean KiemTraTonTaiNsx(String mansx)
    {
        DocFile_NSX();
        for (int i =0; i< ListNSX.size(); i++)
        {
            if (mansx.equals(ListNSX.get(i).getMaNSX()) == true)
            {
                return true;
            }
        }
        return false; 
    }

//----------------------------------------------------------------------------
    public void NhapMoiNsx (String mansx)
    {
        if (KiemTraTonTaiNsx(mansx)== false)
        {
            System.out.println("Them nha san xuat moi");
            Them_NSX(mansx);
        }
    }

    
}

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class List_NCC{
    private ArrayList <NhaCungCap> ListNCC;

    public List_NCC()
    {
        this.ListNCC=new ArrayList<NhaCungCap>();
    }
    public List_NCC(ArrayList<NhaCungCap> ListNCC)
    {
        this.ListNCC=ListNCC;
    }
    public void Them_NCC(String mancc)
    {
        NhaCungCap Ncc = new NhaCungCap();
        Ncc.Input_NCC(mancc);
        this.ListNCC.add(Ncc);
        Ghifile_NCC();
    }
    public void Xuat_NCC()
    {
        System.out.println("\n----------------------THONG-TIN-NHA-NHA-CUNG-CAP----------------------");
        if(ListNCC.size()==0)
        {
            System.out.println("NULL!!");
        }
        else
        {
            System.out.printf("%-20s%-20s%-15s%-20s\n","MA NCC", "TEN NCC", "DIA CHI", "SDT");
            System.out.println("----------------------------------------------------------------------------------------");
            for (int i = 0; i < ListNCC.size(); i++) 
            {
                ListNCC.get(i).Output_NCC();
            }
        }
    }
    public void Ghifile_NCC()  
    {
        try {
            File NSX = new File("C:/OOP/BTlaptrinh/DOAN_OOP/NCC.txt");
            if(!NSX.exists()){
                NSX.createNewFile();
            }
            FileWriter fw = new FileWriter(NSX);
            BufferedWriter bw = new BufferedWriter(fw);
            for(int i=0; i<ListNCC.size();i++)
            {
                bw.write(ListNCC.get(i).toString());
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (IOException ioe) {
            System.out.println("Exception occurred : ");
            ioe.printStackTrace();
        }   
    }
    public ArrayList<List_NCC> DocFile_NCC() {
        ArrayList<List_NCC> list = new ArrayList<>();
        try {
            FileReader fr = new FileReader("NCC.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while (true) {
                line = br.readLine(); 
                if (line == null) {
                    break;
                }
                String txt[] = line.split(";");
                String Mancc = txt[0];
                String Tenncc = txt[1];
                DiaChi dc = new DiaChi(txt[2],txt[3],txt[4],txt[5]);
                String Sdt = txt[6];
                ListNCC.add(new NhaCungCap(Mancc,Tenncc,dc,Sdt));
            }
          fr.close();
          br.close();
        } catch (Exception e) {
        }
        return list;
    }
    public Boolean KiemTraTonTai(String mancc)
    {
        DocFile_NCC();
        for (int i =0; i< ListNCC.size(); i++)
        {
            if (mancc.equals(ListNCC.get(i).getMaNCC()) == true)
            {
                 return true;
            }
        }
        return false; 
    }

    public void NhapMoiNcc (String mancc)
    {
        if (KiemTraTonTai(mancc)== false)
    {
        System.out.println("Them nha cung cap moi");
        Them_NCC(mancc);
    }
}
}
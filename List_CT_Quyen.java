import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class List_CT_Quyen
{
     Scanner scanner = new Scanner(System.in);

     protected ArrayList<CT_Quyen> List_CT_Quyen;
     KiemTraDauVao ktr = new KiemTraDauVao();

     public List_CT_Quyen() {
        this.List_CT_Quyen = new ArrayList<CT_Quyen>();
    }

    public List_CT_Quyen(ArrayList<CT_Quyen> list_CT_Quyen) {
        this.List_CT_Quyen = list_CT_Quyen;
    }

    public int SoLuongQuyen ()
    {
        return List_CT_Quyen.size();
    }
//---------------------------------------------------------------------
   public void Them_Quyen ()
   {
    CT_Quyen dt_ctquyen = new CT_Quyen();
    dt_ctquyen.NhapThongTinQuyen();
    this.List_CT_Quyen.add(dt_ctquyen);
    GhiFile_List_CT_Quyen();
   }    

   public void XuatList_Quyen ()
   {
    ktr.clearScreen();
    System.out.println("\n-----THONG-TIN-QUYEN-----");
 
    if (List_CT_Quyen.size() == 0)
    {
        System.out.println("Khong co quyen nao!");
       ktr.ChonTiepTuc();
    }
   else 
    {
        System.out.printf("%-16s%-20s\n","MA QUYEN", "TEN QUYEN");
      System.out.println("-------------------------");
      for (int i = 0; i < List_CT_Quyen.size(); i++) {
        
        List_CT_Quyen.get(i).XuatThongTinQuyen();
        }
      ktr.ChonTiepTuc();
    }
   }
//------------------------------------------------------------------
public void GhiFile_List_CT_Quyen() {
    try {
        FileWriter fw = new FileWriter("Data_List_CT_Quyen.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        for (int i = 0; i < List_CT_Quyen.size(); i++) {
            bw.write(List_CT_Quyen.get(i).DinhDangFileQuyen());
            bw.newLine();
        }

        bw.close();
        fw.close();

    } catch (Exception e) {
    }
   }
//------------------------------------------------------------
public ArrayList<List_CT_Quyen> DocFile_List_CT_Quyen() {
    ArrayList<List_CT_Quyen> list = new ArrayList<>();
    try {
        FileReader fr = new FileReader("Data_List_CT_Quyen.txt");
        BufferedReader br = new BufferedReader(fr);
        String line = ""; // doc tung dong
        while (true) {
            line = br.readLine(); // du lieu cua tung dong
            if (line == null) {
                break;
            }
            String txt[] = line.split(";");

            String mq = txt[0];
            String tq = txt[1];
           
            List_CT_Quyen.add(new CT_Quyen(mq, tq));
        }
      fr.close();
      br.close();
    } catch (Exception e) {
    }
    return list;
}
//------------------------------------------------------------
public void Tim_Quyen ()
    {
        
        String qFind = ktr.KiemTraMaQuyen();
        int dem = 0;
        for (int i = 0; i<List_CT_Quyen.size(); i++)
        {
            if ( qFind.equals(List_CT_Quyen.get(i).getMQ())  == true)
            {
                System.out.printf("%-15s%-20s\n","MA QUYEN", "TEN QUYEN");
                List_CT_Quyen.get(i).XuatThongTinQuyen();;
                dem ++;
            }
        }
        if (dem == 0) {System.out.println("Quyen : " + qFind + " ,khong co trong danh sach!");}
    }
//------------------------------------------------------------------
public void Sua_Quyen ()
{
   System.out.print("Nhap ma quyen muon sua : ");
   String qSet = ktr.KiemTraMaQuyen();
   int dem =0;
   for (int i = 0; i<List_CT_Quyen.size(); i++)
     {
         if ( qSet.equals(List_CT_Quyen.get(i).getMQ())  == true) // neu tim thay duoc ma quyen
         {
            System.out.printf("%-15s%-20s\n","MA QUYEN", "TEN QUYEN");
            List_CT_Quyen.get(i).XuatThongTinQuyen();
             dem ++;
             int LuaChon;
             do
             {  System.out.println("1.Doi ma quyen");
                System.out.println("2.Doi ten quyen");
                System.out.println("3.Luu thay doi");
                int x=3;
                LuaChon = ktr.KiemTraLuaChon(x);
         
               if (LuaChon == 1)
               {
                 List_CT_Quyen.get(i).setMQ();      
               }
               else if (LuaChon ==2)
               {
                 List_CT_Quyen.get(i).setTenQuyen();
               }
              

             } while (LuaChon !=3 );
         
             GhiFile_List_CT_Quyen();
         }
     }
     if (dem == 0) {System.out.println("Quyen : " + qSet + " ,khong co trong danh sach!");}
}
//-------------------------------------------------------------------------------------------------------
public void Xoa_Quyen ()
{
 System.out.print("Nhap ma quyen muon xoa : ");
 String qDelete = ktr.KiemTraMaQuyen();
 int dem = 0;
 for (int i = 0; i<List_CT_Quyen.size(); i++)
 {
     if ( qDelete.equals(List_CT_Quyen.get(i).getMQ())  == true)
     {
        System.out.printf("%-15s%-20s\n","MA QUYEN", "TEN QUYEN");
        List_CT_Quyen.get(i).XuatThongTinQuyen();
         dem ++;
         System.out.println("Ban muon xoa quyen " + qDelete + " ?");
         int LuaChon = 0;
         
         System.out.println("1.Xoa");
         System.out.println("2.Khong");
         
         int x= 2;
         LuaChon = ktr.KiemTraLuaChon(x);
     
           if (LuaChon == 1)
           {
             List_CT_Quyen.remove(List_CT_Quyen.get(i));
             System.out.println("Da xoa quyen " + qDelete + " !");
            GhiFile_List_CT_Quyen();
            }
     }                     
 }
 if (dem == 0) {System.out.println("Quyen : " + qDelete + " ,khong co trong danh sach!");}
}
//---------------------------------------------------------------------------------------------------
public void XoaTatCa_Quyen ()   
  {
      System.out.println("Ban co chac muon xoa tat ca quyen ?");
      int LuaChon = 0;
      System.out.println("1.Xoa tat ca");
      System.out.println("2.Khong");
      int x= 2;
      LuaChon = ktr.KiemTraLuaChon(x);
      if (LuaChon == 1)
      {
        List_CT_Quyen.clear();
        System.out.println("Da xoa tat ca quyen !");  
       GhiFile_List_CT_Quyen();
    }
  }
//---------------------------------------------------------------------------------
 public Boolean KiemTraMAQuyenTonTai(String DauVao)
 {
    DocFile_List_CT_Quyen();
    for (int i = 0; i< List_CT_Quyen.size(); i++)
    {
        
        if (DauVao.equals(List_CT_Quyen.get(i).getMQ())  == true)
        {
            return false;
        }
    }
    return true;
 }
//------------------------------------------------------------------------------




}

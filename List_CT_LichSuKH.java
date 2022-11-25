import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;


public class List_CT_LichSuKH extends List_CT_GioHang  {

    protected ArrayList<CT_LichSuKH> List_CT_LSKH;


    public List_CT_LichSuKH() {
        this.List_CT_LSKH = new ArrayList<CT_LichSuKH>();
    }

    //--------------------------------------------------------------


public List_CT_LichSuKH(ArrayList<CT_LichSuKH> list_CT_LSKH) {
        List_CT_LSKH = list_CT_LSKH;
        
    }



public List_CT_LichSuKH(ArrayList<CT_GioHang> list_CT_GH, ArrayList<CT_LichSuKH> list_CT_LSKH) {
        super(list_CT_GH);
        List_CT_LSKH = list_CT_LSKH;
    }



//--------------------------------------------------------------
public void Them_LichSuKH(String sdt, String matb, int sl, String tt, String ma)
{
    CT_LichSuKH ctlskh = new CT_LichSuKH(sdt,matb,sl, tt, ma  );
   this.List_CT_LSKH.add(ctlskh);
   GhiFile_List_CT_LichSuKH();
    
}



    //------------------------------------------------------------------   
    public void GhiFile_List_CT_LichSuKH() {
        try {
            FileWriter fw = new FileWriter("Data_List_CT_LichSuKH.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            for (int i = 0; i < List_CT_LSKH.size(); i++) {
               if (i!=List_CT_LSKH.size() -1) 
              {
                
                bw.write(List_CT_LSKH.get(i).toString());
                bw.newLine();
              }
               else 
               {
                bw.write(List_CT_LSKH.get(i).toString());
               }

            }

            bw.close();
            fw.close();

        } catch (Exception e) {
        }
    }
    
//-------------------------------------------------------
public ArrayList<List_CT_LichSuKH> DocFile_List_CT_LichSuKH() {
    ArrayList<List_CT_LichSuKH> list = new ArrayList<>();
    try {
        FileReader fr = new FileReader("Data_List_CT_LichSuKH.txt");
        BufferedReader br = new BufferedReader(fr);
        String line = ""; // doc tung dong
        while (true) {
            line = br.readLine(); // du lieu cua tung dong
            if (line == null) {
                break;
            }
            String txt[] = line.split(";");

            String tk = txt[0];
            String tb = txt[1];
            String sl = txt[2];
            int solg = Integer.parseInt (sl);
            String tt = txt [3];
            String m = txt [4];

            List_CT_LSKH.add(new CT_LichSuKH(tk, tb, solg, tt, m));
        }
      fr.close();
      br.close();
    } catch (Exception e) {
    }
    return list;
} 

//----------------------------------------------------------
void Xuat_ListLichSuKH (String tk)
{
   
    int dem=0;
        System.out.println("\n-------------------------THONG-TIN-GIO-HANG-------------------------");
        System.out.printf("%-20s%-20s%-20s%-20s\n","MA TB","SO LUONG", "TRANG THAI", "MA");
        System.out.println("--------------------------------------------------------------------");
            
            for (int i = 0; i < List_CT_LSKH.size(); i++) 
            {
               if (tk.equals(List_CT_LSKH.get(i).TaiKhoan) == true) 
               {
                dem ++;
                List_CT_LSKH.get(i).XuatGioHang();
                
               }
           
            }
           
            if (dem == 0)
               {
                System.out.println("Gio hang rong !");
               } 
   
}
//-----------------------------------------------------------------------
  public void Tim_KiemLichSuKH (String ma)
  {
    ktr.clearScreen();
    DocFile_List_CT_LichSuKH();
    System.out.println("\n-------------------------THONG-TIN-DON-HANG-------------------------");
    System.out.printf("%-20s%-20s%-20s%-20s\n","MA TB","SO LUONG", "TRANG THAI", "MA");
    System.out.println("--------------------------------------------------------------------");
    for (int i = 0; i< List_CT_LSKH.size(); i++)
    {
        if ( ma.equals(List_CT_LSKH.get(i).Ma)  == true)
        {
           
            List_CT_LSKH.get(i).XuatGioHang();
        }
    }
  }
//-------------------------------------------
public void DoiTrangThai (String ma, String tt)
{
   DocFile_List_CT_LichSuKH();
    for (int i = 0; i< List_CT_LSKH.size(); i++)
    {
        if ( ma.equals(List_CT_LSKH.get(i).Ma)  == true)
        {
           List_CT_LSKH.get(i).TrangThai = tt;
           
        }
    }
    GhiFile_List_CT_LichSuKH();  
}


}

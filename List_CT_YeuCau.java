import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class List_CT_YeuCau 
{
    protected ArrayList<CT_YeuCau> List_CT_YeuCau;
    KiemTraDauVao ktr = new KiemTraDauVao();
    Scanner scanner = new Scanner(System.in);
   
    public List_CT_YeuCau() {
        this.List_CT_YeuCau = new ArrayList<CT_YeuCau>();
    }

    public List_CT_YeuCau(ArrayList<CT_YeuCau> list_CT_SDTCXN) {
     
        this.List_CT_YeuCau = list_CT_SDTCXN;
    }
//----------------------------------------------------------------------
public void Them_YeuCau(String sdtyc, String mayc, String trangthaiyc, String nvpt)
{
    CT_YeuCau ctyc = new CT_YeuCau(sdtyc,mayc,trangthaiyc, nvpt );
   this.List_CT_YeuCau.add(ctyc);
   GhiFile_List_CT_YeuCau();
    
}
//---------------------------------------------------------------------
public void Xuat_ListYeuCau ()
{
    int dem=0;
        System.out.println("\n-------------------------------YEU-CAU------------------------------");
        
        
        System.out.printf("%-20s%-20s%-20s%-20s\n","SDT", "MA", "TRANG THAI", "MANV PHU TRACH");
        System.out.println("--------------------------------------------------------------------------");
           
            
            for (int i = 0; i < List_CT_YeuCau.size(); i++) 
            {
                dem ++;
                List_CT_YeuCau.get(i).Xuat_YeuCau();
            }
           
            if (dem == 0)
               {
                System.out.println("Khong co don hang nao dang cho duyet !");
               } 


}
//-------------------------------------------------------------------------
public void GhiFile_List_CT_YeuCau() {
    try {
        FileWriter fw = new FileWriter("Data_List_CT_YeuCau.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        for (int i = 0; i < List_CT_YeuCau.size(); i++) {
           if (i!=List_CT_YeuCau.size() -1) 
          {
            
            bw.write(List_CT_YeuCau.get(i).DinhDangFileYeuCau());
            bw.newLine();
          }
           else 
           {
            bw.write(List_CT_YeuCau.get(i).DinhDangFileYeuCau());
           }

        }

        bw.close();
        fw.close();

    } catch (Exception e) {
    }
}
//-------------------------------------------------------------------------
  
public ArrayList<List_CT_YeuCau> DocFile_List_CT_YeuCau() {
    ArrayList<List_CT_YeuCau> list = new ArrayList<>();
    try {
        FileReader fr = new FileReader("Data_List_CT_YeuCau.txt");
        BufferedReader br = new BufferedReader(fr);
        String line = ""; // doc tung dong
        while (true) {
            line = br.readLine(); // du lieu cua tung dong
            if (line == null) {
                break;
            }
            String txt[] = line.split(";");

            String sdt = txt[0];
            String ma = txt[1];
            String tt = txt[2];
            String nvpt = txt[3];
            List_CT_YeuCau.add(new CT_YeuCau(sdt, ma, tt, nvpt));
        }
      fr.close();
      br.close();
    } catch (Exception e) {
    }
    return list;
} 

//-----------------------------------------------------------------------------------------------
public void Tim_KiemYeuCau (String mnv)
{
   
    System.out.print("Nhap ma : ");
    String ma = scanner.nextLine();
    int dem = 0;
           
    for (int i = 0; i<List_CT_YeuCau.size(); i++)
    {
        if ( ma.equals(List_CT_YeuCau.get(i).getMaYC())  == true)
        {
           
            List_CT_LichSuKH lskh = new List_CT_LichSuKH();
            lskh.Tim_KiemLichSuKH(ma);
           dem ++;
           int c;
          if (List_CT_YeuCau.get(i).getTrangThaiYC().equals("Cho duyet") == true)
        {   
           do 
           {
             System.out.println("1.Xac nhan ban");
             System.out.println("2.Huy don");
             System.out.println("3.Thoat");
             int x1 = 3;
              c= ktr.KiemTraLuaChon(x1);
             if (c == 1)
             {
               ktr.clearScreen();
                List_CT_YeuCau.get(i).TrangThaiYC = "Da duyet";
               List_CT_YeuCau.get(i).MaNVPhuTrach  = mnv;
               GhiFile_List_CT_YeuCau();
               List_CT_LichSuKH lskh1 = new List_CT_LichSuKH();
               lskh1.DoiTrangThai(ma, "Da mua");
               System.out.println("Ban thanh cong !");
               ktr.ChonTiepTuc();
             }
             else if (c == 2)
             {
                ktr.clearScreen();
                List_CT_YeuCau.get(i).TrangThaiYC = "Da huy";
                List_CT_YeuCau.get(i).MaNVPhuTrach  = mnv;
                GhiFile_List_CT_YeuCau();
                List_CT_LichSuKH lskh2 = new List_CT_LichSuKH();
                lskh2.DoiTrangThai(ma, "Bi huy");
                System.out.println("Da huy don hang !");
                ktr.ChonTiepTuc();
             }

            else if (c == 3)
            {
                ktr.clearScreen();
            }

           } while (c != 3 && c!=1 && c!= 2);
        }
        else 
        {
            System.out.println("Don hang da duoc xu ly !");
            ktr.ChonTiepTuc();
        }  
        }
    }
    if (dem == 0) {System.out.println("Ma yeu cau : " + ma + " ,khong co trong danh sach !"); ktr.ChonTiepTuc(); }
}





}

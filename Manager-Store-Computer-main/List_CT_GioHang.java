import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
public class List_CT_GioHang 
{
    protected ArrayList<CT_GioHang> List_CT_GH;
    KiemTraDauVao ktr = new KiemTraDauVao();
    Scanner scanner = new Scanner(System.in);
    RandomMa rd = new RandomMa();

    public List_CT_GioHang() {
        this.List_CT_GH = new ArrayList<CT_GioHang>();
    }

    public List_CT_GioHang(ArrayList<CT_GioHang> list_CT_GH) {
        this.List_CT_GH = list_CT_GH;
    }
    
    //-------------------------------------------------------------------------
   
    public void Them_GioHang(String tk)
    {
       int d=0;
        CT_GioHang ctgh = new CT_GioHang();
        ctgh.NhapGioHang(tk);        
        
        for (int i = 0; i<List_CT_GH.size(); i++)
        {
           if (ctgh.getTaiKhoan().equals(List_CT_GH.get(i).TaiKhoan) == true && ctgh.getMaTB().equals(List_CT_GH.get(i).MaTB) == true )
           {
            List_CT_GH.get(i).SoLuong += ctgh.getSoLuong();
            d++;   
            GhiFile_List_CT_GioHang();  
        }
           
        }
      
        if (d ==0)
       {
        this.List_CT_GH.add(ctgh);
        GhiFile_List_CT_GioHang();
       }
       
    }

    //---------------------------------------------------------
    public void XuatList_GioHang (String tk)
    {
        int dem=0;
        System.out.println("\n-------------------------THONG-TIN-GIO-HANG-------------------------");
        System.out.printf("%-20s%-20s%-20s%-20s\n","MA TB","SO LUONG", "TRANG THAI", "MA");
        System.out.println("--------------------------------------------------------------------");
            
            for (int i = 0; i < List_CT_GH.size(); i++) 
            {
               if (tk.equals(List_CT_GH.get(i).TaiKhoan) == true) 
               {
                dem ++;
                List_CT_GH.get(i).XuatGioHang();
                
               }
           
            }
           
            if (dem == 0)
               {
                System.out.println("Gio hang rong !");
               } 
           
    }
    //-----------------------------------------------------------------------------
    
    public void GhiFile_List_CT_GioHang() {
        try {
            FileWriter fw = new FileWriter("Data_List_CT_GioHang.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            for (int i = 0; i < List_CT_GH.size(); i++) {
               if (i!=List_CT_GH.size() -1) 
              {
                
                bw.write(List_CT_GH.get(i).toString());
                bw.newLine();
              }
               else 
               {
                bw.write(List_CT_GH.get(i).toString());
               }

            }

            bw.close();
            fw.close();

        } catch (Exception e) {
        }
    }
//--------------------------------------------------------------------------
public ArrayList<List_CT_GioHang> DocFile_List_CT_GioHang() {
    ArrayList<List_CT_GioHang> list = new ArrayList<>();
    try {
        FileReader fr = new FileReader("Data_List_CT_GioHang.txt");
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

            List_CT_GH.add(new CT_GioHang(tk, tb, solg, tt, m));
        }
      fr.close();
      br.close();
    } catch (Exception e) {
    }
    return list;
} 
//------------------------------------------------------------------------------

public void Tim_GioHang (String tk)
{
    System.out.print("Nhap ten SP : ");
    String ghFind = scanner.nextLine();
    int dem = 0;
           
    for (int i = 0; i<List_CT_GH.size(); i++)
    {
        if ( ghFind.equals(List_CT_GH.get(i).getMaTB())  == true && tk.equals(List_CT_GH.get(i).TaiKhoan) == true )
        {
            ktr.clearScreen();
            System.out.println("\n-------------------------THONG-TIN-GIO-HANG-------------------------");
            System.out.printf("%-20s%-20s%-20s%-20s\n","MA TB","SO LUONG", "TRANG THAI", "MA");
            System.out.println("--------------------------------------------------------------------");
            List_CT_GH.get(i).XuatGioHang();
            dem ++;
            ktr.ChonTiepTuc();
        }
    }
    if (dem == 0) {System.out.println("San pham : " + ghFind + " ,khong co trong gio hang!"); ktr.ChonTiepTuc(); }
}

//-----------------------------------------------------------------------------

public void Sua_GioHang (String tk)
{
    System.out.print("Nhap ten SP : ");
    String ghSet = scanner.nextLine();
   int dem = 0;
  
for (int i = 0; i<List_CT_GH.size(); i++)
{
if ( ghSet.equals(List_CT_GH.get(i).getMaTB())  == true && tk.equals(List_CT_GH.get(i).TaiKhoan) == true )
{
    System.out.println("\n-------------------------THONG-TIN-GIO-HANG-------------------------");
    System.out.printf("%-20s%-20s%-20s%-20s\n","MA TB","SO LUONG", "TRANG THAI", "MA");
    System.out.println("--------------------------------------------------------------------");
    List_CT_GH.get(i).XuatGioHang();
    List_CT_GH.get(i).setSoLuong();
    dem ++;
    GhiFile_List_CT_GioHang();
    ktr.clearScreen();
    System.out.println("Doi so luong thanh cong !");
    ktr.ChonTiepTuc();
}
}
if (dem == 0) {System.out.println("Thiet bi : " + ghSet + " ,khong co trong gio hang!"); ktr.ChonTiepTuc(); }
}
//-----------------------------------------------------------------------------------------
public void Xoa_GioHang(String tk) 
{
    System.out.print("Nhap ten SP : ");
    String ghDelete = scanner.nextLine();
    int dem =0;
            
    for (int i = 0; i<List_CT_GH.size(); i++)
    {
        if ( ghDelete.equals(List_CT_GH.get(i).getMaTB())  == true && tk.equals(List_CT_GH.get(i).TaiKhoan) == true )
        {
            System.out.println("\n-------------------------THONG-TIN-GIO-HANG-------------------------");
            System.out.printf("%-20s%-20s%-20s%-20s\n","MA TB","SO LUONG", "TRANG THAI", "MA");
            System.out.println("--------------------------------------------------------------------");
            List_CT_GH.get(i).XuatGioHang();
            dem ++;
            System.out.println("Ban muon xoa " + ghDelete + " ?");
            int LuaChon = 0;
            System.out.println("1.Xoa");
            System.out.println("2.Khong");
            
            int x= 2;
            LuaChon = ktr.KiemTraLuaChon(x);
        
              if (LuaChon == 1)
              {
                ktr.clearScreen();
                List_CT_GH.remove(List_CT_GH.get(i));
                System.out.println("Da xoa tai khoan " + ghDelete + " !");
               GhiFile_List_CT_GioHang();
               ktr.ChonTiepTuc();
              }
            else if (LuaChon == 2)
            {
              ktr.clearScreen();
            }

          
        }
    }
    if (dem == 0) {System.out.println("Thiet bi : " + ghDelete + " ,khong co trong gio hang!"); ktr.ChonTiepTuc();}   
}
//-------------------------------------------------------------------------------------
    public void XoaTatCa_GioHang(String tk)
    {
        System.out.println("Ban co chac muon xoa tat ca thiet bị trong gio hang ?");
        int LuaChon = 0;
        System.out.println("1.Xoa tat ca");
        System.out.println("2.Khong");
        int x= 2;
        LuaChon = ktr.KiemTraLuaChon(x);
        if (LuaChon == 1)
        { 
            int n =  List_CT_GH.size();
            
            for (int k = 0; k<n; k++)
          {
               if (tk.equals(List_CT_GH.get(k).TaiKhoan) == true)
               {
                 List_CT_GH.remove(List_CT_GH.get(k));
                 k--;
                 n--;
                
            }
          }
          GhiFile_List_CT_GioHang();
          ktr.clearScreen();
          System.out.println("Da xoa tat ca SP trong gio hang !");
          ktr.ChonTiepTuc();
        }
        else if (LuaChon == 2)
        {
          ktr.clearScreen();
        }

       
    } 

//-----------------------------------------------------------------------------------
 public void Mua (String tk)
 {
  
  List_CT_YeuCau lyc = new List_CT_YeuCau();
   lyc.DocFile_List_CT_YeuCau();
   List_CT_LichSuKH lskh = new List_CT_LichSuKH();
   lskh.DocFile_List_CT_LichSuKH();
    int n = 8;
    String r;
    r = rd.RandomChuSo(n);
    
   if (List_CT_GH.size() != 0) 
{
    for (int i = 0; i<List_CT_GH.size(); i++)
   {
    if (tk.equals(List_CT_GH.get(i).getTaiKhoan()) == true)
    {
     List_CT_GH.get(i).TrangThai = "Cho duyet";
     List_CT_GH.get(i).Ma = r;
     
     lskh.Them_LichSuKH(List_CT_GH.get(i).getTaiKhoan(), List_CT_GH.get(i).getMaTB(), List_CT_GH.get(i).getSoLuong(), List_CT_GH.get(i).getTrangThai() ,List_CT_GH.get(i).getMa());
    }
  }
   
  lyc.Them_YeuCau(tk, r, "Cho duyet", "Chua co");

  XuatList_GioHang(tk);

  int h =  List_CT_GH.size();        
  for (int k = 0; k<h; k++)
{
     if (tk.equals(List_CT_GH.get(k).TaiKhoan) == true)
     {
       List_CT_GH.remove(List_CT_GH.get(k));
       k--;
       h--;
      
  }
}
  GhiFile_List_CT_GioHang();
 System.out.println("Da gui yeu cau mua thanh cong !");
}

else 
{
  XuatList_GioHang(tk);
  System.out.println("Khong the gui yeu cau vi gio hang rong !");
}

 }












}

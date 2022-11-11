import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class List_CT_TaiKhoan {
    Scanner scanner = new Scanner(System.in);

    protected ArrayList<CT_TaiKhoan> List_CT_TK;
    KiemTraDauVao ktr = new KiemTraDauVao();

    public List_CT_TaiKhoan() {
        this.List_CT_TK = new ArrayList<CT_TaiKhoan>();
    }

    public List_CT_TaiKhoan(ArrayList<CT_TaiKhoan> list_CT_TK) {
        this.List_CT_TK = list_CT_TK;
    }

    public int SoLuongTK ()
    {
        return List_CT_TK.size();
    }


    // --------------------------------------------------------------------------
    
    public void Them_TaiKhoan() {
        CT_TaiKhoan dt_cttk = new CT_TaiKhoan();
        dt_cttk.NhapThongTinTaiKhoan();
        
         System.out.println("Ban muon them tai khoan ?");
         
         System.out.println("---------------------------------------------------------------");
         System.out.printf("%-20s%-20s%-15s%-10s\n","TAI KHOAN", "MAT KHAU", "TINH TRANG", "MA QUYEN");
         System.out.println("---------------------------------------------------------------");
         dt_cttk.XuatThongTinTaiKhoan();
       
         System.out.println("1.Them");
        System.out.println("2.Khong");
        int x= 2;
        int LuaChon = ktr.KiemTraLuaChon(x);
       if (LuaChon == 1) 
       {
        this.List_CT_TK.add(dt_cttk);
        GhiFile_List_CT_TaiKhoan();
       ktr.clearScreen();
        System.out.println("Them thanh cong !");
       ktr.ChonTiepTuc();   
       }
       else if (LuaChon == 2)
       {
        ktr.clearScreen();
       }
       
    
    }

    public void XuatList_TaiKhoan() {
        System.out.println("\n----------------------THONG-TIN-TAI-KHOAN----------------------");
        if (List_CT_TK.size() == 0)
        {
            System.out.println("Khong co tai khoan nao");
           ktr.ChonTiepTuc();
        }
        else 
        {
            System.out.printf("%-20s%-20s%-15s%-10s\n","TAI KHOAN", "MAT KHAU", "TINH TRANG", "MA QUYEN");
            System.out.println("---------------------------------------------------------------");
            for (int i = 0; i < List_CT_TK.size(); i++) {
            List_CT_TK.get(i).XuatThongTinTaiKhoan();
           
            }
            ktr.ChonTiepTuc();
        }
        
    
    }

    // ------------------------------------------------------------------------
    public void GhiFile_List_CT_TaiKhoan() {
        try {
            FileWriter fw = new FileWriter("Data_List_CT_TaiKhoan.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            for (int i = 0; i < List_CT_TK.size(); i++) {
               if (i!=List_CT_TK.size() -1) 
              {
               bw.write(List_CT_TK.get(i).DinhDangFile());
                bw.newLine();
              }
               else 
               {
                bw.write(List_CT_TK.get(i).DinhDangFile());
               }

            }

            bw.close();
            fw.close();

        } catch (Exception e) {
        }
    }

    // -----------------------------------------------------------------------
    public ArrayList<List_CT_TaiKhoan> DocFile_List_CT_TaiKhoan() {
        ArrayList<List_CT_TaiKhoan> list = new ArrayList<>();
        try {
            FileReader fr = new FileReader("Data_List_CT_TaiKhoan.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = ""; // doc tung dong
            while (true) {
                line = br.readLine(); // du lieu cua tung dong
                if (line == null) {
                    break;
                }
                String txt[] = line.split(";");

                String tk = txt[0];
                String mk = txt[1];
                String tt = txt[2];
                String mq = txt[3];

                List_CT_TK.add(new CT_TaiKhoan(tk, mk, tt, mq));
            }
          fr.close();
          br.close();
        } catch (Exception e) {
        }
        return list;
    }
    // -----------------------------------------------------------------------------
    public void Tim_TaiKhoan ()
    {
        
        String tkFind = ktr.KiemTraDangNhapTK();
        int dem = 0;
        for (int i = 0; i<List_CT_TK.size(); i++)
        {
            if ( tkFind.equals(List_CT_TK.get(i).getTaiKhoan())  == true)
            {
                ktr.clearScreen();
                System.out.println("\n----------------------THONG-TIN-TAI-KHOAN----------------------");
                System.out.printf("%-20s%-20s%-15s%-10s\n","TAI KHOAN", "MAT KHAU", "TINH TRANG", "MA QUYEN");
                System.out.println("---------------------------------------------------------------"); 
                List_CT_TK.get(i).XuatThongTinTaiKhoan();
                dem ++;
                ktr.ChonTiepTuc();
            }
        }
        if (dem == 0) {System.out.println("Tai khoan : " + tkFind + " ,khong co trong danh sach!");  ktr.ChonTiepTuc();}
       
    }
   //------------------------------------------------------------------------------------------------
   public void Sua_TaiKhoan ()
   {
      
      String tkSet = ktr.KiemTraDangNhapTK();
      int dem =0;
      for (int i = 0; i<List_CT_TK.size(); i++)
        {
            if ( tkSet.equals(List_CT_TK.get(i).getTaiKhoan())  == true)
            {
               
                String tk =   List_CT_TK.get(i).getTaiKhoan();
                String mk =   List_CT_TK.get(i).getMatKhau();
                String tt =   List_CT_TK.get(i).getTinhTrang();
                String mq =   List_CT_TK.get(i).getMaQuyen();
                dem ++;
                int LuaChon;
                do
                {  
                  ktr.clearScreen();
                  
                  System.out.println("\n----------------------THONG-TIN-TAI-KHOAN----------------------");
                  System.out.printf("%-20s%-20s%-15s%-10s\n","TAI KHOAN", "MAT KHAU", "TINH TRANG", "MA QUYEN");
                  System.out.println("---------------------------------------------------------------");
                  System.out.printf("%-20s%-20s%-15s%-10s\n",tk, mk, tt, mq); 
                  System.out.println("---------------------------------------------------------------");
                  System.out.println("1.Doi tai khoan");
                   System.out.println("2.Doi mat khau");
                   System.out.println("3.Doi tinh trang ");
                   System.out.println("4.Doi ma quyen");
                   System.out.println("5.Luu thay doi");
                   System.out.println("6.Khong luu thay doi");
                   
                   int x =6;
                   LuaChon = ktr.KiemTraLuaChon(x);
            
                  if (LuaChon == 1)
                  {
                    ktr.clearScreen();
                    tk =   ktr.KiemTraTaiKhoanDK();  
                    ktr.clearScreen();  
                  }
                  else if (LuaChon ==2)
                  {
                    ktr.clearScreen();
                    mk = ktr.KiemTraMatKhauDK();
                    ktr.clearScreen();  
                }
                  else if (LuaChon == 3)
                  {
                    ktr.clearScreen();
                    tt = ktr.KiemTraTinhTrang();
                    ktr.clearScreen();  
                }
                  else if (LuaChon == 4)
                  {
                    ktr.clearScreen();
                    mq = ktr.KiemTraMaQuyen();
                    ktr.clearScreen(); 
                }
                   else if  (LuaChon == 5)
                  {
                    ktr.clearScreen(); 
                    List_CT_TK.get(i).NhapBangDoiSo(tk, mk, tt, mq);
                     GhiFile_List_CT_TaiKhoan();    
                     System.out.println("Da luu thay doi !");
                     ktr.ChonTiepTuc(); 
                   }
                   else if  (LuaChon == 6)
                   {
                    ktr.clearScreen();  
                    System.out.println("Khong luu thay doi !");
                      ktr.ChonTiepTuc(); 
                    } 
                                
                } while (LuaChon !=6 && LuaChon !=5);
                 
            }
        }
        if (dem == 0) {System.out.println("Tai khoan : " + tkSet + " ,khong co trong danh sach!"); ktr.ChonTiepTuc();  }
   }
//--------------------------------------------------------------------------------------------------------
   public void Xoa_TaiKhoan ()
   {
    
    String tkDelete = ktr.KiemTraDangNhapTK();
    int dem = 0;
    ktr.clearScreen();
    for (int i = 0; i<List_CT_TK.size(); i++)
    {
        if ( tkDelete.equals(List_CT_TK.get(i).getTaiKhoan())  == true)
        {
            System.out.println("\n----------------------THONG-TIN-TAI-KHOAN----------------------");
            System.out.printf("%-20s%-20s%-15s%-10s\n","TAI KHOAN", "MAT KHAU", "TINH TRANG", "MA QUYEN");
            System.out.println("---------------------------------------------------------------"); 
            List_CT_TK.get(i).XuatThongTinTaiKhoan();
            dem ++;
            System.out.println("Ban muon xoa tai khoan " + tkDelete + " ?");
            int LuaChon = 0;
            
            System.out.println("1.Xoa");
            System.out.println("2.Khong");
            
            int x= 2;
            LuaChon = ktr.KiemTraLuaChon(x);
        
              if (LuaChon == 1)
              {
                ktr.clearScreen();
                List_CT_TK.remove(List_CT_TK.get(i));
                System.out.println("Da xoa tai khoan " + tkDelete + " !");
               GhiFile_List_CT_TaiKhoan();
               ktr.ChonTiepTuc();   
            }
            else if (LuaChon == 2)
            {
                ktr.clearScreen();
            }
        
         }                     
    }
    
    if (dem == 0) {System.out.println("Tai khoan : " + tkDelete + " ,khong co trong danh sach!");ktr.ChonTiepTuc();}
   }
//-----------------------------------------------------------------------------------------------------------------
  public void XoaTatCa_TaiKhoan ()   
  {
      System.out.println("Ban co chac muon xoa tat ca tai khoan ?");
      int LuaChon = 0;
      System.out.println("1.Xoa tat ca");
      System.out.println("2.Khong");
      int x= 2;
      LuaChon = ktr.KiemTraLuaChon(x);
      if (LuaChon == 1)
      {
        ktr.clearScreen();
        List_CT_TK.clear();
        System.out.println("Da xoa tat ca tai khoan !");  
        GhiFile_List_CT_TaiKhoan();
       ktr.ChonTiepTuc();
      }
      else if (LuaChon == 2)
      {
        ktr.clearScreen();
      }
     
    }
//----------------------------------------------------------------------------------------------------
 public boolean KiemTraTKDK (String DauVao)
 {
    DocFile_List_CT_TaiKhoan();
    for (int i = 0; i< List_CT_TK.size(); i++)
    {
        if (DauVao.equals(List_CT_TK.get(i).getTaiKhoan())  == true)
        {
            return false;
        }
    }
    return true;
 }
//-------------------------------------------------------------------------------------------------
public boolean KiemTraTKDN (String tk, String mk)
 {
    DocFile_List_CT_TaiKhoan();
    for (int i = 0; i< List_CT_TK.size(); i++)
    {
        if (tk.equals(List_CT_TK.get(i).getTaiKhoan())  == true && mk.equals(List_CT_TK.get(i).getMatKhau())  == true )
        {
            return true;
        }
        
    }
    return false;
 }
//----------------------------------------------------------------------------------------------

public int KiemTraQuyen (String tk, String mk)
 {
    DocFile_List_CT_TaiKhoan();
    for (int i = 0; i< List_CT_TK.size(); i++)
    {
        if (tk.equals(List_CT_TK.get(i).getTaiKhoan())  == true && mk.equals(List_CT_TK.get(i).getMatKhau())  == true )
        {
            if (List_CT_TK.get(i).getMaQuyen().equals("MQ1"))
            {
               if (List_CT_TK.get(i).getTinhTrang().equals("Mo"))
               {
                return 1;
               }             
               else 
               {
                ktr.clearScreen();
                System.out.println("Tai khoan cua ban da bi khoa!");
                ktr.ChonTiepTuc();
                return 0;
               }
            }
           else if (List_CT_TK.get(i).getMaQuyen().equals("MQ2"))
            {
                if (List_CT_TK.get(i).getTinhTrang().equals("Mo"))
               {
                return 2;
               }             
               else 
               {
                ktr.clearScreen();
                System.out.println("Tai khoan cua ban da bi khoa!");
                ktr.ChonTiepTuc();
                return 0;
               }
            }
            else if (List_CT_TK.get(i).getMaQuyen().equals("MQ3"))
            {
                if (List_CT_TK.get(i).getTinhTrang().equals("Mo"))
                {
                 return 3;
                }             
                else 
                {
                    ktr.clearScreen();
                    System.out.println("Tai khoan cua ban da bi khoa!");
                 ktr.ChonTiepTuc();
                 return 0;
                }
           }
            else if (List_CT_TK.get(i).getMaQuyen().equals("MQ4"))
            {
                if (List_CT_TK.get(i).getTinhTrang().equals("Mo"))
                {
                 return 4;
                }             
                else 
                {
                    ktr.clearScreen();
                    System.out.println("Tai khoan cua ban da bi khoa!");
                 ktr.ChonTiepTuc();
                 return 0;
                }
            } 
           
            else if (List_CT_TK.get(i).getMaQuyen().equals("MQ5"))
            {
                if (List_CT_TK.get(i).getTinhTrang().equals("Mo"))
                {
                 return 5;
                }             
                else 
                {
                    ktr.clearScreen();
                    System.out.println("Tai khoan cua ban da bi khoa!");
                 ktr.ChonTiepTuc();
                 return 0;
                }
            } 
          


        
        
        }
        
    }
    return 0;
 }
//----------------------------------------------------------------------------------------
public String DoiMK ( String tk ,String mk)
{
    DocFile_List_CT_TaiKhoan();
    for (int i = 0; i< List_CT_TK.size(); i++)
    {
        if (tk.equals(List_CT_TK.get(i).getTaiKhoan())  == true && mk.equals(List_CT_TK.get(i).getMatKhau())  == true )
        {
            List_CT_TK.get(i).setMatKhau();
            GhiFile_List_CT_TaiKhoan();
            return List_CT_TK.get(i).getMatKhau();
        }
        
    }
    return "f";
}

}

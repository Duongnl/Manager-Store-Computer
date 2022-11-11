import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;
public class DangKy {
    protected String TaiKhoanDK;
    protected String MatKhauDK;
    KiemTraDauVao ktr = new KiemTraDauVao();
    Scanner scanner = new Scanner(System.in); 
    
    public DangKy() {
        this.TaiKhoanDK = null;
        this.MatKhauDK = null;
    }

    public DangKy(String taiKhoanDK, String matKhauDK) {
        this.TaiKhoanDK = taiKhoanDK;
        this.MatKhauDK = matKhauDK;
    }
//----------------------------------------------------------------------
    public String getTaiKhoanDK() {
        return TaiKhoanDK;
    }

    public void setTaiKhoanDK() {
        
        TaiKhoanDK = ktr.KiemTraTaiKhoanDK();
    }
//-----------------------------------------------------------------------
    public String getMatKhauDK() {
        return MatKhauDK;
    }

    public void setMatKhauDK() {
        MatKhauDK = ktr.KiemTraMatKhauDK();
    }
//---------------------------------------------------------------------
    public void DangKyTK ()
    {
      System.out.println("\n--DANG-KY-TAI-KHOAN-KHACH-HANG--");
      setTaiKhoanDK();
      setMatKhauDK();
      
      ktr.clearScreen();
      System.out.println("----------------------------");
      System.out.printf("%-20s%-20s\n","TAI KHOAN", "MAT KHAU");
      System.out.println("----------------------------");
      System.out.printf("%-20s%-20s\n",TaiKhoanDK,MatKhauDK);
      System.out.println("----------------------------");
      
      System.out.println("1.Dang ky");
      System.out.println("2.Khong");
      int x= 2;
      int LuaChon = ktr.KiemTraLuaChon(x);
      if (LuaChon == 1)
      {
        ktr.clearScreen();
        System.out.println("Dang ky thanh cong !");        
        GhiDKFile_List_CT_TaiKhoan();
        ktr.ChonTiepTuc();
      }
      else if (LuaChon == 2)
      {
        ktr.clearScreen();
        System.out.println("Dang ky khong thanh cong !");
        ktr.ChonTiepTuc();
      }
    }   
//-------------------------------------------------------------------------------
    public String DinhDangFileDK ()
    {
      return TaiKhoanDK + ";" + MatKhauDK + ";" + "Mo" + ";" + "MQ1";
    }
 //-------------------------------------------------------------------------------    
    public void GhiDKFile_List_CT_TaiKhoan() {
        try {
            FileWriter fw = new FileWriter("Data_List_CT_TaiKhoan.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.newLine();  
            bw.write(DinhDangFileDK()); 
            bw.close();
            fw.close();
        } catch (Exception e) {
        }
    }
//-----------------------------------------------------------------------



}

import java.util.Scanner;
public class DangNhap 
{
    protected String TaiKhoanDN;
    protected String MatKhauDN;
    KiemTraDauVao ktr = new KiemTraDauVao();
    Scanner scanner = new Scanner(System.in);

    public DangNhap() {
        TaiKhoanDN = null;
        MatKhauDN = null;
    }

    public DangNhap(String taiKhoanDN, String matKhauDN) {
        TaiKhoanDN = taiKhoanDN;
        MatKhauDN = matKhauDN;
    }
//-----------------------------------------------------------------------------
    public String getTaiKhoanDN() {
        return TaiKhoanDN;
    }

    public void setTaiKhoanDN() {
        
        TaiKhoanDN = ktr.KiemTraDangNhapTK();
    }
//---------------------------------------------------------------------------
    public String getMatKhauDN() {
        return MatKhauDN;
    }

    public void setMatKhauDN() {
        
        MatKhauDN = ktr.KiemTraMatKhauDK();
    }
//-----------------------------------------------------------------------------------
    public void DangNhapTKMK ()
    {
      setTaiKhoanDN();
      setMatKhauDN();
    }

   public Boolean KiemTraDangNhap (String tk, String mk)
   {
    if ( ktr.KiemTraTaiKhoanDN(TaiKhoanDN, MatKhauDN) == true )
      {      
        return true;
      }
      else 
      {
        ktr.clearScreen();
        System.out.println("TK hoac MK sai!");
        ktr.ChonTiepTuc();
        return false;
      }
   }

//------------------------------------------------------------------------------
       



    
}

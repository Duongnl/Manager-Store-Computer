import java.util.Scanner;

public class CT_TaiKhoan {
    protected String TaiKhoan;
    protected String MatKhau;
    // ThoiGian time = new ThoiGian ();
    protected String TinhTrang;
    protected String MaQuyen;
    Scanner scanner = new Scanner(System.in);
    KiemTraDauVao ktr = new KiemTraDauVao();
   


    public CT_TaiKhoan() {
        this.TaiKhoan = null;
        this.MatKhau = null;
        this.TinhTrang = null;
        this.MaQuyen = null;
    }

    public CT_TaiKhoan(String taiKhoan, String matKhau, String tinhTrang, String maQuyen) {
        this.TaiKhoan = taiKhoan;
        this.MatKhau = matKhau;
        this.TinhTrang = tinhTrang;
        this.MaQuyen = maQuyen;
    }

    // --------------------------------------------------------------------
    public String getTaiKhoan() {
        return TaiKhoan;
    }

    public void setTaiKhoan() {
       
        TaiKhoan =ktr.KiemTraTaiKhoanDuocThem();
    }
 
    
    // --------------------------------------------------------------------
    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau() {
       
        MatKhau = ktr.KiemTraMatKhauDK();
        
    
    }

    // -------------------------------------------------------------------
    public String getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang() {
        
            TinhTrang = ktr.KiemTraTinhTrang();
    }
    // -------------------------------------------------------------------
    public String getMaQuyen() {
        return MaQuyen;
    }

    public void setMaQuyen() {
       
        MaQuyen = ktr.KiemTraMaQuyen();

    }
    //----------------------------------------------------------------------
    
    public void NhapThongTinTaiKhoan() {
        System.out.println("-NHAP-THONG-TIN-TAI-KHOAN-"); 
        setTaiKhoan();
        ktr.clearScreen();
        setMatKhau();
        ktr.clearScreen();
        setTinhTrang();
        ktr.clearScreen();
        setMaQuyen();
        ktr.clearScreen();
    }

    public void XuatThongTinTaiKhoan() {
        System.out.printf("%-20s%-20s%-15s%-10s\n",getTaiKhoan(), getMatKhau(),getTinhTrang(), getMaQuyen());
        System.out.println("---------------------------------------------------------------");
    }
  //-----------------------------------------------------------------------

   public String DinhDangFile ()
   {
       return TaiKhoan + ";" + MatKhau + ";" + TinhTrang + ";" + MaQuyen;     
   }    
   //-------------------------------------------------------------------------
   public void NhapBangDoiSo(String taiKhoan, String matKhau, String tinhTrang, String maQuyen) {
    this.TaiKhoan = taiKhoan;
    this.MatKhau = matKhau;
    this.TinhTrang = tinhTrang;
    this.MaQuyen = maQuyen;
}
  



}
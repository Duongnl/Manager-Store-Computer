import java.util.Scanner;

public class CT_GioHang 
{
   protected String TaiKhoan;
   protected String MaTB;
   protected int SoLuong;
   protected String TrangThai;
   protected String Ma;
   
   
   Scanner scanner =new Scanner(System.in);
   KiemTraDauVao ktr = new KiemTraDauVao();
   
   public CT_GioHang() 
   {
    TaiKhoan =null;
    MaTB = null;
    SoLuong = 0;
    TrangThai = null;
    Ma = null;
}

   public CT_GioHang(String taiKhoan, String maTB, int soLuong, String trangThai, String ma) 
   {
    TaiKhoan = taiKhoan;
    MaTB = maTB;
    SoLuong = soLuong;
    TrangThai = trangThai;
    Ma = ma;

   }
//------------------------------------------------------------
public String getTaiKhoan() {
    return TaiKhoan;
}

public void setTaiKhoan(String taiKhoan) {
    TaiKhoan = taiKhoan;
}
//---------------------------------------------------------
public String getMaTB() {
    return MaTB;
}

public void setMaTB() {
    System.out.print("Nhap ma thiet bi muon mua : ");
    MaTB = scanner.nextLine();
}
//-----------------------------------------------------
public int getSoLuong() {
    return SoLuong;
}

public void setSoLuong() {
    SoLuong = ktr.KiemTraSoLuong();
}
//------------------------------------------------------------

public String getTrangThai() {
    return TrangThai;
}

public void setTrangThai() {
    TrangThai = "Chua mua";
}
//------------------------------------------------------
public String getMa() {
    return Ma;
}

public void setMa() {
    
    Ma = "Chua co" ;
}
//---------------------------------------------------------





public void NhapGioHang(String tk)
{
    TaiKhoan = tk;
    setMaTB();
    setSoLuong();
    setTrangThai();
    setMa();
}

public void XuatGioHang ()
{
    
    System.out.printf("%-20s%-20s%-20s%-20s\n",getMaTB(),getSoLuong(), getTrangThai(), getMa());
    System.out.println("--------------------------------------------------------------------");
}

public void MuaGioHang ()
{
    setTrangThai();
    setMa();
}




@Override
public String toString() {
    return TaiKhoan + ";" + MaTB + ";" + SoLuong + ";" + TrangThai + ";" +Ma;
}


   












}

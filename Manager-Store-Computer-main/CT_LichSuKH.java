public class CT_LichSuKH extends CT_GioHang{

    public CT_LichSuKH() {
    super();
    }

    public CT_LichSuKH(String taiKhoan, String maTB, int soLuong, String trangThai, String ma) {
        super(taiKhoan, maTB, soLuong, trangThai, ma);
    }
    
    @Override
public String toString() {
    return TaiKhoan + ";" + MaTB + ";" + SoLuong + ";" + TrangThai + ";" +Ma;
}

//---------------------------------------------------------------



}

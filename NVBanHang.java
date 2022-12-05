public class NVBanHang extends NhanVien{
    public NVBanHang(){
        super();
    }

    public NVBanHang(String maNV,String hoten,String sdt,ThoiGian ns,DiaChi dc){
        super(maNV, hoten, sdt, ns, dc);
    }


    @Override
    public String toString() {
         return "NVBH" + ";" + maNV+";"+ten+";"+sdt+";"+ns+";"+dc;
    }
}

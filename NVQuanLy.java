
public class NVQuanLy extends NhanVien {
    public NVQuanLy(){
        super();
    }

    public NVQuanLy(String maNV,String hoten,String sdt,ThoiGian ns,DiaChi dc){
        super(maNV, hoten, sdt, ns, dc);
    }
    @Override
    public String toString() {
         return "NVQL" + ";" + maNV+";"+ten+";"+sdt+";"+ns+";"+dc;
    }
    // chinh sua
}
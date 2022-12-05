public class NVQuanKho extends NhanVien{
    public NVQuanKho(){
        super();
    }

    public NVQuanKho(String maNV,String hoten,String sdt,ThoiGian ns,DiaChi dc){
        super(maNV, hoten, sdt, ns, dc);
    }
    
    @Override
    public String toString() {
         return "NVQK" + ";" + maNV+";"+ten+";"+sdt+";"+ns+";"+dc;
    }
}

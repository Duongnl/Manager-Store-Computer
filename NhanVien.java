import java.util.Scanner;

public class NhanVien extends ConNguoi {
    protected String maNV;
    Scanner sc = new Scanner(System.in);
    KiemTraDauVao ktr = new KiemTraDauVao();    
    public static int stt =0;
    public NhanVien(){
        super();
        maNV = null;
        stt++;
        maNV = "NV" + stt;
    }

    public NhanVien(String maNV,String hoten,String sdt,ThoiGian ns,DiaChi dc){
        super(hoten, sdt, ns, dc);
        this.maNV=maNV;
        stt++;
        maNV = "NV" + stt;
    }
//----------------------------------------------------
    public static int getStt() {
        return stt;
    }
    
    public static void setStt(int stt) {
        NhanVien.stt = stt;
    }
//-------------------------------------------------
    public void setMaNV(){
        maNV=ktr.ktraMaNV();
    }

    public String getMaNV(){
        return maNV;
    }
    
    public void input(){
       // setMaNV();
        setHoTen();
        setSDT();
        ns.nhapThoiGian();
        dc.Input_ID();//nhap dia chi
    }
    
    public void output(){
        System.out.printf("|%-6s|%-25s|%-12s|%-12s|%-50s|\n",maNV,this.ten,this.sdt,this.ns,this.dc);
        System.out.println("+------+-------------------------+------------+------------+--------------------------------------------------+");
    }

    @Override
    public String toString() {
         return "NV" + ";" + maNV+";"+ten+";"+sdt+";"+ns+";"+dc;
    }
}

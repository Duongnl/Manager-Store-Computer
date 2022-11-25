import java.util.Scanner;

public abstract class ConNguoi {
    Scanner sc = new Scanner(System.in);
    KiemTraDauVao ktr = new KiemTraDauVao();
    protected String ten,sdt;
    protected DiaChi dc;
    protected ThoiGian ns;

    public ConNguoi(){
        ten=null;
        sdt =null;
        dc = new DiaChi();
        ns = new ThoiGian();
    }

    public ConNguoi(String ten,String sdt,ThoiGian ns,DiaChi dc){
        this.ten = ten;
        this.sdt = sdt;
        this.ns = new ThoiGian(ns);
        this.dc = new DiaChi(dc);
    }

    public void setHoTen(){
        System.out.println("Nhap ho ten: ");
        ten = ktr.ktraHoten();
    }

    public void setSDT(){
        System.out.println("Nhap so dien thoai: ");
        sdt = ktr.ktraSDT();
    }

    public String getHoten(){
        return ten;
    }

    public String getSDT(){
        return sdt;
    }

    public abstract void input();
    public abstract void output();
}

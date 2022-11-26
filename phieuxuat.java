package do_an;
import java.util.Scanner;
public class phieuxuat {
    Scanner ip = new Scanner( System.in);
    String ma_px;
    String ma_nv;
    String ma_kh;
    String date_output;
    int total_money;
    public phieuxuat()
    {
       ma_px=null;
       ma_nv= null;
       ma_kh= null;
       date_output = null;
       total_money = 0; 
    }
    public phieuxuat( String ma_px, String ma_nv, String ma_kh, String date_output, int total_money)
    {
        this.ma_px = ma_px;
        this.ma_nv = ma_nv;
        this.ma_kh = ma_kh;
        this.date_output = date_output;
        this.total_money = total_money;
    }
    public void input()
    {
        System.out.println(" Nhap ma px? ");
        ma_px = ip.nextLine();
        System.out.println(" Nhap ma nv? ");
        ma_nv = ip.nextLine();
        System.out.println(" Nhap ma k h? ");
        ma_kh = ip.nextLine();
        System.out.println(" Nhap ma ngay xuat");
        date_output = ip.nextLine();
        System.out.println(" tong tien  ");
        total_money = ip.nextInt();
    }
    public void output()
    {
        System.out.printf("%-15s%-15s%-15s%-15s%-15s", " ma phieu xuat","Ma nhan vien", "ma khach hanh " , "Ngay xuat " ," Tong tien ");
        System.out.printf("%-15s%-15s%-15s%-15s%-15s",  ma_px, ma_nv, ma_kh, date_output , total_money );
        
    }
    public String getMa_px() {
        return ma_px;
    }
    public void setMa_px(String ma_px) {
        this.ma_px = ma_px;
    }
    public String getMa_nv() {
        return ma_nv;
    }
    public void setMa_nv(String ma_nv) {
        this.ma_nv = ma_nv;
    }
    public String getMa_kh() {
        return ma_kh;
    }
    public void setMa_kh(String ma_kh) {
        this.ma_kh = ma_kh;
    }
    public String getDate_output() {
        return date_output;
    }
    public void setDate_output(String date_output) {
        this.date_output = date_output;
    }
    public int getTotal_money() {
        return total_money;
    }
    public void setTotal_money(int total_money) {
        this.total_money = total_money;
    }
    
}

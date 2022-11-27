package do_an;
import java.util.Scanner;
public class phieunhap  {
    Scanner ip = new Scanner(System.in);
    String ma_pn;
    String ma_nv;
    String ma_nha_cc;
    String date_nhap;
    int total_money;
    public phieunhap()
    {
       ma_pn=null;
       ma_nha_cc= null;
       date_nhap= null;
       total_money = 0; 
    }
    public phieunhap( String ma_pn, String ma_nv, String ma_nha_cc, String date_nhap, int total_money)
    {
        this.ma_pn = ma_pn;
        this.ma_nha_cc = ma_nha_cc;
        this.date_nhap = date_nhap;
        this.total_money = total_money;
    }
    public void input()
    {
        System.out.println(" Nhap ma pn? ");
        ma_pn = ip.nextLine();
        System.out.println(" Nhap ma cung cap? ");
        ma_nha_cc = ip.nextLine();
        System.out.println(" Nhap ma ngay nhap ");
        date_nhap = ip.nextLine();
        System.out.println(" Nhap ma tong tien` ");
        total_money = ip.nextInt();
    }
    public void output()
    {
        System.out.printf("%-15s%-15s%-15s%-15s%-15s", " ma phieu nhap","Ma nhan vien" ,"Ngay cung cap", "Ngay nhap " , " Tong tien");
        System.out.printf("%-15s%-15s%-15s%-15s%-15s",  ma_pn, ma_nv , ma_nha_cc, date_nhap, total_money);
        
    }
    public String getMa_pn() {
        return ma_pn;
    }
    public void setMa_pn(String ma_pn) {
        this.ma_pn = ma_pn;
    }
    public String getMa_nv() {
        return ma_nv;
    }
    public void setMa_nv(String ma_nv) {
        this.ma_nv = ma_nv;
    }
    public String getMa_nha_cc() {
        return ma_nha_cc;
    }
    public void setMa_nha_cc(String ma_nha_cc) {
        this.ma_nha_cc = ma_nha_cc;
    }
    public String getDate_nhap() {
        return date_nhap;
    }
    public void setDate_nhap(String date_nhap) {
        this.date_nhap = date_nhap;
    }
    public int getTotal_money() {
        return total_money;
    }
    public void setTotal_money(int total_money) {
        this.total_money = total_money;
    }
    
    // chinh sua chinh sua
    //asdasd
    
}

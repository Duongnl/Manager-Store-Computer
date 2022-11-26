package do_an;
import java.util.Scanner;
public class ct_phieunhap extends phieunhap {
    Scanner ip = new Scanner( System.in);
    String ma_tb;
    int soluong;
    public ct_phieunhap()
    {
    super();
       ma_tb= null;
       soluong = 0; 
    }
    public ct_phieunhap( String ma_pn, String ma_tb, int soluong)
    {
        super(ma_pn);
        this.ma_tb = ma_tb;
        this.soluong = soluong;
    }
    public void input()
    {
        super.input();
        System.out.println(" Nhap ma tb");
        ma_tb = ip.nextLine();
        System.out.println(" so luong ");
        soluong = ip.nextInt();
     
    }
    public void output()
    {
        super.output();
        System.out.printf("%-15s%-15s%-15s", " ma phieu nhap","Ma thiet bi" , " so luong");
        System.out.printf("%-15s%-15s%-15s",  ma_pn, ma_tb , soluong);
        
    }
    public String getMa_pn() {
        return ma_pn;
    }
    public void setMa_pn(String ma_pn) {
        this.ma_pn = ma_pn;
    }
    public String getMa_tb() {
        return ma_tb;
    }
    public void setMa_tb(String ma_tb) {
        this.ma_tb = ma_tb;
    }
    public int getSoluong() {
        return soluong;
    }
    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
    
}

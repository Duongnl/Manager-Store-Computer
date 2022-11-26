package do_an;
import java.util.Scanner;
public class ct_phieuxuat extends phieuxuat {
    Scanner ip = new Scanner( System.in);
    
    String ma_tb;
    int soluong;
    public ct_phieuxuat()
    {
       super();
       ma_tb= null;
       soluong = 0; 
    }
    public ct_phieuxuat( String ma_px, String ma_tb, int soluong)
    {
        super(ma_px);
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
        System.out.printf("%-15s%-15s%-15s",  ma_px, ma_tb , soluong);
        
    }
    public String getMa_px() {
        return ma_px;
    }
    public void setMa_px(String ma_px) {
        this.ma_px = ma_px;
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

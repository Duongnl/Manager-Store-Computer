
import java.util.Scanner;

public class NhaSanXuat {
    private String maNSX;
    private String TenNSX;
    private String QuocGia;
    
    Scanner sc = new Scanner(System.in);
    public NhaSanXuat()
    {
        maNSX=null;
        TenNSX=null;
        QuocGia=null;
       
    }
    public NhaSanXuat(String maNSX, String TenNSX, String QuocGia)
    {
        this.maNSX=maNSX;
        this.TenNSX=TenNSX;
        this.QuocGia=QuocGia;
        
    }
    public String getMaNSX() {
        return maNSX;
    }
    public void setMaNSX(String mansx) {
        maNSX=mansx;
    }
    public String getTenNSX() {
        return TenNSX;
    }
    public void setTenNSX() {
        System.out.println("Nhap vao Ten NSX: ");
        TenNSX = sc.nextLine();
    }
    public String getQuocGia() {
        return QuocGia;
    }
    public void setQuocGia() {
        System.out.println("Nhap vao Quoc Gia: ");
        QuocGia = sc.nextLine();
    }

    
    public void Input(String mansx)
    {
        setMaNSX(mansx);
        setTenNSX();
        setQuocGia();
    }
    public void Output()
    {
        System.out.printf("%-20s%-20s%-15s\n",getMaNSX(), getTenNSX(),getQuocGia());
        System.out.println("------------------------------------------------------------");
    }
    @Override
    
    public String toString() {
        return   maNSX + ";" + TenNSX + ";" + QuocGia ;
    }
}

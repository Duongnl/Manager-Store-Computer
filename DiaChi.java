
import java.util.Scanner;

public class DiaChi {
    private String SoNha;
    private String Duong;
    private String Quan;
    private String ThanhPho;
    Scanner sc=new Scanner(System.in);
    public DiaChi()
    {
        SoNha=null;
        Duong=null;
        Quan=null;
        ThanhPho=null;
    }
    public DiaChi(String SoNha, String Duong, String Quan, String ThanhPho)
    {
        this.SoNha=SoNha;
        this.Duong=Duong;
        this.Quan=Quan;
        this.ThanhPho=ThanhPho;            
    }
    public DiaChi(DiaChi dc)
    {
        SoNha=dc.SoNha;
        Duong=dc.Duong;
        Quan=dc.Quan;
        ThanhPho=dc.ThanhPho;
    }
    
    public String getSoNha() {
        return SoNha;
    }
    public void setSoNha(String SoNha) {
        this.SoNha = SoNha;
    }

    public String getDuong() {
        return Duong;
    }

    public void setDuong(String Duong) {
        this.Duong = Duong;
    }

    public String getQuan() {
        return Quan;
    }

    public void setQuan(String Quan) {
        this.Quan = Quan;
    }

    public String getThanhPho() {
        return ThanhPho;
    }

    public void setThanhPho(String ThanhPho) {
        this.ThanhPho = ThanhPho;
    }
    public void Input_ID()
    {
        System.out.println("Nhap So Nha:");
        SoNha=sc.nextLine();
        System.out.println("Nhap Duong:");
        Duong=sc.nextLine();
        System.out.println("Nhap Quan:");
        Quan=sc.nextLine();
        System.out.println("Nhap Thanh pho:");
        ThanhPho=sc.nextLine();
        
    }
    public void nhapdiachi(String SoNha, String Duong, String Quan, String ThanhPho)
    {
        this.SoNha=SoNha;
        this.Duong=Duong;
        this.Quan=Quan;
        this.ThanhPho=ThanhPho;
    }
    public String toString()
    {
        return SoNha+ ";"+Duong+ ";"+Quan+ ";"+ThanhPho;
    }
    public void Output_ID()
    {
        System.out.println("Dia Chi: "+SoNha+"/"+Duong+"/"+Quan+"/"+ThanhPho);
    }
    
}
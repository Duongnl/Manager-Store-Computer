
import java.util.Scanner;

public class DiaChi {
    private String SoNha;
    private String Duong;
    private String Quan;
    private String ThanhPho;
    KiemTraDauVao ktr = new KiemTraDauVao();
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
    public void setSoNha() {
        System.out.println("Nhap So Nha:");
        SoNha=ktr.ktraChuoiRong();
    }

    public String getDuong() {
        return Duong;
    }

    public void setDuong() {
        System.out.println("Nhap Duong:");
        Duong=ktr.ktraChuoiRong();
    }

    public String getQuan() {
        return Quan;
    }

    public void setQuan() {
        System.out.println("Nhap Quan:");
        Quan=ktr.ktraChuoiRong();
    }

    public String getThanhPho() {
        return ThanhPho;
    }

    public void setThanhPho() {
        System.out.println("Nhap Thanh pho:");
        ThanhPho=ktr.ktraChuoiRong();
    }
    public void Input_ID()
    {   
        setSoNha();
        setDuong();
        setQuan();
        setThanhPho();
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
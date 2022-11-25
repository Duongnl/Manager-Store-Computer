
import java.util.Scanner;
public class NhaCungCap {
    private String MaNCC;
    private String TenNCC;
    private DiaChi DC;
    private String SDT;
    Scanner sc = new Scanner(System.in);

    public NhaCungCap()
    {
        MaNCC = null;
        TenNCC = null;
        DC = new DiaChi();
        SDT = null;
    }

    public NhaCungCap(String MaNCC, String TenNCC, DiaChi diachi, String SDT) {
        this.MaNCC = MaNCC;
        this.TenNCC = TenNCC;
        this.DC = diachi;
        this.SDT = SDT;
    }
    public NhaCungCap(String MaNCC, String TenNCC, String SoNha,String Duong, String Quan,String ThanhPho , String SDT)
    {
        this.MaNCC = MaNCC;
        this.TenNCC = TenNCC; 
        this.SDT = SDT;
    }
    public String getMaNCC() {
        return MaNCC;
    }

    public void setMaNCC(String mancc) 
    {
        MaNCC = mancc;
    }

    public String getTenNCC() {
        return TenNCC;
    }

    public void setTenNCC() {
        System.out.println("Nhap vao Ten nha cung cap : ");
        TenNCC = sc.nextLine();
    }

    public DiaChi getDC() {
        return DC;
    }

    public void setDC(DiaChi dC) {
        DC = dC;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT() {
        System.out.println("Nhap vao SDT nha cung cap : ");
        SDT = check_SDT();
    }
    public String  check_SDT()
    {
    while(true){
        SDT = sc.nextLine();
        if(SDT.matches("0"+ "\\d{9}"))
        {
            return SDT;
        } 
        else {
            System.out.println("Ding Dang SDT: 0....  SDT gom 10 so!!");
            System.out.println("Moi nhap lai: ");
        } 
    }
    }
    public void Input_NCC(String mancc)
    {
        setMaNCC(mancc);
        setTenNCC();
        System.out.println("Nhap vao Dia Chi NCC: ");
        DC.Input_ID();
        setSDT();
    }
    public void Output_NCC()
    {
        System.out.printf("%-20s%-20s%-15s%-20s\n",getMaNCC(), getTenNCC(),DC.getSoNha()+"/"+DC.getDuong()+"/"+DC.getQuan()+"/"+DC.getThanhPho(),getSDT());        
        System.out.println("----------------------------------------------------------------------------------------------------");
    }
    @Override
    public String toString() {
        return  MaNCC + ";" + TenNCC + ";" + DC.toString() + ";" + SDT;
    }
}

import java.util.Scanner;
public class ThietBi{
    protected String MaTB;
    protected String HangTB;
    protected int Soluong;
    protected int  Gia_ban;
    protected int Gia_nhap;
    protected String TSKT_TB;
    protected String NhaSX;
    protected String NhaCC;
    Scanner sc = new Scanner(System.in);

    public ThietBi()
    {
        MaTB = null;
        HangTB = null;
        Soluong = 0;
        Gia_ban = 0;
        Gia_nhap = 0;
        TSKT_TB = null;
        NhaCC=null;
        NhaSX=null;
    }
    public ThietBi(String MaTB, String HangTB, int Soluong, int Gia_nhap,int Gia_ban, String TSKT_TB,String NhaSX,String NhaCC) {
        this.MaTB = MaTB;
        this.HangTB = HangTB;
        this.Soluong=Soluong;
        this.Gia_ban = Gia_ban;
        this.Gia_nhap = Gia_nhap;
        this.TSKT_TB = TSKT_TB;
        this.NhaSX=NhaSX;
        this.NhaCC=NhaCC;
    }
    public String getMaTB() {
        return MaTB;
    }
    public void setMaTB(String matb) {
        MaTB =matb;
    }
    public String getHangTB() {
        return HangTB;
    }
    public void setHangTB() {
        System.out.println("Nhap Vao Hang Thiet Bi: ");
        HangTB =sc.nextLine();
    }
    public int getSoluong(){
        return Soluong;
    }
    public void setSoluong()
    {
        System.out.println("Nhap Vao So Luong Thiet Bi: ");
        Soluong = sc.nextInt();
    }
    public int getGia_ban() {
        return Gia_ban;
    }
    public void setGia_ban() {
        System.out.println("Nhap Vao Gia Ban Thiet Bi: ");
        Gia_ban = Check_Gia_ban();
    }
    public int getGia_nhap() {
        return Gia_nhap;
    }
    public void setGia_nhap() {
        System.out.println("Nhap Vao Gia Nhap Thiet Bi: ");
        Gia_nhap =sc.nextInt();
    }
    public String getNhaCC() {
        return NhaCC;
    }
    public void setNha_CC() {
        System.out.println("Nhap vao Ma Nha Cung Cap: ");
        NhaCC = checkMa_NCC();
        List_NCC lncc = new List_NCC();
        lncc.NhapMoiNcc(NhaCC);
    }
    public String getNhaSX() {
        return NhaSX;
    }
    public void setNha_SX() {
        System.out.println("Nhap vao Ma Nha San Xuat: "); //aaaaa
        NhaSX=checkMa_NSX();

        List_NSX lnsx = new List_NSX();
        lnsx.NhapMoiNsx(NhaSX);
    }
    public String  checkMa_NSX()
    {
        while(true){
            String mansx=sc.nextLine();
            mansx = mansx.toUpperCase();
            if(mansx.matches("NSX" + "[0-9]{1,3}"))
            {
                return mansx;
            } 
            else {
                System.out.println("Ding dang ma Nha San Xuat: . Vidu: NSX001");
                System.out.println("Moi nhap lai: ");
            } 
        }
    } 
    public String  checkMa_NCC()
    {
        while(true){
            String mancc=sc.nextLine();
            mancc = mancc.toUpperCase();
            if(mancc.matches("NCC" + "[0-9]{1,3}"))
            {
                return mancc;
            } 
            else {
                System.out.println("Ding dang ma Nha Cung Cap: . Vidu: NCC001");
                System.out.println("Moi nhap lai: ");
            } 
        }
    } 
    public String getTSKT_TB() {
        return TSKT_TB;
    }
    public void setTSKT_TB() {
        System.out.println("Nhap Vao Thong So Thiet Bi: ");
        sc.nextLine();
        TSKT_TB = sc.nextLine();
        
    }
    public int Check_Gia_ban() {
        while (true) {
            Gia_ban=sc.nextInt();
            if (Gia_ban > Gia_nhap) {
                return Gia_ban;
            } else {
                System.out.print("Gia ban phai lon hon gia nhap! Nhap lai: ");
            } 
        }
    }
    public void  Input_ThietBi(String matb)
    {
        setMaTB(matb);
        setHangTB();
        setSoluong();
        setGia_nhap();
        setGia_ban();
        setTSKT_TB();
        setNha_SX();
        setNha_CC();
    }
    public void Output_ThietBi()
    {
       System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n",getMaTB(),getHangTB(),getSoluong(),getGia_nhap(),getGia_ban(),getTSKT_TB(),getNhaSX(),getNhaCC());
      
    }
    @Override
    public String toString() {
        return  MaTB + ";" + HangTB + ";" + Soluong + ";" + Gia_nhap
                + ";" + Gia_ban + ";" + TSKT_TB + ";" + NhaSX + ";" + NhaCC ;
    }
    
}
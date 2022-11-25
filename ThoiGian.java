import java.util.Scanner;
public class ThoiGian {
    private int Ngay;
    private int Thang;
    private int Nam;
    Scanner sc=new Scanner(System.in);

    public ThoiGian()
    {
        Ngay=0;
        Thang=0;
        Nam=0;
    }

    public ThoiGian(int Ngay, int Thang, int Nam) {
        this.Ngay = Ngay;
        this.Thang = Thang;
        this.Nam = Nam;
    }

    public int getNgay() {
        return Ngay;
    }
    public void setNgay(int Ngay) {
        this.Ngay = Ngay;
    }

    public int getThang() {
        return Thang;
    }
    public void setThang(int Thang) {
        this.Thang = Thang;
    }

    public int getNam() {
        return Nam;
    }
    public void setNam(int Nam) {
        this.Nam = Nam;
    }
    public int Check_Ngay() {
        while (true) {
            Ngay=sc.nextInt();
            if (Ngay > 0 && Ngay <= 31) {
                return Ngay;
            } else {
                System.out.print("Ngay khong hop le ! Moi nhap lai: ");
            } 
        }
    }
    public int Check_Thang() {
        while (true) {
            Thang=sc.nextInt();
            if (Thang > 0 && Thang <= 12) {
                return Thang;
            } else {
                System.out.print("Thang khong hop le ! Moi nhap lai: ");
            } 
        }
    }
    public int Check_Nam() {
        while (true) {
            Nam=sc.nextInt();
            if (Nam > 999 && Nam <10000) {
                return Nam;
            } else {
                System.out.print("Nam khong hop le ! Moi nhap lai: ");
            } 
        }
    }
    public void Input_ThoiGian()
    {
        System.out.println("Nhap Ngay:");
        Ngay=Check_Ngay();
        System.out.println("Nhap Thang:");
        Thang=Check_Thang();
        System.out.println("Nhap Nam:");
        Nam=Check_Nam();
    }
    
    @Override
    public String toString() {
        return "ThoiGian [Ngay=" + Ngay + ", Thang=" + Thang + ", Nam=" + Nam + "]";
    }

    public void Output_ThoiGian()
    {
        System.out.println("Thoi Gian: "+Ngay+"/"+Thang+"/"+Nam);
    }
}

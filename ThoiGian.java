import java.util.Scanner;

public class ThoiGian {
    Scanner sc = new Scanner(System.in);
    private int ngay,thang,nam;

    public ThoiGian(){
        ngay = 0 ;
        thang = 0;
        nam =0;
    }

    public ThoiGian(int ngay,int thang, int nam){
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }
    
    public ThoiGian(ThoiGian t){
        this.ngay = t.ngay;
        this.thang = t.thang;
        this.nam = t.nam;
    }

    public boolean ktNamNhuan(int nam){
        if(nam % 4 == 0){
            if(nam % 100 == 0){
                if(nam % 400 == 0)
                    return true;
                else 
                    return false;
            } else 
                return true;
        }else
            return false;
    }

    public void setNgay(){
        System.out.println("Nhap ngay: ");
        while(true){
            ngay = sc.nextInt();
            if(thang == 1 || thang == 3 || thang == 5 || thang == 7 ||
               thang == 8 || thang ==10 || thang == 12){
                if(ngay<1 || ngay > 31)
                    System.out.println("Nhap lai trong [ 1 - 31 ]: ");
                else 
                    return;
            }else if(thang==2){
                if(ktNamNhuan(nam))
                    if(ngay<1 || ngay > 29)
                    System.out.println("Nhap lai trong [1-29]");
                    else
                    return;
                else
                    if(ngay<1 || ngay > 28)
                    System.out.println("Nhap lai trong [1-28]");
                    else 
                    return;
            }
            else {
                if(ngay < 1 || ngay > 30) 
                    System.out.println("Nhap lai trong [ 1 - 30 ]: ");
                else 
                return;
            }
        }
    }

    public void setThang(){
        System.out.println("Nhap thang: ");
        while(true){
            thang = sc.nextInt();
            if(thang<1 || thang >12)
            System.out.println("Nhap lai trong [1 - 12]: ");
            else
            return;
        }
    }

    public void setNam(){
        System.out.println("Nhap nam: ");
        while(true){
            nam = sc.nextInt();
            if(nam < 1900 || nam > 2022 ) {
                System.out.println("Nhap lai trong [1990 - 2022 ]: ");
            }
            else
            return;
        }
    }

    public int getNgay(){
        return ngay;
    }

    public int getThang(){
        return thang;
    }

    public int getNam(){
        return nam;
    }

    public void nhapThoiGian(){
        setNam();
        setThang();
        setNgay();
    }

    public void xuatThoiGian(){
        System.out.println(ngay + "/" + thang + "/" + nam);
    }

    public String toString(){
        return ngay+"/"+thang+"/"+nam;
    }
    public static void main(String[] args) {
        ThoiGian test = new ThoiGian();
        test.nhapThoiGian();
        test.xuatThoiGian();
    }
}
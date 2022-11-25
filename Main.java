import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
          List_ThietBi tb = new List_ThietBi();
          Scanner sc = new Scanner(System.in);
          tb.DocFile_ThietBi();
          int c;
          do 
          {
              System.out.println("1.Them TB");
              System.out.println("2.Xem danh sach thiet bi");
              System.out.println("3.Sua TB");
              System.out.println("4.Xoa TB");
              System.out.println("5.Thoat");
              c = sc.nextInt();
          if (c== 1)
          {
              tb.ThemThietBi();
              tb.GhiFile_ThietBi(); 
          }
          else if (c==2)
          {
            tb.XuatThietBi();
            int choose;
            do {
                List_NSX nsx = new List_NSX();
                List_NCC ncc = new List_NCC();
                System.out.println("1.Xem Nha San Xuat");
                System.out.println("2.Xem Nha Cung Cap ");
                 choose = sc.nextInt();
                switch(choose)
                {
                    case 1:
                    nsx.DocFile_NSX();
                    nsx.Xuat_NSX();
                    break;

                    case 2:
                    ncc.DocFile_NCC();
                    ncc.Xuat_NCC();
                    break;
                }
                
            } while (choose != 3);
          }
          else if (c==3)
          {
              tb.ThayDoiThongTinSP();
              tb.GhiFile_ThietBi();
         }
          else if (c==4)
          {
              tb.XoaThietBi();
              tb.GhiFile_ThietBi();
          }
        } 
        while (c !=5);
    }
}

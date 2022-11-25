

public class MenuQLKHO
{
   protected String tk;
   protected String mk;
    KiemTraDauVao ktr = new KiemTraDauVao();

   public MenuQLKHO() {
    this.tk = null;
    this.mk = null;
}

   public MenuQLKHO(String tk, String mk) {
    this.tk = tk;
    this.mk = mk;
}

public String getTk() {
    return tk;
}

public void setTk(String tk) {
    this.tk = tk;
}

public String getMk() {
    return mk;
}

public void setMk(String mk) {
    this.mk = mk;
}

public void HanhDongQLKHO()
{
    List_CT_TaiKhoan lcttk = new List_CT_TaiKhoan();
        
        int LuaChon;

        do 
        {
          System.out.println("MENU QUAN LY KHO");
          System.out.println("1.Xem thong tin tai khoan");
          System.out.println("2.Doi mat khau");
          System.out.println("3.Xem san pham");
          System.out.println("4.Tim san pham");
          System.out.println("5.Nhap");
          System.out.println("6.Doi thong tin SP");
          System.out.println("7.Xoa san pham");
          System.out.println("8.Xem nha san xuat");
          System.out.println("9.Xem nha cung cap");
          System.out.println("10.Dang xuat");
          int x = 10;
          LuaChon = ktr.KiemTraLuaChon(x);
          if (LuaChon == 1)
          {
            ktr.clearScreen();
            System.out.printf("%-20s%-20s\n","TAI KHOAN", "MAT KHAU");
            System.out.printf("%-20s%-20s\n",tk, mk);
            ktr.ChonTiepTuc();
          }
          else if (LuaChon == 2)
          {
            ktr.clearScreen();
            mk = lcttk.DoiMK(tk, mk);
            System.out.println("Doi mat khau thanh cong !");
            ktr.ChonTiepTuc();
          } 
          else if (LuaChon == 3)
          {
    
          }
          else if (LuaChon == 4)
          {

          }
          else if (LuaChon == 5)
          {

          }
           else if (LuaChon == 10)
           {
            ktr.clearScreen();
         System.out.println("Ban muon dang xuat ?");
         System.out.println("1.Co?");
         System.out.println("2.Khong?");
         int h= 2;
         int luachon = ktr.KiemTraLuaChon(h);
         if (luachon == 1)
         {
            ktr.clearScreen();
            System.out.println("Dang xuat thanh cong!");
            ktr.ChonTiepTuc();
         }
         else if (luachon == 2)
         {
            ktr.clearScreen();
            LuaChon =-1;
         }
           }
       
        }while (LuaChon != 10);




}
    



}

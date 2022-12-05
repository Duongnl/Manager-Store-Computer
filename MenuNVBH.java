public class MenuNVBH 
{
    protected String tk;
    protected String mk;
    KiemTraDauVao ktr = new KiemTraDauVao();

    public MenuNVBH() {
        this.tk = null;
        this.mk = null;
    }
    public MenuNVBH(String tk, String mk) {
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
    public void HanhDongNVBH ()
    {
        List_CT_TaiKhoan lcttk = new List_CT_TaiKhoan();
        lcttk.DocFile_List_CT_TaiKhoan();
        int LuaChon;
        do 
        {
          System.out.println("MENU NHAN VIEN");
          System.out.println("1.Xem thong tin tai khoan");
          System.out.println("2.Doi mat khau");
          
          System.out.println("3.Xem san pham");
          System.out.println("4.Tim san pham");
           
          System.out.println("5.Don hang cho xac nhan ban");
          System.out.println("6.Ban truc tiep");
          System.out.println("7.Dang xuat");
          int x = 7;
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
             List_ThietBi ltb = new List_ThietBi();
             ltb.DocFile_ThietBi();
             ltb.XuatThietBi();
          }
          else if (LuaChon == 4)
          {
            List_ThietBi ltb = new List_ThietBi();
             ltb.DocFile_ThietBi();
             ltb.TimKiemThietBi();
          }
          else if (LuaChon == 5)
          {
            ktr.clearScreen();  
            int c;
          do  
           { 
              List_CT_YeuCau lyc = new List_CT_YeuCau();
              lyc.DocFile_List_CT_YeuCau();
              lyc.Xuat_ListYeuCau();
              System.out.println("1.Truy cap don hang");
              System.out.println("2.Thoat");
              int x1 = 2;
              c = ktr.KiemTraLuaChon(x1);
              if (c == 1)
              {
                
                lyc.Tim_KiemYeuCau(tk);
              }
              else if (c == 2)
              {
                ktr.clearScreen();
              }


           
            }while (c != 2); 



          }
           else if (LuaChon == 7)
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


       
        }while (LuaChon != 7);

    }


}
    
  





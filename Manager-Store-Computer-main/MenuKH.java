
public class MenuKH 
{
    KiemTraDauVao ktr = new KiemTraDauVao();
    
    protected String tk;
    protected String mk;
    
    
    
    public MenuKH( String tk, String mk) {
       
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







    public void HanhDongKH ()
    {
        List_CT_TaiKhoan lcttk = new List_CT_TaiKhoan();
        List_CT_GioHang lctgh = new List_CT_GioHang();
        lctgh.DocFile_List_CT_GioHang();
       
        int LuaChon;

        do 
        {
            System.out.println("MENU KHACH HANG");
            System.out.println("1.Xem thong tin tai khoan");
          System.out.println("2.Doi mat khau");
          System.out.println("3.Xem san pham");
          System.out.println("4.Tim san pham");
          System.out.println("5.Gio hang");
          System.out.println("6.Dang xuat");
          int x= 6;
          LuaChon = ktr.KiemTraLuaChon(x);
          if (LuaChon == 1)
          {
            ktr.clearScreen();
            System.out.println("----------------------------");
            System.out.printf("%-20s%-20s\n","TAI KHOAN", "MAT KHAU");
            System.out.println("----------------------------");
            System.out.printf("%-20s%-20s\n",tk, mk);
            System.out.println("----------------------------");
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
            ktr.clearScreen();
            int chon = 0;
            do 
            {
               System.out.println("1.Them SP vao gio hang");
               System.out.println("2.Xem SP trong gio hang");
               System.out.println("3.Tim SP trong gio hang");
               System.out.println("4.Sua so luong cua SP trong gio hang");
               System.out.println("5.Xoa SP trong gio hang");
               System.out.println("6.Xoa tat ca san pham trong gio hang");
               System.out.println("7.Mua");
               System.out.println("8.Don mua");
               System.out.println("9.Thoat");
               int k = 9;
               chon = ktr.KiemTraLuaChon(k);
               if (chon == 1)
               {
                ktr.clearScreen();
                lctgh.Them_GioHang(tk);
                ktr.clearScreen();
               }
              else if (chon == 2)
              {
               ktr.clearScreen();
                lctgh.XuatList_GioHang(tk);
              ktr.ChonTiepTuc();
              }
              
              else if (chon == 3)
              {
                ktr.clearScreen();
                lctgh.Tim_GioHang(tk);
                
              }
              
              else if (chon == 4)
              {
                ktr.clearScreen();
                lctgh.Sua_GioHang(tk);
              }
              else if (chon == 5)
              {
                ktr.clearScreen();
                lctgh.Xoa_GioHang(tk);

              }
              else if (chon == 6)
              {
                ktr.clearScreen();
                lctgh.XoaTatCa_GioHang(tk);
              }
             else if (chon == 7)
             {
              ktr.clearScreen();
              lctgh.Mua(tk);
             
              ktr.ChonTiepTuc(); 
            }
            
            else if (chon == 8)
            {
              List_CT_LichSuKH lctlskh = new List_CT_LichSuKH();
              lctlskh.DocFile_List_CT_LichSuKH();
              ktr.clearScreen();
              lctlskh.Xuat_ListLichSuKH(tk);;
             ktr.ChonTiepTuc();
            }


             
              else  if (chon == 9)
             {
              ktr.clearScreen();
             }
           
            }while (chon != 9);
          }
      
       
          else if (LuaChon == 6)
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
         else if (luachon == 6)
         {
            ktr.clearScreen();
            LuaChon =-1;
         }

        }


        }while (LuaChon != 6);

    }


}

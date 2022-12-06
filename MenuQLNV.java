public class MenuQLNV 
{
    protected String tk;
    protected String mk;
    KiemTraDauVao ktr = new KiemTraDauVao();

    public MenuQLNV() {
        this.tk = null;
        this.mk = null;
    }

    public MenuQLNV(String tk, String mk) {
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

    public void HanhDongQLNV ()
    {
        List_CT_TaiKhoan lcttk = new List_CT_TaiKhoan();
        lcttk.DocFile_List_CT_TaiKhoan();
        DSNV dsnv = new DSNV();
        dsnv.docFile();
        int sttHienTai = Integer.parseInt(String.valueOf(dsnv.SttHienTai()));
        NhanVien.setStt(sttHienTai);
        int LuaChon;
        int x ;
        do 
        {
          System.out.println("MENU QUAN LY NHAN VIEN");
          System.out.println("1.Xem thong tin tai khoan");
          System.out.println("2.Doi mat khau");
          System.out.println("3.Them nhan vien");
          System.out.println("4.Xem danh sach nhan vien");
          System.out.println("5.Xoa nhan vien");
          System.out.println("6.Doi thong tin nhan vien");
          System.out.println("7.Dang xuat");
          x = 7;
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
            dsnv.themNhanVien();
            String loainv = dsnv.LayLoaiNV();
            String tk = dsnv.LayMANV();
          
            lcttk.ThemTKTuDong(loainv,tk);
           
           
    
          }
          else if (LuaChon == 4)
          {
             
            do
            {
              System.out.println("1.Xem tat ca nhan vien");
              
              System.out.println("2.Xem nhan vien quan ly");
              System.out.println("3.Xem nhan vien quan kho");
              System.out.println("4.Xem nhan vien ban hang");
              System.out.println("5.Quay lai");
              
              x= 5;
              LuaChon = ktr.KiemTraLuaChon(x);
              if (LuaChon == 1)
              {
                dsnv.xuatDSNV();
              }
              else if (LuaChon == 2)
              {
              dsnv.XemNVQL();
            }
            else if (LuaChon == 3)
            {
              dsnv.XemNVQK();
                
            }
            else if (LuaChon == 4)
            {
              dsnv.XemNVBH();
                
            }
  
          
          
            

            }while(LuaChon!=5);
          
          }
          else if (LuaChon == 5)
          {
             dsnv.xoaN();
          }
          else if (LuaChon == 6)
          {
            dsnv.suaTTNV();
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

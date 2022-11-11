
public class Menu  {

    KiemTraDauVao ktr = new KiemTraDauVao();

    

    public void Chon_DN_DK() 
    {
      ktr.clearScreen();
      int LuaChon; 
      do {  
        System.out.println("1.Dang nhap");
        System.out.println("2.Dang ky");
        System.out.println("3.Thoat");
        int x= 3;
        LuaChon = ktr.KiemTraLuaChon(x);

        List_CT_TaiKhoan cttk = new List_CT_TaiKhoan();

        if (LuaChon == 1) 
        {  
             ktr.clearScreen();
            System.out.println("--DANG-NHAP--");
          
            DangNhap dn = new DangNhap();
            boolean kt;
        
                dn.DangNhapTKMK();
                 kt = dn.KiemTraDangNhap(dn.getTaiKhoanDN(), dn.getMatKhauDN()) ;
                if ( kt == true) 
                {
                    int truonghop = cttk.KiemTraQuyen(dn.getTaiKhoanDN(), dn.getMatKhauDN() ) ;
                    if (truonghop == 1)
                   {
                    ktr.clearScreen();
                    MenuKH mnkh = new MenuKH(dn.getTaiKhoanDN(), dn.getMatKhauDN());
                    mnkh.HanhDongKH();
                   }          
                   else if (truonghop == 2)
                   {
                    ktr.clearScreen();
                    MenuNVBH mnnv = new MenuNVBH(dn.getTaiKhoanDN(), dn.getMatKhauDN());
                    mnnv.HanhDongNVBH();
                   }
                   else if (truonghop == 3)
                   {
                    ktr.clearScreen();
                    MenuAD mnad = new MenuAD(dn.getTaiKhoanDN(), dn.getMatKhauDN());
                    mnad.HanhDongAD();
                   } 
                   else if (truonghop == 4)
                   {
                    ktr.clearScreen();
                    MenuQLKHO mnqlkho = new MenuQLKHO(dn.getTaiKhoanDN(), dn.getMatKhauDN());
                    mnqlkho.HanhDongQLKHO();
                   }
                   else if (truonghop == 5)
                   {
                    ktr.clearScreen();
                    MenuQLNV mnqlnv = new MenuQLNV(dn.getTaiKhoanDN(), dn.getMatKhauDN());
                    mnqlnv.HanhDongQLNV();
                   }

                  }
          }
        else if (LuaChon == 2)
        {
          ktr.clearScreen();
          DangKy dk = new DangKy();
          dk.DangKyTK();
        }


     }while (LuaChon != 3);

    }

}


public class MenuAD 
{
    KiemTraDauVao ktr = new KiemTraDauVao();
   protected String tk;
   protected String mk;

   
   public MenuAD() 
   {
     this.tk = null;
     this.mk = null;
  }    

    public MenuAD(String tk, String mk) 
    {
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

   public void HanhDongAD ()
    {
      ktr.clearScreen();
      List_CT_TaiKhoan lcttk = new List_CT_TaiKhoan();
      lcttk.DocFile_List_CT_TaiKhoan();  
      List_CT_Quyen lctq = new List_CT_Quyen();
      lctq.DocFile_List_CT_Quyen();
      int chon;
        do  
      {
        System.out.println("MEMU ADMIN");
        System.out.println("1.Them TK");
        System.out.println("2.Xem TK");
        System.out.println("3.Tim TK");
        System.out.println("4.Sua TK");
        System.out.println("5.Xoa TK");
        System.out.println("6.Xoa tat ca TK");
        System.out.println("7.Xem quyen");
        System.out.println("8.Dang xuat");
        int x = 8; 
        chon =  ktr.KiemTraLuaChon(x);
        if (chon == 1)
        {
          ktr.clearScreen();
          lcttk.Them_TaiKhoan();
        } 
        else if (chon == 2)
        {
          ktr.clearScreen();  
          lcttk.XuatList_TaiKhoan();
        }
         else if (chon == 3)
         {
            ktr.clearScreen();
            lcttk.Tim_TaiKhoan();
         } 
         else if (chon == 4)
         {
            ktr.clearScreen();
            lcttk.Sua_TaiKhoan(tk);
         }
         else if (chon == 5)
         {
            ktr.clearScreen();
            lcttk.Xoa_TaiKhoan(getTk());
           
         }
         else if (chon == 6)
         {
            ktr.clearScreen();
            lcttk.XoaTatCa_TaiKhoan();
         }
        else if (chon == 7)
        {
         ktr.clearScreen();   
         lctq.XuatList_Quyen();
        }
        else if (chon == 8)
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
            chon =-1;
         }

        }

       }while (chon != 8);

    }
      
    


}

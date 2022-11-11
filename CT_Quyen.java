import java.util.Scanner;;
public class CT_Quyen 
{
   protected String MQ;
   protected String TenQuyen;
   KiemTraDauVao ktr = new KiemTraDauVao();
   Scanner scanner = new Scanner(System.in);

   public CT_Quyen() {
    this.MQ = null;
    this.TenQuyen = null;
}

   public CT_Quyen(String mQ, String tenQuyen) {
      this.MQ = mQ;
      this.TenQuyen = tenQuyen;
}
//----------------------------------------------------------
   public String getMQ() {
    return MQ;
   }

   public void setMQ() {
      List_CT_Quyen listctq = new List_CT_Quyen(); 
      int dem = 0; 
     do
    {
        MQ = ktr.KiemTraMaQuyen();
     if (listctq.KiemTraMAQuyenTonTai(MQ) == false)
     {
       dem =-1;
       System.out.println("Ma quyen ton tai !");
      }
    else {dem = 0;}
   }while (dem == -1); 
   }
//--------------------------------------------------------------------
   public String getTenQuyen() {
    return TenQuyen;
   }

   public void setTenQuyen() {
     
    System.out.println("Chon ten quyen : ");
    System.out.println("1.Quyen KH");
    System.out.println("2.Quyen NVBH");   
    System.out.println("3.Quyen AD");   
    System.out.println("4.Quyen QLKHO");  
    System.out.println("4.Quyen QLNV");   
    
    int x= 3;
    int LuaChon = ktr.KiemTraLuaChon(x);
    
    if (LuaChon == 1)
    {
       TenQuyen = "Quyen KH";
    }
    else if (LuaChon == 2)
    {
        TenQuyen = "Quyen NV";
    }
   else if (LuaChon == 3)
   {
    TenQuyen = "Quyen AD";
   }
   else if (LuaChon == 4)
   {
    TenQuyen = "Quyen QLKHO";
   }
   else if (LuaChon == 5)
   {
    TenQuyen = "Quyen QLNV";
   }




   }
//-----------------------------------------------------------
  public void NhapThongTinQuyen ()
  {
   System.out.println("--NHAP-THONG-TIN-QUYEN--");
   setMQ();
   setTenQuyen();
  }
 
   public void XuatThongTinQuyen ()
   {
    System.out.printf("%-16s%-20s\n",getMQ(), getTenQuyen());
    System.out.println("-------------------------");
   }
//-------------------------------------------------------
  public String DinhDangFileQuyen ()
  {
   return MQ + ";" + TenQuyen;
  }
//------------------------------------------------------






    

}

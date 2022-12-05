
import java.util.Scanner;

public class KiemTraDauVao {
  Scanner scanner = new Scanner(System.in);
  protected String DauVao;
  protected int Chon;
 
  
  public KiemTraDauVao() {
    this.DauVao = null;
    this.Chon = 0;
  }

  public KiemTraDauVao(String dauVao, int chon) {
    this.DauVao = dauVao;
    this.Chon = chon;
  }

  // ----------------------------------------------------------------------
  public String getDauVao() {
    return DauVao;
  }

  public void setDauVao(String dauVao) {
    DauVao = dauVao;
  }

  // --------------------------------------------------------------------
  public int getChon() {
    return Chon;
  }

  public void setChon(int chon) {
    Chon = chon;
  }

  // --------------------------------------------------------------------
  public boolean KiemTra(String input) 
  {
    boolean flag;
    String digit = "[0-9]{1,10}";
    flag = input.matches(digit);
    return flag;
  }
  
  public boolean KiemTra1 (String input)
  {
 
    boolean flag;
    String digit = "[0-9]{1,3}";
    flag = input.matches(digit);
    return flag;
  
  }
  



//------------------------------------------------------------------------
  
public  void clearScreen() {  
  System.out.print("\033[H\033[2J");  
  System.out.flush();  
}  


public String KiemTraMaQuyen ()
    {  
        
          System.out.println("1. MQ1 Quyen KH");
          System.out.println("2. MQ2 Quyen NVBH");
          System.out.println("3. MQ3 Quyen AD");
          System.out.println("4. MQ4 Quyen QLKHO");
          System.out.println("5. MQ5 Quyen QLNV");
          
          int x = 5;
          int LuaChon = KiemTraLuaChon(x);
          if (LuaChon == 1)
          {
            return "MQ1";
          }
          else if (LuaChon == 2)
          {
            return "MQ2";
          }
          else if (LuaChon == 3)
          {
            return "MQ3";
          }
          else if (LuaChon == 4)
          {
            return "MQ4";
          }
          else if (LuaChon == 5)
          {
            return "MQ5";
          }
         


        return "f";
        
    }
//--------------------------------------------------------------------------

 public String KiemTraNhapMaQuyen ()
 {
   
  while (true)
  {
  System.out.print("Nhap ma quyen (MQ__) : "); 
  DauVao = scanner.nextLine();
   DauVao = DauVao.toUpperCase();
   if (DauVao.matches("MQ"+"[1-5]{1,2}"))
   {
    return DauVao;
   }
   else 
   {
    System.out.println("Dinh dang ma quyen : MQ__. Vi du: MQ1");
   }
  }
 }



//---------------------------------------------------------------------
public String KiemTraTaiKhoanDK()
{
  List_CT_TaiKhoan listcttk = new List_CT_TaiKhoan();
  
  while (true)
  {
     System.out.print("Nhap SDT : "); 
     DauVao = scanner.nextLine();
     DauVao = DauVao.toUpperCase();
     if (DauVao.matches("0"+"[0-9]{9}"))
     {
        if (listcttk.KiemTraTKDK(DauVao) == false)
         {
          clearScreen(); 
          System.out.println("SDT ton tai !");
         }
        else   { return DauVao; }    
     }
     else 
     {
      clearScreen();
      System.out.println("Vui long nhap dung dinh dang SDT");   
     }
  }
}

public String KiemTraTaiKhoanDuocThem()
{
  List_CT_TaiKhoan listcttk = new List_CT_TaiKhoan();
  
  while (true)
  {
     System.out.print("Nhap tai khoan : "); 
     DauVao = scanner.nextLine();
     DauVao = DauVao.toUpperCase();
     if (DauVao.matches("0"+"[0-9]{9}") || DauVao.matches("NV"+"[0-9]{1,10}") )
     {
        if (listcttk.KiemTraTKDK(DauVao) == false)
         {
          clearScreen(); 
          System.out.println("SDT/MaNV ton tai !");
         }
        else   { return DauVao; }    
     }
     else 
     {
      clearScreen();
      System.out.println("Vui long nhap dung dinh dang SDT/MANV (NV__)");   
     }
  }
}



//--------------------------------------------------------------------------------------
public String KiemTraMatKhauDK ()
{
  while (true)
  {
    System.out.print("Nhap mat khau ( 5->10 ky tu) : "); 
    DauVao = scanner.nextLine();
    if (DauVao.matches("[a-zA-Z_0-9]{5,10}"))
    {
       if (DauVao.length() >=5 && DauVao.length() <=10 )
     {
        { return DauVao; }    
      }
      else 
      {
        clearScreen();
      System.out.println("Mat khau phai tu 5 -> 10 ky tu");  
      }
    
    }
     else 
     {
      clearScreen();
      System.out.println("Mat khau phai tu 5 -> 10 ky tu");  
     }
  }
}
//--------------------------------------------------------------------------------------------

public String KiemTraDangNhapTK()
{
  while (true)
  {
     System.out.print("Tai khoan : "); 
     DauVao = scanner.nextLine();
     DauVao = DauVao.toUpperCase();
     if (DauVao.matches("0"+"[0-9]{9}") ||  DauVao.matches("NV"+"[0-9]{1,10}") )
     {
         return DauVao;   
     }
     else 
     {
      clearScreen();
      System.out.println("Vui long nhap dung dinh dang! Khach hang nhap SDT / Nhan vien nhap MaNV (NV__) )");
        
     }
      
  
    }
}

public boolean KiemTraTaiKhoanDN(String tk, String mk)
{
  List_CT_TaiKhoan listcttk = new List_CT_TaiKhoan();
      
    if (listcttk.KiemTraTKDN(tk,mk) == true)
         {
           return true;
         }
   return false;
}
//----------------------------------------------------------------------------------------

public int KiemTraLuaChon(int x) 
{
  do {
    System.out.print("Chon : ");
    DauVao = scanner.nextLine();
    if (KiemTra(DauVao) == true ) {
      if (Integer.parseInt(DauVao) > x || Integer.parseInt(DauVao) <1) {
        Chon = -1;
        System.out.println("Chon 1 -> " + x +" !");
      } else {
        Chon = Integer.parseInt(DauVao);
      }
    }

    else {
    
      System.out.println("Chon 1 -> " + x +" !");
      Chon = -1;
    }

  } while (Chon == -1);

  return Chon;
}

//--------------------------------------------------------------------
public void ChonTiepTuc ()
{
 
  do {
    
    System.out.print("Chon 1 de tiep tuc ! ");
    System.out.print("Chon : ");
    DauVao = scanner.nextLine();
    if (KiemTra(DauVao) == true) {
      if ( Integer.parseInt(DauVao) != 1) {
        Chon = -1;
        System.out.println("Chon 1 de tiep tuc !");
      } else {
        Chon = 1;
        clearScreen();
      }
    }

    else {
      System.out.println("Chon 1 de tiep tuc !");
      Chon = -1;
    }

  } while (Chon == -1);       
}
//----------------------------------------------------------------------------------------------
public String KiemTraTinhTrang ()
{
  System.out.println("Chon tinh trang : ");
  System.out.println("1.Mo");
  System.out.println("2.Khoa");   
  int x= 2;
 int LuaChon =KiemTraLuaChon(x);
  
  if (LuaChon == 1)
  {
      return "Mo";
  }
  else
  {
      return "Khoa";
  }


}

//-----------------------------------------------------------------------------------------
public int KiemTraSoLuong ()
{
  while (true)
  {
     System.out.print("So luong :  "); 
     DauVao = scanner.nextLine();
     DauVao = DauVao.toUpperCase();
     if ( DauVao.matches("[0-9]{1,10}") )
     {
            int x = Integer.parseInt(DauVao);
            return x;
     }
     else 
     {
      clearScreen();
      System.out.println("Vui long nhap lai so luong !");
        
     }
      
  
    }

}
//------------------------------------------------------------------------------






public String ktraHoten(){
  String dauVao;
  while(true){
      dauVao = scanner.nextLine();
      dauVao = dauVao.trim();
      dauVao = dauVao.replaceAll("\\s+", " ");
      if(dauVao!="")
      return dauVao;
      else
      System.out.println("Nhap ho ten: ");
  }
}

public String ktraChuoiRong()
{
  String DauVao;
  while (true)
  {
    DauVao = scanner.nextLine();
   if (DauVao != "")
   {
    return DauVao;
   }
   else
   System.out.println("Nhap lai !");
  }
}

public String ktraSDT(){
  String Dauvao;
  while(true){
      Dauvao = scanner.nextLine();
      if(Dauvao.matches("0"+"[0-9]{9}")){
          return Dauvao;
      } else {
          System.out.println("Dinh dang SDT 0__. _:9 so con lai VD: 0123456789");
      }
      System.out.println("Moi nhap lai: ");
  }
}

public String ktraMaKH(){
  String Dauvao;
  while (true) {
      Dauvao = scanner.nextLine();
      Dauvao = Dauvao.toUpperCase();
      if (Dauvao.matches("KH" + "[0-9]{1,2}")) {
         return Dauvao;
      } else {
          System.out.println("Dinh dang ma khach hang KH__. Vd: KH1");
      }
      System.out.println("Moi nhap lai: ");
  }
}

public boolean ktraTontaiMaKH(String Dauvao){
  DSKH temp = new DSKH();
  temp.docFile();
  for(KhachHang i:temp.getList()){
    if(i.getMaKH().equals(Dauvao)){
      System.out.println("Ma khach hang da ton tai!\nNhap lai: ");
      return true;
    }
  }
  return false;
}

public String ktraMaNV(){
    String Dauvao;
    while (true) {
        Dauvao = scanner.nextLine();
        Dauvao = Dauvao.toUpperCase();
        if (Dauvao.matches("NV" + "[0-9]{1,2}")) {
           return Dauvao;
        } else {
            System.out.println("Dinh dang ma nhan vien NV__. Vd: NV01");
        }
        System.out.println("Moi nhap lai: ");
    }
}
}

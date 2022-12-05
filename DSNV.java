import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
public class DSNV implements docGhiFile{
    private ArrayList<NhanVien> list;
    Scanner sc = new Scanner(System.in);
    KiemTraDauVao ktr = new KiemTraDauVao();

    public DSNV() {
        list = new ArrayList<NhanVien>();
    }

    public DSNV(ArrayList<NhanVien> list) {
        this.list = new ArrayList<NhanVien>(list);
    }

    public ArrayList<NhanVien> getList(){
          return list;
    }

    public void setList(ArrayList<NhanVien>list){
        this.list = list;
    }

    public int soluongNV() {
        return list.size();
    }

    public void themNhanVien() {
            System.out.println("1.Nhan vien ban hang");
            System.out.println("2.Nhan vien quan ly");
            System.out.println("3.Nhan vien quan kho");
            int luachon = ktr.KiemTraLuaChon(3);
            switch(luachon){
                case 1:
                    NhanVien bh = new NVBanHang();
                    bh.input();
                    this.list.add(bh);
                    break;
                case 2:
                    NhanVien ql = new NVQuanLy();
                    ql.input();
                    this.list.add(ql);
                    break;
                case 3:
                    NhanVien qk = new NVQuanKho();
                    qk.input();
                    this.list.add(qk);
                    break;
                  }
        ghiFile();
    }

    public void timNhanVien() {
        int flag = 0;
        System.out.println("1.Tim kiem theo ma nhan vien");
        System.out.println("2.Tim kiem theo ten nhan vien");
        System.out.println("3.Tim kiem theo SDT nhan vien");
        int luachon = ktr.KiemTraLuaChon(3);
        switch (luachon) {
            case 1:
                System.out.println("Nhap ma nhan vien muon tim: ");
                String manv =ktr.ktraMaNV();
                System.out.println(
                        "+------+------------------------------+------------+------------+--------------------------------------------------+");
                System.out.printf("|%-6s|%-30s|%-12s|%-12s|%-50s|\n", "Ma NV", "Ten NV", "SDT", "Ngay sinh", "Dia chi");
                System.out.println(
                        "+------+------------------------------+------------+------------+--------------------------------------------------+");
                for (NhanVien i : list) {
                    if (i.getMaNV().contains(manv)) {
                        i.output();
                        flag = 1;
                    }
                }
                if (flag == 0)
                    System.out.println("Khong tim thay!");
                break;
            case 2:
                System.out.println("Nhap ten nhan vien muon tim: ");
                String hoten = ktr.ktraHoten();
                System.out.println(
                        "+------+-------------------------+------------+------------+--------------------------------------------------+");
                System.out.printf("|%-6s|%-25s|%-12s|%-12s|%-50s|\n", "Ma KH", "Ten KH", "SDT", "Ngay sinh", "Dia chi");
                System.out.println(
                        "+------+-------------------------+------------+------------+--------------------------------------------------+");
                for (NhanVien i : list)
                    if (i.getHoten().contains(hoten)) {
                        i.output();
                        flag = 1;
                    }
                if (flag == 0)
                    System.out.println("Khong tim thay!");
                break;
            default:
                System.out.println("Nhap sdt nhan vien muon tim: ");
                String sdt = ktr.ktraSDT();
                System.out.println(
                        "+------+-------------------------+------------+------------+--------------------------------------------------+");
                System.out.printf("|%-6s|%-25s|%-12s|%-12s|%-50s|\n", "Ma KH", "Ten KH", "SDT", "Ngay sinh", "Dia chi");
                System.out.println(
                        "+------+-------------------------+------------+--------------------+--------------------------------------------------+");
                for (NhanVien i : list)
                    if (i.getSDT().contains(sdt)) {
                        i.output();
                        flag = 1;
                    }
                if (flag == 0)
                    System.out.println("Khong tim thay!");
        }
    }

    public void suaTTNV() {
        int flag = 0;
        while (flag == 0) {
            System.out.println("Nhap ma nhan vien: ");
            String manv = ktr.ktraMaKH();
            for (NhanVien i : list) {
                if (manv.equals(i.getMaNV())) {
                    flag = 1;
                    System.out.println("1.Sua ho ten");
                    System.out.println("2.Sua SDT");
                    System.out.println("3.Sua ngay sinh");
                    System.out.println("4.Sua dia chi");
                    System.out.println("5.Sua tat ca thong tin");
                    int luachon = ktr.KiemTraLuaChon(5);
                    switch (luachon) {
                        case 1:
                            i.setHoTen();
                            break;
                        case 2:
                            i.setSDT();
                            break;
                        case 3:
                            i.ns.setNam();
                            i.ns.setThang();
                            i.ns.setNgay();
                            break;
                        case 4:
                            i.dc.setSoNha();
                            i.dc.setDuong();
                            i.dc.setQuan();
                            i.dc.setThanhPho();
                            break;
                        default:
                            i.setHoTen();
                            i.setSDT();
                            i.ns.setNam();
                            i.ns.setThang();
                            i.ns.setNgay();
                            i.dc.setSoNha();
                            i.dc.setDuong();
                            i.dc.setQuan();
                            i.dc.setThanhPho();
                            break;
                    }
                    ghiFile();
                }
            }
        }
    }

    public void xoaN() {
        xuatDSNV();
        System.out.println("1.Xoa 1 NV");
        System.out.println("2.Xoa tat ca NV");
        int luachon = ktr.KiemTraLuaChon(2);
        switch (luachon) {
            case 1:
                int flag = 0;
                while (flag == 0) {
                    System.out.println("Nhap ma nhan vien: ");
                    String makh = ktr.ktraMaKH();
                    for (int i = 0; i < list.size(); i++) {
                        if (makh.equals(list.get(i).getMaNV())) {
                            flag = 1;
                            System.out.println(
                                    "+------+-------------------------+------------+------------+--------------------------------------------------+");
                            System.out.printf("|%-6s|%-25s|%-12s|%-12s|%-50s|\n", "Ma KH", "Ten KH", "SDT", "Ngay sinh",
                                    "Dia chi");
                            System.out.println(
                                    "+------+-------------------------+------------+------------+--------------------------------------------------+");
                            list.get(i).output();
                            System.out.println("Ban co chac nhan vien nay?");
                            System.out.println("1.Dong y\n2.Khong");
                            luachon = ktr.KiemTraLuaChon(2);
                            switch(luachon){
                                case 1:
                                list.remove(i);
                                System.out.println("Xoa thanh cong!");
                                break;
                                case 2:
                                 System.out.println("Ban co muon chon nhan khac?");
                                 System.out.println("1.Dong y\n2.Thoat");
                                 luachon=ktr.KiemTraLuaChon(2);
                                 switch(luachon){
                                     case 1:
                                        flag = 0;
                                        break;
                                     case 2:
                                        break;
                                 }
                            }
                        }
                    }
                }
                break;
            case 2:
                System.out.println("Ban co chac xoa het nhan vien?");
                System.out.println("1.Dong y\n2.Thoat");
                luachon=ktr.KiemTraLuaChon(2);
                switch(luachon){
                    case 1:
                    list.clear();
                    System.out.println("Xoa thanh cong!");
                    break;
                    case 2: 
                    break;
                }
        }
       ghiFile();
    }

    public void xuatDSNV() {
        if (list.size() == 0) {
            System.out.println("Khong co nhan vien!");
        } else {
            System.out.println(
                    "+------+-------------------------+------------+------------+--------------------------------------------------+");
            System.out.printf("|%-6s|%-25s|%-12s|%-12s|%-50s|\n", "Ma NV", "Ten NV", "SDT", "Ngay sinh", "Dia chi");
            System.out.println(
                    "+------+-------------------------+------------+------------+--------------------------------------------------+");
            for (NhanVien i : list) {
                i.output();
            }
        }
    }

    public void ghiFile(){
        try {
            FileWriter fw = new FileWriter("DSNV.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < list.size(); i++) {
                bw.write(list.get(i).toString());
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (Exception e) {
        }
    }

    public void docFile() {
        try {
            FileReader fr = new FileReader("DSNV.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = ""; // doc tung dong
            while (true) {
                line = br.readLine(); // du lieu cua tung dong
                if (line == null) {
                    break;
                }
                String txt[] = line.split(";");
                 String loaiNV = txt[0];
                 String maNV = txt[1];
                 String ten = txt[2];
                 String sdt = txt[3];
                 String Thoigian=txt[4];
                 String subtxt[] = Thoigian.split("/");
                 int ngay = Integer.parseInt(subtxt[0]);
                 int thang = Integer.parseInt(subtxt[1]);
                 int nam = Integer.parseInt(subtxt[2]);
                 String soNha = txt[4];
                 String duong = txt[5];
                 String phuong = txt[6];
                 String tp = txt[7];
                 
                 if (loaiNV.equals("NVBH")==true)                      
                {
                 list.add(new NVBanHang(maNV,ten,sdt,new ThoiGian(ngay, thang, nam),new DiaChi(soNha,duong,phuong,tp)));
                } 
                else if (loaiNV.equals("NVQK")==true)
                {
                    list.add(new NVQuanKho(maNV,ten,sdt,new ThoiGian(ngay, thang, nam),new DiaChi(soNha,duong,phuong,tp)));
                }
                else if (loaiNV.equals("NVQL")==true)
                {
                    list.add(new NVQuanLy(maNV,ten,sdt,new ThoiGian(ngay, thang, nam),new DiaChi(soNha,duong,phuong,tp)));
                }
            }
          fr.close();
          br.close();
        } catch (Exception e) {
        }
    }
   public void XemNVQK ()
   {
    int k=0;  
    System.out.println(
                    "+------+-------------------------+------------+------------+--------------------------------------------------+");
            System.out.printf("|%-6s|%-25s|%-12s|%-12s|%-50s|\n", "Ma NV", "Ten NV", "SDT", "Ngay sinh", "Dia chi");
            System.out.println(
                    "+------+-------------------------+------------+------------+--------------------------------------------------+");
    for (int i = 0; i<list.size(); i++)
     {
        if (list.get(i) instanceof NVQuanKho)
        {
            list.get(i).output();
           k++;
        }
     }
     if (k ==0)
     {
        System.out.println("Khong co nhan vien quan kho !");
     }
   
    }  
     
    public void XemNVQL ()
    {
     int k=0;  
     System.out.println(
                     "+------+-------------------------+------------+------------+--------------------------------------------------+");
             System.out.printf("|%-6s|%-25s|%-12s|%-12s|%-50s|\n", "Ma NV", "Ten NV", "SDT", "Ngay sinh", "Dia chi");
             System.out.println(
                     "+------+-------------------------+------------+------------+--------------------------------------------------+");
     for (int i = 0; i<list.size(); i++)
      {
         if (list.get(i) instanceof NVQuanLy)
         {
             list.get(i).output();
            k++;
         }
      }
      if (k ==0)
      {
         System.out.println("Khong co nhan vien quan ly !");
      }
    
     }  
     
     public void XemNVBH ()
     {
      int k=0;  
      System.out.println(
                      "+------+-------------------------+------------+------------+--------------------------------------------------+");
              System.out.printf("|%-6s|%-25s|%-12s|%-12s|%-50s|\n", "Ma NV", "Ten NV", "SDT", "Ngay sinh", "Dia chi");
              System.out.println(
                      "+------+-------------------------+------------+------------+--------------------------------------------------+");
      for (int i = 0; i<list.size(); i++)
       {
          if (list.get(i) instanceof NVBanHang)
          {
              list.get(i).output();
             k++;
          }
       }
       if (k ==0)
       {
          System.out.println("Khong co nhan vien ban hang !");
       }
     
      }  
       
     public String LaySDT ()
     {
       return list.get(list.size()-1).getSDT();
     }
     
     public String LayLoaiNV ()
     {
       if (list.get(list.size()-1) instanceof NVBanHang)
        {
            return "NVBH";
        }
       else if (list.get(list.size()-1) instanceof NVQuanKho)
        {
            return "NVQK";
        }  
        else 
        {
            return "NVQL";
        }
      }
     




}

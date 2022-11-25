import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
public class DSKH implements docGhiFile{
    private ArrayList<KhachHang> list;
    Scanner sc = new Scanner(System.in);
    KiemTraDauVao ktr = new KiemTraDauVao();

    public DSKH() {
        list = new ArrayList<KhachHang>();
    }

    public DSKH(ArrayList<KhachHang> list) {
        this.list = new ArrayList<KhachHang>(list);
    }

    public ArrayList<KhachHang> getList(){
          return list;
    }

    public void setList(ArrayList<KhachHang>list){
        this.list = list;
    }

    public int soluongKH() {
        return list.size();
    }

    public void themKhachHang() {
        KhachHang kh = new KhachHang();
        kh.input();
        this.list.add(kh);
        ghiFile();
    }

    public void timKhachHang() {
        int flag = 0;
        System.out.println("1.Tim kiem theo ma khach hang");
        System.out.println("2.Tim kiem theo ten khach hang");
        System.out.println("3.Tim kiem theo SDT khach hang");
        int luachon = ktr.KiemTraLuaChon(3);
        switch (luachon) {
            case 1:
                System.out.println("Nhap ma khach hang muon tim: ");
                String makh = ktr.ktraMaKH();
                System.out.println(
                        "+------+-------------------------+------------+------------+--------------------------------------------------+");
                System.out.printf("|%-6s|%-25s|%-12s|%-12s|%-50s|\n", "Ma KH", "Ten KH", "SDT", "Ngay sinh", "Dia chi");
                System.out.println(
                        "+------+-------------------------+------------+------------+--------------------------------------------------+");
                for (KhachHang i : list) {
                    if (i.getMaKH().contains(makh)) {
                        i.output();
                        flag = 1;
                    }
                }
                if (flag == 0)
                    System.out.println("Khong tim thay!");
                break;
            case 2:
                System.out.println("Nhap ten khach hang muon tim: ");
                String hoten = ktr.ktraHoten();
                System.out.println(
                        "+------+-------------------------+------------+------------+--------------------------------------------------+");
                System.out.printf("|%-6s|%-25s|%-12s|%-12s|%-50s|\n", "Ma KH", "Ten KH", "SDT", "Ngay sinh", "Dia chi");
                System.out.println(
                        "+------+-------------------------+------------+------------+--------------------------------------------------+");
                for (KhachHang i : list)
                    if (i.getHoten().contains(hoten)) {
                        i.output();
                        flag = 1;
                    }
                if (flag == 0)
                    System.out.println("Khong tim thay!");
                break;
            default:
                System.out.println("Nhap sdt khach hang muon tim: ");
                String sdt = ktr.ktraSDT();
                System.out.println(
                        "+------+-------------------------+------------+------------+--------------------------------------------------+");
                System.out.printf("|%-6s|%-25s|%-12s|%-12s|%-50s|\n", "Ma KH", "Ten KH", "SDT", "Ngay sinh", "Dia chi");
                System.out.println(
                        "+------+-------------------------+------------+--------------------+--------------------------------------------------+");
                for (KhachHang i : list)
                    if (i.getSDT().contains(sdt)) {
                        i.output();
                        flag = 1;
                    }
                if (flag == 0)
                    System.out.println("Khong tim thay!");
        }
    }

    public void suaTTKH() {
        int flag = 0;
        while (flag == 0) {
            System.out.println("Nhap ma khach hang: ");
            String makh = ktr.ktraMaKH();
            for (KhachHang i : list) {
                if (makh.equals(i.getMaKH())) {
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

    public void xoaKH() {
        xuatDSKH();
        System.out.println("1.Xoa 1 KH");
        System.out.println("2.Xoa tat ca KH");
        int luachon = ktr.KiemTraLuaChon(2);
        switch (luachon) {
            case 1:
                int flag = 0;
                while (flag == 0) {
                    System.out.println("Nhap ma khach hang: ");
                    String makh = ktr.ktraMaKH();
                    for (int i = 0; i < list.size(); i++) {
                        if (makh.equals(list.get(i).getMaKH())) {
                            flag = 1;
                            System.out.println(
                                    "+------+-------------------------+------------+------------+--------------------------------------------------+");
                            System.out.printf("|%-6s|%-25s|%-12s|%-12s|%-50s|\n", "Ma KH", "Ten KH", "SDT", "Ngay sinh",
                                    "Dia chi");
                            System.out.println(
                                    "+------+-------------------------+------------+------------+--------------------------------------------------+");
                            list.get(i).output();
                            System.out.println("Ban co chac xoa khach hang nay?");
                            System.out.println("1.Dong y\n2.Khong");
                            luachon = ktr.KiemTraLuaChon(2);
                            switch(luachon){
                                case 1:
                                list.remove(i);
                                System.out.println("Xoa thanh cong!");
                                break;
                                case 2:
                                 System.out.println("Ban co muon chon khach hang khac?");
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
                System.out.println("Ban co chac xoa het khach hang?");
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

    public void xuatDSKH() {
        if (list.size() == 0) {
            System.out.println("Khong co khach hang!");
        } else {
            System.out.println(
                    "+------+-------------------------+------------+------------+--------------------------------------------------+");
            System.out.printf("|%-6s|%-25s|%-12s|%-12s|%-50s|\n", "Ma KH", "Ten KH", "SDT", "Ngay sinh", "Dia chi");
            System.out.println(
                    "+------+-------------------------+------------+------------+--------------------------------------------------+");
            for (KhachHang i : list) {
                i.output();
            }
        }
    }

    public void ghiFile(){
        try {
            FileWriter fw = new FileWriter("DSKH.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < list.size(); i++) {
                bw.write(list.get(i).DinhDangFile());
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (Exception e) {
        }
    }

    public void docFile() {
        try {
            FileReader fr = new FileReader("DSKH.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = ""; // doc tung dong
            while (true) {
                line = br.readLine(); // du lieu cua tung dong
                if (line == null) {
                    break;
                }
                String txt[] = line.split(";");
                 String maKH = txt[0];
                 String ten = txt[1];
                 String sdt = txt[2];
                 String Thoigian=txt[3];
                 String subtxt[] = Thoigian.split("/");
                 int ngay = Integer.parseInt(subtxt[0]);
                 int thang = Integer.parseInt(subtxt[1]);
                 int nam = Integer.parseInt(subtxt[2]);
                 String soNha = txt[4];
                 String duong = txt[5];
                 String quan = txt[6];
                 String tp = txt[7];
                 list.add(new KhachHang(maKH,ten,sdt,new ThoiGian(ngay, thang, nam),new DiaChi(soNha,duong,quan,tp)));
            }
          fr.close();
          br.close();
        } catch (Exception e) {
        }
    }
    public static void main(String[] args) {
        DSKH a = new DSKH();
        a.docFile();
        a.timKhachHang();
        a.xuatDSKH();
    }
}

public class KhachHang extends ConNguoi {
    private String maKH;
    KiemTraDauVao ktr = new KiemTraDauVao();
    public KhachHang(){
        super();
        maKH = null;
    }

    public KhachHang(String maKH,String ten,String sdt,ThoiGian ns,DiaChi dc){
        super(ten,sdt,ns,dc);
        this.maKH = maKH;
    }

    public void setMaKH(){
        System.out.println("Nhap ma khach hang: ");
        maKH = ktr.ktraMaKH();
        while(ktr.ktraTontaiMaKH(maKH)){
            maKH = ktr.ktraMaKH();
        }
    }

    public String getMaKH(){
        return maKH;
    }
    
    public void input(){
        setMaKH();
        setHoTen();
        setSDT();
        ns.nhapThoiGian();
        dc.Input_ID();
    }

    public void output(){
        System.out.printf("|%-6s|%-25s|%-12s|%-12s|%-50s|\n",maKH,this.ten,this.sdt,this.ns,this.dc);
        System.out.println("+------+-------------------------+------------+------------+--------------------------------------------------+");
    }

    public String DinhDangFile(){
        return maKH+";"+ten+";"+sdt+";"+ns+";"+dc;
    }
    
}

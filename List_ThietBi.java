import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class List_ThietBi {
    private ArrayList<ThietBi> List_TB;
    Scanner sc = new Scanner(System.in);
    public List_ThietBi()
    {
        this.List_TB = new ArrayList<ThietBi>();
    }
    public List_ThietBi(ArrayList<ThietBi> List_TB)
    {
        this.List_TB=List_TB;
    }

    public void ThemThietBi()
    {
      
        System.out.println("Nhap ma TB : ");
       
        String matb = sc.nextLine();
        int dem =0; 
        for (int i =0; i< List_TB.size(); i++)
        {
            if (matb.equals(List_TB.get(i).getMaTB()) == true)
            {
                System.out.println("Them so luong");
                int sl;
                sl = sc.nextInt();
                List_TB.get(i).Soluong += sl;  
                dem ++;
                sc.nextLine();
                GhiFile_ThietBi();
            }
        }
     
        if (dem == 0)
        {
            ThietBi TB = new ThietBi();
            TB.Input_ThietBi(matb);
            this.List_TB.add(TB);
            GhiFile_ThietBi();
        }
    }
    public void XuatThietBi()
    {
        System.out.println("\n-------------------------------------------------------------THONG-TIN-SAN-PHAM---------------------------------------------------------------");
        if(List_TB.size()==0)
        {
            System.out.println("NULL!!");
        }
        else
        {
            System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n","MA THIET BI", "HANG THIET BI", "SO LUONG TB", "GIA NHAP","GIA BAN","THONG SO KT","NHA_SX","NHA_CC");
            System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------");
            for (int i = 0; i < List_TB.size(); i++) 
            {
                List_TB.get(i).Output_ThietBi();
            }
        }
    }

    public void TimKiemThietBi()
    {
        int count =0;
        System.out.println("Nhap Vao Ma Thiet Bi Can Tim: ");
        String MATB = sc.nextLine();
        for(int i=0; i<List_TB.size();i++)
        {
            if(MATB.equals(List_TB.get(i).getMaTB())==true)
            {
                System.out.println("\n-------------------------------------------------THONG-TIN-SAN-PHAM---------------------------------------------------------------------------");
                System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n","MA THIET BI", "HANG THIET BI", "SO LUONG TB", "GIA NHAP","GIA BAN","THONG SO KT","NHA_SX","NHA_CC");
                System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------");
                List_TB.get(i).Output_ThietBi();
                count++;
            }
        }
        if(count == 0)
        {
            System.out.println("Thiet bi khong ton tai!");
        }
    }
    
    public void ThayDoiThongTinSP()
    {   int count=0;
        System.out.println("Nhap vao ma thiet bi can sua: ");
        String mathb = sc.nextLine();
        for(int i=0; i<List_TB.size();i++)
        {

            if(mathb.equals(List_TB.get(i).getMaTB())==true)
            {
                System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n","MA THIET BI", "HANG THIET BI", "SO LUONG TB", "GIA NHAP","GIA BAN","THONG SO KT","NHA_SX","NHA_CC");
                List_TB.get(i).Output_ThietBi();
                System.out.println("-----------------------------CHON-CAC-THONG-TIN-CAN-THAY-DOI-----------------------");
                System.out.println("1-Thay Doi Ma Thiet Bi");
                System.out.println("2-Thay Doi Hang Thiet Bi");
                System.out.println("3-Thay Doi Gia Nhap Thiet Bi");
                System.out.println("4-Thay Doi Gia Ban Thiet Bi");
                System.out.println("5-Thay Doi Thong So Thiet Bi");
                System.out.println("6-Thay Doi Nha San Xuat");
                System.out.println("7-Thay Doi Nha Cung Cap");
                int choose = sc.nextInt() ;
                switch(choose){
                    case 1:
                    List_TB.get(i).setMaTB(mathb);
                    break;
                    case 2:
                    List_TB.get(i).setHangTB();
                    break;
                    case 3:
                    List_TB.get(i).setGia_nhap();
                    break;
                    case 4:
                    List_TB.get(i).setGia_ban();
                    break;
                    case 5:
                    List_TB.get(i).setTSKT_TB();
                    break;
                    case 6:
                    List_TB.get(i).setNha_SX();
                    break;
                    case 7:
                    List_TB.get(i).setNha_CC();
                    break;
                }
            count++;
            }
        }
        if(count == 0)
        {
            System.out.println("Thiet bi khong ton tai!");
        }       
    }
    
    
    public void XoaThietBi()
    {
        System.out.println("Nhap Ma Thiet Bi Muon Xoa: ");
        String mthb = sc.nextLine();
        int dem=0;
        for(int i=0;i<List_TB.size();i++)
        { 
            
            if(mthb.equals(List_TB.get(i).getMaTB())==true)
            {
                System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n","MA THIET BI", "HANG THIET BI", "SO LUONG TB", "GIA NHAP","GIA BAN","THONG SO KT","NHA_SX","NHA_CC");
                List_TB.get(i).Output_ThietBi();
                dem++;
                List_TB.remove(List_TB.get(i));
                GhiFile_ThietBi();
            }    

        }
        if(dem == 0)
        {
            System.out.println("Thiet bi khong ton tai!");
        } 
    }
    public void XoaTatCa()
    {
        System.out.println("Xoa Tat Ca San Pham ");
        int luachon = sc.nextInt();
        System.out.println("XOA");
        System.out.println("THOAT");
        switch(luachon)
        {
            case 1:
            List_TB.clear();
            GhiFile_ThietBi();
            break;
        }
    }
    public void GhiFile_ThietBi()
    {
        try {
            File Thietbi = new File("C:/OOP/BTlaptrinh/DOAN_OOP/ThietBi.txt");
            if(!Thietbi.exists()){
                Thietbi.createNewFile();
            }
            FileWriter fw = new FileWriter(Thietbi);
            BufferedWriter bw = new BufferedWriter(fw);
            for(int i=0; i<List_TB.size();i++)
            {
                bw.write(List_TB.get(i).toString());
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (IOException ioe) {
            System.out.println("Exception occurred : ");
            ioe.printStackTrace();
        } 
    }

    public ArrayList<List_ThietBi> DocFile_ThietBi() {
        ArrayList<List_ThietBi> list = new ArrayList<>();
        try {
            FileReader fr = new FileReader("ThietBi.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while (true) {
                line = br.readLine(); 
                if (line == null) {
                    break;
                }
                String txt[] = line.split(";");
                String Mathietbi = txt[0];
                String Hangtb = txt[1];
                String soluong = txt[2];
                String gianhap = txt[3];
                String giaban = txt[4];
                String thongsokt = txt[5];
                String nhasx = txt[6];
                String nhacc = txt[7];
                List_TB.add(new ThietBi(Mathietbi,Hangtb,Integer.parseInt(soluong), Integer.parseInt(gianhap),Integer.parseInt(giaban),thongsokt,nhasx,nhacc));
            }
          fr.close();
          br.close();
        } catch (Exception e) {
        }
        return list;
    }
    public static int size() {
        return 0;
    }
    
}

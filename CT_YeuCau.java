
public class CT_YeuCau 
{
    protected String SDTYC;
    protected String MaYC;
    protected String TrangThaiYC;
    protected String MaNVPhuTrach;
    
    public CT_YeuCau() {
        SDTYC = null;
        MaYC = null;
        TrangThaiYC = null;
        MaNVPhuTrach =null;
    }
    
    
    
    public CT_YeuCau(String sDTYC, String maYC, String trangThaiYC, String maNVPhuTrach) {
        SDTYC = sDTYC;
        MaYC = maYC;
        TrangThaiYC = trangThaiYC;
        MaNVPhuTrach = maNVPhuTrach;
    }

//----------------------------------------------------------------

    public String getSDTYC() {
        return SDTYC;
    }



    public void setSDTYC(String sDTYC) {
        SDTYC = sDTYC;
    }

//-------------------------------------------------------------

    public String getMaYC() {
        return MaYC;
    }



    public void setMaYC(String maYC) {
        MaYC = maYC;
    }

//--------------------------------------------------------

    public String getTrangThaiYC() {
        return TrangThaiYC;
    }



    public void setTrangThaiYC(String trangThaiYC) {
        TrangThaiYC = trangThaiYC;
    }

   //------------------------------------------------------
    
   public String getMaNVPhuTrach() {
    return MaNVPhuTrach;
}



public void setMaNVPhuTrach(String maNVPhuTrach) {
    MaNVPhuTrach = maNVPhuTrach;
}

   //-----------------------------------------------------------
    public void Xuat_YeuCau ()
    {
        System.out.printf("%-20s%-20s%-20s%-20s\n",getSDTYC(), getMaYC(), getTrangThaiYC(), getMaNVPhuTrach());
        System.out.println("--------------------------------------------------------------------------");


    }
//-------------------------------------------------------
public String DinhDangFileYeuCau()
{
    return SDTYC + ";" + MaYC + ";" + TrangThaiYC + ";" + MaNVPhuTrach;
}




    

}

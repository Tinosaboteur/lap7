package test;

abstract class phuongtiendichuyen extends hangsanxuat{
    
    protected String loaiphuongtien;
    public String laytenhang(){
        return this.tenhangsanxuat;
    }
    public void batdau(){};
    public void tangtoc(){};
    public void dunglai(){};
    abstract double layvantoc();
}

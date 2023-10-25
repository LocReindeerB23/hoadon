package hoa_don;
public class KhachHang {
    private String maKH;
    private String hoTen;
    private String diaChi;
    public void nhap(){
        System.out.println("Nhập mã KH: ");
        this.maKH= nextLine();
        System.out.println("Nhập họ tên: ");
        this.hoTen= nextLine();
        System.out.println("Nhập địa chỉ: ");
        this.diaChi= nextLine();
    }
    /**
     *
     * @return
     */
    @Override
    public String toString(){
       return "Mã KH=\t"+this.maKH+"\n"+"Họ Tên= \t"+this.hoTen+"  \t"+"Địa chỉ= \t"+this.diaChi; 
    }

    private String nextLine() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

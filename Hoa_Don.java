package hoa_don;
import java.util.Scanner;
public class Hoa_Don {
    private String soHD;
    private int soMaHang;
    private KhachHang kH;
    private Hang dsHang;
    private NgayThang ngayHD;
    public void nhap(){
        kH= new KhachHang();
        dsHang= new Hang();
        ngayHD= new NgayThang(soMaHang, soMaHang, soMaHang);
        Scanner sn = new Scanner(System.in);
        System.out.println("nhập số HĐ: ");
        this.soHD= nextLine();
        System.out.println("nhập sô mã hàng: ");
        this.soMaHang= nextInt();
    }   

    private String nextLine() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private int nextInt() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

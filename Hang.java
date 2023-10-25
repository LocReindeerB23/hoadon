package hoa_don;
import java.util.Scanner;
public class Hang {
    private String tenHang;
    private double soLuong;
    private double donGia;

    public Hang(String tenHang, double soLuong, double donGia) {
        this.tenHang = tenHang;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Tên Hàng: ");
        this.tenHang = nextLine();
        System.out.println("Nhập số lượng: ");
        this.soLuong = nextDouble();
        System.out.println("Nhập đơn giá: ");
        this.donGia = nextDouble();
    }
    public double tinhTongTien(){
        double t = t +(donGia*soLuong);
        System.out.println("Tổng tiền HĐ là: "+t);
        return t;
    }

    private double nextDouble() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String nextLine() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

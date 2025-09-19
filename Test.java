package Test;
import java.util.Scanner;
import Class.PhanSo;
public class Test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		PhanSo ps1=new PhanSo();
		PhanSo ps2=new PhanSo();
		PhanSo psTong =new PhanSo();
		PhanSo psHieu =new PhanSo();
		PhanSo psTich =new PhanSo();
		PhanSo psThuong =new PhanSo();
		
		System.out.println("Nhap vao phan so thu nhat:");
		ps1.nhapPS(sc);
		System.out.println("Nhap vao phan so thu hai:");
		ps2.nhapPS(sc);
		
		psTong=ps1.congPS(ps2);
		psHieu=ps1.truPS(ps2);
		psTich=ps1.nhanPS(ps2);
		psThuong=ps1.chiaPS(ps2);
		
		System.out.println("\nPhan so thu nhat la:");
		ps1.hienThiPS();
		System.out.println("\nPhan so thu hai la:");
		ps2.hienThiPS();
		System.out.println("\nPhan so tong la:");
		psTong.hienThiPS();
		System.out.println("\nPhan so hieu la:");
		psHieu.hienThiPS();
		System.out.println("\nPhan so tich la:");
		psTich.hienThiPS();
		System.out.println("\nPhan so thuong la:");
		psThuong.hienThiPS();
		sc.close();
	}
}

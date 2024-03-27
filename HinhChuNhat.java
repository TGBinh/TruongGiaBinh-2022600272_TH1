/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
import java.util.Scanner;
public class HinhChuNhat {
    private float dai,rong;
    public float tinhDienTich(){
        return dai*rong;
    }
    public float tinhChuVi() {
        return (dai+rong)*2;
    }
    void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        dai = sc.nextFloat();
        System.out.print("Nhap chieu rong: ");
        rong = sc.nextFloat();
    }
    public static void inTieuDe(){
        System.out.printf("%15s%15s%15s%15s%n","Chiều dài ","Chiều rộng "," chu vi","Diện tich");
    }
    public void xuat() {
        System.out.printf("%15.1f%15.1f%15.1f%15.1f%n",dai,rong,tinhChuVi(),tinhDienTich());
    }
    public static void main(String[] args) {
    HinhChuNhat h=new HinhChuNhat();
    h.nhap();
    HinhChuNhat.inTieuDe();
    h.xuat();
    }
}

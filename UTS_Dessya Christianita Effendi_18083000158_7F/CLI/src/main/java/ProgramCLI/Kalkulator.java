/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProgramCLI;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	// TODO code application logic here
	ModuleUtama();
	}
    public static void ModuleUtama(){
	Scanner scan = new Scanner(System.in);
        System.out.println("Hallo! Selamat datang di Kalkulator Matematika Pintar (^-^)/ ");
	System.out.println("\n[pilihan]");
	System.out.println("1. Penjumlahan");
	System.out.println("2. Pengurangan");
	System.out.println("3. Perkalian");
	System.out.println("4. Pembagian");
	System.out.println("Silakan masukan pilihan anda :");
	int choice = scan.nextInt();
	switch(choice){
            case 1: ModuleTambah(); break;
            case 2: ModuleKurang(); break;
            case 3: ModuleKali(); break;
            case 4: ModuleBagi(); break;
	}
}
    public static void ModuleTambah(){
	Scanner scan = new Scanner(System.in);
	System.out.println("\n[penjumlahan]");
	System.out.println("masukan bilangan pertama :");
	double bil1 = scan.nextDouble();
	System.out.println("masukan bilangan kedua :");
	double bil2 = scan.nextDouble();
	System.out.println("hasil dari penjumlahan " + String.valueOf(bil1) + " + " + String.valueOf(bil2) + " adalah : " + (bil1 + bil2));
		
	ModuleUtama();

	}

    public static void ModuleKurang(){
	Scanner scan = new Scanner(System.in);
	System.out.println("\n[pengurangan]");
	System.out.println("masukan bilangan pertama :");
	double bil1 = scan.nextDouble();
	System.out.println("masukan bilangan kedua :");
	double bil2 = scan.nextDouble();
	System.out.println("hasil dari pengurangan " + String.valueOf(bil1) + " - " + String.valueOf(bil2) + " adalah : " + (bil1 - bil2));
		
	ModuleUtama();

	}

    public static void ModuleKali(){
	Scanner scan = new Scanner(System.in);
	System.out.println("\n[perkalian]");
	System.out.println("masukan bilangan pertama :");
	double bil1 = scan.nextDouble();
	System.out.println("masukan bilangan kedua :");
	double bil2 = scan.nextDouble();
	System.out.println("hasil dari perkalian " + String.valueOf(bil1) + " * " + String.valueOf(bil2) + " adalah : " + (bil1 * bil2));
		
	ModuleUtama();

	}

    public static void ModuleBagi(){
	Scanner scan = new Scanner(System.in);
	System.out.println("\n[pembagian]");
	System.out.println("masukan bilangan pertama :");
	double bil1 = scan.nextDouble();
	System.out.println("masukan bilangan kedua :");
	double bil2 = scan.nextDouble();
	System.out.println("hasil dari pembagian " + String.valueOf(bil1) + " / " + String.valueOf(bil2) + " adalah : " + (bil1 / bil2));
		
	ModuleUtama();

	}
}


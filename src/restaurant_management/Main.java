package restaurant_management;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.InputMismatchException;

public class Main {
    public static Function fungsi;
    public static Elemen elm;
    public static data_mobil drs;
    
    public static void main(String[] args){
        
        // List Stock
        List toyota_stock = new List();
        List honda_stock = new List();
        List suzuki_stock = new List();
        
        // List Penjualan
        List hondaList = new List();
        List suzukiList = new List();
        List toyotaList = new List();
        List[] terjual = {hondaList, suzukiList, toyotaList};
        
        // Scanner
        Scanner s = new Scanner(System.in);
        Scanner k = new Scanner(System.in);
        int pilihan = 0;
        
        boolean lagi = false;
        boolean lagi2 = false;
        
        String nama;
        String type = null;
        String warna = null;
        String platnomor = null;
        String nama_pembeli = null;
        int banyak;
        int harga = 0;
        int index = 0;
        
        String choice = "";

        toyota_stock.insertData(data_mobil.toyota);
        honda_stock.insertData(data_mobil.honda);
        suzuki_stock.insertData(data_mobil.suzuki);        

        
        do {
            System.out.println("===========================");  
            System.out.println("Rental Mobil");
            System.out.println("==========================="); 
            System.out.println("1. Lihat Data Tersedia ");
            System.out.println("2. Tambah Data ");
            System.out.println("3. Hapus Data ");
            System.out.println("4. Cari Data ");
            System.out.println("5. Lihat Data Penjualan ");
            System.out.println("6. Hitung Jumlah Penjualan ");
            System.out.println("7. Hitung Total Pendapatan ");
            System.out.println("8. Beli Barang");
            System.out.println("9. Keluar ");
            
            try{
                System.out.print("Pilihan : ");
                pilihan = s.nextInt();
            
                switch(pilihan){                
                    case 1 : //INI MENU 1 BANG
                            System.out.println("\n\n");
                            fungsi.ulang();
                            int pilihan2 = s.nextInt();
                            if (pilihan2 == 1) 
                            {
                            System.out.print("\033[H\033[2J");
                            System.out.flush();
                            System.out.println("\n---------------------------- List Toyota----------------------------\n");
                            System.out.println("--------------------------------------------------------");
                            System.out.printf("|  %-3s|               %-20s |   %-8s| \n","NO","Model","Harga");
                            System.out.println("--------------------------------------------------------");
                            toyota_stock.lihat_data();
                            System.out.println("-----------------------------------------------------------------");
                            }
                            else if (pilihan2 == 2){
                            System.out.println("\n---------------------------- List Honda ----------------------------\n");
                            System.out.println("--------------------------------------------------------");;
                            System.out.printf("|  %-3s|               %-20s |   %-8s| \n","NO","Model","Harga");
                            System.out.println("--------------------------------------------------------");;
                            honda_stock.lihat_data();
                            System.out.println("-----------------------------------------------------------------");
                            }
                            else if (pilihan2 == 3){
                            System.out.println("\n---------------------------- List Suzuki ----------------------------\n");
                            System.out.println("--------------------------------------------------------");
                            System.out.printf("|  %-3s|               %-20s |   %-8s| \n","NO","Model","Harga");
                            System.out.println("--------------------------------------------------------");
                            suzuki_stock.lihat_data();
                            System.out.println("-----------------------------------------------------------------");
                            }                            
                                                              
                        break;

                    case 2 : //INI MENU 2 BANG                   
                        String info_dicari;
                        fungsi.ulang();
                        int pilihan3 = s.nextInt();
                        switch(pilihan3){
                            case 1 : //Pilihan menu toyota
                                fungsi.ulang2();
                                int pilihan4 = s.nextInt();
                                s.nextLine();
                                if (pilihan4 == 1){
                                    System.out.println("Masukkan Jumlah Mobil (TOYOTA) yang akan dimasukkan : ");
                                    banyak = s.nextInt();
                                    String toyota = s.nextLine(); // skip
                                    
                                    for (int i = 0; i < banyak; i++) {
                                        System.out.println("Nama : ");
                                        nama = s.nextLine();
                                        System.out.println("Type : ");
                                        type = s.nextLine();
                                        System.out.println("Warna : ");
                                        warna = s.nextLine();
                                        System.out.println("Harga : ");
                                        harga = Integer.parseInt(s.nextLine());
                                        System.out.println("Plat Nomor : ");
                                        platnomor = s.nextLine();
                                        System.out.println("Nama Pembeli : ");
                                        nama_pembeli = s.nextLine();
                                        // ---------------------------------------
                                        toyota_stock.insertFirst(nama, type, warna, harga, platnomor, nama_pembeli); 
                                        System.out.println("===========================");
                                    }                                
                                  
                                    break;                                
                                }else if (pilihan4 == 2){
                                    System.out.println("Masukkan Jumlah Mobil (TOYOTA) yang akan dimasukkan : ");
                                    banyak = s.nextInt();
                                    String toyota = s.nextLine(); // skip
                                    for (int i = 0; i < banyak; i++) {
                                        System.out.println("Nama : ");
                                        System.out.println("Type : ");
                                        System.out.println("Warna : ");
                                        System.out.println("Harga : ");
                                        System.out.println("Plat Nomor : ");
                                        System.out.println("Nama Pembeli : ");
                                        nama = s.nextLine(); 
                                        type = s.nextLine();
                                        warna = s.nextLine();
                                        harga = s.nextInt();
                                        platnomor = s.nextLine();
                                        nama_pembeli = s.nextLine();                                    
                                        //BAKAL SKIP KARNA SETELAH INT
                                        info_dicari = s.nextLine();
                                        System.out.println("Masukkan nama Mobil (TOYOTA) yang akan dimasukkan setelah ini : ");
                                        info_dicari = s.nextLine();
                                        // ---------------------------------------
                                        toyota_stock.insertAt(nama, type, warna, harga, platnomor, nama_pembeli, info_dicari);
                                        System.out.println("===========================");
                                    }
                                    
                                    break;
                                    
                                    
                                    }else if(pilihan4 == 3){
                                    System.out.println("Masukkan Jumlah Mobil (TOYOTA) yang akan dimasukkan : ");
                                    banyak = s.nextInt();
                                    String toyota = s.nextLine(); // skip

                                    for (int i = 0; i < banyak; i++) {
                                        System.out.println("Nama : ");
                                        System.out.println("Type : ");
                                        System.out.println("Warna : ");
                                        System.out.println("Harga : ");
                                        System.out.println("Plat Nomor : ");
                                        System.out.println("Nama Pembeli : ");
                                        nama = s.nextLine(); 
                                        type = s.nextLine();
                                        warna = s.nextLine();
                                        harga = s.nextInt();
                                        platnomor = s.nextLine();
                                        nama_pembeli = s.nextLine();
                                        // ---------------------------------------s
                                        toyota_stock.insertLast(nama, type, warna, harga, platnomor, nama_pembeli);
                                        System.out.println("===========================");
                                        
                                    }
                                    
                                    break;
                                }                                                       
                            case 2 : //Pilihan menu honda
                                fungsi.ulang2();
                                int pilihan5 = s.nextInt();
                                s.nextLine();
                                if (pilihan5 == 1){
                                    System.out.println("Masukkan Jumlah Mobil (HONDA) yang akan dimasukkan : ");
                                    banyak = s.nextInt();
                                    String honda= s.nextLine(); // skip

                                                                        
                                    for (int i = 0; i < banyak; i++) {
                                        System.out.println("Nama : ");
                                        System.out.println("Type : ");
                                        System.out.println("Warna : ");
                                        System.out.println("Harga : ");
                                        System.out.println("Plat Nomor : ");
                                        System.out.println("Nama Pembeli : ");
                                        nama = s.nextLine(); 
                                        type = s.nextLine();
                                        warna = s.nextLine();
                                        harga = s.nextInt();
                                        platnomor = s.nextLine();
                                        nama_pembeli = s.nextLine();                                    
                                        honda_stock.insertFirst(nama, type, warna, harga, platnomor, nama_pembeli);
                                        System.out.println("===========================");
                                        s.close();
                                    }
                                    
                                    break;                                
                                    }else if (pilihan5 == 2){
                                    System.out.println("Masukkan Jumlah Mobil (HONDA) yang akan dimasukkan : ");
                                    banyak = s.nextInt();
                                    String honda= s.nextLine(); // skip
                                    
                                    for (int i = 0; i < banyak; i++) {
                                        System.out.println("Nama : ");
                                        System.out.println("Type : ");
                                        System.out.println("Warna : ");
                                        System.out.println("Harga : ");
                                        System.out.println("Plat Nomor : ");
                                        System.out.println("Nama Pembeli : ");
                                        nama = s.nextLine(); 
                                        type = s.nextLine();
                                        warna = s.nextLine();
                                        harga = s.nextInt();
                                        platnomor = s.nextLine();
                                        nama_pembeli = s.nextLine();

                                        //BAKAL SKIP KARNA SETELAH INT
                                        info_dicari = s.nextLine();
                                        System.out.println("Masukkan nama Mobil (HONDA) yang akan dimasukkan setelah ini : ");
                                        info_dicari = s.nextLine();
                                        honda_stock.insertAt(nama, type, warna, harga, platnomor, nama_pembeli, info_dicari);
                                        System.out.println("===========================");
                                    }
                                                                    
                                    break;                                
                                    }else if(pilihan5 == 3){
                                    System.out.println("Masukkan Jumlah Mobil (HONDA) yang akan dimasukkan : ");
                                    banyak = s.nextInt();
                                    String honda = s.nextLine(); // skip
                                    
                                    for (int i = 0; i < banyak; i++) {
                                        System.out.println("Nama : ");
                                        System.out.println("Type : ");
                                        System.out.println("Warna : ");
                                        System.out.println("Harga : ");
                                        System.out.println("Plat Nomor : ");
                                        System.out.println("Nama Pembeli : ");
                                        nama = s.nextLine(); 
                                        type = s.nextLine();
                                        warna = s.nextLine();
                                        harga = s.nextInt();
                                        platnomor = s.nextLine();
                                        nama_pembeli = s.nextLine();

                                        honda_stock.insertLast(nama, type, warna, harga, platnomor, nama_pembeli);
                                        System.out.println("===========================");
                                    }
                                    
                                    break;                                
                                }                            
                        case 3 : //Pilihan menu dessert
                                fungsi.ulang2();
                                int pilihan6 = s.nextInt();
                                if (pilihan6 == 1){
                                    System.out.println("Masukkan Jumlah Mobil (SUZUKI) yang akan dimasukkan : ");
                                    banyak = s.nextInt();
                                    String suzuki = s.nextLine(); // skip

                                    for (int i = 0; i < banyak; i++) {
                                        System.out.println("Nama : ");
                                        System.out.println("Type : ");
                                        System.out.println("Warna : ");
                                        System.out.println("Harga : ");
                                        System.out.println("Plat Nomor : ");
                                        System.out.println("Nama Pembeli : ");
                                        nama = s.nextLine(); 
                                        type = s.nextLine();
                                        warna = s.nextLine();
                                        harga = s.nextInt();
                                        platnomor = s.nextLine();
                                        nama_pembeli = s.nextLine();
                                        suzuki_stock.insertFirst(nama, type, warna, harga, platnomor, nama_pembeli);
                                        System.out.println("===========================");
                                        s.close();
                                    }
                                    

                                    break;

                                }else if (pilihan6 == 2){
                                    System.out.println("Masukkan Jumlah Mobil (SUZUKI) yang akan dimasukkan : ");
                                    banyak = s.nextInt();
                                    String suzuki = s.nextLine(); // skip

                                    for (int i = 0; i < banyak; i++) {
                                        System.out.println("Nama : ");
                                        System.out.println("Type : ");
                                        System.out.println("Warna : ");
                                        System.out.println("Harga : ");
                                        System.out.println("Plat Nomor : ");
                                        System.out.println("Nama Pembeli : ");
                                        nama = s.nextLine(); 
                                        type = s.nextLine();
                                        warna = s.nextLine();
                                        harga = s.nextInt();
                                        platnomor = s.nextLine();
                                        nama_pembeli = s.nextLine();
                                        //BAKAL SKIP KARNA SETELAH INT
                                        info_dicari = s.nextLine();
                                        System.out.println("Masukkan nama Mobil (SUZUKI) yang akan dimasukkan setelah ini : ");
                                        info_dicari = s.nextLine();
                                        suzuki_stock.insertAt(nama, type, warna, harga, platnomor, nama_pembeli,info_dicari);
                                        System.out.println("===========================");
                                    }
                                    
                                    break;

                                }else if(pilihan6 == 3){
                                    System.out.println("Masukkan Jumlah Mobil (SUZUKI) yang akan dimasukkan : ");
                                    banyak = s.nextInt();
                                    String suzuki = s.nextLine(); // skip

                                    for (int i = 0; i < banyak; i++) {
                                        System.out.println("Nama : ");
                                        System.out.println("Type : ");
                                        System.out.println("Warna : ");
                                        System.out.println("Harga : ");
                                        System.out.println("Plat Nomor : ");
                                        System.out.println("Nama Pembeli : ");
                                        nama = s.nextLine(); 
                                        type = s.nextLine();
                                        warna = s.nextLine();
                                        harga = s.nextInt();
                                        platnomor = s.nextLine();
                                        nama_pembeli = s.nextLine();

                                        suzuki_stock.insertLast(nama, type, warna, harga, platnomor, nama_pembeli);
                                        System.out.println("===========================");
                                    }
                                    
                                    break;
                                }
                            case 5 :
                                lagi = true;

                            default :  
                                System.out.println("Pilihan anda salah!");

                        }

                        case 3 : //INI MENU 3 BANG----------------------------------------------------------------------------------------------------------------------------------------------
                            fungsi.ulang();
                            int pilihan4 = s.nextInt();
                            switch(pilihan4){
                                case 1 :
                                    fungsi.ulang3();
                                    int pilihan5 = s.nextInt();
                                    if (pilihan5 == 1){
                                        System.out.println("Hapus Depan");
                                        toyota_stock.deleteFirst();
                                        System.out.println("Data berhasil dihapus!!");
                                        
                                        break;  
                                    }else if (pilihan5 == 2){
                                        System.out.print("Masukkan urutan mobil toyota yang akan dihapus: ");
                                        index = s.nextInt();
                                        String toyota = s.nextLine(); // skip
                                        toyota_stock.hapusListAt(index);
                                        System.out.println("Data berhasil dihapus");
                                        
                                        break;    
                                    }else if(pilihan5 == 3){
                                        System.out.println("Hapus Belakang");
                                        toyota_stock.deleteLast();
                                        System.out.println("Data berhasil dihapus!!");
                                        
                                        break;
                                    }
                                case 2 :
                                    fungsi.ulang3();
                                    int pilihan6 = s.nextInt();
                                    if (pilihan6 == 1){
                                        System.out.println("Hapus Depan");
                                        honda_stock.deleteFirst();
                                        System.out.println("Data berhasil dihapus!!");
                                        
                                        break;  
                                    }else if (pilihan6 == 2){
                                        System.out.print("Masukkan urutan mobil Honda yang akan dihapus: ");
                                        index = s.nextInt();
                                        String honda = s.nextLine(); // skip
                                        honda_stock.hapusListAt(index);
                                        System.out.println("Data berhasil dihapus");
                                        
                                        break;

                                    }else if(pilihan6 == 3){
                                        System.out.println("Hapus Belakang");
                                        honda_stock.deleteLast();
                                        System.out.println("Data berhasil dihapus!!");
                                        
                                        break;

                                    }

                                case 3 :
                                    fungsi.ulang3();
                                    int pilihan7 = s.nextInt();
                                    if (pilihan7 == 1){
                                        System.out.println("Hapus Depan");
                                        suzuki_stock.deleteFirst();
                                        System.out.println("Data berhasil dihapus!!");
                                        
                                        break;

                                    }else if (pilihan7 == 2){
                                       System.out.print("Masukkan urutan mobil Suzuki yang akan dihapus: ");
                                        index = s.nextInt();
                                        String suzuki = s.nextLine(); // skip
                                        suzuki_stock.hapusListAt(index);
                                        System.out.println("Data berhasil dihapus");
                                        
                                        break;

                                    }else if(pilihan7 == 3){
                                        System.out.println("Hapus Belakang");
                                        suzuki_stock.deleteLast();
                                        System.out.println("Data berhasil dihapus!!");
                                        
                                        break;
                                    }
                                case 4 :
                                    lagi = true;
                                default :  
                                    System.out.println("Pilihan anda salah!");

                            }
                            break;
                        case 4:
                            fungsi.ulang();
                            int pilihan5 = s.nextInt();
                            switch(pilihan5){
                               case 1 :
                                    fungsi.ulang4();
                                    int pilihan8 = s.nextInt();
                                    s.nextLine();
                                    if (pilihan8 == 1){
                                        System.out.println("Masukkan Mobil Toyota yang akan di cari:");
                                        nama = s.nextLine();
                                        toyota_stock.cari(nama);
                                        break;  
                                    }else if (pilihan8 == 2){
                                        System.out.println("Masukkan Mobil Toyota yang akan di cari sebelumnya: ");
                                        nama = s.nextLine();
                                        toyota_stock.cariSebelumnya(nama);
                                        break;    
                                    }else if(pilihan8 == 3){
                                        System.out.println("Masukkan Mobil Toyota yang akan di cari setelahnya: ");
                                        nama = s.nextLine();
                                        toyota_stock.cariSetelahnya(nama);
                                        break;
                                    }
                                case 2 :
                                    fungsi.ulang4();
                                    int pilihan9 = s.nextInt();
                                    s.nextLine();
                                    if (pilihan9 == 1){
                                        System.out.println("Masukkan Mobil Honda yang akan di cari:");
                                        nama = s.nextLine();
                                        honda_stock.cari(nama);
                                        break;  
                                    }else if (pilihan9 == 2){
                                        System.out.println("Masukkan Mobil Honda yang akan di cari sebelumnya: ");
                                        nama = s.nextLine();
                                        honda_stock.cariSebelumnya(nama);
                                        break;    
                                    }else if(pilihan9 == 3){
                                        System.out.println("Masukkan Mobil Honda yang akan di cari setelahnya: ");
                                        nama = s.nextLine();
                                        honda_stock.cariSetelahnya(nama);
                                        break;
                                    }

                                case 3 :
                                    fungsi.ulang4();
                                    int pilihan10 = s.nextInt();
                                    s.nextLine();
                                    if (pilihan10 == 1){
                                        System.out.println("Masukkan Mobil Suzuki yang akan di cari:");
                                        nama = s.nextLine();
                                        suzuki_stock.cari(nama);
                                        break;  
                                    }else if (pilihan10 == 2){
                                        System.out.println("Masukkan Mobil Suzuki yang akan di cari sebelumnya: ");
                                        nama = s.nextLine();
                                        suzuki_stock.cariSebelumnya(nama);
                                        break;    
                                    }else if(pilihan10 == 3){
                                        System.out.println("Masukkan Mobil Suzuki yang akan di cari setelahnya: ");
                                        nama = s.nextLine();
                                        suzuki_stock.cariSetelahnya(nama);
                                        break;
                                    }
                                case 4 :
                                    lagi = true;
                                default :  
                                    System.out.println("Pilihan anda salah!");

                                    }
                                    break;


                        case 5 : //INI MENU 5 BANG
                            System.out.println("--------------------------------------------------------");
                            System.out.printf("|  %-3s|               %-20s |   %-8s| \n","NO","Toyota","Harga");
                            System.out.println("--------------------------------------------------------");
                            toyotaList.lihat_data();
                            System.out.println("--------------------------------------------------------");

                            System.out.println("");
                            System.out.println("--------------------------------------------------------");
                            System.out.printf("|  %-3s|               %-20s |   %-8s| \n","NO","Honda","Harga");
                            System.out.println("--------------------------------------------------------");
                            hondaList.lihat_data();
                            System.out.println("--------------------------------------------------------");

                            System.out.println("");
                            System.out.println("--------------------------------------------------------");
                            System.out.printf("|  %-3s|               %-20s |   %-8s| \n","NO","Suzuki","Harga");
                            System.out.println("--------------------------------------------------------");
                            suzukiList.lihat_data();
                            System.out.println("--------------------------------------------------------");
                            break;

                        case 6 : //INI MENU 6 BANG
                            System.out.println("------------------------------------");
                            System.out.printf("|           %-15s  |  %-3s| \n","Toyota",toyotaList.total());
                            System.out.printf("|           %-15s  |  %-3s| \n","Honda",hondaList.total());
                            System.out.printf("|           %-15s  |  %-3s| \n","Suzuki",suzukiList.total());
                            System.out.println("------------------------------------");
                               
                            break;

                        case 7 : //INI MENU 7 BANG
                            System.out.println("--------------------------------------------------");
                            System.out.printf("|           %-15s  |      %-8s     | \n","Toyota",toyotaList.totalHarga());
                            System.out.printf("|           %-15s  |      %-8s     | \n","Honda",hondaList.totalHarga());
                            System.out.printf("|           %-15s  |      %-8s     | \n","Suzuki",suzukiList.totalHarga());
                            System.out.println("--------------------------------------------------");
                            System.out.printf("|           %-15s  |      %-8s     | \n","TOTAL",(toyotaList.totalHarga() + hondaList.totalHarga() + suzukiList.totalHarga()));
                            System.out.println("--------------------------------------------------");
                             
                            break;


                        case 8 : //INI MENU 8 BANG
                            fungsi.ulang();
                            int pilihan6 = s.nextInt();
                            nama = s.nextLine(); //skip
                            if (pilihan6 == 1 ){
                                System.out.println("--------------------------------------------------------");
                                System.out.printf("|  %-3s|               %-20s |   %-8s| \n","NO","Mobil Toyota","Harga");
                                System.out.println("--------------------------------------------------------");
                                toyota_stock.lihat_data();
                                System.out.println("--------------------------------------------------------");
                                System.out.print("Ketikkan Mobil Toyota yang ingin dibeli = ");
                                nama = s.nextLine();
                                System.out.println("--------------------------------");
                                toyota_stock.beli(nama, toyotaList);
                            }

                            if (pilihan6 == 2 ){
                                System.out.println("--------------------------------------------------------");
                                System.out.printf("|  %-3s|               %-20s |   %-8s| \n","NO","Mobil Honda","Harga");
                                System.out.println("--------------------------------------------------------");
                                honda_stock.lihat_data();
                                System.out.println("--------------------------------------------------------");
                                System.out.print("Ketikkan Mobil Honda yang ingin dibeli = ");
                                nama = s.nextLine();
                                System.out.println("--------------------------------");
                                honda_stock.beli(nama, hondaList);
                            }

                            if (pilihan6 == 3 ){
                                System.out.println("--------------------------------------------------------");
                                System.out.printf("|  %-3s|               %-20s |   %-8s| \n","NO","Suzuki","Harga");
                                System.out.println("--------------------------------------------------------");
                                suzuki_stock.lihat_data();
                                System.out.println("--------------------------------------------------------");
                                System.out.print("Ketikkan Mobil Suzuki yang ingin dibeli = ");
                                nama = s.nextLine();
                                System.out.println("--------------------------------");
                                suzuki_stock.beli(nama, suzukiList);
                            }
                            
                            break;
                            
                        case 9 :
                              System.exit(0);
                            break;

                        default :
                            System.out.println("input anda salah");
                    }
                 } catch (InputMismatchException e) {
                System.out.println("Input harus berupa angka. Silakan coba lagi.");
                s.nextLine();
            } catch (Exception e) {
                System.out.println("Terjadi kesalahan: " + e.getMessage());
                s.nextLine();
            }

            System.out.print("Kembali ke menu utama? (y/n): ");
        } while (s.next().equalsIgnoreCase("y"));

        s.close();
    }
    
}

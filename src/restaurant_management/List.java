package restaurant_management;



public class List {
    List toyota_stock;
    Elemen first;
    Elemen last;
    
    List() {
       first = null;
    }
    
    void insertData(Elemen[] elemen) {
        for (Elemen elemen2 : elemen) {
            insertLast_raw(elemen2.info.nama, elemen2.info.type, elemen2.info.warna, elemen2.info.harga, elemen2.info.platnomor, elemen2.info.nama_pembeli);
        }
    }
    
    
        void insertLast_raw(String nama, String type, String warna, int harga, String platnomor, String nama_pembeli) {
        Elemen elemenBaru = new Elemen (nama, type, warna, harga, platnomor, nama_pembeli);
        if (first == null) {
            first = elemenBaru;
        }
        else {
            Elemen current = first;
            while (current.next != null) {
                current = current.next;
            }
            current.next = elemenBaru;
            elemenBaru.prev = current;
        }
    }
    
    
    void insertFirst(String nama, String type, String warna, int harga, String platnomor, String nama_pembeli) {
    Elemen elemen_baru = new Elemen(nama, type, warna, harga, platnomor, nama_pembeli);
    if (first == null) {
        first = elemen_baru;}
    else{
        elemen_baru.next = first;
        first.prev = elemen_baru;
        //3. Arahkan first ke elemenfirst.prev = elemen_baru; baru
        first = elemen_baru;
        }
    }
    
    void insertLast(String nama, String type, String warna, int harga, String platnomor, String nama_pembeli) {
        // buat elemen baru
        Elemen elemen_baru = new Elemen(nama, type, warna, harga, platnomor, nama_pembeli);
        if (first == null) {
            first = elemen_baru;
        } else {
            Elemen elementSementara = first;
            while (elementSementara.next != null) {
                elementSementara = elementSementara.next;
            }
            elementSementara.next = elemen_baru;
            elemen_baru.prev = elementSementara.next;
        }
    }


    void insertAt(String nama, String type, String warna, int harga, String platnomor, String nama_pembeli, String info_dicari) {
    if (first == null) {
        // Linked list kosong
        first = new Elemen(nama, type, warna, harga, platnomor, nama_pembeli);
        first.next = first;
        first.prev = first;
    } else {
        
        Elemen elemenSementara = first;
        Elemen elemen_baru = new Elemen(nama, type, warna, harga, platnomor, nama_pembeli);
        while (true) {
            if (elemenSementara.info.nama.equals(info_dicari)) {
                elemen_baru.next = elemenSementara.next;
                elemenSementara.next.prev = elemen_baru;
                elemen_baru.prev = elemenSementara;
                elemenSementara.next = elemen_baru;
                break;
            } else {
                elemenSementara = elemenSementara.next;
                if (elemenSementara == first) {
                    // Tidak ada elemen yang sesuai dengan info_dicari
                    break;
                }
            }
        }
    }
}


    void deleteFirst() {
        if (first != null) {
            first = first.next;
            first.prev = null;
        }
    }
    
    void deleteLast() {
        if (first.next == null){
            first = null;
        }
     
        else if (first != null) {
            Elemen elemenSementara = first;
            Elemen beforeLast = null;
            
            while (elemenSementara.next != null) {
                beforeLast = elemenSementara;
                elemenSementara = elemenSementara.next;

            }
            beforeLast.next = null; 
            elemenSementara.prev = null;
            
        }
    }
    
    
    void hapusListAt(int index) {
    
    if (first == null) {
        System.out.println("List Kosong");
    } else {
        Elemen elemenSementara = first;
        int count = 0;
        while (elemenSementara != null) {
            if (count == index) {
                Elemen elemen_baru = new Elemen(elemenSementara.info.nama, elemenSementara.info.type, elemenSementara.info.warna, elemenSementara.info.harga,elemenSementara.info.platnomor, elemenSementara.info.nama_pembeli);
                System.out.println(toyota_stock);
                
                if (elemenSementara == first) {
                    first = first.next;
                }
                if (elemenSementara.next != null) {
                    elemenSementara.next.prev = elemenSementara.prev;
                }
                if (elemenSementara.prev != null) {
                    elemenSementara.prev.next = elemenSementara.next;
                }
                elemenSementara = null;
                System.out.println("Elemen pada indeks " + index + " berhasil dihapus");
                
                
                break;
            }
            elemenSementara = elemenSementara.next;
            count++;
            if (elemenSementara == first) {
                System.out.println("Indeks yang diminta melebihi batas");
                break;
            }
        }
    }
}
 
    void beli(String info, List lt) {
        Elemen current = first;
        if (current == null) {
            System.out.println("List kosong!");
        } else {
            while (current != null) {
                if (current.info.nama.equals(info)) {
                    lt.insert_beli(current.info.nama, current.info.type, current.info.warna, current.info.harga, current.info.platnomor, current.info.nama_pembeli);
                    delete_beli(info);
                    System.out.println("Berhasil Dibeli");
                    System.out.println("--------------------------------");
                    break;
                }
                current = current.next;
            }
            if (current == null){
                System.out.println("Tidak Ada Dalam Daftar");
            }
        }
    }
    
    void cari(String nama) {
    if (first == null) {
        System.out.println("List kosong");
        return;
    }
    Elemen elemenSementara = first;
    while (elemenSementara != null) {
        if (elemenSementara.info.nama.equals(nama)) {
            System.out.println("Menu di temukan");
            System.out.println("Nama: " + elemenSementara.info.nama);
            System.out.println("Harga: " + elemenSementara.info.harga);
            return;
        }
        elemenSementara = elemenSementara.next;
    }
    System.out.println("Maaf, " + nama + " tidak ditemukan");
    }
    
    void cariSetelahnya(String nama){
        Elemen elemenSementara = first;
        while (!elemenSementara.info.nama.equals(nama)){
            elemenSementara = elemenSementara.next;
            if (elemenSementara == last){
                System.out.println("Nama yang di cari tidak ada");
                break;
            }
        }
        if (elemenSementara.info.nama.equals(nama)){
            System.out.println("Nama: "+ elemenSementara.info.nama);
            System.out.println("Nama Setelahnya: " + elemenSementara.next.info.nama);
            System.out.println("Harga: " + elemenSementara.next.info.harga);
        }
    }
    
    void cariSebelumnya(String nama){
        Elemen elemenSementara = first;
        Elemen before = null;
        while (!elemenSementara.info.nama.equals(nama)){
            before = elemenSementara;
            elemenSementara = elemenSementara.next;
            if (elemenSementara == first){
                System.out.println("Nama yang di cari tidak ada");
                break;
            }
        }
        if (elemenSementara.info.nama.equals(nama)){
            System.out.println("Nama: "+elemenSementara.info.nama);
            if (before == null){
                System.out.println("Tidak ada nama sebelumnya");
            } else {
                System.out.println("Nama Sebelumnya: "+ before.info.nama);
                System.out.println("Harga: "+ before.info.harga);
            }
        }
    }
    
    void delete_beli(String info){
        if (first == null) {
            System.out.println("Data kosong!");
        }
        else{
            Elemen current = first;
            Elemen beforeLast = current;
            while (!current.info.nama.equals(info)){
                beforeLast = current;
                current = current.next;
            }
            if (current.next == null){
                beforeLast.next = null;
            } else if (info.equals(first.info.nama)) {
                first = current.next;
                first.prev = null;
            } else if (current.info.nama.equals(info)){
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }else{
                System.out.println("Data yang dicari tidak ada!");
            }
        }
    }
    void insert_beli(String nama, String type, String warna, int harga, String platnomor, String nama_pembeli) {
        Elemen elemenBaru = new Elemen(nama, type, warna, harga, platnomor, nama_pembeli);
        if (first == null) {
            first = elemenBaru;
        }
        else {
             Elemen current = first;
            while (current.next != null) {
           
                current = current.next;
            }
            current.next = elemenBaru;
            elemenBaru.prev = current;
        }
    }
    
    int total(){
        Elemen current = first;
        int total = 0;
        while (current != null){
            total += 1;
            current = current.next;
        }
        return total;
    }
    
    int totalHarga() {
        Elemen current = first;
        int sum = 0;
        while (current != null) {
            sum += current.info.harga;
            current = current.next;
        }
        return sum;
    }
    
    void lihat_data() {
       int i = 0;
       Elemen elemenSementara = first;
       if(elemenSementara == null){
           System.out.println("KOSONG");     
        }else{
        
        while(elemenSementara != null) {
            i++;
            System.out.printf("|  %-3s|             %-20s   |   %-8s|  \n",i,elemenSementara.info.nama,elemenSementara.info.harga);
            elemenSementara = elemenSementara.next;
        }
    }
}   
}

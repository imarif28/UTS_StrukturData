package restaurant_management;


public class Elemen {
    Mobil info;
    Elemen next;
    Elemen prev;
    
    Elemen (String nama, String type, String warna, int harga, String platnomor, String nama_pembeli) { 
    info=new Mobil (nama, type, warna, harga, platnomor, nama_pembeli); 
    next=null;
    prev=null;}


}


package id.ac.undiksha.siak;

import id.ac.undiksha.siak.entities.Mahasiswa;
import id.ac.undiksha.siak.entities.Dosen;
import id.ac.undiksha.siak.entities.Pegawai;

public class Main {

	public static void main(String[] args) {
		
		Mahasiswa mhs1 = new Mahasiswa(
			"Alpha", 
			"Singaraja", 
			true, 
			"001", 
			"Ilmu Komputer", 
			"Teknik Informatika", 
			"Teknik dan Kejuruan"
		);
		
		Dosen dosen1 = new Dosen(
			"Beta", 
			"Bali", 
			true, 
			"002", 
			"Sistem Informasi", 
			"Teknik Informatika", 
			"Teknik dan Kejuruan", 
			"Wakil Dekan I"
		);
		
		Pegawai pgw1 = new Pegawai(
			"Delta", 
			"Singaraja", 
			false, 
			"003", 
			"UPT TIK"
		);
		
		Mahasiswa mhs2 = new Mahasiswa(
			"Epsilon", 
			"Singaraja", 
			false, 
			"004", 
			"Ilmu Komputer", 
			"Teknik Informatika", 
			"Fakultas Teknik dan Kejuruan"
		);
		
		mhs1.printAllInfo();
		System.out.println();
		dosen1.printAllInfo();
		System.out.println();
		pgw1.printAllInfo();
		System.out.println();
		mhs2.printAllInfo();
	}

}

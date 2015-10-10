import java.util.Scanner;
class Inisialisasi{
	public int [] data;
	public int panjang;
	public int i;
	//deklarasi panjang array
	public Inisialisasi(int panjang){
		this.panjang=panjang;
		this.data=new int[panjang];
		i=0;
	}
	//Inputan Antrian
	public void inputAntrian(int nilai){
		data[i]=nilai;
		i++;
	}
	// keluaran antrian
	public void keluaranAntrian(){
		int temp, kosong=0;
		for(int j=0; j<panjang-1; j++){
			temp=data[j+1];
			data[j]=temp;
			data[j+1]=kosong;
		}
	}
	// tampilan hasil
	public void tampilkanHasil(){
		System.out.print("urutan data\n");
		for(int n = 0; n<panjang; n++){
			System.out.print("data ke- "+(n+1)+": "+data[n]+"\n");
		}
		System.out.println();
	}
}
class Antrian{
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		Inisialisasi in;
		int p,pilihan=1, angka, k;
		System.out.print("Masukkan Panjang Antrian = ");
		p=sc.nextInt();
		in=new Inisialisasi(p);
		while (pilihan==1 || pilihan==2){
		System.out.print("\nPilihan\n");
		System.out.print("1. Input Antrian\n");
		System.out.print("2. Output Antrian\n");
		System.out.print("3. Exit\n");
		System.out.print("Masukkan Pilihan = ");
		pilihan= sc.nextInt();
		if(pilihan==1){
		System.out.print("Berapa Angka yang di Inputkan = ");
		int n = sc.nextInt();
			for (k=0; k<n;k++){
				System.out.print("angka ke-"+(k+1)+": ");
				angka=sc.nextInt();
				in.inputAntrian(angka);
			}
			in.tampilkanHasil();
		}
		else if(pilihan==2){
		System.out.print("Berapa angka yang akan dikelaurkan = ");
		int m=sc.nextInt();
			for(k=0;k<m;k++){
				in.keluaranAntrian();
			}
			in.tampilkanHasil();
		}
		else if(pilihan==3){
			System.exit(0);
			}
		else{
			System.out.print("Pilihan Salah \n");
			pilihan=1;
		}
	}
}
}
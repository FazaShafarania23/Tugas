public class modiv1{
	public static void main(String[]args){
		String entry [][][]={{{"vianslezer", "100411052", "surabaya"}, {"echa", "100411025", "jakarta"},
		{"masayu", "100411024", "malang"}, {"naia", "100411023", "palembang"}, {"elmira", "100411022", "jogja"},
		{"shaka", "100411021", "kebumen"}, {"rajendra", "100411020", "kalasan"}, {"ipin", "1004110019", "lombok"}}};
			//looping semaua data
			for ( int i = 0; i < entry.length; i++){
				for (int j = 0; j < entry[i].length; i++){
					System.out.println("Data "+(i+1)+"-"+(j+1));
					System.out.println("Nama\t "+entry[i][j][0]);
					System.out.println("Nim\t "+entry[i][j][1]);
					System.out.println("Alamat\t "+entry[i][j][2]);
					System.out.println("--------------------------");
				}
	       	}
		}
	}


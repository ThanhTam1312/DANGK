public class Practice1 {
    public static void main (String[]args){
        double[][] BangDiemHocSinh =  {{'A', 'B', 'A', 'C', 'D', 'E', 'A', 'D', 'E', 'C'},
                                       {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
		                                   {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
				                               {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
				                               {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
				                               {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
				                               {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
				                               {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
        double[] Key = 
            {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
       for(int i = 0 ; i < BangDiemHocSinh.length; i++) {
			int TinhDiem = 0;
			for(int j = 0 ; j < BangDiemHocSinh [i] .length ; j++) {
				if(BangDiemHocSinh[i][j] == Key[j])
				TinhDiem++;
        }
        System.out.println("Diem So cua hoc sinh "  +  i  + " la "  + TinhDiem);
    }
    }
}


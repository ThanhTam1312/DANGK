public class Practice7 {
        public static boolean isNguyenTo(int n){
    	if(n < 2) return false;
        for(int i =2;i<=n/2;i++)if(n%i==0)return false;
        return true;
    }
    public static boolean isSuperNguyenTo(int n){
        while(n>0){
            if(!isNguyenTo(n))
             return false;
            n/=10;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so N =");
        int n =input.nextInt();
        System.out.print("Cac so sieu nguyen to co "+ n+ " chu so la : ");
        int ketThuc = (int)Math.pow(10,n)-1;//voi n =4 thi ket thuc = 9999
        int batdau =(int)Math.pow(10,n-1);//voi n =4 thi bat dau  =1000
        for(int i=batdau;i<=ketThuc;i++)if(isSuperNguyenTo(i))System.out.print(i+" ");
        
    }
}

import java.util.Scanner; 
public class Practice6 {
  private String P="";
  private int k=5;
  private String C="";
  public void Nhap(){
      Scanner nhap = new Scanner(System.in);
      System.out.print("Nhập xâu ký tự: ");
      P = nhap.next();  
  } 
public String MaHoa(){
    P = P.toUpperCase();
       for(int i = 0;i<P.length();i++)
        C += (char) ('A' + (P.charAt(i) - 'A' + k) % 26);
    return C;        
}
public String GiaiMa(){
    String kq="";
    for(int i = 0;i<P.length();i++)
        kq += (char) ('A' + (C.charAt(i) - 'A' + (26-k)) % 26);
    return kq;
}
public static void main(String[] args) {
    Practice6 ce = new Practice6();
    ce.Nhap();
    System.out.println("Xâu ký tự được mã hóa: "+ce.MaHoa());
    System.out.println("Xâu ký tự được giải mã: "+ce.GiaiMa());     
}
}
    

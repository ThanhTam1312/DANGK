import java.util.Scanner;
import java.util.StringTokenizer;
public class Practice14_15 {
   public static String removeNonLetter(String s){
       s = s.replaceAll("[^a-zA-Z ]","");
       s = s.replaceAll("\\s+ ", " ").trim();
       return s;
   }
   public static String removeBank(String s){
       s = s.strip();
       return s;
   }
   public static int demTu(String s){
       int dem =1;
       if(s.isEmpty())return 0;
       if(s.charAt(0)!=' '&&s.charAt(s.length()-1)!=' '){
       for(int i=0;i<s.length();i++){
           if(s.charAt(i)==' ')dem++;
       }
    }
    else{
        s = removeBank(s);
        dem=demTu(s);
    }
       return dem;
   }
   public static void main(String[] args) {
       String s;
       System.out.print("Nhap vao chuoi s = ");
       Scanner input = new Scanner(System.in);
       s= input.nextLine();
       s = removeNonLetter(s);
       s= s.toLowerCase();
    
    String[] string = s.split(" ");
    for(int i=0;i<string.length;i++){
        string[i]=string[i].substring(0, 1).toUpperCase() + string[i].substring(1);
    }
    System.out.println("So ky tu trong xau "+demTu(s)+"\nChuoi sau khi chuan hoa : ");
    for (String string2 : string) {System.out.print(string2+" ");    
                                  }
   }
}
    

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;


public class Practice3 {
    public static void main(String[] args){
        double[][] weather = new double[10][4];
        
        //Đọc file vào mảng 2 chiều
        try{
            FileInputStream fis = new FileInputStream("C:/ghi chu/weather.txt");
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader bfr = new BufferedReader(isr);
            String line = bfr.readLine();
            
            int row = 0;
            while(line != null){
                String[] array = line.split(" ");
                for (int col = 0; col < 4; col++){
                    weather[row][col] = Double.parseDouble(array[col]);
                }
                row++;
                line = bfr.readLine();
            }
            
            fis.close();
            isr.close();
            bfr.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        //Tính trung bình cộng Nhiệt độ và Độ ẩm
        double avgTemp = 0;
        double avgHum = 0;
        for(int row = 0; row < 10; row++){
            avgTemp += weather[row][2];
            avgHum += weather[row][3];
        }
        avgTemp = avgTemp/10;
        avgHum = avgHum/10;
        
        //In kết quả
        System.out.println("Nhiệt độ trung bình là: " + avgTemp);
        System.out.println("Độ ẩm trung bình là: " + avgHum);
        }
    }

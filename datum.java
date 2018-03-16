import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;
public class datum{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String arr[] = br.readLine().split(" ");
        String givenDate = arr[0] + "/" + arr[1] + "/2009";
        DateTimeFormatter format = DateTimeFormatter.ofPattern("d/M/yyyy");
        LocalDate date = LocalDate.parse(givenDate, format);
        DayOfWeek day = date.getDayOfWeek();
        bw.write(day.getDisplayName(TextStyle.FULL, Locale.US));      
        bw.flush();
	}
}

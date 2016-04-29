import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * Created by JohnTsai on 16/1/11.
 */
public class TimeUpdater {
    private String fileName;
    private String dateString;

    private static final String formatStr = "yyyy-MM-dd kk:mm";

    public TimeUpdater(String fileName){
        this.fileName = fileName;
        this.dateString = getDateString(new Date());
    }

    private String read(){
        File file = new File(fileName);
        Path path = file.toPath();
        String str = null;
        try {
            str = new String(Files.readAllBytes(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }

    private void write(String string){
        byte data[] = string.getBytes();
        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            fos.write(data);
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void update(){
        String str = read();
        System.out.println(dateString);
        String updateStr= str.replaceFirst("[0-9]{4}-[0-9]{2}-[0-9]{2}\\s[0-9]{2}:[0-9]{2}", this.dateString);
        write(updateStr);
    }

    public static String getDateString(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat(formatStr);
        return sdf.format(date);
    }

    public static void main(String[] args) {
        TimeUpdater timeUpdater = new TimeUpdater("./README.MD");
        timeUpdater.update();
    }
}

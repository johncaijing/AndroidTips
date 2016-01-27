import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by JohnTsai on 16/1/27.
 */
public class UrlValidate {

    private String fileName;

    public UrlValidate(String fileName){
        this.fileName = fileName;
    }

    public String readFile(String fileName){
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

    public List<String> getStringByRegex(String str, String patternStr){
        List<String> list = new ArrayList<>();
        Pattern pattern = Pattern.compile(patternStr);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()){
            list.add(matcher.group());
        }
        return list;
    }

    public Boolean checkValidate(String urlStr){
        try {
            URL url = new URL(urlStr);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("HEAD");
            connection.setConnectTimeout(3*1000);
            connection.setReadTimeout(10*1000);
            connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/28.0.1500.29 Safari/537.36");
            connection.connect();

            int code = connection.getResponseCode();
            System.out.println("responseCode:--->"+code);
            return code>=200&&code<400;
        } catch (IOException e) {
            System.out.println("fail...");
            e.printStackTrace();
            return false;
        }
    }

    public void checkValidate(){
        System.out.println("-----start checking------");
        String readme = readFile(this.fileName);
        List<String> urlList = getStringByRegex(readme,"\\(http.*?\\)");
        List<String> failList = new ArrayList<>();
        for(String string:urlList){
            String replace = string.replace("(", "").replace(")","");
            System.out.println("checking..."+replace);
            if(checkValidate(replace)==false)
                failList.add(replace);
        }
        if(failList.size()==0)
            System.out.println("All sites are available");
        else{
            System.out.println("--------------------\nSites not available:");
            for(String site:failList){
                System.out.println(site);
            }
        }
    }

    public static void main(String[] args){
        UrlValidate urlValidate = new UrlValidate("./README.md");
        urlValidate.checkValidate();
    }
}

package hyperhosting;
import java.io.File;
import java.nio.file.Files;
class download{
String link,dest;
download(String link,String dest){
this.link=link;
this.dest=dest;
}
public void stdown(String fname){
try{
File f = new File(link);
File d = new File(dest+"/"+fname);
Files.copy(f.toPath(),d.toPath());
}
catch(Exception e){}
}
}

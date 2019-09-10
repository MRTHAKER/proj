import java.io.File;
import java.nio.file.Files;
class upload{
String path;
File ok;
upload(String path,String filename){
try{
File f = new File(path);
File d = new File("/home/mrhacker5476/Desktop/"+filename);
Files.copy(f.toPath(),d.toPath());
ok=d;
}
catch(Exception e){System.out.println(e.toString());}
}
public String getlink(){
return ok.getAbsolutePath();
}
}

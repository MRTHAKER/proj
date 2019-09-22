import java.io.File;
import java.nio.file.Files;
class upload{
String path;
File ok;
upload(String path,String filename,String ext){
try{
File f = new File(path);
File dir=new File("/home/mrhacker5476/hyper/"+ext);
if(dir.exists()){
File d = new File("/home/mrhacker5476/hyper/"+ext+"/"+filename);
Files.copy(f.toPath(),d.toPath());
ok=d;
}
else{
File dd = new File("/home/mrhacker5476/hyper/"+ext);
dd.mkdir();
File d = new File("/home/mrhacker5476/hyper/"+ext+"/"+filename);
Files.copy(f.toPath(),d.toPath());
ok=d;
}
}
catch(Exception e){System.out.println(e.toString());}
}
public String getlink(){
return ok.getAbsolutePath();
}
}

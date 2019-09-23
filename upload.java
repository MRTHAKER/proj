import java.io.*;
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
File fi=new File("/home/mrhacker5476/proj/dirs.txt");
if(fi.exists()){
FileWriter fw = new FileWriter("/home/mrhacker5476/proj/dirs.txt",true);
fw.write("/home/mrhacker5476/hyper/"+ext+"\n");
fw.close();
}
else{
FileWriter fw = new FileWriter("/home/mrhacker5476/proj/dirs.txt",false);
fw.write("/home/mrhacker5476/hyper/"+ext+"\n");
fw.close();
}
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

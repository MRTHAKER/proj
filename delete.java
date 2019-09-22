import java.io.*;
import java.nio.file.Files;
class delete{
public void remove(File fa){
try{
File[] al=fa.listFiles();
for(File file : al){
if(file.isDirectory())
{
remove(file);
}
else
{
add(file);
}
}
}
catch(Exception e){
System.out.println(e.toString());
}
}
public void add(File fff){
try{
File fi=new File("/home/mrhacker5476/proj/delete.txt");
if(fi.exists()){
FileWriter fw = new FileWriter("/home/mrhacker5476/proj/files.txt",true);
fw.write(fff.getAbsolutePath());
fw.close();
}
else{
FileWriter fw = new FileWriter("/home/mrhacker5476/proj/files.txt",false);
fw.write(fff.getAbsolutePath());
fw.close();
}
}
catch(Exception e){
System.out.println(e.toString());
}
}
}

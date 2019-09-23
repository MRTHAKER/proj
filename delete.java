package hyperhosting;
import java.io.*;
import java.nio.file.Files;
import java.util.*;
class delete{
public void readDir(){
try{
ArrayList<String> gg=new ArrayList<String>();
File df = new File("/home/mrhacker5476/proj/dirs.txt");
BufferedReader b = new BufferedReader(new FileReader(df));
String del;
while ((del = b.readLine()) != null){
   gg.add(del);
}
for(String temp:gg){
File q=new File(temp);
remove(q);
}
}
catch(Exception e){}
}
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
ArrayList<String> sd=new ArrayList<String>();
File msg = new File("/home/mrhacker5476/proj/files.txt");
BufferedReader bfr = new BufferedReader(new FileReader(msg));
String del;
while ((del = bfr.readLine()) != null){
   sd.add(del);
}
if(sd.contains(fff.getAbsolutePath())){}
else{
FileWriter fw = new FileWriter("/home/mrhacker5476/proj/files.txt",true);
fw.write(fff.getAbsolutePath()+"\n");
fw.close();
}
}
catch(Exception e){
System.out.println(e.toString());
}
}
}

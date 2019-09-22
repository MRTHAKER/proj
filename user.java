import java.io.*;
class user{
String name;
String email;
String pass;
user(String name,String email,String pass){
this.name=name;
this.email=email;
this.pass=pass;
}

public void addUser(){
try{
File f=new File("/home/mrhacker5476/proj/users.txt");
if(f.exists()){
FileWriter fw = new FileWriter("/home/mrhacker5476/proj/users.txt",true);
fw.write(name+"\n"+email+"\n"+pass);
fw.close();
}
else{
FileWriter fw = new FileWriter("/home/mrhacker5476/proj/users.txt",false);
fw.write(name+"\n"+email+"\n"+pass);
fw.close();
}
}
catch(Exception e){
System.out.println(e.toString());
}
}
}

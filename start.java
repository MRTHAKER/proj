import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
class start{
public static void main(String args[]){
System.out.println("Welcome to Hyper Hostings");
Scanner reg=new Scanner(System.in);
System.out.println("For new regisration press 8, If already registered press any key.");
String n=reg.nextLine();
if(n.equals("8"))
{
Scanner name=new Scanner(System.in);
System.out.println("Enter name: ");
String nm=reg.nextLine();
Scanner email=new Scanner(System.in);
System.out.println("Enter email id: ");
String mail=reg.nextLine();
Scanner pass=new Scanner(System.in);
System.out.println("Enter password");
String pa=reg.nextLine();
user u=new user(nm,mail,pa);
u.addUser();
System.out.println("You are registered, Use your email id for login with your password");
}
Scanner suser = new Scanner(System.in);
System.out.println("Enter Email");
String user=suser.nextLine();
Scanner spass = new Scanner(System.in);
System.out.println("Enter password");
String pass=spass.nextLine();
if(user.equals("") || pass.equals(""))
{
user=" ";pass=" ";
}
ArrayList<String> userfile=new ArrayList<String>();
try{
File u = new File("/home/mrhacker5476/proj/users.txt");
BufferedReader br = new BufferedReader(new FileReader(u));
String st;
while ((st = br.readLine()) != null){
   userfile.add(st);
}
}
catch(Exception e){
System.out.println(e.toString());
}
if(userfile.contains(user) && userfile.contains(pass)){
System.out.println("Choose operation from the menu below");
System.out.println("1.Upload");
System.out.println("2.Download");
Scanner sc = new Scanner(System.in);
System.out.println("Enter your choice");
String s=sc.nextLine();
if(s.equals("1")){
Scanner sb = new Scanner(System.in);
System.out.println("Enter link of file for uploading..");
String ss=sb.nextLine();
Scanner sca = new Scanner(System.in);
System.out.println("Enter filename..");
String sbb=sca.nextLine();
upload up =new upload(ss,sbb);
System.out.println("Here is link of your uploaded file: "+up.getlink());
}
if(s.equals("2")){
Scanner sk = new Scanner(System.in);
System.out.println("Enter Filename");
String skk=sk.nextLine();
Scanner scan = new Scanner(System.in);
System.out.println("Enter link of file for download..");
String ss=scan.nextLine();
Scanner ssa = new Scanner(System.in);
System.out.println("Enter destination directory path..");
String saa=ssa.nextLine();
download dd =new download(ss,saa);
dd.stdown(skk);
System.out.println("Your file has been successfully downloaded at: "+saa);
}
}
else{
System.out.println("Wrong username or password");
}
}
}

import java.util.Scanner;
class start{
public static void main(String args[]){
System.out.println("Welcome to Hyper Hostings");
Scanner suser = new Scanner(System.in);
System.out.println("Enter Username");
String user=suser.nextLine();
Scanner spass = new Scanner(System.in);
System.out.println("Enter password");
String pass=spass.nextLine();
if(user.equals("mahek") && pass.equals("5476")){
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

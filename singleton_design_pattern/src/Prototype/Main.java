package Prototype;

public class Main {

	public static void main(String[] args) throws InterruptedException {
System.out.println("creating object using prototype Design");

NetWorkConnection  connection= new NetWorkConnection();
connection.setIp("192.37.366.37");
connection.loadVerImpotantData();
//System.out.println(connection.toString());

//we want new object
try {
	NetWorkConnection connection2;

	 connection2=(NetWorkConnection) connection.clone();
	 NetWorkConnection connection3=(NetWorkConnection) connection.clone();
	 System.out.println(connection.toString());
	 
	 connection.getDomains().remove(0);
	 System.out.println(connection.toString());
	 
	 System.out.println(connection2.toString());
	 System.out.println(connection3.toString());

} catch (CloneNotSupportedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}}


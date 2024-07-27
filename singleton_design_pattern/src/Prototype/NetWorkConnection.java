package Prototype;

import java.util.ArrayList;
import java.util.List;

public class NetWorkConnection implements Cloneable {
	
	private String ip;
	private String impData;
	private List<String> domains=new ArrayList<>();
	
	public String getIp() {
		return ip;
	}
	public List<String> getDomains() {
		return domains;
	}
	public void setDomains(List<String> domains) {
		this.domains = domains;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getImpData() {
		return impData;
	}
	public void setImpData(String impData) {
		this.impData = impData;
	}
	public void loadVerImpotantData() throws InterruptedException
	{
		this.impData="Very very important data";
		domains.add("www.leaernDesign.com");
		domains.add("www.santosh.com");
		domains.add("www.honrao.com");

		domains.add("www.ssantos.com");

		Thread.sleep(5000);
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		//deep clonning start
		NetWorkConnection connection=new NetWorkConnection();
		connection.setIp(this.getIp());
		connection.setImpData(this.getImpData());
		
		for(String d:this.getDomains())
		{
			connection.getDomains().add(d);
		}
		
		return connection;
		//deep clonning end
		
		//shadow clonning start
		//return super.clone();
		//shadow clonning start

	}
	@Override
	public String toString() {
		return "NetWorkConnection [ip=" + ip + ", impData=" + impData + ", domains=" + domains + "]";
	}
	
	


}

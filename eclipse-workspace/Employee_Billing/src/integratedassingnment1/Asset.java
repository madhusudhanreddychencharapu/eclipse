//lex_auth_0130008620764692481835
//do not modify the above line

package integratedassingnment1;

public class Asset  {
	
	String assetId;
	public String getAssetId() {
		return assetId;
	}
	public void setAssedtId(String assedtId) {
		this.assetId = assedtId;
	}
	public String getAssetName() {
		return assetName;
	}
	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}
	public String getAssetExpiry() {
		return assetExpiry;
	}
	public void setAssetExpiry(String assetExpiry) {
		this.assetExpiry = assetExpiry;
	}
	String assetName;
	String assetExpiry;
	//Implement your code here
	public Asset(String assedtId, String assetName, String assetExpiry) {
		super();
		this.assetId = assedtId;
		this.assetName = assetName;
		this.assetExpiry = assetExpiry;
	}
	
	
	@Override
	public String toString() {
		return "Asset Id: "+getAssetId()+", Asset Name: "+getAssetName()+", Asset Expiry: "+getAssetExpiry();
	}
}
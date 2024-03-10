package lap_mid1;
//Lama
public class BankTransfer extends payment{

	private String BankName;
	private String TranserNum;
	
	public BankTransfer(double a, String bName,String tNum) {
		super(a);
		BankName=bName;
		TranserNum= tNum;
		
	}
	public BankTransfer(BankTransfer BT) {
		super(BT.amount);
		BankName=BT.BankName;
		TranserNum=BT.TranserNum;
	}
public double CalculateGrand(){
	amount= amount+ (amount * (4.78/100));
	return amount;
}
	
	public void Displayinfo() {
		super.Displayinfo();
		System.out.println("Bank Name : " + BankName + " , TranserNum : " +
				TranserNum ) ;
	}

}

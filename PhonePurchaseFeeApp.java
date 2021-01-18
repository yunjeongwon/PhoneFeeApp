public class PhonePurchaseFeeApp {
	public static void main(String[] args) {
		
		phone.가족할인 = 0.7;
		phone.선택약정할인 = 0.75;
							
		phone p1 = new phone();		
		p1.기기값 = 760000.0;
		p1.공시지원금 = 390000.0;
		p1.유지요금제 = 89000.0;
		p1.이후요금제 = 50000.0;
		
		System.out.println("기기값 : " + p1.기기값);
		System.out.println("공시 총 비용 : " + p1.공시총비용());
		System.out.println("선약 총 비용 : " + p1.선약총비용());
		
		phone p2 = new phone();
		p2.기기값 = 740000.0;
		p2.공시지원금 = 400000.0;
		p2.유지요금제 = 89000.0;
		p2.이후요금제 = 45000.0;
		
		System.out.println("기기값 : " + p2.기기값);
		System.out.println("공시 총 비용 : " + p2.공시총비용());
		System.out.println("선약 총 비용 : " + p2.선약총비용());
		
	}
}

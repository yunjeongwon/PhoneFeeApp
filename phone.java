
class phone{
	public double 기기값;
	public double 공시지원금;
	public double 유지요금제;
	public double 이후요금제;
	public static double 가족할인 = 0.7;
	public static double 선택약정할인 = 0.75;
	
	public double 선약총비용() {
		return 기기값 + 선약요금제총비용();
	}

	public double 선약요금제총비용() {
		return (유지요금제 * 3 + 이후요금제 * 21) * 가족할인 * 선택약정할인;
	}

	public double 공시총비용() {
		return 할부원금() + 공시요금제총비용();
	}

	public double 공시요금제총비용() {
		return (유지요금제 * 6 + 이후요금제 * 18) * 가족할인;
	}

	public double 할부원금() {
		return 기기값 - 공시지원금;
	}
}
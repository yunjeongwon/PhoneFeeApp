
class phone{
	public double ��Ⱚ;
	public double ����������;
	public double ���������;
	public double ���Ŀ����;
	public static double �������� = 0.7;
	public static double ���þ������� = 0.75;
	
	public double �����Ѻ��() {
		return ��Ⱚ + ���������Ѻ��();
	}

	public double ���������Ѻ��() {
		return (��������� * 3 + ���Ŀ���� * 21) * �������� * ���þ�������;
	}

	public double �����Ѻ��() {
		return �Һο���() + ���ÿ�����Ѻ��();
	}

	public double ���ÿ�����Ѻ��() {
		return (��������� * 6 + ���Ŀ���� * 18) * ��������;
	}

	public double �Һο���() {
		return ��Ⱚ - ����������;
	}
}
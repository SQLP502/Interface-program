package doctoralCandidate;

public class DoctoralCandidate implements Student,Teacher{
	String name;
	char sex;
	int age;
	double tuition;
	double salary;
	//ʵ��ѧ������ӿڽ���ѧ�ѳ��󷽷�
	public void payTuition(double tuition){

	}
	//ʵ��ѧ������ӿڲ�ѯѧ�ѳ��󷽷�
	public void inquireTuition(double tuition){
		this.tuition = tuition;
		System.out.println("������ɵ�ѧ��Ϊ��"+this.tuition);
	}
	//ʵ�ֽ�ʦ����ӿڷ���нˮ���󷽷�
	public void giveSalary(double salary){
		
	}
	//ʵ�ֽ�ʦ����ӿڲ�ѯнˮ���󷽷�
	public void inquireSalary(double salary){
		this.salary = salary;
		System.out.println("����нˮΪ��"+this.salary);
	}
}

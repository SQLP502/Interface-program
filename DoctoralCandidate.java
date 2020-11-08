package doctoralCandidate;

public class DoctoralCandidate implements Student,Teacher{
	String name;
	char sex;
	int age;
	double tuition;
	double salary;
	//实现学生管理接口缴纳学费抽象方法
	public void payTuition(double tuition){

	}
	//实现学生管理接口查询学费抽象方法
	public void inquireTuition(double tuition){
		this.tuition = tuition;
		System.out.println("你需缴纳的学费为："+this.tuition);
	}
	//实现教师管理接口发放薪水抽象方法
	public void giveSalary(double salary){
		
	}
	//实现教师管理接口查询薪水抽象方法
	public void inquireSalary(double salary){
		this.salary = salary;
		System.out.println("您的薪水为："+this.salary);
	}
}

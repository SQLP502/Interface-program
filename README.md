# 2019311378 计191 许燕瑜
## 实验目的  
掌握Java中抽象类和抽象方法的定义；   
掌握Java中接口的定义，熟练掌握接口的定义形式以及接口的实现方法;  
了解异常的使用方法，并在程序中根据输入情况做异常处理。    
  
## 实验内容
某学校为了给学生提供勤工俭学机会，也减轻授课教师的部分压力，准许博士研究生参与课程的助教工作。此时，该博士研究生有双重身份：学生和助教教师。  
1、设计两个管理接口：学生管理接口和教师管理接口。  
    学生接口必须包括缴纳学费、查学费的方法；  
    教师接口包括发放薪水和查询薪水的方法。  
2、设计博士研究生类，实现上述的两个接口，该博士研究生应具有姓名、性别、年龄、每学期学费、每月薪水等属性。  
3、编写测试类，并实例化至少两名博士研究生，统计他们的年收入和学费。根据两者之差，算出每名博士研究生的年应纳税金额。  
## 实验要求：  
1、在博士研究生类中实现各个接口定义的抽象方法;  
2、对年学费和年收入进行统计，用收入减去学费，求得纳税额；  
3、国家最新纳税标准（系数），属于某一时期的特定固定值，与实例化对象没有关系，考虑如何用static  final修饰定义。  
4、实例化研究生类时，可采用运行时通过main方法的参数args一次性赋值，也可采用Scanner类实现运行时交互式输入。  
5、根据输入情况，要在程序中做异常处理。  
## 实验过程及核心代码：  
1、对于学生类，缴纳学费和查询学费方法的声明。  
```
public interface Student {
	public abstract void payTuition(double tuition); //缴纳学费
	public abstract void inquireTuition(double tuition); //查询学费
}

```  
2、对于Teacher类，发放薪水和查询薪水方法的声明。
```
public interface Teacher {
	public abstract void giveSalary(double salary); //发放薪水
	public abstract void inquireSalary(double salary); //查询薪水
}
```  
3、对于DoctoralCandidate类  
实现接口  
```
public class DoctoralCandidate implements Student,Teacher{
	String name;
	char sex;
	int age;
	double tuition;
	double salary;
  ```   
  
  实现学生接口和教师接口的抽象方法  
  ```
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
  ```
  4、设计Test类，对于以上学生，教师接口进行测试并输出结果。  
  
  ## 实验感想  
这次实验主要体现了抽象类，接口与异常处理的使用。  
首先创建接口来定义一些抽象方法，然后再通过实例化类来实现这些方法，在实验类中构造接口对象来实现接口回调，调用属于接口定义的原方法。  
学以致用，或许还不熟悉，还没有真正领悟到这部分知识的优点，后面结合更多的知识点，再多多操练，能更领悟到编程的奥妙。

package arrays;
//	Employee Blueprint is this
class Employee
{
	private String name;
	private int empid;
	private int deptNo;
	private int managerNo;
	private String hireDate;
	private double sal;
	private double comm;
	private String job;
	
	private Employee() {}
	
	public Employee(String name,int empid,int deptNo,int managerNo,String job,
			String hireDate,double sal,double comm)
	{
		super();
		this.name=name;
		this.empid=empid;
		this.deptNo=deptNo;
		this.managerNo=managerNo;
		this.hireDate=hireDate;
		this.sal=sal;
		this.comm=comm;
		this.job=job;
	}
	
	@Override
	public String toString()
	{
		return "[Name: "+name+",Empid: "+empid+", deptNo: "+deptNo+", manager: "+managerNo+", job: "+job+
				", hireDate: "+hireDate+", sal: "+sal+", comm: "+comm+"]"; 
	}

	public String getName() {
		return name;
	}

	public int getEmpid() {
		return empid;
	}

	public int getDeptNo() {
		return deptNo;
	}

	public int getManagerNo() {
		return managerNo;
	}

	public String getHireDate() {
		return hireDate;
	}

	public double getSal() {
		return sal;
	}

	public double getComm() {
		return comm;
	}

	public String getJob() {
		return job;
	}
}

//	Employee database & thier operations are here
class EmployeeDB
{
	private String user;
	private String pass;
	private boolean connect;
	private Employee[]db = new Employee[10];
	private int count=0;
	private int index=0;
	
	private EmployeeDB() {}
	
	public EmployeeDB(String user,String pass)
	{
		super();
		this.user = user;
		this.pass = pass;
		System.out.println("DB Created!");
	}
	
	public void login(String user,String pass)
	{
		if(this.user.equals(user)&&this.pass.equals(pass))
		{
			connect = true;
			System.out.println("DB Connetcted!");
		}
		else
		{
			System.out.println("Could not resolve the connect identifier specified");
		}
	}
	
	public boolean addEmployee(String name,int empid,int deptNo,int managerNo,String hireDate,String job,
			double sal,double comm)
	{
		if(connect && count<0.75*db.length)
		{
			db[index++] = new Employee(name, empid, deptNo, managerNo, hireDate, job, sal, comm);
			count++;
//			System.out.println(name+" Employee Added");
			return true;
		}
		else if(connect)
		{
			Employee[]temp = new Employee[db.length*2];
			for(int i=0;i<db.length;i++)
			{
				temp[i] = db[i];
			}
			db = temp;
			db[index++] = new Employee(name, empid, deptNo, managerNo, hireDate, job, sal, comm);
			count++;
//			System.out.println(name+" Employee Added");
			return true;
		}
		else
		{	
			System.out.println("Could not resolve the connect identifier specified");
			return false;
		}
	}
	
	public void showDB()
	{
		if(connect)
		{
			for(int i=0;i<db.length;i++)
			{
				if(db[i]!=null)
					System.out.println(db[i]);
			}
		}
		else
		{
			System.out.println("Could not resolve the connect identifier specified");
		}
	}
	
	public void searchByJob(String j)
	{
		if(connect)
		{
			for(int i=0;i<count;i++)
			{
				if(db[i].getJob().equalsIgnoreCase(j))
					System.out.println(db[i]);
			}
		}
		else
		{
			System.out.println("Could not resolve the connect identifier specified");
		}
	}
	
	public void searchByDeptNo(int deptno)
	{
		if(connect)
		{
			for(int i=0;i<count;i++)
			{
				if(db[i].getDeptNo()==deptno)
				{
					System.out.println(db[i]);
				}
			}
		}
		else
		{
			System.out.println("Could not resolve the connect identifier specified");
		}
	}
	
	public void searchByName(String name)
	{
		if(connect)
		{
			for(int i=0;i<count;i++)
			{
				if(db[i].getName().equalsIgnoreCase(name))
					System.out.println(db[i]);
			}
		}
		else
		{
			System.out.println("Could not resolve the connect identifier specified");
		}
	}
	
	public void searchBySallary(double sall,char ch)
	{
		if(connect)
		{
			int cnt=0;
			for(int i=0;i<count;i++)
			{
				if(db[i].getSal()==sall && ch=='e')
				{
					System.out.println(db[i]);
					cnt++;
				}
				else if(db[i].getSal()>=sall && ch=='m')
				{
					System.out.println(db[i]);
					cnt++;
				}
				else if(db[i].getSal()<=sall && ch=='l')
				{
					System.out.println(db[i]);
					cnt++;
				}
				
			}
			System.out.println("count is: "+cnt);
		}
		else
		{
			System.out.println("Could not resolve the connect identifier specified");
		}
	}
	
	public void searchBywithoutMgr()
	{
		if(connect)
		{
			for(int i=0;i<count;i++)
			{
				if(db[i].getManagerNo()==-1)
				{
					System.out.println(db[i]);
				}
			}
		}
		else
		{
			System.out.println("Could not resolve the connect identifier specified");
		}
	}
	
	public void maxSallary()
	{
		if(connect)
		{
			double max=Integer.MIN_VALUE;
			for(int i=0;i<count;i++)
			{
				if(db[i].getSal()>max)
				{
					max=db[i].getSal();
				}
			}
			System.out.println("Max Sallary: "+max);
		}
		else
		{
			System.out.println("Could not resolve the connect identifier specified");
		}
	}
	
	public void secMaxSallary()
	{
		if(connect)
		{
			double max=Integer.MIN_VALUE;
			double secMax=Integer.MIN_VALUE;
			for(int i=0;i<count;i++)
			{
				if(db[i].getSal()>max)
				{
					secMax = max;
					max=db[i].getSal();
				}
				else if(db[i].getSal()!=max && db[i].getSal()>max)
				{
					secMax = db[i].getSal();
				}
			}
			System.out.println("Second Max Sallary: "+secMax);
		}
		else
		{
			System.out.println("Could not resolve the connect identifier specified");
		}
	}
	
	public void getEmpUnderMgrId(int id)
	{
		if(connect)
		{
			int cnt=0;
			for(int i=0;i<count;i++)
			{
				if(db[i].getManagerNo()==id)
				{
					System.out.println(db[i]); 
					cnt++;
				}
			}
			System.out.println("Conut is: "+cnt);
		}
		else
		{
			System.out.println("Could not resolve the connect identifier specified");
		}
	}
	
	public void searchByComm(int com,char ch)
	{
		if(connect)
		{
			int cnt=0;
			for(int i=0;i<count;i++)
			{
				if(db[i].getComm()==com && ch=='e')
				{
					System.out.println(db[i]);
					cnt++;
				}
				else if(db[i].getComm()>=com && ch=='m')
				{
					System.out.println(db[i]);
					cnt++;
				}
				else if(db[i].getComm()<=com && ch=='l')
				{
					System.out.println(db[i]);
					cnt++;
				}
				
			}
			System.out.println("count is: "+cnt);
		}
		else
		{
			System.out.println("Could not resolve the connect identifier specified");
		}
	} 
}

public class EmployeeDBDriver 
{
	public static void main(String[]args)
	{
		EmployeeDB ref = new EmployeeDB("scott", "tiger");
		
		ref.login("scott", "tiger");

		//				  name, empid, deptNo, managerNo, hireDate, job, sal, comm
		ref.addEmployee("smith", 739, 20, 7902, "clerx", "17-22-1980", 800, 0.0);
		ref.addEmployee("Allen", 7499, 30, 7902, "Salesman", "20/02/1981", 500, 300);
		ref.addEmployee("Ward", 7521, 30, 7698, "Salesman", "20/20/1981", 1250, 500.0);
		ref.addEmployee("Jones", 7566, 20, 7839, "Manager", "02/04/1981", 2975.0, 0.0);
		ref.addEmployee("Martin", 7654, 30, 7698, "Salesman", "28/09/1981", 1250.0, 1400.0);
		ref.addEmployee("Blake", 7698, 30, 7839, "Manager", "02/04/1981", 2850.0, 0.0);
		ref.addEmployee("Clark", 7782, 10, 7839, "Manager", "09/06/1981", 2450.0, 0.0);
		ref.addEmployee("Scott", 7788, 20, 7566, "Analyst", "19/04/1981", 3000.0, 0.0);
		ref.addEmployee("King", 7839, 10, -1, "President", "17/11/1981", 5000.0, 0.0);
		ref.addEmployee("Turner", 744, 30, 7698, "Salesman", "08/09/1981", 1500.0, 0.0);
		ref.addEmployee("Adams", 7876, 30, 7788, "Clerk", "23/05/1981", 1100.0, 0.0);
		ref.addEmployee("James", 7900, 30, 7698, "Clerk", "03/12/1981", 950.0, 0.0);
		ref.addEmployee("Ford", 7902, 20, 7566, "Analyst", "03/12/1981", 3000.0, 0.0);
		ref.addEmployee("Miller", 7934, 10, 7782, "Clerx", "23/01/1981", 1300.0, 0.0);
		
//		ref.searchByDeptNo(10);
//		ref.searchByName("Ford");
//		ref.searchByJob("analyst");
//		ref.searchBySallary(950,'e');      //m for more than  //e for exact // l for lessthan
//		ref.searchBywithoutMgr();
//		ref.maxSallary();
//		ref.secMaxSallary();
//		ref.getEmpUnderMgrId(7902);
		ref.searchByComm(300, 'm');      //m for more than  //e for exact // l for lessthan
//		ref.showDB();
	}
}

import java.io.Serializable;

public class LinkedList implements Serializable {
	
	class Node implements Serializable{
		Employee obj;
		Node next;
		
		public Node() {
			
		}

		public Node(Employee obj) {
			this.obj = obj;
			this.next = null;
		}		
	}
	
	Node head=null;
	
	void addLast(Employee obj){
		Node node=new Node(obj);
		
		if(head==null) {
			head=node;
		}
		else {
			Node ptr=head;
			while(ptr.next!=null) {
				ptr=ptr.next;
			}
			ptr.next=node;
		}
	}
	
	void displayAll() {
		if(head==null) {
			System.out.println("No Employees to display...");
			return;
		}
		Node ptr=head;
		while(ptr!=null) {
			System.out.println("Name : "+ptr.obj.name+"  ");
			System.out.println("Address : "+ptr.obj.address+"  ");
			System.out.println("Age : "+ptr.obj.age+"  ");
			System.out.println("Gender : "+ptr.obj.gender+"  ");
			System.out.println("Basic Salary : "+ptr.obj.basicSalary+"  ");
			if(ptr.obj instanceof Manager) {
				Manager m=(Manager)ptr.obj;
				System.out.println("HRA : "+m.hra+"  "+"\n");
			}
			else if(ptr.obj instanceof Engineer) {
				Engineer e=(Engineer)ptr.obj;
				System.out.println("Overtime : "+e.overtime+"\n");
			}
			else {
				SalesPerson s=(SalesPerson)ptr.obj;
				System.out.println("Commission : "+s.commission+"\n");
			}
			ptr=ptr.next;
		}
	}
	
	void displayFirst() {
		if(head==null) {
			System.out.println("No Employees to display...");
			return;
		}
		Node ptr=head;
		System.out.print("Name : "+ptr.obj.name+"  ");
		System.out.print("Address : "+ptr.obj.address+"  ");
		System.out.print("Age : "+ptr.obj.age+"  ");
		System.out.print("Gender : "+ptr.obj.gender+"  ");
		System.out.print("Basic Salary : "+ptr.obj.basicSalary+"  ");
		if(ptr.obj instanceof Manager) {
			Manager m=(Manager)ptr.obj;
			System.out.print("HRA : "+m.hra+"  ");
		}
		else if(ptr.obj instanceof Engineer) {
			Engineer e=(Engineer)ptr.obj;
			System.out.println("Overtime : "+e.overtime);
		}
		else if (ptr.obj instanceof SalesPerson){
			SalesPerson s=(SalesPerson)ptr.obj;
			System.out.println("Commission : "+s.commission);
		}
	}
	
	void displayLast() {
		if(head==null) {
			System.out.println("No Employees to display...");
			return;
		}
		Node ptr=head;
		while(ptr.next!=null) {
			ptr=ptr.next;
		}
		System.out.println("Name : "+ptr.obj.name+"  ");
		System.out.println("Address : "+ptr.obj.address+"  ");
		System.out.println("Age : "+ptr.obj.age+"  ");
		System.out.println("Gender : "+ptr.obj.gender+"  ");
		System.out.println("Basic Salary : "+ptr.obj.basicSalary+"  ");
		if(ptr.obj instanceof Manager) {
			Manager m=(Manager)ptr.obj;
			System.out.println("HRA : "+m.hra+"  "+"\n");
		}
		else if(ptr.obj instanceof Engineer) {
			Engineer e=(Engineer)ptr.obj;
			System.out.println("Overtime : "+e.overtime+"\n");
		}
		else {
			SalesPerson s=(SalesPerson)ptr.obj;
			System.out.println("Commission : "+s.commission+"\n");
		}
	}
	
	
	void sortManager() {
		Node ptr=head;
		
		while(ptr!=null) {
				Node temp=ptr.next;
				while(temp!=null) {
					if(ptr.obj instanceof Manager && temp.obj instanceof Manager) {
						if(ptr.obj.name.compareTo(temp.obj.name)>0) {
							Employee tempObj=ptr.obj;
							ptr.obj=temp.obj;
							temp.obj=tempObj;
						}
					}
					temp=temp.next;
				}
				ptr=ptr.next;
		}	
	}
	
	void sortEngineer() {
		Node ptr=head;
		
		while(ptr!=null) {
				Node temp=ptr.next;
				while(temp!=null) {
					if(ptr.obj instanceof Engineer && temp.obj instanceof Engineer) {
						if(ptr.obj.name.compareTo(temp.obj.name)>0) {
							Employee tempObj=ptr.obj;
							ptr.obj=temp.obj;
							temp.obj=tempObj;
						}
					}
					temp=temp.next;
				}
				ptr=ptr.next;
		}
		
	}
	
	void sortSalesPerson() {
		Node ptr=head;
		
		while(ptr!=null) {
				Node temp=ptr.next;
				while(temp!=null) {
					if(ptr.obj instanceof SalesPerson && temp.obj instanceof SalesPerson) {
						if(ptr.obj.name.compareTo(temp.obj.name)>0) {
							Employee tempObj=ptr.obj;
							ptr.obj=temp.obj;
							temp.obj=tempObj;
						}
					}
					temp=temp.next;
				}
				ptr=ptr.next;
		}	
	}
	
	void sortEmployeesAsc() {
		Node ptr=head;
		
		while(ptr!=null) {
				Node temp=ptr.next;
				while(temp!=null) {
					if(ptr.obj.name.compareTo(temp.obj.name)>0) {
						Employee tempObj=ptr.obj;
						ptr.obj=temp.obj;
						temp.obj=tempObj;
					}
					temp=temp.next;
				}
				ptr=ptr.next;
		}
	}
	
	void sortEmployeesDesc() {
		Node ptr=head;
		
		while(ptr!=null) {
				Node temp=ptr.next;
				while(temp!=null) {
					if(ptr.obj.name.compareTo(temp.obj.name)<0) {
						Employee tempObj=ptr.obj;
						ptr.obj=temp.obj;
						temp.obj=tempObj;
					}
				temp=temp.next;
				}
				ptr=ptr.next;
		}
	}
}

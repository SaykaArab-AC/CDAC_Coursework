package in.cdac;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.function.Function;


// Q. Create the following using Lambda and Collection Framework -
//    Create a class called Transaction that contains the following data members
//		1. txId int
//		2. txDate LocalDate
//		3. txAmount float
//		4. txStatus boolean
//		5. txArrears boolean
//
//		Create 5 objects of the above Transaction object by taking input from the user and 
//		store the same in a Collection object.
//		Create the Lambda expressions for -
//			1. Getting all the Transactions from the Collection where the txAmount is > 5000
//			2. Getting all the Transactions where the txStatus is false
//			3. Write a Lambda Function to generate the amount due. The amount due is calculated as the txAmount + Rs. 500/- + 18% of txAmount if the txArrears is true else if txArrears if false then only the txAmount will be returned

public class Demo03 {

	public static void main(String[] args) {	
		ArrayList<Transaction> TransactionList=new ArrayList<>();
		TransactionList.add(new Transaction(101,23000,true,true));
		TransactionList.add(new Transaction(102,4800,true,true));
		TransactionList.add(new Transaction(104,4506,false,true));
		TransactionList.add(new Transaction(103,58230,true,false));
		TransactionList.add(new Transaction(106,1000,false,false));
		
		
		Function<ArrayList<Transaction>,ArrayList<Transaction>>checkAmt=list->{
			ArrayList<Transaction> newList=new ArrayList<>();
			for(Transaction t:list) {
				if(t.txtAmount>5000)
					newList.add(t);
			}
			return newList;
		};
		ArrayList<Transaction> newList=checkAmt.apply(TransactionList);
		iterate(newList);
		
		Function<ArrayList<Transaction>,ArrayList<Transaction>>checkStatus=list->{
			ArrayList<Transaction> statusList=new ArrayList<>();
			for(Transaction t:list) {
				if(!t.txtStatus)
					statusList.add(t);
			}
			return statusList;
		};
		
		ArrayList<Transaction>statusList=checkStatus.apply(TransactionList);
		iterate(statusList);

		Function<ArrayList<Transaction>,ArrayList<Double>>amountDue=list->{
			ArrayList<Double>amtDue=new ArrayList<>();
			for(Transaction t:list) {
				if(t.txtArrears) {
					amtDue.add(t.getTxtAmount()+500+(0.18*t.getTxtAmount()));
				}
				else
					amtDue.add(t.getTxtAmount());
			}
			return amtDue;
		};
		
		ArrayList<Double>amtDue=amountDue.apply(TransactionList);
		//System.out.println(TransactionList+" => Amount Due = "+amtDue+"\n"); ❌ prints whole amtDye list
		for(int i =0;i<TransactionList.size();i++) {
			System.out.println(TransactionList.get(i)+" => Amount Due = "+amtDue.get(i));
		}
	}
	
	public static void iterate(ArrayList<Transaction> a) {
		ListIterator<Transaction> lItr1=a.listIterator();
		while(lItr1.hasNext()) {
			System.out.println(lItr1.next());
		}
		System.out.println("-------------------------------------------------------------------------------");
	}

}

class Transaction{
	int txtId;
	double txtAmount;
	boolean txtStatus;
	boolean txtArrears;

	public Transaction(int txtId, double txtAmount, boolean txtStatus, boolean txtArrears) {
		this.txtId = txtId;
		this.txtAmount = txtAmount;
		this.txtStatus = txtStatus;
		this.txtArrears = txtArrears;
	}

	public int getTxtId() {
		return txtId;
	}

	public double getTxtAmount() {
		return txtAmount;
	}

	public boolean isTxtStatus() {
		return txtStatus;
	}

	public boolean isTxtArrears() {
		return txtArrears;
	}

	@Override
	public String toString() {
		return "Transaction [txtId=" + txtId + ", txtAmount=" + txtAmount + ", txtStatus=" + txtStatus + ", txtArrears="
				+ txtArrears + "]";
	}
	
}
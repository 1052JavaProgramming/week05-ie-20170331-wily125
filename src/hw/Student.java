/*
* 主題: 建立一個Student的類別，並用 ArrayList 進行管理，使用者可以一直輸入，
* 直到使用者按 N or n 才結束Student 的類別裡有 name,id 及 score 三個資料成員，
* 同學在加入student 物件之後要能依 student 的 score 進行遞減排序
* 日期: 2017/06/10
* 作者: 105021024 任韋丞
*/
public class Student {
	private String name,id;
	private int score,num;
	
	public Student (String name1,String id1,int score1){
		
		this.name=name1;
		this.id=id1;
		this.setscore(score1);
		
	}
	
	private void name(String va){
		this.name=va;
	}
	private void id(String v){
		this.id=v;
	}
	private void setscore(int val) {
		// TODO Auto-generated method stub
		this.score=val;
	}
	
	
	public String getname(){
		return name;
	}
	public String getid(){
		return id;
	}
	public int getscore(){
		return score;
	}
	public String getfr(){
		return "name:"+this.getname()+" id:("+this.getid()+") score:"+this.getscore();
	}
}

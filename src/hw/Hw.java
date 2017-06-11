/*
* 主題: 建立一個Student的類別，並用 ArrayList 進行管理，使用者可以一直輸入，
* 直到使用者按 N or n 才結束Student 的類別裡有 name,id 及 score 三個資料成員，
* 同學在加入student 物件之後要能依 student 的 score 進行遞減排序
* 日期: 2017/06/10
* 作者: 105021024 任韋丞
*/
import java.util.*;
public class Hw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> nameList =new ArrayList<Student>();
		Scanner scn =new Scanner(System.in);
		Scanner sss =new Scanner(System.in);
		System.out.println();
		String q;
		char g;
		Boolean wow =true;
		while(wow){
		nameList.add(new Student(scn.next(),scn.next(),scn.nextInt()));
		for(int i=0;i<nameList.size();i++){
			for(int j=i+1;j<nameList.size();j++){
		if(nameList.get(j).getscore()>nameList.get(i).getscore()){
			Student o = nameList.get(i);
			nameList.set(i, nameList.get(j));
			
			nameList.set(j,o);
		}
		}
		}
		for(int i=0;i<nameList.size();i++){
		System.out.println(nameList.get(i).getfr());
		}
		System.out.println("若要不輸入資料請輸入N or n");
		System.out.println("若要繼續輸入請按其餘的任意鍵");
		q=sss.nextLine();
		g=q.charAt(0);
		if(g==46||g==110){
		wow =false;
		}
		}
		
	}
	}
	

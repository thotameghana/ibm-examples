package com.oops;

//Interfaces are like contract b/w the programmer's
//D1 will create an interface
interface UserDB{
	void store();
	void delete();
}
//D2 will create an interface
interface UserQuery{
	void find();
}
//D3 will implement both the interfaces
class UserDBOneImpl implements UserDB, UserQuery{

	@Override
	public void find() {
		System.out.println("find() methods");
	}

	@Override
	public void store() {
		System.out.println("store() methods");
		
	}

	@Override
	public void delete() {
		System.out.println("delete() methods");
		
	}
	
}
public class TestInterface {
	//d4 will call find() method
	public static void uid4(UserQuery query) {
		query.find();
	}
	//d5 will call store and delete methods
	public static void uid5(UserDB db) {
		db.store();
		db.delete();
	}
	public static void main(String[] args) {
		UserDBOneImpl userDBOneImpl = new UserDBOneImpl();
		uid4(userDBOneImpl);
		uid5(userDBOneImpl);
	}
}

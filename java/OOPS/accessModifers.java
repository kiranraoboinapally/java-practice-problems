/*
private has less scope than as follows
private<default<protected<public
*/
class Parent
{
void add() //default
	{
	System.out.println("add in Parent");
	}
}
class Child extends Parent
{
protected void add() //protected scope>default it runs perfect if reversed mehtods cause error
	{
	System.out.println("add in Child");
	}
}

//if both has private causes error in override it differs one to other 
//access modifiers are used in differnt classes
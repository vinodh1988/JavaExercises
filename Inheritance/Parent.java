class Parent
{
  protected int a;
  
  Parent(){
    System.out.println("Parent constructor");
  }
  Parent(int a){
    this.a=a;
  }
  public void show(){
    System.out.println("A::"+a);
  }
}
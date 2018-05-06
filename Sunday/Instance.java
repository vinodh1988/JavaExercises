class Instance
{
  int hashTemp;
  Instance(int h){
	  hashTemp=h;
  };
  
  public int hashCode(){
	  return hashTemp;
  }
  public void show(){
	  System.out.println("Object is ...."+hashCode());
  }
  
  protected void finalize(){
    System.out.println(hashCode()+" Object is destroyed");
  }
}

class Running{
	public static void main(String n[])
	{
		Instance r=new Instance(-555);
		new Instance(-444).show();
		r.show();
		r=new Instance(-111);
		r.show();
		Instance x=new Instance(-222);
		Instance y=x;
		x=new Instance(-333);
		r=x;
		y.show();
		x.show();
		Instance f[]=new Instance[2099808048];
		
		for(int i=0;i<f.length;i++)
		{
			f[i]=new Instance(i);
		}
		
	}
}
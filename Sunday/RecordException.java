
class RecordException extends Exception{
  public void printStackTrace(){
    super.printStackTrace();
	System.out.println("Record size exceeded");
  }
  
  public String toString(){
    return "Record Exception occured!!!";
  }
  
  public String getMessage(){
    return "Record size more than required";
  }

}
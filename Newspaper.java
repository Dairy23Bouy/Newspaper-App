public class Newspaper{

	private String name;
	private double price;
	private String editor;
	private String email;


    Newspaper(){

    }

    Newspaper(String name, double price, String editor, String email){
    	this.name = name;
    	this.price = price;
    	this.editor = editor;
    	this.email = email;
    }


	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public double getPrice(){
		return price;
	} 

	public void setPrice(double price){
		this.price = price;
	}

	public String getEditor(){
		return editor;
	}

	public void setEditor(String editor){
		this.editor = editor;
	}

	public String getEmail(){
		return email;
	}

	public void setEmail(String email){
		this.email = email;
	}

	 @Override
    public String toString() {

    	return "Newspaper{" + 

    					 name + '\'' + 
    					 + price +
    					 editor +
    				 email + '}';
    }
}







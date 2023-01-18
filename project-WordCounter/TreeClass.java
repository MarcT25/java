

public class TreeClass {
	
	private NodeClass root;
	
	
	   public void insertWord(NodeClass wd)
	   {
	      insertPalabra(root,wd);
	   }
	   public void insertPalabra(NodeClass rt, NodeClass nd)
	   {
	       if(rt == null)
	               root=nd;
	       else
	       {
	            if(rt.getPalabra().compareTo(nd.getPalabra()) < 0) 
	               if(rt.getRight() == null)
	                  rt.setRight(nd);
	               else
	                  insertPalabra(rt.getRight(), nd);
	            else
	            
	            if(rt.getPalabra().compareTo(nd.getPalabra()) > 0) 
	               if(rt.getLeft()== null)
	                  rt.setLeft(nd);
	               else
	                  insertPalabra(rt.getLeft(), nd);
	               
	            }
	       }
	         
	
	
	public void display() {
		displayTree(root);
	}
	
	public void displayTree(NodeClass rt) {
		
		
		if(rt == null)
			System.out.println("EMPTY TREE");
		else {
			
			if(rt.getLeft() != null)
				displayTree(rt.getLeft());
			
			//splits comas, semicolons, colons, ., out of the words to then print it out.
			String[] wordlist =  rt.getPalabra().split("[-.!:,;*]");
			
			for(int i = 0; i < wordlist.length; i++) {
			System.out.println(" " + wordlist[i]);
			}
			
			if(rt.getRight() != null)
				displayTree(rt.getRight());
			
		}
	}

}

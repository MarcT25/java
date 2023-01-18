

public class NodeClass {
	
	private NodeClass right;
	private NodeClass left;
	private String palabra;
	
	// default constructor
	public NodeClass(String w) {
		
		palabra = w;
		right = null;
		left = null;
	}
	
	public NodeClass(String p, NodeClass r, NodeClass l) {
		
		palabra = p;
		right = r;
		left = l;
	}
	
	//setters
	public void setPalabra(String p) {

		palabra = p;
	}
	
	public void setRight(NodeClass r) {
		
		right = r;
	}
	
	public void setLeft(NodeClass l) {
		
		left = l;
	}
	
	//getters
	
	public String getPalabra() {
		
		return palabra;
	}
	
	public NodeClass getRight() {
		
		return right;
	}
	
	public NodeClass getLeft() {
		
		return left;
	}
	
	/**public boolean contains(NodeClass wr) {
		
		int com = getPalabra().compareTo(wr.getPalabra());
		
		if(com == 0)
			return true;
		if(com < 0 && getRight() != null && right.contains(wr) )
			return true;
		if(com > 0 && getLeft() != null && left.contains(wr))
			return true;
		
					return false;
		
	}**/
	
}

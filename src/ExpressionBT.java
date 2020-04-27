class ExpressionBT{
	String type;
	char operator;
	int value;
	String variable;
	ExpressionBT left;
	ExpressionBT right;
	
	/*
	 * Constructors 
	 */
	ExpressionBT(){
		
	}
	
	ExpressionBT(String[] e){
		
	}
	
	/*
	 * Getters 
	 */
	public String getType(){ return ""; }
	public int getValue(){ return 0; }
	public String getVariable(){ return ""; }
	public ExpressionBT getLeft(){ return null;}
	public ExpressionBT getRight(){ return null; }
	
	/*
	 * Setters  
	 */
	public void setType(String t){ }
	public void setValue(int v){ }
	public void setVariable(String var){ }
	public void setLeft(ExpressionBT b){ }
	public void setRight(ExpressionBT b){ }
	
	/* 
	 * Other Methods 
	 */
	
	// traverses the expression using recursion and returns an integer: 
	//    the integer value of the expression. 
	//  Note: only if there are no variables in the expression. 
	//  If there are variables, print out that you cannot evaluate and return 0
	public int Evaluate(){
		return 0;
	}
	
	// prints out the expression in infix notation with parentheses, using a BTStack
	public void Print(){
		
	}
	
	// It prints out all variables in the tree, if any. 
	// If there is no variable, it prints out "no variable in this expression". This method should use a BTQueue.
	public void allVariables(){
		
	}
	
	// returns true if the expression contains at least one variable, false otherwise
	public boolean includesVariables(){
		return true;
	}
}

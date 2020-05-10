public class PostfixExpression{
    
    private String expression;
	
    PostfixExpression(){}
    
    PostfixExpression(String e){
        
        expression = e;
        
    }
	
    public String getExpression(){

        return expression;

    }

    public void setExpression(String newExpr){

        expression = newExpr;

    }

    public int Evaluate(){
        
        String[] expArray = expression.split(" ");
        
        IntStack stack = new IntStack(expArray.length);
        
        for(int i = 0; i < expArray.length; i++){
        
            if(expArray[i].equals("+")){
            
                stack.push(stack.pop() + stack.pop());
            
            }else if(expArray[i].equals("-")){
                
                int b = stack.pop();
                int a = stack.pop();
            
                stack.push(a - b);
            
            }else if(expArray[i].equals("/")){
            
                int b = stack.pop();
                int a = stack.pop();
            
                stack.push(a / b);
            
            }else if(expArray[i].equals("*")){
            
                stack.push(stack.pop() * stack.pop());
            
            }else{
            
                stack.push(Integer.parseInt(expArray[i]));
            
            }
        
        }
        
        return stack.pop();

    }

    public void Print(){
        
        System.out.println(expression);

    }

}

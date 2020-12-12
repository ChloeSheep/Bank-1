public class Tool {
    Tool(){}
    public boolean is_alpha(String str) {
        if(str==null) return false;
        return str.matches("^[A-Za-z]+$");
    }
    public boolean in_range(String str,int num1,int num2){
        return str.length() <= num2 && str.length() >= num1;
    }
    public boolean is_number(String str){
        if (str==null) return false;
        return str.matches("^[0-9]+");
    }
}

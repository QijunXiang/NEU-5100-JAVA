public class Reverse{
    public String reverse(String s) {
        if(s == null || s.length() == 0) return "";
        
        String[] temp = s.split(" ");
        StringBuilder rs = new StringBuilder();
        
        for(int i = temp.length-1; i >= 0; i--) {
            if(!temp[i].equals("")) {
            rs.append(temp[i]);
            rs.append(" ");
            }
        }
        
        return rs.toString().trim();
    }
}


import accessspecifiers.PublicAccessSpecifiers;
import accessspecifiers.DefaultAccessSpecifiers;

class obj {
        public static void main(String[] args) {
                PublicAccessSpecifiers p = new PublicAccessSpecifiers();
                obj mine = new obj();
                
                p.MyFunction();
                obj.MyFunction(); 
        }
        
    }


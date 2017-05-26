
import javax.swing.JOptionPane;



public class LanguageFilter {
    static int i=0,k=1;
    private String fdata="",pdata[]= new String[i];    
    
    public String Filter(String Font,String Data)
    {   i++; k++; pdata[i]=Data;  fdata=""; 
        if(Font.compareTo("GurbaniAkharHeavy")==0)
        {//Punjabi Character filteration
            
            int length=Data.length(), count=0; String ch;
            while(count<length)
            { ch=Data.substring(count, count+1);
              if((ch.compareTo(">")!=0)&&(ch.compareTo("#")!=0)&&(ch.compareTo("%")!=0)&&
                   (ch.compareTo("_")!=0)&&(ch.compareTo("(")!=0)&&(ch.compareTo(")")!=0)&&
                      (ch.compareTo("<")!=0)&&(ch.compareTo("{")!=0)&&(ch.compareTo("}")!=0)&&
                        (ch.compareTo("\"")!=0)&&(ch.compareTo("\'")!=0))  
              {
                  fdata=fdata+ch;
              }
              count++;
            }
            
        }
        
        else if(Font.compareTo("DevLys 010")==0)
        {// Hindi Character filteration
            
        }
        
        else  if(Font.compareTo("GurbaniAkharHeavy")!=0 && Font.compareTo("DevLys 010")!=0)
        { // english character filteration            
           
            int length=Data.length(), count=0; String ch;
            while(count<length)
            { ch=Data.substring(count, count+1);
              if((ch.compareTo("~")!=0)&&(ch.compareTo("`")!=0)&&(ch.compareTo("#")!=0)&&
                   (ch.compareTo("%")!=0)&&(ch.compareTo("(")!=0)&&(ch.compareTo(")")!=0)&&
                      (ch.compareTo("_")!=0)&&(ch.compareTo("{")!=0)&&(ch.compareTo("}")!=0)
                        &&(ch.compareTo("[")!=0)&&(ch.compareTo("]")!=0)&&(ch.compareTo("<")!=0)
                          &&(ch.compareTo(">")!=0)&&(ch.compareTo("\"")!=0)&&(ch.compareTo("^")!=0))  
              {
                  fdata=fdata+ch;
              }
              count++;
            }
            
        }
        return fdata;
    }
    
    public String RestoreData()
    {
        --k;
        if(k>=0){
        return pdata[k]; 
                }
    
        else{
            JOptionPane.showMessageDialog(null,"No previous data Exists ");
            return "";
        }
       
}
}

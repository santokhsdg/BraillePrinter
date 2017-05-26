
import javax.swing.JOptionPane;


public class DataProcessing {
    
    public  int exp=0,size,indes=0,sh=0,ml=24,limit=6400,
            min_choice=20,max_choice=81,choice_set=0,
            font_size=15,m,lis=110;
    String pdata;
    
    String Inscriptor(String s, int lol)
    {
        String ss="",ff;
        ff=elafe(s);
        ss=elate(s);
        ss=sort(ss,lol);   
        ss=ss+ff;
        return ss;
    }
    int lines(String s)
    {
        int i,l,en=0;
       l=s.length();
       String ch;
        for(i=0;i<l;i++)
         {
             ch=s.substring(i,i+1);
             if(ch.compareTo("\n")==0)
             {
                en++; 
                
                            
             }           
         }
        
        return en;
    }
    
    int pages(String s)
   {
       
       int i,l,en=0,pg=1;
       l=s.length();
       String ch;
        for(i=0;i<l;i++)
         {
             ch=s.substring(i,i+1);
             if(ch.compareTo("\n")==0)
             {
                en++; 
                
                if((en%24==0)&& !(en==0))
             {
                 pg++;
                 
             }               
             }           
         }
        return pg;
   }
     public String inverts(String ss,int lol)
    { 
        int en=0,i,l,k,li=0,ls,j,enter=0,list=0,count;
               exp=0;
       String ch1,ssd="";
       l=ss.length();
       // code for getting no of lines by counting enter characters
       for(i=0;i<l;i++)
       {
           ch1=ss.substring(i,i+1);
           if(ch1.equals("\n"))
           {
               en++;
           }
           
       }
       // declaring array of strings each representing individual line
       String x[]= new String[en],
              y[]= new String[en],extra="";
       // each line will have lol characters
       // inverting the text 
       for(k=0,count=1;k<en;k++)
       {       
           if(enter==0)
           { k=CountEnter(ss); enter++; list=k;}
            
           if(enter==1)   
            {
                extra=ss.substring(k*lol,k*lol+1); enter++;                
            }
                     
       
           x[k]=ss.substring(lol*k,lol*(k+1));          
           ls=x[k].length(); 
           if((count)%2==0)
           {
           y[k]="";
           for(j=0;j<ls;j++)
           {
               y[k]=y[k]+x[k].substring(ls-1-j,ls-j);
           }
           y[k]=y[k]+"\n";
           }
           else{
               y[k]=ss.substring(lol*k,lol*(k+1)-1 );
           }
            count++;       
         ssd=ssd+y[k];
           
       }
       li=ssd.length();
       ssd=extra+ssd.substring(1,li)+"\n";
        ssd=AddEnter(ssd,list);
        return ssd;
    }
     
     
   public String invert(String ss,int lol)
    { 
        int en=0,i,l,k,li=0,ls,j,enter=0,list=0,count;
               exp=0;
       String ch1,ssd="";
       l=ss.length();
       // code for getting no of lines by counting enter characters
       for(i=0;i<l;i++)
       {
           ch1=ss.substring(i,i+1);
           if(ch1.equals("\n"))
           {
               en++;
           }
           
       }
       // declaring array of strings each representing individual line
       String x[]= new String[en],
              y[]= new String[en],extra="";
       // each line will have lol characters
       // inverting the text 
       for(k=0,count=1;k<en;k++)
       {       
           if(enter==0)
           { k=CountEnter(ss); enter++; list=k;}
            
           if(enter==1)   
            {
                extra=ss.substring(k*lol,k*lol+1); enter++;             
            }                   
       
           x[k]=ss.substring(lol*k,lol*(k+1));  
           
       }
       
       li=ssd.length();
       ssd=extra+ssd.substring(1,li)+"\n";
        ssd=AddEnter(ssd,list);
        return ssd;
    }
    
  public  String TextAdjust(String s)
    {
        s=s+"\n";
        String ssd="",ch;
        int i,en=0,l,lin=0,hin,ki=0,l2;
        l=s.length();
        for(i=0;i<l;i++)
        {
            ch=s.substring(i,i+1);
            if(ch.equals("\n"))
            {
                en++;
            }
        }
        String ss[]=new String[en];
        
        ch=null;
        for(i=0;i<l;i++)
        {
            ch=s.substring(i,i+1 );
            if(ch.equals("\n"))
            {
                hin=i;
                ss[ki]=s.substring(lin,hin+1);
                
                if(ss[ki].length()==lis+2)
                {
                    lis=lis+1;
                }
                            
                if(ss[ki].length()==lis)
                {
                    lis=lis-1;
                }
                if(ss[ki].length()==lis+1)
                {           
                    
                    ss[ki]=ss[ki].substring(0,lis)+" ";
                    
                }
                
                lin=hin+1;
                ssd=ssd+ss[ki];
                ki++;
                
            }
        }     
        int l1=ssd.length();
        ssd=ssd.substring(0,l1-1);        
        return ssd;
    }
  
  private int CountEnter(String s)
  {
      int i=1, count=0,l;
      String ch="";
      l=s.length();
      if(l>0){
         ch=s.substring(0,1); 
      }
      
      while((i<l)&& (ch.compareTo("\n")==0||ch.compareTo(" ")==0))
      {    ch=s.substring(i,i+1);
          if(ch.compareTo("\n")==0)
          {
              count++;
          }
          i++;
      }
      return count;
  }

  private String AddEnter(String s, int count)
{ String ss=""; int i=0;
    for(i=0;i<count;i++)
    {
        ss=ss+"\n";
    }
    ss=ss+s;
    return ss;
}
  public String[] Partition(String r)
  {
      int en=0,i,l,iv=0,hv,j=0;
                             
                   //JOptionPane.showMessageDialog(null, r+"\n"+exp);
       String s="",ch,ch1;        
        
        l=r.length();
        s=r;
        if(!(r.substring(l-1,l).equals("\n")))
        {
        s=r.substring(0,l)+"\n";
        }
        
         l=s.length();
         
         // count the number of \n's in the string
       
          
            for(i=0;i<l;i++)
         {
             ch=s.substring(i,i+1);
             if(ch.compareTo("\n")==0)
             {
                en++; 
             }
         }
         
         String x[]=new String[en];
               
        
        for(i=0;i<l;i++)
        {
            
           ch1= s.substring(i,i+1);
           
           if(ch1.compareTo("\n")==0)
           {
               hv=i;
               x[j]=s.substring(iv,hv+1);
               
               iv=hv+1;
                j++; 
               
           }
           // put string between "\n"s in the array of string.
        }
        return x;
  }
    
 public String sort(String r,int lol)
    {
         int en=0,i,l,iv=0,hv,j=0,los,count=0,ziv=0,zih,zi=0,k,space=0,sp=0;
                             
                   //JOptionPane.showMessageDialog(null, r+"\n"+exp);
       String s="",ch,ch1,ch2,ch3,ssd="";        
        
        l=r.length();
        s=r;
        if(!(r.substring(l-1,l).equals("\n")))
        {
        s=r.substring(0,l)+"\n";
        }
        
         l=s.length();
         
         // count the number of \n's in the string
       
          
            for(i=0;i<l;i++)
         {
             ch=s.substring(i,i+1);
             if(ch.compareTo("\n")==0)
             {
                en++; 
             }
         }
         
         String x[]=new String[en];
               String y[]=new String[limit];
        
        for(i=0;i<l;i++)
        {
            
           ch1= s.substring(i,i+1);
           
           if(ch1.compareTo("\n")==0)
           {
               hv=i;
               x[j]=s.substring(iv,hv+1);
               
               iv=hv+1;
                j++; 
               
           }
           // put string between "\n"s in the array of string.
        }
        
        // string has been put in the array of string x[]
        try
        {
        for(i=0;i<en;i++)
        {
            
          los=x[i].length();
          
          if(los<=lol)
          {
            y[zi]=x[i];
           
            zi++;
            // put the strings having length <=30 in an array y[]
            // 
          }
          else if(los>lol)   // x[] string having characters more than lol       
          {    ziv=0;          
              
            for(k=0;k<los;k++)
              {  
                  ch3=x[i].substring(k,k+1);
                  
                      if(ch3.equals(" "))
                      {
                          space=k;
                          sp++;
                      }
                      
                    count++;                 
                  if(count==lol)
                  {
                      
                      zih=k;          
                            
                      ch2=x[i].substring(zih,zih+1);    // picking the last character
                      
                      if(ch2.equals(" "))
                      {
                          y[zi]=x[i].substring(ziv,zih)+"\n";
                          ziv=zih+1;
                           k--;
                          zi++;
                          sp=0;
                      }
                     
                      else if(!(ch2.equals(" ")))
                      {                    
                        if((count==lol||count==lol-1) && sp==0)
                        {
                         y[zi]=x[i].substring(ziv,zih)+"\n";
                        ziv=k;
                         zi++;  
                         sp=0;                                                
                        }
                          
                         else
                        {
                         y[zi]=x[i].substring(ziv,space)+"\n";
                         zi++;
                         ziv=space+1;
                         k=space;
                         sp=0; 
                                }
                      }                   
                                         
                       count=0;                                   
                       
                      if(los-k<=lol+1) // last character whose length is less than 30
                  {
                      y[zi]=x[i].substring(k+1,los); 
                       zi++;
                      break;
                  }
                                        
                    }    
                         
              }
            // string has been devided into array of strings            
            //string has been sorted into the array of fixed length characters
              
          }
               
            
        }
        
        }
        
        catch(Exception e){
            if(lol<10)
            {
                JOptionPane.showMessageDialog(null," Characters in line must be kept according to the \n size of text and printer space ,should be around\n "
                        + "default characters in the line that is 30\nProgramming Problems: "+e);
            }
            
            else
            {JOptionPane.showMessageDialog(null," Please use the following troubleshooting Hints:"
                    + "\n1. There must not be more than 2 continuous enters between 2 lines."
                    + "\n2. The entered text must be in valid form."
                    + "\n3. Shapes must be printed either seperately or after the text.\nProgramming Problems: "+e);
           
            }                         
        exp++;
        }
        
        
        
        for(int q=0;q<zi;q++)
        {    
            ssd=ssd+y[q];
        } 
        
        return ssd ;
        
      
    }

    
    ///
    ///
    /// method for filling the empty characters by space
  public  String space(String ss,int lol)
    {
         int en=0,i,l,li=0,hi,in=0,d,ls,k;
               
       String ch1,ch2,ssd="";
       l=ss.length();
       // code for getting no of lines by counting enter characters
       for(i=0;i<l;i++)
       {
           ch1=ss.substring(i,i+1);
           if(ch1.equals("\n"))
           {
               en++;
           }
           
       }
       // declaring array of strings each representing individual line
       String x[]= new String[en],  y[]= new String[en]; 
       // putting the string in the array of strings excluding last character ie \n
       for(i=0;i<l;i++)
       {
           ch2=ss.substring(i,i+1);
           if(ch2.equals("\n"))
           {
               hi=i;
                x[in]=ss.substring(li,hi);
                ls=x[in].length();
                if(ls<lol)
                {
                    d=lol-1-ls;
                    for(k=0;k<d;k++)
                    {
                        x[in]=x[in]+" ";
                    }
                    
                }
               
               y[in]=x[in]+"\n"; 
               ssd=ssd+y[in];
                in++;
                li=hi+1;
               
               
           }
           
       }
      

        return ssd;
    }
  
  public String RestoreData()
    {
        return pdata;
    }
    
  
   // Skip enter in the text
  public String SkipEnter(String data)
  { pdata=data;
      int l=data.length(),i=0;
      String ch,newdata="";
      while(i<l)
      {
          ch=data.substring(i,i+1);
          if(ch.compareTo("\n")!=0)
          {
              newdata=newdata+ch;
          }
          i++;
      }  
      
      return newdata;
  }
   
    
    
    // seperation of text from string
   public String elate(String s)
    {
        int l=s.length(),i;
        String ssd="",ch;
     
        for(i=0;i<l;i++)
        {
            ch=s.substring(i,i+1);            
            if((ch.equals("$")))
            {
                indes=i;                
                break;
            }
                ssd=ssd+s.substring(i,i+1);
            
        }   
               
        return ssd;
        
    }
    // seperation of figure from string
     public String elafe(String s)
      {
          int l=s.length(),i,st=0;
        String ssd="",ch;
        for(i=0;i<l;i++)
        {
            ch=s.substring(i,i+1);
            if(ch.equals("$"))
            {
                st++;
            }
        }
               if(st>0) {
       ssd=s.substring(indes,l);
               }
               else
               {
                   ssd="";
               }
               
        return ssd;
      }
}

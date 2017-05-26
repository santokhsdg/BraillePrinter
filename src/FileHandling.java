
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class FileHandling {
    
    String filename;  
    
     private int CreateFileFolder(String pathname)
     {
         
         File  folder= new File(pathname);
         int check=1;
         if(!folder.exists())
         {          check--;   
             folder.mkdir() ;
             JOptionPane.showMessageDialog(null,"Braille Document Folder has been Created on Desktop");
         }
         
         return check;
     }
     
    public String SaveFile(String label,String data,String pathname)
    {
        CreateFileFolder(pathname);
        String filename="";
            
            if(label.equals("New File"))
       {
        JFileChooser saver = new JFileChooser(pathname);
        //saver.setFileFilter(new Text_Filter());
        int returnVal = saver.showSaveDialog(null);
        File file = saver.getSelectedFile();
        BufferedWriter writer = null;
        String ext=".txt";
        if (returnVal == JFileChooser.APPROVE_OPTION)
        {
            
            try
            {
            writer = new BufferedWriter( new FileWriter( pathname+"//"+file.getName()+ext));
            writer.write( data);
            writer.close( );
           
            filename=(file.getName());// return the name of the file
            }
            catch (IOException e)
            {
            JOptionPane.showMessageDialog(null, "The Text could not be Saved!",
						"Error!", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        
       }
       else
       {  filename=label;
           JFileChooser saver = new JFileChooser(pathname);
        //saver.setFileFilter(new Text_Filter());        
        File file = saver.getSelectedFile();
        BufferedWriter writer = null;       
            try
            {
            writer = new BufferedWriter( new FileWriter( pathname+"//"+label));
            writer.write( data);
            writer.close( );
                    
            }
            catch (IOException e)
            {
            JOptionPane.showMessageDialog(null, "The Text could not be Saved!",
						"Error!", JOptionPane.INFORMATION_MESSAGE);
            }
        
       }
        
              
        
        return filename;
    }
    
        
        
         public String SaveFile(String data,String pathname)
    {
        CreateFileFolder(pathname);
        String filename="";
            
            
       
        JFileChooser saver = new JFileChooser(pathname);
        //saver.setFileFilter(new Text_Filter());
        int returnVal = saver.showSaveDialog(null);
        File file = saver.getSelectedFile();
        BufferedWriter writer = null;
        String ext=".txt";
        if (returnVal == JFileChooser.APPROVE_OPTION)
        {
            
            try
            {
            writer = new BufferedWriter( new FileWriter( pathname+"//"+file.getName()+ext));
            writer.write( data);
            writer.close( );
           
            filename=(file.getName());// return the name of the file
            }
            catch (IOException e)
            {
            JOptionPane.showMessageDialog(null, "The Text could not be Saved!",
						"Error!", JOptionPane.INFORMATION_MESSAGE);
            }
        }
         
        
              
        
        return filename;
    }
    
    
    public String WindowClosing(String label,String data,String pathname)
    {
        CreateFileFolder(pathname);
        String filename="";
        
        int i=1;
        i=JOptionPane.showConfirmDialog(null,"Do you want to save the file?"," Confirmation Dialog", i);
       
        if(i==0){
            if(label.equals("New File"))
       {
        JFileChooser saver = new JFileChooser(pathname);
        //saver.setFileFilter(new Text_Filter());
        int returnVal = saver.showSaveDialog(null);
        File file = saver.getSelectedFile();
        BufferedWriter writer = null;
        String ext=".txt";
        if (returnVal == JFileChooser.APPROVE_OPTION)
        {
            if(file.getName().endsWith(".txt"))
            {
                ext="";
            }
            try
            {
            writer = new BufferedWriter( new FileWriter( pathname+"//"+file.getName()+ext));
            writer.write( data);
            writer.close( );
           
            filename=(file.getName());// return the name of the file
            }
            catch (IOException e)
            {
            JOptionPane.showMessageDialog(null, "The Text could not be Saved!",
						"Error!", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        System.exit(0);
       }
       else
       {  filename=label;
           JFileChooser saver = new JFileChooser(pathname);
        //saver.setFileFilter(new Text_Filter());        
        File file = saver.getSelectedFile();
        BufferedWriter writer = null;       
            try
            {
            writer = new BufferedWriter( new FileWriter(pathname+"//"+ label));
            writer.write( data);
            writer.close( );
                    
            }
            catch (IOException e)
            {
            JOptionPane.showMessageDialog(null, "The Text could not be Saved!",
						"Error!", JOptionPane.INFORMATION_MESSAGE);
            }
        
       }
        
        }
       
        
        if(i==1)
        {
            System.exit(0);
        }
        
        
        
        
        return filename;
    }
    
    String SaveAs(String label,String data,String pathname)
    {
        CreateFileFolder(pathname);
        String s="";
        
         JFileChooser saver = new JFileChooser(pathname);
        //saver.setFileFilter(new Text_Filter());
        int returnVal = saver.showSaveDialog(null);
        File file = saver.getSelectedFile();
        BufferedWriter writer = null;
        if (returnVal == JFileChooser.APPROVE_OPTION)
        {
            try
            {
            writer = new BufferedWriter( new FileWriter( pathname+"//"+label+".txt"));
            writer.write(data);
            writer.close( );
            
            }
            catch (IOException e)
            {
            JOptionPane.showMessageDialog(null, "The Text could not be Saved! Please check if other files have same name.");
            }
            
        }
        
        return file.getName();
    }
    
    
   public String FileOpen(String pathname)
    {
        CreateFileFolder( pathname);
         String s="",name="";
         try
  {     
    JFileChooser loadEmp = new JFileChooser(pathname);//new dialog
    File selectedFile;//needed*
    BufferedReader in;//needed*
    FileReader reader = null;//needed*,look these three up for further info
     
    //opens dialog if button clicked
    if (loadEmp.showOpenDialog(null)==JFileChooser.APPROVE_OPTION)
    {
      //gets file from dialog
      selectedFile = loadEmp.getSelectedFile();
           name = selectedFile.getName();
          
      //makes sure files can be processed before proceeding
      if (selectedFile.canRead() && selectedFile.exists())
      {
      reader = new FileReader(selectedFile);
      }
    }
     
   in = new BufferedReader(reader);
    
    //inputLine recieves file text
    String inputLine = in.readLine();
    int LineNumber = 0;
    while(inputLine!=null)
    {
      //LineNumber isn't needed, but it adds a line count on the left, nice
      LineNumber++;
      StringTokenizer tokenizer = new StringTokenizer(inputLine);
       
      //displays text file
      s=s+(inputLine+"\n");
      //next line in File opened
      inputLine = in.readLine();
    }
    
    //close stream, files stops loading
    in.close();
  }
  //catches input/output exceptions and all subclasses exceptions
  catch(IOException ex)
  {
    JOptionPane.showMessageDialog(null,"File cannot be opened");
  }
  //catches nullpointer exception, file not found
  catch(NullPointerException ex)
  {
   
  }
         filename=name;
         return s;
    }
    
   
   
    public String FileName()
    {
        return filename;
    }
    
    public void NewFile(String label,String data,String pathname)
    {
        CreateFileFolder(pathname);
         if(label.equals("New File"))
       {
        JFileChooser saver = new JFileChooser();
        //saver.setFileFilter(new Text_Filter());
        int returnVal = saver.showSaveDialog(null);
        File file = saver.getSelectedFile();
        BufferedWriter writer = null;
        if (returnVal == JFileChooser.APPROVE_OPTION)
        {
            try
            {
            writer = new BufferedWriter( new FileWriter( pathname+"//"+file.getName()+".txt"));
            writer.write(data);
            writer.close( );
            
            }
            catch (IOException e)
            {
            JOptionPane.showMessageDialog(null, "The Text could not be Saved!",
						"Error!", JOptionPane.INFORMATION_MESSAGE);
            }
        }
       }
       else
       {
           JFileChooser saver = new JFileChooser(pathname);
        //saver.setFileFilter(new Text_Filter());        
        File file = saver.getSelectedFile();
        BufferedWriter writer = null;       
            try
            {
            writer = new BufferedWriter( new FileWriter( pathname+"//"+label+".txt"));
            writer.write(data);
            writer.close( );
                       
            }
            catch (IOException e)
            {
            JOptionPane.showMessageDialog(null, "The Text could not be Saved!",
						"Error!", JOptionPane.INFORMATION_MESSAGE);
            }
        
       }
        
        
    }
    
}

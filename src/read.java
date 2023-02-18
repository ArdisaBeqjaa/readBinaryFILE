
import java.io.*;
import java.util.ArrayList;

public class read {
    private String bookName;
    read(String bookName){
        this.bookName=bookName;

    }
    ArrayList<String> arrayList=new ArrayList<String>();
    public int readfile() throws FileNotFoundException {




           try {

               FileInputStream fstream=new FileInputStream("C:\\Users\\USER\\IdeaProjects\\readBinaryFILE\\src\\book1.txt");
               DataInputStream in=new DataInputStream(fstream);
               BufferedReader br=new BufferedReader(new InputStreamReader(in));
               String stline;

               while ((stline= br.readLine())!=null){
                   arrayList.add(stline);
                   System.out.println(stline);


               }


               boolean x=true;
               for(int i=0;i<arrayList.size();i++){
                   if(bookName.equals(arrayList.get(i))){
                       System.out.println("book is found");
                       x=true;
                       break;
                   }
                   else x=false;
               }
               if(x==false) {
                   System.out.println("the book is not found");
                   return 0;
               }



               in.close();
           } catch (IOException e) {
               throw new RuntimeException(e);
           }



        return 1;
    }

}

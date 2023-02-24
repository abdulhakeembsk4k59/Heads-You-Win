import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;

public class HeadsToWin {
    public static void main(String[] args) {
        try{
            PrintWriter pw = new PrintWriter(new File("myfile2.csv"));
            StringBuilder sb = new StringBuilder();
            int p1Hcnt = 0;
            int p2Hcnt = 0;
            int loop = 1;
            while(loop<=3){
                sb.append("\r\n");
                sb.append("\r\n");
                sb.append("Cycle : "+loop);
                sb.append("\r\n");

                sb.append(",");
                sb.append("Player 1");
                sb.append(",");
                sb.append("Player 2");
                sb.append(",");
                sb.append("\r\n");

                
                int rounds = 1;
                ArrayList<String> arl = new ArrayList<>();
                arl.add("Head");
                arl.add("Tail");
                while(rounds<11){
                    System.out.println("Round : "+rounds);
                    sb.append("Round "+rounds+": ");
                    sb.append(",");
                    for(int i = 0; i<arl.size(); i++){
                        int index = (int)(Math.random()*arl.size());
                        System.out.println("Random element is : "+arl.get(index));
                        if(arl.get(index).equals("Head") && i==0){
                            sb.append("Head");
                            sb.append((","));
                            p1Hcnt++;
                        }else if(arl.get(index).equals("Tail") && i==0){
                            sb.append("Tails");
                            sb.append(",");
                        }
                        else if(arl.get(index).equals("Head") && i==1){
                            sb.append("Head");
                            sb.append((","));
                            p2Hcnt++;
                        }else if(arl.get(index).equals("Tail") && i == 1){
                            sb.append("Tails");
                            sb.append(",");
                        }
                    }
                    sb.append("\r\n");
                    rounds++;
                }

                

                

                sb.append("\r\n");
                sb.append("\r\n");
                sb.append("\r\n");
                sb.append("\r\n");
                loop++;
            }


            sb.append(",");
            sb.append(p1Hcnt);
            sb.append(",");
            sb.append(p2Hcnt);
            sb.append(",");
            sb.append("\r\n");
            if(p1Hcnt>p2Hcnt){
                sb.append("Player 1 Won the Match");
            }else if(p1Hcnt==p2Hcnt){
                sb.append("Match Tied");
            }
            else{
                sb.append("Player 2 Won the Match");
            }
            pw.write(sb.toString());
            pw.close();
        }catch(Exception e){

        }
    }
}

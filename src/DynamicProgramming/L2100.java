package DynamicProgramming;

public class L2100
{
    public static void main(String[] args) {

    }
    public List<Integer> goodDaysToRobBank(int[] security, int time) {
        int n = security.length;
        int[] pf = new int[n];
        int[] sf = new int[n];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1 ; i < security.length-time ; i++){
            if(security[i-1] >= security[i]){
                pf[i] = 1 + pf[i-1];
            }else{
                pf[i] = 0;
            }
        }
        for(int i = security.length-2 ; i >= time; i--){
            if(security[i+1] < security[i]){
                sf[i] = 0;
            }else{
                sf[i] = 1 + sf[i+1];
            }
        }
        for(int i = time ; i < security.length-time ; i++){
            if(pf[i] >= time && sf[i] >= time){
                list.add(i);
            }
        }
        return list;

    }
}

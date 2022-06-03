import java.util.ArrayList;
import java.util.List;

public class SILab2 {

        public static List<String> function(List<String> list) { //A
            if (list.size() <= 0) { //A
                throw new IllegalArgumentException("List length should be greater than 0"); //B
            }
            int n = list.size(); //C
            int rootOfN = (int) Math.sqrt(n); //C
            if (rootOfN * rootOfN  != n) { //C
                throw new IllegalArgumentException("List length should be a perfect square"); //D
            }
            List<String> numMines = new ArrayList<>(); //E
            for (int i = 0; i < n; i++) { //F.1(int i=0), F.2(i < n), F.3(i++)
                if (!list.get(i).equals("#")) { //G
                    int num = 0; //H
                    if ( (i % rootOfN != 0 && list.get(i - 1).equals("#")) || (i % rootOfN != rootOfN - 1 && list.get(i + 1).equals("#")) ) { //H
                        if ( (i % rootOfN != 0 && list.get(i - 1).equals("#")) && (i % rootOfN != rootOfN - 1 && list.get(i + 1).equals("#")) ){ //I
                            num += 2; //J
                        }
                        else { //K
                            num  += 1; //L
                        }
                    }
                    if (i - rootOfN >= 0 && list.get(i - rootOfN).equals("#")){ //M
                        num++; //N
                    }
                    if (i + rootOfN < n && list.get(i + rootOfN).equals("#")){ //O
                        num++; //P
                    }
                    numMines.add(String.valueOf(num)); //Q
                }
                else { //R
                    numMines.add(list.get(i)); //R
                }
            } //S
            return numMines; //T
        } //U
    }


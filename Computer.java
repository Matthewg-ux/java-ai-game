public class Computer extends Player {

    public Computer(String token) {

        super("Bit Bucket", token);
    }

    int rowA = 0;
    int colA=0;
    public int determineMoveCol(Board b, String ctoken, String htoken){

        for(int i=2; i >=0; i--){
            if(b.grid[i][0].equals(ctoken)){
                if(b.grid[i][1].equals(ctoken)){
                    if(b.grid[i][2].equals("-")){
                        return 2;
                    }
                }
            }
        }


        boolean legalRow = false;
        while(legalRow == false){
            int col = (int )(Math.random() * 2);
            int row = (int )(Math.random() * 3);
            if(b.grid[row][col].equals("-")){
                colA = col;
                rowA = row;
                legalRow = true;
            }
        }
        return colA;

    }

    public int determineMoveRow(){

        return rowA;

    }


}


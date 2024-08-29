package patternBasedArrayProcessor;


/**
 * ArrayProcessor - see task
 * 
 * @author  Diana Hermann
 * @version 2024/05/21
 *
 */
public class ArrayProcessor {
    
    public long process( long[][] theArray ){
        long resultSum = 0;
        //start position
        int xPosInArray = 0;

        while (theArray.length > xPosInArray + 3){ //checks if pattern fits downwards
            int yPosInArray = 0; 
            while (theArray[xPosInArray + 0].length > yPosInArray + 2){ //checks if pattern fits to the right at x+0 [ ][x][x][ ]
                
                if(    //checks if pattern fits three positions to the right at x+1 [x][ ][ ][x]
                       theArray[xPosInArray + 1].length > yPosInArray + 3
                       //checks if pattern fits three positions to the right at x+2 [x][ ][ ][x]
                    && theArray[xPosInArray + 2].length > yPosInArray + 3
                       //checks if pattern fits two positions to the right at x+3 [ ][x][x][ ] 
                    && theArray[xPosInArray + 3].length > yPosInArray + 2
                ){
                    //sort pattern, result only of pattern
                    resultSum = resultSum + theArray[xPosInArray][yPosInArray+1];     // [ ][x][x][ ]
                    resultSum = resultSum + theArray[xPosInArray][yPosInArray+2];

                    resultSum = resultSum + theArray[xPosInArray+1][yPosInArray];     // [x][ ][ ][x]
                    resultSum = resultSum + theArray[xPosInArray+1][yPosInArray+3];

                    resultSum = resultSum + theArray[xPosInArray+2][yPosInArray];     // [x][ ][ ][x]
                    resultSum = resultSum + theArray[xPosInArray+2][yPosInArray+3];

                    resultSum = resultSum + theArray[xPosInArray+3][yPosInArray+1];   // [ ][x][x][ ]
                    resultSum = resultSum + theArray[xPosInArray+3][yPosInArray+2];

                }
                yPosInArray++;
            }
            xPosInArray++;
        }
        return resultSum;
    }
}//class

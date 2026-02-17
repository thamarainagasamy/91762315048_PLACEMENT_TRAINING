package 91762315048_PLACEMENT_TRAINING.L2.array;

public class problem_414 {
    public int thirdMax(int[] a) {
        Integer max1=null,max2=null,max3=null;
        for(int i :a){
            if(max1==null || i>max1 ){
                max3=max2;
                max2=max1;
                max1=i;
            }
            else if(max1==i){
                continue;
            }
            else if(max2==null || i>max2){
                max3=max2;
                max2=i;
            }
            else if(max2==i){
                continue;
            }
            else if(max3==null || i>max3){
                max3=i;
            }
        }
       return ((max3 != null)?max3:max1).intValue();
    }
}

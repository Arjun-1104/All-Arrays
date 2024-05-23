public class length_arr {
    public static void main(String[] args) {

        int[][] arr2 = { // inisialize 2d-array
            {1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}
        };

        int[] a = {21,22,23,24,25};
        int[] b = {26,27,28,29,30};
        int[] c = {31,32,33,34,35};
        int[][] res = {a,b,c};
        int size = arr2.length * arr2[0].length;
    
        System.out.println("row: "+res.length);
        System.out.println("column: "+res[0].length);
        System.out.println("size : " +size);
    }
}
    


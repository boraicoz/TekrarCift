import java.util.Arrays;
public class TekrarEdenCift {

 static boolean isFind(int[]dizi,int value){

     for(int i:dizi)
     {
         if(i==value)
             return true;
     }
     return false;

 }
    public static void main(String[] args) {
        int []dizi={3,2,5,5,4,4,-2,-6,0,0,1,6,3,8,2,7,9,3,2,-2,-88,-6,-4,-4,-6};
        int []tekrarcift=new int[dizi.length];
        int index=0;
        for(int i=0;i<dizi.length;i++)
        {
            if(dizi[i]%2==0)
            {
              for(int j=0;j<dizi.length;j++)
              {
                  if((i!=j)&&(dizi[i]==dizi[j]))
                  {
                      if(!isFind(tekrarcift,dizi[i])) {
                          tekrarcift[index++] = dizi[i];
                      }
                      break;
                  }

              }
            }

        }
        System.out.println(Arrays.toString(tekrarcift));

    }
}

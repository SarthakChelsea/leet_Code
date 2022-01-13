public class Flip_an_image_method1 {
    public  static int[][] flipAndInvertImage(int[][] image) {

        for(int i=0;i<image.length;i++){
            //Reversing the image
            for(int j=0;j<image[i].length/2;j++)
            {      int t;
                t=image[i][j];
                image[i][j]=image[i][image[i].length-1-j];
                image[i][image[i].length-1-j]=t;
            }

        //Inverting the image

            for(int k=0;k<image[i].length;k++)
            { if(image[i][k]==0)
                image[i][k]=1;
            else
                image[i][k]=0;

            }
        }
        return image;


    }
    public static void main(String args[]){

    }
}

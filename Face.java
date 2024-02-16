import org.bytedeco.javacpp.opencv_core.Mat;
import org.bytedeco.javacpp.opencv_objdetect.CascadeClassifier;
import org.opencv.core.MatOfRect;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

public class Face{
    public static void main(String[] args) {
        org.opencv.core.Mat img = Imgcodecs.imread("Images/test.jpg");

        Detect(img);
    }
    public static void Detect(org.opencv.core.Mat img){

        //Used to store multiple faces
        MatOfRect mr1 = new MatOfRect();

        //Convert to gray scale
        org.opencv.core.Mat grayMat = new org.opencv.core.Mat();
        Imgproc.cvtColor(img, grayMat, Imgproc.COLOR_BGR2GRAY);
        Imgproc.equalizeHist(grayMat,grayMat);

        int height = grayMat.height();
        int absoluteFaceSize = 0;

        if(Math.round(height * 0.2f) > 0){
            absoluteFaceSize = Math.round(height * 0.2f);
        }

        //DetectFaces
        CascadeClassifier faceCascade = new CascadeClassifier();
        //Load File
        
     }
}